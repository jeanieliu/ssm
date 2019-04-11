package com.neuedu.dao;

import com.neuedu.util.MybatisSession;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class IClassDAOTest {

    @Test
    public void selectById() throws IOException {
        SqlSession session= MybatisSession.getSession();
        IClassDAO dao= session.getMapper(IClassDAO.class);
        System.out.println(dao.selectById(1));
        session.close();
    }
}