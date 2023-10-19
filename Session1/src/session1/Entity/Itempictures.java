/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session1.Entity;

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
@Table(name = "itempictures")
@NamedQueries({
    @NamedQuery(name = "Itempictures.findAll", query = "SELECT i FROM Itempictures i"),
    @NamedQuery(name = "Itempictures.findById", query = "SELECT i FROM Itempictures i WHERE i.id = :id"),
    @NamedQuery(name = "Itempictures.findByGuid", query = "SELECT i FROM Itempictures i WHERE i.guid = :guid"),
    @NamedQuery(name = "Itempictures.findByPictureFileName", query = "SELECT i FROM Itempictures i WHERE i.pictureFileName = :pictureFileName")})
public class Itempictures implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "GUID")
    private String guid;
    @Basic(optional = false)
    @Column(name = "PictureFileName")
    private String pictureFileName;
    @JoinColumn(name = "ItemID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Items itemID;

    public Itempictures() {
    }

    public Itempictures(Long id) {
        this.id = id;
    }

    public Itempictures(Long id, String guid, String pictureFileName) {
        this.id = id;
        this.guid = guid;
        this.pictureFileName = pictureFileName;
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

    public String getPictureFileName() {
        return pictureFileName;
    }

    public void setPictureFileName(String pictureFileName) {
        this.pictureFileName = pictureFileName;
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
        if (!(object instanceof Itempictures)) {
            return false;
        }
        Itempictures other = (Itempictures) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "session1.Itempictures[ id=" + id + " ]";
    }
    
}
