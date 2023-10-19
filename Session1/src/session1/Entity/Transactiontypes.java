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
@Table(name = "transactiontypes")
@NamedQueries({
    @NamedQuery(name = "Transactiontypes.findAll", query = "SELECT t FROM Transactiontypes t"),
    @NamedQuery(name = "Transactiontypes.findById", query = "SELECT t FROM Transactiontypes t WHERE t.id = :id"),
    @NamedQuery(name = "Transactiontypes.findByGuid", query = "SELECT t FROM Transactiontypes t WHERE t.guid = :guid"),
    @NamedQuery(name = "Transactiontypes.findByName", query = "SELECT t FROM Transactiontypes t WHERE t.name = :name")})
public class Transactiontypes implements Serializable {

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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "transactionTypeID")
    private List<Transactions> transactionsList;

    public Transactiontypes() {
    }

    public Transactiontypes(Long id) {
        this.id = id;
    }

    public Transactiontypes(Long id, String guid, String name) {
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

    public List<Transactions> getTransactionsList() {
        return transactionsList;
    }

    public void setTransactionsList(List<Transactions> transactionsList) {
        this.transactionsList = transactionsList;
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
        if (!(object instanceof Transactiontypes)) {
            return false;
        }
        Transactiontypes other = (Transactiontypes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "session1.Transactiontypes[ id=" + id + " ]";
    }
    
}
