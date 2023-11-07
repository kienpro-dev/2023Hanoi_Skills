/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session2.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author tienk
 */
@Entity
@Table(name = "transactions")
@NamedQueries({
    @NamedQuery(name = "Transactions.findAll", query = "SELECT t FROM Transactions t"),
    @NamedQuery(name = "Transactions.findById", query = "SELECT t FROM Transactions t WHERE t.id = :id"),
    @NamedQuery(name = "Transactions.findByGuid", query = "SELECT t FROM Transactions t WHERE t.guid = :guid"),
    @NamedQuery(name = "Transactions.findByUserID", query = "SELECT t FROM Transactions t WHERE t.userID = :userID"),
    @NamedQuery(name = "Transactions.findByAmount", query = "SELECT t FROM Transactions t WHERE t.amount = :amount"),
    @NamedQuery(name = "Transactions.findByTransactionDate", query = "SELECT t FROM Transactions t WHERE t.transactionDate = :transactionDate"),
    @NamedQuery(name = "Transactions.findByGatewayReturnID", query = "SELECT t FROM Transactions t WHERE t.gatewayReturnID = :gatewayReturnID")})
public class Transactions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "GUID")
    private String guid;
    @Basic(optional = false)
    @Column(name = "UserID")
    private long userID;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "Amount")
    private BigDecimal amount;
    @Basic(optional = false)
    @Column(name = "TransactionDate")
    @Temporal(TemporalType.DATE)
    private Date transactionDate;
    @Basic(optional = false)
    @Column(name = "GatewayReturnID")
    private String gatewayReturnID;
    @JoinColumn(name = "TransactionTypeID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Transactiontypes transactionTypeID;
    @OneToMany(mappedBy = "transactionID")
    private List<Bookings> bookingsList;

    public Transactions() {
    }

    public Transactions(Long id) {
        this.id = id;
    }

    public Transactions(Long id, String guid, long userID, BigDecimal amount, Date transactionDate, String gatewayReturnID) {
        this.id = id;
        this.guid = guid;
        this.userID = userID;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.gatewayReturnID = gatewayReturnID;
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

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getGatewayReturnID() {
        return gatewayReturnID;
    }

    public void setGatewayReturnID(String gatewayReturnID) {
        this.gatewayReturnID = gatewayReturnID;
    }

    public Transactiontypes getTransactionTypeID() {
        return transactionTypeID;
    }

    public void setTransactionTypeID(Transactiontypes transactionTypeID) {
        this.transactionTypeID = transactionTypeID;
    }

    public List<Bookings> getBookingsList() {
        return bookingsList;
    }

    public void setBookingsList(List<Bookings> bookingsList) {
        this.bookingsList = bookingsList;
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
        if (!(object instanceof Transactions)) {
            return false;
        }
        Transactions other = (Transactions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "session2.entity.Transactions[ id=" + id + " ]";
    }
    
}
