/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.db.entity.pharmacy;

import com.db.entity.Category;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author ACM Safrin
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class PharmaceuticalItemType extends Category implements Serializable{
     private static final long serialVersionUID = 1L;
}
