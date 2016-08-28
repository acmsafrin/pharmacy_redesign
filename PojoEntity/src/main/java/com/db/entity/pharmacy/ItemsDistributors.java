/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db.entity.pharmacy;

import com.db.entity.Institution;
import com.db.entity.Item;
import com.db.entity.WebUser;
import com.google.gson.annotations.Expose;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author safrin
 */
@Entity
public class ItemsDistributors implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    private Institution institution;
    @ManyToOne
    @Expose
    private Item item;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Expose
    private Date createdAt;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Expose
    private Date retiredAt;

    @Expose
    private boolean retired;
    @Expose
    private String retireComments;
    @Expose
    private int orderNo;

  
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ItemsDistributors)) {
            return false;
        }
        ItemsDistributors other = (ItemsDistributors) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.divudi.entity.pharmacy.ItemsDistributors[ id=" + id + " ]";
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
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

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

   
}
