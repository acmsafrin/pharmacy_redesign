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
public class RefundBill extends Bill implements Serializable {

    public RefundBill() {
        billClassType = BillClassType.RefundBill;
        qty = 0 - 1;
    }

}
