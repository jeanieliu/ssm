package com.neuedu.service;

import com.neuedu.dao.IUserDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration({"classpath:Spring-dao.xml","classpath:Spring-service.xml"})
public class IUserServiceTest {

    @Autowired
    private IUserService userService;

    @Test
    public void getVipAll() {
        System.out.println(userService.getVipAll(1,3));
    }
}