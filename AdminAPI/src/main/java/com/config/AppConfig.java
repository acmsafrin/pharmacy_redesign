/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.config;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author ACM Safrin
 */
@Configuration
@EnableTransactionManagement
@ComponentScan({"com.service","com.db"})
public class AppConfig {
        @Bean
        public SessionFactory sessionFactory() {
                LocalSessionFactoryBuilder builder =
			new LocalSessionFactoryBuilder(dataSource());
                builder.scanPackages("com.db.entity")
                      .addProperties(getHibernateProperties());

                return builder.buildSessionFactory();
        }

	private Properties getHibernateProperties() {
                Properties prop = new Properties();
                //prop.put("hibernate.format_sql", "true");
                prop.put("hibernate.show_sql", "true");
                prop.put("hibernate.dialect",
                    "org.hibernate.dialect.MySQLDialect");
               // prop.put("hibernate.hbm2ddl.auto","update");
                //create-drop,create,update,validate
                return prop;
        }

	@Bean(name = "dataSource")
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
	        ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/hmis");
		ds.setUsername("root");
		return ds;
	}

	//Create a transaction manager
	@Bean
        public HibernateTransactionManager transactionManager() {
                return new HibernateTransactionManager(sessionFactory());
        }

        @Bean
        public HibernateTemplate hibernateTemplate(SessionFactory sessionFactory){
            HibernateTemplate hibernateTemplate=new HibernateTemplate();
            hibernateTemplate.setSessionFactory(sessionFactory);
            return hibernateTemplate;
        }
	

}
