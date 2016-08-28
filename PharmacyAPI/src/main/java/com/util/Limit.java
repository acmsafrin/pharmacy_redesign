/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.util;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.criterion.Criterion;
import org.hibernate.engine.spi.TypedValue;

/**
 *
 * @author ACM Safrin
 */
public class Limit {
        private Limit() {}

        public static LimitBy by(int maxResults) {
            return new LimitBy(maxResults);
        }

        static class LimitBy implements Criterion {
            private int max;

            public LimitBy(int max) {
                this.max = max;
            }

            @Override
            public String toSqlString(Criteria criteria, CriteriaQuery criteriaQuery) throws HibernateException {
                criteria.setMaxResults(max);
                return "1 = 1";
            }

            @Override
            public TypedValue[] getTypedValues(Criteria criteria, CriteriaQuery criteriaQuery) throws HibernateException {
                return new TypedValue[0];
            }
        }
    }