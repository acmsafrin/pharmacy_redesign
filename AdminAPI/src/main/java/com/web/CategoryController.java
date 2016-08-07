/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web;

import com.db.entity.Category;
import com.google.gson.Gson;
import com.pojo.Status;
import com.service.CategoryService;
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
@RequestMapping("/category")
//url:http://localhost:8080/StudentRestApiHibernateSpring/category/
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    String findAll() {
        return categoryService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    String find(@PathVariable("id") long id) {
        return categoryService.find(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String save(@RequestBody Category category) {
        categoryService.save(category);
        return GsonUtil.toJson(new Status("01", "SUCCESS"));
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String update(@PathVariable("id") long id,@RequestBody Category category) {
        categoryService.update(category);
        return GsonUtil.toJson(new Status("01", "SUCCESS"));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public @ResponseBody
    String delete(@PathVariable("id") long id) {
        categoryService.delete(id);
        return GsonUtil.toJson(new Status("01", "SUCCESS"));
    }

    public CategoryService getCategoryService() {
        return categoryService;
    }

    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

}
