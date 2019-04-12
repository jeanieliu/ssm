package com.neuedu.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisSession {


    private static SqlSessionFactory  getSqlSessionFactory() throws IOException {
        /*1:文件提取*/
        String resource="mybatis-config.xml";
        /*2：生成io流--inputString*/
        InputStream inputStream= Resources.getResourceAsStream(resource);
        /*3：SqlSessionFactory对象*/
        return new SqlSessionFactoryBuilder().build(inputStream);
    }

    public  static SqlSession  getSession() throws IOException {
       return  getSqlSessionFactory().openSession();
    }

    public static SqlSession  getSession(boolean var1) throws IOException {
        return  getSqlSessionFactory().openSession(var1);
    }
}
