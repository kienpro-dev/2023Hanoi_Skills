/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session4.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author tienk
 */
@Entity
@Table(name = "itemamenities")
@NamedQueries({
    @NamedQuery(name = "Itemamenities.findAll", query = "SELECT i FROM Itemamenities i"),
    @NamedQuery(name = "Itemamenities.findById", query = "SELECT i FROM Itemamenities i WHERE i.id = :id"),
    @NamedQuery(name = "Itemamenities.findByGuid", query = "SELECT i FROM Itemamenities i WHERE i.guid = :guid")})
public class Itemamenities implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "GUID")
    private String guid;
    @JoinColumn(name = "AmenityID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Amenities amenityID;
    @JoinColumn(name = "ItemID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Items itemID;

    public Itemamenities() {
    }

    public Itemamenities(Long id) {
        this.id = id;
    }

    public Itemamenities(Long id, String guid) {
        this.id = id;
        this.guid = guid;
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

    public Amenities getAmenityID() {
        return amenityID;
    }

    public void setAmenityID(Amenities amenityID) {
        this.amenityID = amenityID;
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
        if (!(object instanceof Itemamenities)) {
            return false;
        }
        Itemamenities other = (Itemamenities) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "session4.entity.Itemamenities[ id=" + id + " ]";
    }
    
}
