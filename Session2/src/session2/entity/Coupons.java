/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session2.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author tienk
 */
@Entity
@Table(name = "coupons")
@NamedQueries({
    @NamedQuery(name = "Coupons.findAll", query = "SELECT c FROM Coupons c"),
    @NamedQuery(name = "Coupons.findById", query = "SELECT c FROM Coupons c WHERE c.id = :id"),
    @NamedQuery(name = "Coupons.findByGuid", query = "SELECT c FROM Coupons c WHERE c.guid = :guid"),
    @NamedQuery(name = "Coupons.findByCouponCode", query = "SELECT c FROM Coupons c WHERE c.couponCode = :couponCode"),
    @NamedQuery(name = "Coupons.findByDiscountPercent", query = "SELECT c FROM Coupons c WHERE c.discountPercent = :discountPercent"),
    @NamedQuery(name = "Coupons.findByMaximimDiscountAmount", query = "SELECT c FROM Coupons c WHERE c.maximimDiscountAmount = :maximimDiscountAmount")})
public class Coupons implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "GUID")
    private String guid;
    @Basic(optional = false)
    @Column(name = "CouponCode")
    private String couponCode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "DiscountPercent")
    private BigDecimal discountPercent;
    @Basic(optional = false)
    @Column(name = "MaximimDiscountAmount")
    private BigDecimal maximimDiscountAmount;
    @OneToMany(mappedBy = "couponID")
    private List<Bookings> bookingsList;

    public Coupons() {
    }

    public Coupons(Long id) {
        this.id = id;
    }

    public Coupons(Long id, String guid, String couponCode, BigDecimal discountPercent, BigDecimal maximimDiscountAmount) {
        this.id = id;
        this.guid = guid;
        this.couponCode = couponCode;
        this.discountPercent = discountPercent;
        this.maximimDiscountAmount = maximimDiscountAmount;
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

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(BigDecimal discountPercent) {
        this.discountPercent = discountPercent;
    }

    public BigDecimal getMaximimDiscountAmount() {
        return maximimDiscountAmount;
    }

    public void setMaximimDiscountAmount(BigDecimal maximimDiscountAmount) {
        this.maximimDiscountAmount = maximimDiscountAmount;
    }

    public List<Bookings> getBookingsList() {
        return bookingsList;
    }

    public void setBookingsList(List<Bookings> bookingsList) {
        this.bookingsList = bookingsList;
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
        if (!(object instanceof Coupons)) {
            return false;
        }
        Coupons other = (Coupons) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "session2.entity.Coupons[ id=" + id + " ]";
    }
    
}
