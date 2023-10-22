/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session4.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author tienk
 */
@Entity
@Table(name = "bookings")
@NamedQueries({
    @NamedQuery(name = "Bookings.findAll", query = "SELECT b FROM Bookings b"),
    @NamedQuery(name = "Bookings.findById", query = "SELECT b FROM Bookings b WHERE b.id = :id"),
    @NamedQuery(name = "Bookings.findByGuid", query = "SELECT b FROM Bookings b WHERE b.guid = :guid"),
    @NamedQuery(name = "Bookings.findByBookingDate", query = "SELECT b FROM Bookings b WHERE b.bookingDate = :bookingDate"),
    @NamedQuery(name = "Bookings.findByAmountPaid", query = "SELECT b FROM Bookings b WHERE b.amountPaid = :amountPaid")})
public class Bookings implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "GUID")
    private String guid;
    @Basic(optional = false)
    @Column(name = "BookingDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bookingDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AmountPaid")
    private BigDecimal amountPaid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bookingID")
    private List<Bookingdetails> bookingdetailsList;
    @JoinColumn(name = "CouponID", referencedColumnName = "ID")
    @ManyToOne
    private Coupons couponID;
    @JoinColumn(name = "TransactionID", referencedColumnName = "ID")
    @ManyToOne
    private Transactions transactionID;
    @JoinColumn(name = "UserID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Users userID;

    public Bookings() {
    }

    public Bookings(Long id) {
        this.id = id;
    }

    public Bookings(Long id, String guid, Date bookingDate) {
        this.id = id;
        this.guid = guid;
        this.bookingDate = bookingDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(BigDecimal amountPaid) {
        this.amountPaid = amountPaid;
    }

    public List<Bookingdetails> getBookingdetailsList() {
        return bookingdetailsList;
    }

    public void setBookingdetailsList(List<Bookingdetails> bookingdetailsList) {
        this.bookingdetailsList = bookingdetailsList;
    }

    public Coupons getCouponID() {
        return couponID;
    }

    public void setCouponID(Coupons couponID) {
        this.couponID = couponID;
    }

    public Transactions getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Transactions transactionID) {
        this.transactionID = transactionID;
    }

    public Users getUserID() {
        return userID;
    }

    public void setUserID(Users userID) {
        this.userID = userID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bookings)) {
            return false;
        }
        Bookings other = (Bookings) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "session4.entity.Bookings[ id=" + id + " ]";
    }
    
}
