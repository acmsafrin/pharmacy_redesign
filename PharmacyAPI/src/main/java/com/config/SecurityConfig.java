/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.config;

import com.db.dao.WebUserFacade;
import com.db.entity.WebUser;
import com.service.ApplicationSingleton;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author ACM Safrin
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    WebUserFacade webUserFacade;
    @Autowired
    ApplicationSingleton applicationSingleton;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        List<WebUser> list = webUserFacade.findAll();
//        InMemoryUserDetailsManagerConfigurer imudmc = auth.inMemoryAuthentication();
//        for (WebUser w : list) {
//            imudmc.withUser(w.getName()).password(w.getWebUserPassword()).roles("ADMIN");
//            applicationSingleton.getUserMap().put(w.getName(), w);
//        }
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests()
                .antMatchers("/*").access("hasRole('ROLE_ADMIN')")
                //.antMatchers("/signup", "/about").permitAll() // 
                //	.antMatchers("/dba/**").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_DBA')")
                .and().httpBasic();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
                .ignoring()
                .antMatchers("/resources/**"); // #3
    }

}
