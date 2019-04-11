package com.neuedu.dao;

import com.neuedu.util.MybatisSession;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ICategoryDAOTest {

    @Test
    public void selectAll() throws IOException {
        SqlSession session= MybatisSession.getSession();
        ICategoryDAO dao=session.getMapper(ICategoryDAO.class);
        System.out.println(dao.selectAll());
        session.close();
    }
}