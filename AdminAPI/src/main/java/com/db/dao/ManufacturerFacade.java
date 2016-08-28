/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.db.dao;

import com.db.entity.Manufacturer;
import org.springframework.stereotype.Component;

/**
 *
 * @author ACM Safrin
 */
@Component
public class ManufacturerFacade extends AbstractFacade<Manufacturer>{

    public ManufacturerFacade() {
        super(Manufacturer.class);
    }
}
