/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db.entity.backdated;

import com.db.entity.Category;
import com.db.entity.backdated.Staff;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author buddhika
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@XmlRootElement
public class Grade extends Category implements Serializable {
  
    private static final long serialVersionUID = 1L;



   
    
    
}
