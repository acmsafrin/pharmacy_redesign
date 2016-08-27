/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojo;

import com.google.gson.annotations.Expose;
import java.io.Serializable;

/**
 *
 * @author ACM Safrin
 */
public class Status implements Serializable {
    @Expose
    private String code;
    @Expose
    private String message;

    public Status(String code, String message) {
        this.code = code;
        this.message = message;
    }

    
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    
}
