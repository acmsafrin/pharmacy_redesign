/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.db.dao.CategoryFacade;
import com.db.dao.WebUserFacade;
import com.db.entity.WebUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACM Safrin
 */
@Service
public class WebUserService extends AbstractRestService<WebUser> {

    @Autowired
    public void setAbstractFacade(WebUserFacade facade) {
        super.setAbstractFacade(facade); //To change body of generated methods, choose Tools | Templates.
    }

}
