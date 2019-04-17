package com.neuedu.service;

import com.neuedu.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration({"classpath:spring-dao.xml","classpath:spring-service.xml"})
public class IUserServiceTest {

    @Autowired
    private IUserService userService;
    @Test
    public void getVipAll() {
        System.out.println(userService.getVipAll());
    }

    @Test
    public void getAdminAll() {
    }

    @Test
    public void modify() {
        User user=new User();
        user.setUname("kk");
        user.setUpwd("123456");
        user.setTelephone("78945612301");
        user.setAddress("shanghai");
        user.setUlevel(0);
        userService.modify(user);

    }
}