/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session2.entity;

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
@Table(name = "itemprices")
@NamedQueries({
    @NamedQuery(name = "Itemprices.findAll", query = "SELECT i FROM Itemprices i"),
    @NamedQuery(name = "Itemprices.findById", query = "SELECT i FROM Itemprices i WHERE i.id = :id"),
    @NamedQuery(name = "Itemprices.findByGuid", query = "SELECT i FROM Itemprices i WHERE i.guid = :guid"),
    @NamedQuery(name = "Itemprices.findByDate", query = "SELECT i FROM Itemprices i WHERE i.date = :date"),
    @NamedQuery(name = "Itemprices.findByPrice", query = "SELECT i FROM Itemprices i WHERE i.price = :price"),
    @NamedQuery(name = "Itemprices.findListing", query = "SELECT ip FROM Itemprices ip JOIN ip.itemID i WHERE ip.date IN (SELECT MAX(ip.date) FROM Itemprices ip GROUP BY ip.itemID)")})
public class Itemprices implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "GUID")
    private String guid;
    @Basic(optional = false)
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date date;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "Price")
    private BigDecimal price;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "itemPriceID")
    private List<Bookingdetails> bookingdetailsList;
    @JoinColumn(name = "CancellationPolicyID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Cancellationpolicies cancellationPolicyID;
    @JoinColumn(name = "ItemID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Items itemID;

    public Itemprices() {
    }

    public Itemprices(Long id) {
        this.id = id;
    }

    public Itemprices(Long id, String guid, Date date, BigDecimal price) {
        this.id = id;
        this.guid = guid;
        this.date = date;
        this.price = price;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<Bookingdetails> getBookingdetailsList() {
        return bookingdetailsList;
    }

    public void setBookingdetailsList(List<Bookingdetails> bookingdetailsList) {
        this.bookingdetailsList = bookingdetailsList;
    }

    public Cancellationpolicies getCancellationPolicyID() {
        return cancellationPolicyID;
    }

    public void setCancellationPolicyID(Cancellationpolicies cancellationPolicyID) {
        this.cancellationPolicyID = cancellationPolicyID;
    }

    public Items getItemID() {
        return itemID;
    }

    public void setItemID(Items itemID) {
        this.itemID = itemID;
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
        if (!(object instanceof Itemprices)) {
            return false;
        }
        Itemprices other = (Itemprices) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "session2.entity.Itemprices[ id=" + id + " ]";
    }
    
}
