/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.db.dao.AbstractFacade;
import com.db.entity.WebUser;
import com.util.GsonUtil;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ACM Safrin
 */
public class AbstractRestService<T> {

    private AbstractFacade abstractFacade;
    @Autowired
    ApplicationSingleton applicationSingleton;

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

    private void setCreaterDetail(T t, Class cls) {
        try {
            cls.getDeclaredMethod("setCreatedAt", Date.class).invoke(t, new Date());
            cls.getDeclaredMethod("setCreater", WebUser.class).invoke(t, getLoggedUser());
        } catch (Exception e) {
            e.printStackTrace();
            if (cls.getSuperclass() != null) {
                setCreaterDetail(t, cls.getSuperclass());
            }
        }
    }

    @Transactional(readOnly = false)
    public void save(T t) {
        setCreaterDetail(t, t.getClass());
        abstractFacade.save(t);
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void update(T t) {
        abstractFacade.update(t);
    }

    private void setRetireDetail(T t, Class cls) {
        try {
            cls.getDeclaredMethod("setRetired", Boolean.class).invoke(t, true);
            cls.getDeclaredMethod("setRetiredAt", Date.class).invoke(t, new Date());
            cls.getDeclaredMethod("setRetirer", WebUser.class).invoke(t, getLoggedUser());
        } catch (Exception e) {
            e.printStackTrace();
            if (cls.getSuperclass() != null) {
                setRetireDetail(t, cls.getSuperclass());
            }
        }
    }

    @Transactional(readOnly = false)
    public void delete(long id) {
        T t = (T) abstractFacade.find(id);

        setRetireDetail(t, t.getClass());

        abstractFacade.update(t);
    }

    private WebUser getLoggedUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return applicationSingleton.getUserMap().get(auth.getName());
    }

}
