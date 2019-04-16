package com.neuedu.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring-dao.xml")
public class IUserDAOTest {

    @Autowired
    private IUserDAO userDAO;

    @Test
    public void selectAll() {
        System.out.println(userDAO.selectAll());
    }

    @Test
    public void selectById() {
    }

    @Test
    public void insertUser() {
    }

    @Test
    public void selectByName() {
    }
}