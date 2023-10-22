/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session4.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author tienk
 */
@Entity
@Table(name = "dimdates")
@NamedQueries({
    @NamedQuery(name = "Dimdates.findAll", query = "SELECT d FROM Dimdates d"),
    @NamedQuery(name = "Dimdates.findById", query = "SELECT d FROM Dimdates d WHERE d.id = :id"),
    @NamedQuery(name = "Dimdates.findByDate", query = "SELECT d FROM Dimdates d WHERE d.date = :date"),
    @NamedQuery(name = "Dimdates.findByYear", query = "SELECT d FROM Dimdates d WHERE d.year = :year"),
    @NamedQuery(name = "Dimdates.findByQuarter", query = "SELECT d FROM Dimdates d WHERE d.quarter = :quarter"),
    @NamedQuery(name = "Dimdates.findByMonth", query = "SELECT d FROM Dimdates d WHERE d.month = :month"),
    @NamedQuery(name = "Dimdates.findByMonthName", query = "SELECT d FROM Dimdates d WHERE d.monthName = :monthName"),
    @NamedQuery(name = "Dimdates.findByDayOfMonth", query = "SELECT d FROM Dimdates d WHERE d.dayOfMonth = :dayOfMonth"),
    @NamedQuery(name = "Dimdates.findByDayOfWeek", query = "SELECT d FROM Dimdates d WHERE d.dayOfWeek = :dayOfWeek"),
    @NamedQuery(name = "Dimdates.findByDayName", query = "SELECT d FROM Dimdates d WHERE d.dayName = :dayName"),
    @NamedQuery(name = "Dimdates.findByIsHoliday", query = "SELECT d FROM Dimdates d WHERE d.isHoliday = :isHoliday")})
public class Dimdates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @Column(name = "Year")
    private int year;
    @Basic(optional = false)
    @Column(name = "Quarter")
    private int quarter;
    @Basic(optional = false)
    @Column(name = "Month")
    private int month;
    @Basic(optional = false)
    @Column(name = "MonthName")
    private String monthName;
    @Basic(optional = false)
    @Column(name = "DayOfMonth")
    private int dayOfMonth;
    @Basic(optional = false)
    @Column(name = "DayOfWeek")
    private int dayOfWeek;
    @Basic(optional = false)
    @Column(name = "DayName")
    private String dayName;
    @Basic(optional = false)
    @Column(name = "isHoliday")
    private boolean isHoliday;

    public Dimdates() {
    }

    public Dimdates(Long id) {
        this.id = id;
    }

    public Dimdates(Long id, Date date, int year, int quarter, int month, String monthName, int dayOfMonth, int dayOfWeek, String dayName, boolean isHoliday) {
        this.id = id;
        this.date = date;
        this.year = year;
        this.quarter = quarter;
        this.month = month;
        this.monthName = monthName;
        this.dayOfMonth = dayOfMonth;
        this.dayOfWeek = dayOfWeek;
        this.dayName = dayName;
        this.isHoliday = isHoliday;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getQuarter() {
        return quarter;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public boolean getIsHoliday() {
        return isHoliday;
    }

    public void setIsHoliday(boolean isHoliday) {
        this.isHoliday = isHoliday;
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
        if (!(object instanceof Dimdates)) {
            return false;
        }
        Dimdates other = (Dimdates) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "session4.entity.Dimdates[ id=" + id + " ]";
    }
    
}
