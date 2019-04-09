package com.neuedu.dao;

import com.neuedu.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class UserDAOTest {

    @Test
    public void selectall() throws IOException {
        String resource = "mybatis-config.xml";//mybatis-config.xml路径
        InputStream inputStream = Resources.getResourceAsStream(resource);//输入流
        /*生成SqlSessiongFactory*/
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        /*
        *  生成SqlSession对象
        * */
       SqlSession session= sqlSessionFactory.openSession();
       /*
       *  session方法getMapper 获取映射对象
       * */
        UserDAO userDAO=      session.getMapper(UserDAO.class);
        List<User> listu=userDAO.selectall();
        System.out.println(listu);

    }
}