/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session2.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "cancellationrefundfees")
@NamedQueries({
    @NamedQuery(name = "Cancellationrefundfees.findAll", query = "SELECT c FROM Cancellationrefundfees c"),
    @NamedQuery(name = "Cancellationrefundfees.findById", query = "SELECT c FROM Cancellationrefundfees c WHERE c.id = :id"),
    @NamedQuery(name = "Cancellationrefundfees.findByGuid", query = "SELECT c FROM Cancellationrefundfees c WHERE c.guid = :guid"),
    @NamedQuery(name = "Cancellationrefundfees.findByDaysLeft", query = "SELECT c FROM Cancellationrefundfees c WHERE c.daysLeft = :daysLeft"),
    @NamedQuery(name = "Cancellationrefundfees.findByPenaltyPercentage", query = "SELECT c FROM Cancellationrefundfees c WHERE c.penaltyPercentage = :penaltyPercentage")})
public class Cancellationrefundfees implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "GUID")
    private String guid;
    @Basic(optional = false)
    @Column(name = "DaysLeft")
    private int daysLeft;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PenaltyPercentage")
    private BigDecimal penaltyPercentage;
    @JoinColumn(name = "CancellationPolicyID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Cancellationpolicies cancellationPolicyID;

    public Cancellationrefundfees() {
    }

    public Cancellationrefundfees(Long id) {
        this.id = id;
    }

    public Cancellationrefundfees(Long id, String guid, int daysLeft, BigDecimal penaltyPercentage) {
        this.id = id;
        this.guid = guid;
        this.daysLeft = daysLeft;
        this.penaltyPercentage = penaltyPercentage;
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

    public int getDaysLeft() {
        return daysLeft;
    }

    public void setDaysLeft(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    public BigDecimal getPenaltyPercentage() {
        return penaltyPercentage;
    }

    public void setPenaltyPercentage(BigDecimal penaltyPercentage) {
        this.penaltyPercentage = penaltyPercentage;
    }

    public Cancellationpolicies getCancellationPolicyID() {
        return cancellationPolicyID;
    }

    public void setCancellationPolicyID(Cancellationpolicies cancellationPolicyID) {
        this.cancellationPolicyID = cancellationPolicyID;
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
        if (!(object instanceof Cancellationrefundfees)) {
            return false;
        }
        Cancellationrefundfees other = (Cancellationrefundfees) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "session2.entity.Cancellationrefundfees[ id=" + id + " ]";
    }
    
}
