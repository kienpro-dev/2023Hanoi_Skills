/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session2.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "cancellationpolicies")
@NamedQueries({
    @NamedQuery(name = "Cancellationpolicies.findAll", query = "SELECT c FROM Cancellationpolicies c"),
    @NamedQuery(name = "Cancellationpolicies.findById", query = "SELECT c FROM Cancellationpolicies c WHERE c.id = :id"),
    @NamedQuery(name = "Cancellationpolicies.findByGuid", query = "SELECT c FROM Cancellationpolicies c WHERE c.guid = :guid"),
    @NamedQuery(name = "Cancellationpolicies.findByName", query = "SELECT c FROM Cancellationpolicies c WHERE c.name = :name"),
    @NamedQuery(name = "Cancellationpolicies.findByCommission", query = "SELECT c FROM Cancellationpolicies c WHERE c.commission = :commission")})
public class Cancellationpolicies implements Serializable {

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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "Commission")
    private BigDecimal commission;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cancellationPolicyID")
    private List<Itemprices> itempricesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cancellationPolicyID")
    private List<Cancellationrefundfees> cancellationrefundfeesList;

    public Cancellationpolicies() {
    }

    public Cancellationpolicies(Long id) {
        this.id = id;
    }

    public Cancellationpolicies(Long id, String guid, String name, BigDecimal commission) {
        this.id = id;
        this.guid = guid;
        this.name = name;
        this.commission = commission;
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

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public List<Itemprices> getItempricesList() {
        return itempricesList;
    }

    public void setItempricesList(List<Itemprices> itempricesList) {
        this.itempricesList = itempricesList;
    }

    public List<Cancellationrefundfees> getCancellationrefundfeesList() {
        return cancellationrefundfeesList;
    }

    public void setCancellationrefundfeesList(List<Cancellationrefundfees> cancellationrefundfeesList) {
        this.cancellationrefundfeesList = cancellationrefundfeesList;
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
        if (!(object instanceof Cancellationpolicies)) {
            return false;
        }
        Cancellationpolicies other = (Cancellationpolicies) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "session2.entity.Cancellationpolicies[ id=" + id + " ]";
    }
    
}
