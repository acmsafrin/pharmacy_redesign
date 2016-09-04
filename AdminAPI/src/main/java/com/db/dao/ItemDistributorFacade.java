/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db.dao;

import com.db.entity.Dealer;
import com.db.entity.pharmacy.ItemsDistributors;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

/**
 *
 * @author ACM Safrin
 */
@Component
public class ItemDistributorFacade extends AbstractFacade<ItemsDistributors> {

    public ItemDistributorFacade() {
        super(ItemsDistributors.class);
    }

    public List<ItemsDistributors> findByDealer(Long id) {
        List list = findBySQL("from " + getEntityClass().getSimpleName() + " where retired=false and institution.id=" + id);
        return list;
    }
}
