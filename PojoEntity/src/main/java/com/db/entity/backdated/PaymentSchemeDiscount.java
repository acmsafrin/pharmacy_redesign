/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db.entity.backdated;


import com.db.entity.backdated.PriceMatrix;
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
public class PaymentSchemeDiscount extends PriceMatrix implements Serializable {
    private static final long serialVersionUID = 1L;
    
}