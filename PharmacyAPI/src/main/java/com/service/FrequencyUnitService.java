/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.db.dao.FrequencyUnitFacade;
import com.db.entity.pharmacy.FrequencyUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACM Safrin
 */
@Service
public class FrequencyUnitService extends AbstractRestService<FrequencyUnit> {

    @Autowired
    public void setAbstractFacade(FrequencyUnitFacade facade) {
        super.setAbstractFacade(facade); //To change body of generated methods, choose Tools | Templates.
    }

}
