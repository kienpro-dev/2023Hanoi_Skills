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
@Table(name = "itemscores")
@NamedQueries({
    @NamedQuery(name = "Itemscores.findAll", query = "SELECT i FROM Itemscores i"),
    @NamedQuery(name = "Itemscores.findById", query = "SELECT i FROM Itemscores i WHERE i.id = :id"),
    @NamedQuery(name = "Itemscores.findByGuid", query = "SELECT i FROM Itemscores i WHERE i.guid = :guid"),
    @NamedQuery(name = "Itemscores.findByValue", query = "SELECT i FROM Itemscores i WHERE i.value = :value"),
    @NamedQuery(name = "Itemscores.findCustom", query = "SELECT i FROM Itemscores i WHERE i.itemID.id = :id")})
public class Itemscores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "GUID")
    private String guid;
    @Basic(optional = false)
    @Column(name = "Value")
    private long value;
    @JoinColumn(name = "ItemID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Items itemID;
    @JoinColumn(name = "ScoreID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Scores scoreID;
    @JoinColumn(name = "UserID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Users userID;

    public Itemscores() {
    }

    public Itemscores(Long id) {
        this.id = id;
    }

    public Itemscores(Long id, String guid, long value) {
        this.id = id;
        this.guid = guid;
        this.value = value;
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

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public Items getItemID() {
        return itemID;
    }

    public void setItemID(Items itemID) {
        this.itemID = itemID;
    }

    public Scores getScoreID() {
        return scoreID;
    }

    public void setScoreID(Scores scoreID) {
        this.scoreID = scoreID;
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
        if (!(object instanceof Itemscores)) {
            return false;
        }
        Itemscores other = (Itemscores) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "session4.entity.Itemscores[ id=" + id + " ]";
    }
    
}
