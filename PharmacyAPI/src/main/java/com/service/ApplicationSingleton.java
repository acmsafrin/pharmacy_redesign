/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.service.*;
import com.db.entity.WebUser;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACM Safrin
 */
@Service
public class ApplicationSingleton {

    private static final ApplicationSingleton instance = new ApplicationSingleton();
    private Map<String, WebUser> userMap = new HashMap<>();

    private ApplicationSingleton() {
    }

    public static ApplicationSingleton getInstance() {
        return instance;
    }

    public Map<String, WebUser> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, WebUser> userMap) {
        this.userMap = userMap;
    }

}
