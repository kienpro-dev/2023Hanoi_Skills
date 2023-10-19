/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session1.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "amenities")
@NamedQueries({
    @NamedQuery(name = "Amenities.findAll", query = "SELECT a FROM Amenities a"),
    @NamedQuery(name = "Amenities.findById", query = "SELECT a FROM Amenities a WHERE a.id = :id"),
    @NamedQuery(name = "Amenities.findByGuid", query = "SELECT a FROM Amenities a WHERE a.guid = :guid"),
    @NamedQuery(name = "Amenities.findByName", query = "SELECT a FROM Amenities a WHERE a.name = :name"),
    @NamedQuery(name = "Amenities.findByIconName", query = "SELECT a FROM Amenities a WHERE a.iconName = :iconName")})
public class Amenities implements Serializable {

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
    @Column(name = "IconName")
    private String iconName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "amenityID")
    private List<Itemamenities> itemamenitiesList;

    public Amenities() {
    }

    public Amenities(Long id) {
        this.id = id;
    }

    public Amenities(Long id, String guid, String name) {
        this.id = id;
        this.guid = guid;
        this.name = name;
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

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public List<Itemamenities> getItemamenitiesList() {
        return itemamenitiesList;
    }

    public void setItemamenitiesList(List<Itemamenities> itemamenitiesList) {
        this.itemamenitiesList = itemamenitiesList;
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
        if (!(object instanceof Amenities)) {
            return false;
        }
        Amenities other = (Amenities) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "session1.Amenities[ id=" + id + " ]";
    }
    
}
