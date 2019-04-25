package com.neuedu.dao;

import com.neuedu.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserDAO {

    List<User> selectAll();

    List<User> selectAllByUlevel(@Param("ulevel") Integer ulevel);
    User selectById(@Param("uid") Integer id);

    Integer insertUser(@Param("user") User user);
    /* 根据名字进行查询，但是名字给不全
    *
    *   1）name：a
    *   2)name:%a%
    * */
    List<User> selectByName(@Param("name") String name);

    Integer deleteUser(@Param("uid") Integer uid);


    User selectByNamePassword(@Param("uname") String name, @Param("upwd") String pwd);

}
