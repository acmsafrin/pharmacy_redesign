/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web;

import com.db.entity.Manufacturer;
import com.pojo.ErrorStatus;
import com.pojo.SuccesStatus;
import com.service.ManufacturerService;
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
 * @param <S>
 * @param <E>
 */
@RestController
@RequestMapping("/manufacturer")
//url:http://localhost:8080/StudentRestApiHibernateSpring/manufacturer/
public class ManufacturerController<S extends ManufacturerService> {

    @Autowired
    private S service;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    String findAll() {
        String result;
        try {
            result = service.findAll();
        } catch (Exception e) {
            e.printStackTrace();
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
    
    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public @ResponseBody
    String filterByName(@PathVariable("name") String name) {
        String result;
        try {
            result = service.findByName(name);
        } catch (Exception e) {
            result = GsonUtil.toJson(new ErrorStatus());
        }

        return result;
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String save(@RequestBody Manufacturer entity) {
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
    String update(@PathVariable("id") long id, @RequestBody Manufacturer entity) {
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
