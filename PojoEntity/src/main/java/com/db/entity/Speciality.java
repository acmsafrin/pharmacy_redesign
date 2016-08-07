/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db.entity;

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
public class Speciality extends Category implements Serializable {
    private static final long serialVersionUID = 1L;
   
    
}
