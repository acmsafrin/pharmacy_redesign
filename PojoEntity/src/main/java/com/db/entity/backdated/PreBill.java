/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db.entity.backdated;


import com.enums.BillClassType;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author buddhika
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class PreBill extends Bill implements Serializable {

    public PreBill() {
        billClassType = BillClassType.PreBill;
        qty = 1;
    }
//    private static final long serialVersionUID = 1L;

}
