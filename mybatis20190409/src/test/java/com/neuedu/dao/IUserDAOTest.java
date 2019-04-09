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

public class IUserDAOTest {

    @Test
    public void selectAll() throws IOException {
        /*1:文件提取*/
        String resource="mybatis-config.xml";
        /*2：生成io流--inputString*/
        InputStream inputStream= Resources.getResourceAsStream(resource);
        /*3：SqlSessionFactory对象*/
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        /*4:生成sqlSession对象*/
        SqlSession session=sqlSessionFactory.openSession();

        /*5：生成接口对象*/
        IUserDAO userDAO=session.getMapper(IUserDAO.class);
        /*6:使用*/
        List<User> list=userDAO.selectAll();
        System.out.println(list);
        /*7:关闭*/
        session.close();
    }
}