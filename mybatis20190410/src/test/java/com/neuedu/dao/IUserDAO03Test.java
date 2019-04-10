package com.neuedu.dao;

import com.neuedu.entity.User;
import com.neuedu.entity.User02;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class IUserDAO03Test {
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
    @Test
    public void selectAll() {
        SqlSession session=sqlSessionFactory.openSession();

        IUserDAO03 userDAO03=session.getMapper(IUserDAO03.class);

        System.out.println(userDAO03.selectAll());

        session.close();
    }

    @Test
    public void selectById() {
    }

    @Test
    public void insertUser() {
        User02 user=new User02();
        user.setU_name("zhang");
        user.setU_pwd("123456");
        user.setU_address("上海");
        user.setU_telephone("12457812457");
        user.setU_level(1);

        SqlSession session=sqlSessionFactory.openSession();

        IUserDAO03 userDAO03=session.getMapper(IUserDAO03.class);

        System.out.println(userDAO03.insertUser(user));

        session.commit();
        session.close();
    }
}