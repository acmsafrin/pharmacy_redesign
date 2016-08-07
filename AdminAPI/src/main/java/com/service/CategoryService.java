/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.db.dao.CategoryFacade;
import com.db.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACM Safrin
 */
@Service
public class CategoryService extends AbstractRestService<Category> {

    @Autowired
    public void setAbstractFacade(CategoryFacade categoryFacade) {
        super.setAbstractFacade(categoryFacade); //To change body of generated methods, choose Tools | Templates.
    }

}
