/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.db.dao;

import com.db.entity.pharmacy.Vmp;
import org.springframework.stereotype.Component;

/**
 *
 * @author ACM Safrin
 */
@Component
public class VmpFacade extends AbstractFacade<Vmp>{

    public VmpFacade() {
        super(Vmp.class);
    }
}
