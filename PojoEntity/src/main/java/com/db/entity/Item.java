
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db.entity;


import com.db.entity.pharmacy.MeasurementUnit;
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
    Long id;
    int orderNo;
    @ManyToOne
    Category category;
    Double total = 0.0;
    Boolean discountAllowed = false;
    @ManyToOne
    Institution institution;
    @ManyToOne
    Department department;    
    @ManyToOne
    Institution forInstitution;
    @ManyToOne
    Department forDepartment;   
    @ManyToOne
    Item billedAs;
    @ManyToOne
    Item reportedAs;
    String name;
    String sname;
    String tname;
    String code;
    String barcode;
    String printName;
    String shortName;
    String fullName;
    //Created Properties
    @ManyToOne
    WebUser creater;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    Date createdAt;
    //Retairing properties
    boolean retired;
    @ManyToOne
    WebUser retirer;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    Date retiredAt;
    String retireComments;
    @ManyToOne
    Item parentItem;
    boolean userChangable;   
    private double dblValue = 0.0f;   
    boolean priceByBatch;
    @ManyToOne
    MeasurementUnit measurementUnit;
    @ManyToOne
    Category worksheet;
    @ManyToOne
    Category reportFormat;
    boolean billable;
    boolean formatable;
    boolean patientNotRequired;
    boolean chargesVisibleForInward;
    boolean requestForQuentity;
    boolean marginNotAllowed;
    @ManyToOne
    Institution manufacturer;
    @ManyToOne
    Institution importer;

    @Lob
    String descreption;
    @Lob
    String comments;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date effectiveFrom;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date effectiveTo;
    private boolean scanFee;
    double profitMargin;
   
    String creditNumbers;
    String cashNumbers;
    String agencyNumbers;
    String reserveName;
    String reserveNumbers;
    int maxTableRows;

    public String getCreditNumbers() {
        return creditNumbers;
    }

    public void setCreditNumbers(String creditNumbers) {
        this.creditNumbers = creditNumbers;
    }

    public String getCashNumbers() {
        return cashNumbers;
    }

    public void setCashNumbers(String cashNumbers) {
        this.cashNumbers = cashNumbers;
    }

        public String getAgencyNumbers() {
        return agencyNumbers;
    }

    public void setAgencyNumbers(String agencyNumbers) {
        this.agencyNumbers = agencyNumbers;
    }

    public String getReserveName() {
        return reserveName;
    }

    public void setReserveName(String reserveName) {
        this.reserveName = reserveName;
    }

    public int getMaxTableRows() {
        return maxTableRows;
    }

    public void setMaxTableRows(int maxTableRows) {
        this.maxTableRows = maxTableRows;
    }

    public Date getEffectiveFrom() {
        return effectiveFrom;
    }

    public void setEffectiveFrom(Date effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
    }

    public boolean isMarginNotAllowed() {
        return marginNotAllowed;
    }

    public void setMarginNotAllowed(boolean marginNotAllowed) {
        this.marginNotAllowed = marginNotAllowed;
    }

   

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

 
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean isDiscountAllowed() {
        return discountAllowed;
    }

    public Boolean getDiscountAllowed() {
        return discountAllowed;
    }

    public void setDiscountAllowed(Boolean discountAllowed) {
        this.discountAllowed = discountAllowed;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

  

    public Institution getForInstitution() {
        return forInstitution;
    }

    public void setForInstitution(Institution forInstitution) {
        this.forInstitution = forInstitution;
    }

    public Department getForDepartment() {
        return forDepartment;
    }

    public void setForDepartment(Department forDepartment) {
        this.forDepartment = forDepartment;
    }

    

    public Item getBilledAs() {
        return billedAs;
    }

    public void setBilledAs(Item billedAs) {
        this.billedAs = billedAs;
    }

    public Item getReportedAs() {
        return reportedAs;
    }

    public void setReportedAs(Item reportedAs) {
        this.reportedAs = reportedAs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
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

    public String getPrintName() {
        return printName;
    }

    public void setPrintName(String printName) {
        this.printName = printName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public WebUser getCreater() {
        return creater;
    }

    public void setCreater(WebUser creater) {
        this.creater = creater;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }

    public WebUser getRetirer() {
        return retirer;
    }

    public void setRetirer(WebUser retirer) {
        this.retirer = retirer;
    }

    public Date getRetiredAt() {
        return retiredAt;
    }

    public void setRetiredAt(Date retiredAt) {
        this.retiredAt = retiredAt;
    }

    public String getRetireComments() {
        return retireComments;
    }

    public void setRetireComments(String retireComments) {
        this.retireComments = retireComments;
    }

    public Item getParentItem() {
        return parentItem;
    }

    public void setParentItem(Item parentItem) {
        this.parentItem = parentItem;
    }

    public boolean isUserChangable() {
        return userChangable;
    }

    public void setUserChangable(boolean userChangable) {
        this.userChangable = userChangable;
    }

    
    public boolean isPriceByBatch() {
        return priceByBatch;
    }

    public void setPriceByBatch(boolean priceByBatch) {
        this.priceByBatch = priceByBatch;
    }

    public MeasurementUnit getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(MeasurementUnit measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    public Category getWorksheet() {
        return worksheet;
    }

    public void setWorksheet(Category worksheet) {
        this.worksheet = worksheet;
    }

    public Category getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(Category reportFormat) {
        this.reportFormat = reportFormat;
    }

    public boolean isBillable() {
        return billable;
    }

    public void setBillable(boolean billable) {
        this.billable = billable;
    }

    public boolean isFormatable() {
        return formatable;
    }

    public void setFormatable(boolean formatable) {
        this.formatable = formatable;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

   

    public boolean isPatientNotRequired() {
        return patientNotRequired;
    }

    public void setPatientNotRequired(boolean patientNotRequired) {
        this.patientNotRequired = patientNotRequired;
    }

   

    public double getDblValue() {
        return dblValue;
    }

    public void setDblValue(double dblValue) {
        this.dblValue = dblValue;
    }

 
    public double getProfitMargin() {
        return profitMargin;
    }

    public void setProfitMargin(double profitMargin) {
        this.profitMargin = profitMargin;
    }


  
    public boolean isChargesVisibleForInward() {
        return chargesVisibleForInward;
    }

    public void setChargesVisibleForInward(boolean chargesVisibleForInward) {
        this.chargesVisibleForInward = chargesVisibleForInward;
    }

    public boolean isRequestForQuentity() {
        return requestForQuentity;
    }

    public void setRequestForQuentity(boolean requestForQuentity) {
        this.requestForQuentity = requestForQuentity;
    }

    public Institution getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Institution manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Institution getImporter() {
        return importer;
    }

    public void setImporter(Institution importer) {
        this.importer = importer;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

   
    public Date getEffectiveTo() {
        return effectiveTo;
    }

    public void setEffectiveTo(Date effectiveTo) {
        this.effectiveTo = effectiveTo;
    }

    public boolean isScanFee() {
        return scanFee;
    }

    public void setScanFee(boolean scanFee) {
        this.scanFee = scanFee;
    }

  

    public String getReserveNumbers() {
        return reserveNumbers;
    }

    public void setReserveNumbers(String reserveNumbers) {
        this.reserveNumbers = reserveNumbers;
    }

    @Override
    public int compareTo(Item o) {
        if(o==null){
            return 0;
        }
        
        if(o.getName()==null){
            return 0;
        }
        
        if(this==null){
            return 0;
        }
        
        if(this.getName()==null){
            return 0;
        }
        
        return this.name.compareTo(o.name);
    }

   

 

}
