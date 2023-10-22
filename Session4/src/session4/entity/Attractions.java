/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session4.entity;

import java.io.Serializable;
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

/**
 *
 * @author tienk
 */
@Entity
@Table(name = "attractions")
@NamedQueries({
    @NamedQuery(name = "Attractions.findAll", query = "SELECT a FROM Attractions a"),
    @NamedQuery(name = "Attractions.findById", query = "SELECT a FROM Attractions a WHERE a.id = :id"),
    @NamedQuery(name = "Attractions.findByGuid", query = "SELECT a FROM Attractions a WHERE a.guid = :guid"),
    @NamedQuery(name = "Attractions.findByName", query = "SELECT a FROM Attractions a WHERE a.name = :name"),
    @NamedQuery(name = "Attractions.findByAddress", query = "SELECT a FROM Attractions a WHERE a.address = :address")})
public class Attractions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "GUID")
    private String guid;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "Address")
    private String address;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "attractionID")
    private List<Itemattractions> itemattractionsList;
    @JoinColumn(name = "AreaID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Areas areaID;

    public Attractions() {
    }

    public Attractions(Long id) {
        this.id = id;
    }

    public Attractions(Long id, String guid, String name, String address) {
        this.id = id;
        this.guid = guid;
        this.name = name;
        this.address = address;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Itemattractions> getItemattractionsList() {
        return itemattractionsList;
    }

    public void setItemattractionsList(List<Itemattractions> itemattractionsList) {
        this.itemattractionsList = itemattractionsList;
    }

    public Areas getAreaID() {
        return areaID;
    }

    public void setAreaID(Areas areaID) {
        this.areaID = areaID;
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
        if (!(object instanceof Attractions)) {
            return false;
        }
        Attractions other = (Attractions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "session4.entity.Attractions[ id=" + id + " ]";
    }
    
}
