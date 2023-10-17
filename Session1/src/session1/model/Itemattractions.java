/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session1.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "itemattractions")
@NamedQueries({
    @NamedQuery(name = "Itemattractions.findAll", query = "SELECT i FROM Itemattractions i"),
    @NamedQuery(name = "Itemattractions.findById", query = "SELECT i FROM Itemattractions i WHERE i.id = :id"),
    @NamedQuery(name = "Itemattractions.findByGuid", query = "SELECT i FROM Itemattractions i WHERE i.guid = :guid"),
    @NamedQuery(name = "Itemattractions.findByDistance", query = "SELECT i FROM Itemattractions i WHERE i.distance = :distance"),
    @NamedQuery(name = "Itemattractions.findByDurationOnFoot", query = "SELECT i FROM Itemattractions i WHERE i.durationOnFoot = :durationOnFoot"),
    @NamedQuery(name = "Itemattractions.findByDurationByCar", query = "SELECT i FROM Itemattractions i WHERE i.durationByCar = :durationByCar")})
public class Itemattractions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "GUID")
    private String guid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Distance")
    private BigDecimal distance;
    @Column(name = "DurationOnFoot")
    private BigInteger durationOnFoot;
    @Column(name = "DurationByCar")
    private BigInteger durationByCar;
    @JoinColumn(name = "AttractionID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Attractions attractionID;
    @JoinColumn(name = "ItemID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Items itemID;

    public Itemattractions() {
    }

    public Itemattractions(Long id) {
        this.id = id;
    }

    public Itemattractions(Long id, String guid) {
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

    public BigDecimal getDistance() {
        return distance;
    }

    public void setDistance(BigDecimal distance) {
        this.distance = distance;
    }

    public BigInteger getDurationOnFoot() {
        return durationOnFoot;
    }

    public void setDurationOnFoot(BigInteger durationOnFoot) {
        this.durationOnFoot = durationOnFoot;
    }

    public BigInteger getDurationByCar() {
        return durationByCar;
    }

    public void setDurationByCar(BigInteger durationByCar) {
        this.durationByCar = durationByCar;
    }

    public Attractions getAttractionID() {
        return attractionID;
    }

    public void setAttractionID(Attractions attractionID) {
        this.attractionID = attractionID;
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
        if (!(object instanceof Itemattractions)) {
            return false;
        }
        Itemattractions other = (Itemattractions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "session1.model.Itemattractions[ id=" + id + " ]";
    }
    
}
