/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.db.dao.ItemDistributorFacade;
import com.db.entity.pharmacy.ItemsDistributors;
import com.util.GsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACM Safrin
 */
@Service
public class ItemDistributorService extends AbstractRestService<ItemsDistributors> {

    @Autowired
    public void setAbstractFacade(ItemDistributorFacade facade) {
        super.setAbstractFacade(facade); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String findByDealer(Long id) {
        return GsonUtil.toJson(((ItemDistributorFacade)getAbstractFacade()).findByDealer(id));
    }

}
