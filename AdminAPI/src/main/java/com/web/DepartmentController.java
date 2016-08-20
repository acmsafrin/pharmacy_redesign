/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web;

import com.db.entity.Department;
import com.pojo.ErrorStatus;
import com.pojo.SuccesStatus;
import com.service.DepartmentService;
import com.util.GsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ACM Safrin
 */
@RestController
@RequestMapping("/department")
//url:http://localhost:8080/StudentRestApiHibernateSpring/department/
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    String findAll() {
        String result;
        try {
            result = service.findAll();
        } catch (Exception e) {
            result = GsonUtil.toJson(new ErrorStatus());
        }

        return result;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    String find(@PathVariable("id") long id) {
        String result;
        try {
            result = service.find(id);
        } catch (Exception e) {
            result = GsonUtil.toJson(new ErrorStatus());
        }

        return result;
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String save(@RequestBody Department entity) {
        String result;
        try {
            service.save(entity);
            result = GsonUtil.toJson(new SuccesStatus());
        } catch (Exception e) {
            result = GsonUtil.toJson(new ErrorStatus());
        }
        return result;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String update(@PathVariable("id") long id, @RequestBody Department entity) {
        String result;        
        try {            
            service.update(entity);            
            result = GsonUtil.toJson(new SuccesStatus());
        } catch (Exception e) {
            result = GsonUtil.toJson(new ErrorStatus());
        }
        return result;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public @ResponseBody
    String delete(@PathVariable("id") long id) {
        String result;
        try {
            service.delete(id);
            result = GsonUtil.toJson(new SuccesStatus());
        } catch (Exception e) {
            result = GsonUtil.toJson(new ErrorStatus());
        }
        return result;
    }

    

}
