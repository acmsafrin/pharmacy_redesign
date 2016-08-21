/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.db.dao.PharmaceuticalItemTypeFacade;
import com.db.entity.pharmacy.PharmaceuticalItemType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACM Safrin
 */
@Service
public class PharmaceuticalItemTypeService extends AbstractRestService<PharmaceuticalItemType> {

    @Autowired
    public void setAbstractFacade(PharmaceuticalItemTypeFacade facade) {
        super.setAbstractFacade(facade); //To change body of generated methods, choose Tools | Templates.
    }

}
