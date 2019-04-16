package com.neuedu.dao;

import com.neuedu.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserDAO {

    List<User> selectAll();

    User selectById(@Param("uid") Integer id);

    Integer insertUser(@Param("user") User user);
    /* 根据名字进行查询，但是名字给不全
    *
    *   1）name：a
    *   2)name:%a%
    * */
    List<User> selectByName(@Param("name") String name);
}
