/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.db.dao.MeasurementUnitFacade;
import com.db.entity.pharmacy.MeasurementUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACM Safrin
 */
@Service
public class MeasurementUnitService extends AbstractRestService<MeasurementUnit> {

    @Autowired
    public void setAbstractFacade(MeasurementUnitFacade facade) {
        super.setAbstractFacade(facade); //To change body of generated methods, choose Tools | Templates.
    }

}