/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.service.*;
import com.db.dao.PharmaceuticalItemCategoryFacade;
import com.db.entity.pharmacy.PharmaceuticalItemCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACM Safrin
 */
@Service
public class PharmaceuticalItemCategoryService extends AbstractRestService<PharmaceuticalItemCategory> {

    @Autowired
    public void setAbstractFacade(PharmaceuticalItemCategoryFacade facade) {
        super.setAbstractFacade(facade); //To change body of generated methods, choose Tools | Templates.
    }

}
