/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.db.dao.AbstractFacade;
import com.util.GsonUtil;
import java.util.Date;
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
        try {
            t.getClass().getDeclaredMethod("setCreatedAt", Date.class).invoke(t, new Date());
        } catch (Exception e) {
            e.printStackTrace();
        }
        abstractFacade.save(t);
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void update(T t) {
        abstractFacade.update(t);
    }

    @Transactional(readOnly = false)
    public void delete(long id) {
        T t = (T) abstractFacade.find(id);
        
        try {
            t.getClass().getDeclaredMethod("setRetired", Boolean.class).invoke(t, true);
            t.getClass().getDeclaredMethod("setRetiredAt", Date.class).invoke(t, new Date());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        abstractFacade.update(t);
    }

}
