/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.db.dao.VmpFacade;
import com.db.entity.pharmacy.Vmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACM Safrin
 */
@Service
public class VmpService extends AbstractRestService<Vmp> {

    @Autowired
    public void setAbstractFacade(VmpFacade facade) {
        super.setAbstractFacade(facade); //To change body of generated methods, choose Tools | Templates.
    }

}
