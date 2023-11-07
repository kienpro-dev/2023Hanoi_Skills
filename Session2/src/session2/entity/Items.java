/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session2.entity;

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
@Table(name = "items")
@NamedQueries({
    @NamedQuery(name = "Items.findAll", query = "SELECT i FROM Items i"),
    @NamedQuery(name = "Items.findById", query = "SELECT i FROM Items i WHERE i.id = :id"),
    @NamedQuery(name = "Items.findByGuid", query = "SELECT i FROM Items i WHERE i.guid = :guid"),
    @NamedQuery(name = "Items.findByTitle", query = "SELECT i FROM Items i WHERE i.title = :title"),
    @NamedQuery(name = "Items.findByCapacity", query = "SELECT i FROM Items i WHERE i.capacity = :capacity"),
    @NamedQuery(name = "Items.findByNumberOfBeds", query = "SELECT i FROM Items i WHERE i.numberOfBeds = :numberOfBeds"),
    @NamedQuery(name = "Items.findByNumberOfBedrooms", query = "SELECT i FROM Items i WHERE i.numberOfBedrooms = :numberOfBedrooms"),
    @NamedQuery(name = "Items.findByNumberOfBathrooms", query = "SELECT i FROM Items i WHERE i.numberOfBathrooms = :numberOfBathrooms"),
    @NamedQuery(name = "Items.findByExactAddress", query = "SELECT i FROM Items i WHERE i.exactAddress = :exactAddress"),
    @NamedQuery(name = "Items.findByApproximateAddress", query = "SELECT i FROM Items i WHERE i.approximateAddress = :approximateAddress"),
    @NamedQuery(name = "Items.findByDescription", query = "SELECT i FROM Items i WHERE i.description = :description"),
    @NamedQuery(name = "Items.findByHostRules", query = "SELECT i FROM Items i WHERE i.hostRules = :hostRules"),
    @NamedQuery(name = "Items.findByMinimumNights", query = "SELECT i FROM Items i WHERE i.minimumNights = :minimumNights"),
    @NamedQuery(name = "Items.findByMaximumNights", query = "SELECT i FROM Items i WHERE i.maximumNights = :maximumNights")})
public class Items implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "GUID")
    private String guid;
    @Basic(optional = false)
    @Column(name = "Title")
    private String title;
    @Basic(optional = false)
    @Column(name = "Capacity")
    private int capacity;
    @Basic(optional = false)
    @Column(name = "NumberOfBeds")
    private int numberOfBeds;
    @Basic(optional = false)
    @Column(name = "NumberOfBedrooms")
    private int numberOfBedrooms;
    @Basic(optional = false)
    @Column(name = "NumberOfBathrooms")
    private int numberOfBathrooms;
    @Basic(optional = false)
    @Column(name = "ExactAddress")
    private String exactAddress;
    @Basic(optional = false)
    @Column(name = "ApproximateAddress")
    private String approximateAddress;
    @Basic(optional = false)
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @Column(name = "HostRules")
    private String hostRules;
    @Basic(optional = false)
    @Column(name = "MinimumNights")
    private int minimumNights;
    @Basic(optional = false)
    @Column(name = "MaximumNights")
    private int maximumNights;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "itemID")
    private List<Itemprices> itempricesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "itemID")
    private List<Itemscores> itemscoresList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "itemID")
    private List<Itemattractions> itemattractionsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "itemID")
    private List<Itemamenities> itemamenitiesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "itemID")
    private List<Itempictures> itempicturesList;
    @JoinColumn(name = "AreaID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Areas areaID;
    @JoinColumn(name = "ItemTypeID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Itemtypes itemTypeID;
    @JoinColumn(name = "UserID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Users userID;

    public Items() {
    }

    public Items(Long id) {
        this.id = id;
    }

    public Items(Long id, String guid, String title, int capacity, int numberOfBeds, int numberOfBedrooms, int numberOfBathrooms, String exactAddress, String approximateAddress, String description, String hostRules, int minimumNights, int maximumNights) {
        this.id = id;
        this.guid = guid;
        this.title = title;
        this.capacity = capacity;
        this.numberOfBeds = numberOfBeds;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.exactAddress = exactAddress;
        this.approximateAddress = approximateAddress;
        this.description = description;
        this.hostRules = hostRules;
        this.minimumNights = minimumNights;
        this.maximumNights = maximumNights;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public String getExactAddress() {
        return exactAddress;
    }

    public void setExactAddress(String exactAddress) {
        this.exactAddress = exactAddress;
    }

    public String getApproximateAddress() {
        return approximateAddress;
    }

    public void setApproximateAddress(String approximateAddress) {
        this.approximateAddress = approximateAddress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHostRules() {
        return hostRules;
    }

    public void setHostRules(String hostRules) {
        this.hostRules = hostRules;
    }

    public int getMinimumNights() {
        return minimumNights;
    }

    public void setMinimumNights(int minimumNights) {
        this.minimumNights = minimumNights;
    }

    public int getMaximumNights() {
        return maximumNights;
    }

    public void setMaximumNights(int maximumNights) {
        this.maximumNights = maximumNights;
    }

    public List<Itemprices> getItempricesList() {
        return itempricesList;
    }

    public void setItempricesList(List<Itemprices> itempricesList) {
        this.itempricesList = itempricesList;
    }

    public List<Itemscores> getItemscoresList() {
        return itemscoresList;
    }

    public void setItemscoresList(List<Itemscores> itemscoresList) {
        this.itemscoresList = itemscoresList;
    }

    public List<Itemattractions> getItemattractionsList() {
        return itemattractionsList;
    }

    public void setItemattractionsList(List<Itemattractions> itemattractionsList) {
        this.itemattractionsList = itemattractionsList;
    }

    public List<Itemamenities> getItemamenitiesList() {
        return itemamenitiesList;
    }

    public void setItemamenitiesList(List<Itemamenities> itemamenitiesList) {
        this.itemamenitiesList = itemamenitiesList;
    }

    public List<Itempictures> getItempicturesList() {
        return itempicturesList;
    }

    public void setItempicturesList(List<Itempictures> itempicturesList) {
        this.itempicturesList = itempicturesList;
    }

    public Areas getAreaID() {
        return areaID;
    }

    public void setAreaID(Areas areaID) {
        this.areaID = areaID;
    }

    public Itemtypes getItemTypeID() {
        return itemTypeID;
    }

    public void setItemTypeID(Itemtypes itemTypeID) {
        this.itemTypeID = itemTypeID;
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
        if (!(object instanceof Items)) {
            return false;
        }
        Items other = (Items) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "session2.entity.Items[ id=" + id + " ]";
    }
    
}
