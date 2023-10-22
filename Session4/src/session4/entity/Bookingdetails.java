/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session4.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author tienk
 */
@Entity
@Table(name = "bookingdetails")
@NamedQueries({
    @NamedQuery(name = "Bookingdetails.findAll", query = "SELECT b FROM Bookingdetails b"),
    @NamedQuery(name = "Bookingdetails.findById", query = "SELECT b FROM Bookingdetails b WHERE b.id = :id"),
    @NamedQuery(name = "Bookingdetails.findByGuid", query = "SELECT b FROM Bookingdetails b WHERE b.guid = :guid"),
    @NamedQuery(name = "Bookingdetails.findByIsRefund", query = "SELECT b FROM Bookingdetails b WHERE b.isRefund = :isRefund"),
    @NamedQuery(name = "Bookingdetails.findByRefundDate", query = "SELECT b FROM Bookingdetails b WHERE b.refundDate = :refundDate"),
    @NamedQuery(name = "Bookingdetails.findByRefundCancellationPoliciyID", query = "SELECT b FROM Bookingdetails b WHERE b.refundCancellationPoliciyID = :refundCancellationPoliciyID")})
public class Bookingdetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "GUID")
    private String guid;
    @Basic(optional = false)
    @Column(name = "isRefund")
    private boolean isRefund;
    @Column(name = "RefundDate")
    @Temporal(TemporalType.DATE)
    private Date refundDate;
    @Column(name = "RefundCancellationPoliciyID")
    private BigInteger refundCancellationPoliciyID;
    @JoinColumn(name = "BookingID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Bookings bookingID;
    @JoinColumn(name = "ItemPriceID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Itemprices itemPriceID;

    public Bookingdetails() {
    }

    public Bookingdetails(Long id) {
        this.id = id;
    }

    public Bookingdetails(Long id, String guid, boolean isRefund) {
        this.id = id;
        this.guid = guid;
        this.isRefund = isRefund;
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

    public boolean getIsRefund() {
        return isRefund;
    }

    public void setIsRefund(boolean isRefund) {
        this.isRefund = isRefund;
    }

    public Date getRefundDate() {
        return refundDate;
    }

    public void setRefundDate(Date refundDate) {
        this.refundDate = refundDate;
    }

    public BigInteger getRefundCancellationPoliciyID() {
        return refundCancellationPoliciyID;
    }

    public void setRefundCancellationPoliciyID(BigInteger refundCancellationPoliciyID) {
        this.refundCancellationPoliciyID = refundCancellationPoliciyID;
    }

    public Bookings getBookingID() {
        return bookingID;
    }

    public void setBookingID(Bookings bookingID) {
        this.bookingID = bookingID;
    }

    public Itemprices getItemPriceID() {
        return itemPriceID;
    }

    public void setItemPriceID(Itemprices itemPriceID) {
        this.itemPriceID = itemPriceID;
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
        if (!(object instanceof Bookingdetails)) {
            return false;
        }
        Bookingdetails other = (Bookingdetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "session4.entity.Bookingdetails[ id=" + id + " ]";
    }
    
}
