/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.db.entity;

import com.db.entity.Institution;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author ACM Safrin
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Importer extends Institution{
    
}
