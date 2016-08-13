/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.db.dao.AbstractFacade;
import com.util.GsonUtil;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ACM Safrin
 */
public class AbstractRestService<T> {

    private AbstractFacade abstractFacade;

    public AbstractFacade getAbstractFacade() {
        return abstractFacade;
    }

    public void setAbstractFacade(AbstractFacade abstractFacade) {
        this.abstractFacade = abstractFacade;
    }

    public String findAll() {
        return GsonUtil.toJson(abstractFacade.findAll());
    }

    public String find(long id) {
        return GsonUtil.toJson(abstractFacade.find(id));
    }
    
     public String findByName(String name) {
        return GsonUtil.toJson(abstractFacade.findByName(name));
    }

    @Transactional(readOnly = false)
    public void save(T t) {
        abstractFacade.save(t);
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void update(T t) {
        abstractFacade.update(t);
    }

    @Transactional(readOnly = false)
    public void delete(long id) {
        T t = (T) abstractFacade.find(id);
        abstractFacade.delete(t);
    }

}
