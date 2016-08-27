/*
 * Author
 * Dr. M H B Ariyaratne, MO(Health Information), email : buddhika.ari@gmail.com
 */
package com.db.entity;

import com.google.gson.annotations.Expose;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 *
 * @author ACM Safrin
 */
@Entity
public class Category implements Serializable {

    static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Expose
    private Long id;
    @ManyToOne
    @Expose
    private WebUser creater;
    @ManyToOne
    @Expose
    private WebUser retirer;
    @ManyToOne
    @Expose
    private Category parentCategory;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Expose
    private Date createdAt;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Expose
    private Date retiredAt;

    @Expose
    private String name;
    @Expose
    private String description;
    @Expose
    private boolean retired;
    @Expose
    private String retireComments;
    @Expose
    private Double dblValue;
    @Expose
    private Long longValue;
    @Expose
    private String code;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Category)) {
            return false;
        }
        Category other = (Category) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.divudi.entity.Category[ id=" + id + " ]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Double getDblValue() {
        return dblValue;
    }

    public void setDblValue(Double dblValue) {
        this.dblValue = dblValue;
    }

    public Long getLongValue() {
        return longValue;
    }

    public void setLongValue(Long longValue) {
        this.longValue = longValue;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
