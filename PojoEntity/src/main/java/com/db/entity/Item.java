
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db.entity;

import com.db.entity.pharmacy.MeasurementUnit;
import com.google.gson.annotations.Expose;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author buddhika
 */
@Entity
public class Item implements Serializable, Comparable<Item> {

    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Expose
    private Long id;
    @ManyToOne
    @Expose
    private Category category;
    @ManyToOne
    @Expose
    private Institution institution;
    @ManyToOne
    @Expose
    private WebUser creater;
    @ManyToOne
    @Expose
    private WebUser retirer;
    @ManyToOne
    @Expose
    private MeasurementUnit measurementUnit;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Expose
    private Date createdAt;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Expose
    private Date retiredAt;

    @Expose
    private String name;
    @Expose
    private String code;
    @Expose
    private String barcode;
    @Expose
    private boolean retired;
    @Expose
    private String retireComments;
    @Lob
    @Expose
    private String comments;

    public Item() {

    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.divudi.entity.Item[ id=" + id + " ]";
    }

    
    @Override
    public int compareTo(Item o) {
        if (o == null) {
            return 0;
        }

        if (o.getName() == null) {
            return 0;
        }

        if (this == null) {
            return 0;
        }

        if (this.getName() == null) {
            return 0;
        }

        return this.name.compareTo(o.name);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public WebUser getCreater() {
        return creater;
    }

    public void setCreater(WebUser creater) {
        this.creater = creater;
    }

    public WebUser getRetirer() {
        return retirer;
    }

    public void setRetirer(WebUser retirer) {
        this.retirer = retirer;
    }

    public MeasurementUnit getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(MeasurementUnit measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getRetiredAt() {
        return retiredAt;
    }

    public void setRetiredAt(Date retiredAt) {
        this.retiredAt = retiredAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }

    public String getRetireComments() {
        return retireComments;
    }

    public void setRetireComments(String retireComments) {
        this.retireComments = retireComments;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    
    
}
