/*
 * Author : Dr. M H B Ariyaratne
 *
 * MO(Health Information), Department of Health Services, Southern Province
 * and
 * Email : buddhika.ari@gmail.com
 */
package com.db.entity;

import com.enums.Title;
import com.enums.Sex;
import com.google.gson.annotations.Expose;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author ACM Safrin
 */
@Entity
public class Person implements Serializable {

    static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Expose
    Long id;
    @ManyToOne
    WebUser creater;
    @ManyToOne
    WebUser retirer;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Expose
    Date dob;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Expose
    Date createdAt;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Expose
    Date retiredAt;

    @Enumerated(EnumType.STRING)
    @Expose
    Title title;
    @Enumerated(EnumType.STRING)
    @Expose
    Sex sex;

    @Expose
    String name;
    @Expose
    String description;
    @Expose
    String nic;
    @Expose
    String address;
    @Expose
    String fax;
    @Expose
    String email;
    @Expose
    String website;
    @Expose
    String mobile;
    @Expose
    String phone;
    @Expose
    String initials;
    @Expose
    String surName;
    @Expose
    String zoneCode;
    @Expose
    boolean retired;
    @Expose
    String retireComments;

//    @Transient
//    String nameWithTitle;
//   
//
//    public String getNameWithTitle() {
//        String temT = "";
//        Title t;
//        if (getName() != null) {
//            t = getTitle();
//            if (t == Title.Baby) {
//                temT = "Baby ";
//            } else if (t == Title.Dr) {
//                temT = "Dr. ";
//            } else if (t == Title.DrMiss) {
//                temT = "Dr(Miss). ";
//            } else if (t == Title.DrMrs) {
//                temT = "Dr(Mrs). ";
//            } else if (t == Title.DrMs) {
//                temT = "Dr(Ms). ";
//            } else if (t == Title.Hon) {
//                temT = "Hon. ";
//            } else if (t == Title.Master) {
//                temT = "Master. ";
//            } else if (t == Title.Miss) {
//                temT = "Miss. ";
//            } else if (t == Title.Mr) {
//                temT = "Mr. ";
//            } else if (t == Title.Mrs) {
//                temT = "Mrs. ";
//            } else if (t == Title.Ms) {
//                temT = "Ms. ";
//            } else if (t == Title.Prof) {
//                temT = "Prof. ";
//            } else if (t == Title.Rev) {
//                temT = "Rev. ";
//            } else if (t == Title.RtHon) {
//                temT = "Rt. Hon. ";
//            } else if (t == Title.RtRev) {
//                temT = "Rt. Rev. ";
//            } else {
//                temT = "";
//            }
//
//            nameWithTitle = temT + getName();
//        }
//
//        return nameWithTitle;
//    }
//
//    public void setNameWithTitle(String nameWithTitle) {
//        this.nameWithTitle = nameWithTitle.toUpperCase();
//    }
    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getRetireComments() {
        return retireComments;
    }

    public void setRetireComments(String retireComments) {
        this.retireComments = retireComments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public WebUser getCreater() {
        return creater;
    }

    public void setCreater(WebUser creater) {
        this.creater = creater;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getZoneCode() {
        return zoneCode;
    }

    public void setZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setRetired(Boolean retired) {
        this.retired = retired;
    }

    public Date getRetiredAt() {
        return retiredAt;
    }

    public void setRetiredAt(Date retiredAt) {
        this.retiredAt = retiredAt;
    }

    public WebUser getRetirer() {
        return retirer;
    }

    public void setRetirer(WebUser retirer) {
        this.retirer = retirer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address.toUpperCase();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

}
