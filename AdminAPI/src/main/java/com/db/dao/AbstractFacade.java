/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ACM Safrin
 * @param <T>
 */
public class AbstractFacade<T> {

    @Autowired
    HibernateTemplate hibernateTemplate;
    private Class<T> entityClass;

    public AbstractFacade() {
    }

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public void save(T t) {
        getHibernateTemplate().save(t);
    }

    public T find(Long id) {
        return getHibernateTemplate().get(entityClass, id);
    }

    public void refresh(T entity) {
        getHibernateTemplate().refresh(entity);
    }

    public void update(T entity) {
        getHibernateTemplate().merge(entity);
        //getEntityManager().flush();
    }

    public void delete(T entity) {
        getHibernateTemplate().delete(entity);
    }

    public List<T> findAll() {
        List<T> list = (List<T>) (getHibernateTemplate().find(" from " + entityClass.getSimpleName()));
        return list;
    }

    public List<T> findBySQL(String temSQL) {
        List<T> list = (List<T>) (getHibernateTemplate().find(temSQL));
        return list;
    }

}
