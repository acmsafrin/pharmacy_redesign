/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.util;

import com.google.gson.Gson;

/**
 *
 * @author ACM Safrin
 */
public class GsonUtil {
   private static Gson gson=new Gson();
    
    
    public static String toJson(Object obj){
        return gson.toJson(obj);
    }
}
