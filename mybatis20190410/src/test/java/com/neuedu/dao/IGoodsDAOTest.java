package com.neuedu.dao;

import com.neuedu.entity.Goods;
import com.neuedu.util.MybatisSession;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class IGoodsDAOTest {


    @Test
    public void selectByNameAndDesc() throws IOException {
        SqlSession session= MybatisSession.getSession();
        IGoodsDAO dao= session.getMapper(IGoodsDAO.class);
      /* List<Goods> goods= dao.selectByNameAndDesc("一",null);*/
        List<Goods> goods= dao.selectByNameAndDesc(null,null);
        System.out.println(goods);
        session.close();

    }
}