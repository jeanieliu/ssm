package com.neuedu.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration({"classpath:Spring-dao.xml","classpath:Spring-service.xml"})
public class ICategoryServiceTest {

    @Autowired
    ICategoryService categoryService;

    @Test
    public void getAll() {
        System.out.println(categoryService.getAll());
    }
}