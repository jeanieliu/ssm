package com.neuedu.dao;

import com.neuedu.entity.Goods;
import com.neuedu.util.MybatisSession;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
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

    @Test
    public void updateGoods() throws IOException {
        SqlSession session=MybatisSession.getSession(true);
        IGoodsDAO dao=session.getMapper(IGoodsDAO.class);
        Goods goods=new Goods();
        goods.setGid(3);
        goods.setGname("富贵");
        goods.setGprice(new BigDecimal(10000));
        System.out.println(dao.updateGoods(goods));

        session.close();

    }

    @Test
    public void selectByCidList() throws IOException {
        SqlSession session=MybatisSession.getSession(true);
        IGoodsDAO dao=session.getMapper(IGoodsDAO.class);
        List<Integer> cids=new ArrayList<Integer>();
        cids.add(1);
       // cids.add(2);

        System.out.println(dao.selectByCidList(cids));

        session.close();

    }

    @Test
    public void selectByOffsetAndNum() throws IOException {
        SqlSession session=MybatisSession.getSession(true);
        IGoodsDAO dao=session.getMapper(IGoodsDAO.class);
        System.out.println(dao.selectByOffsetAndNum(2,2));
        session.close();
    }
}