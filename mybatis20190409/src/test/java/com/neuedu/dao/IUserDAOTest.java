package com.neuedu.dao;

import com.neuedu.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class IUserDAOTest {
    SqlSessionFactory sqlSessionFactory;
    @Before
    public void before() throws IOException {
        /*1:文件提取*/
        String resource="mybatis-config.xml";
        /*2：生成io流--inputString*/
        InputStream inputStream= Resources.getResourceAsStream(resource);
        /*3：SqlSessionFactory对象*/
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    }

 /*   *//*非接口的使用*//*
    @Test
    public void selectAllxml() throws IOException {
     *//*4:生成sqlSession对象*//*
        SqlSession session=sqlSessionFactory.openSession();


        *//*6:使用*//*
       *//* List<User> list=session.selectList("selectAll");*//*

       *//* System.out.println(list);*//*
       User user=session.selectOne("selectById",2);
        System.out.println(user);
        *//*7:关闭*//*
        session.close();
    }*/
    @Test
    public void selectAll() throws IOException {

        //4:生成sqlSession对象
        SqlSession session=sqlSessionFactory.openSession();

        //5：生成接口对象
        IUserDAO userDAO=session.getMapper(IUserDAO.class);
       // 6:使用
        List<User> list=userDAO.selectAll();
        System.out.println(list);
        //7:关闭
        session.close();
    }
   /* @Test
    public void selectById() {
        *//*4:生成sqlSession对象*//*
        SqlSession session=sqlSessionFactory.openSession();

        *//*5：生成接口对象*//*
        IUserDAO userDAO=session.getMapper(IUserDAO.class);
        *//*6:使用*//*
        User list=userDAO.selectById(2);
        System.out.println(list);
        *//*7:关闭*//*
        session.close();

    }

    @Test
    public void insertUser() {
        User user=new User();
        user.setUname("zhang");
        user.setUpwd("123456");
        user.setAddress("上海");
        user.setTelephone("12457812457");
        user.setUlevel(1);
        *//*4:生成sqlSession对象*//*
        *//*  生成的SqlSession对象，自动提交关闭，默认false
        解决方法：1）sqlSessionFactory.openSession(true)：自动提交*//*
        SqlSession session=sqlSessionFactory.openSession();

        *//*5：生成接口对象*//*
        IUserDAO userDAO=session.getMapper(IUserDAO.class);
        *//*6:使用*//*
       Integer i=userDAO.insertUser(user);
       *//*2）：手动提交    session.commit();*//*
       session.commit();
        System.out.println(i);
        *//*7:关闭*//*
        session.close();

    }*/
}