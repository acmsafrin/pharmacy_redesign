/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db.dao;

import com.util.Limit;
import java.util.Date;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

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
    
     public Long count(){       
        List list= findBySQL("select count(*) from "+entityClass.getSimpleName());
        return (Long)list.get(0);
    }

    public List<T> findByName(String name) {
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(entityClass).add(Restrictions.eq("retired", false))
                .add(Restrictions.like("name", "%" + name + "%"));
        return (List<T>) getHibernateTemplate().findByCriteria(detachedCriteria);
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
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(entityClass).add(Restrictions.eq("retired", false));
        List<T> list = (List<T>) getHibernateTemplate().findByCriteria(detachedCriteria);
        return list;
    }

    public List<T> findAll(int max) {        
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(entityClass).
                add(Restrictions.eq("retired", false)).addOrder(Order.asc("id")).add(Limit.by(max));        
        List<T> list = (List<T>) getHibernateTemplate().findByCriteria(detachedCriteria);
        return list;
    }
    
     public List<T> findAll(int offset,int pagesize) {        
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(entityClass).
                add(Restrictions.eq("retired", false)).addOrder(Order.asc("id"));        
        List<T> list = (List<T>) getHibernateTemplate().findByCriteria(detachedCriteria,offset,pagesize);
        return list;
    }

    public List<T> findBySQL(String temSQL) {
        List<T> list = (List<T>) (getHibernateTemplate().find(temSQL));
        return list;
    }

}
