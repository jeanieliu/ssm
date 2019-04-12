package com.neuedu.dao;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neuedu.entity.User;
import com.neuedu.util.MybatisSession;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class UserMapperTest {

    @Test
    public void selectByPrimaryKey() throws IOException {
        SqlSession session= MybatisSession.getSession();
        UserMapper userMapper= session.getMapper(UserMapper.class);
        System.out.println(userMapper.selectByPrimaryKey(2).getUname());
        session.close();
    }

    @Test
    public void selectAll() throws IOException {
        SqlSession session= MybatisSession.getSession();
        UserMapper userMapper= session.getMapper(UserMapper.class);
        /*显示第几页的，每页的个数*/
        PageHelper.startPage(1,4);

        List<User> userList=userMapper.selectAll();
        for(User u:userList) {
            System.out.println(u.getUname()+"  "+u.getTelephone());
        }
        session.close();


        // 取分页信息
        PageInfo<User> pageInfo = new PageInfo<User>(userList);
        long total = pageInfo.getTotal(); //获取总记录数
        System.out.println("信息：" + total);
        System.out.println("当前页数："+pageInfo.getPageNum());

    }
}