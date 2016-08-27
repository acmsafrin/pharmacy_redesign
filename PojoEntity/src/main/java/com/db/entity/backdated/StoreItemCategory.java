/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db.entity.backdated;

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
public class StoreItemCategory extends com.db.entity.Category implements Serializable {
    private static final long serialVersionUID = 1L;
    

 
}
