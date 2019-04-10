package com.neuedu.dao;

import com.neuedu.entity.User;
import com.neuedu.entity.User02;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserDAO03 {

    List<User02> selectAll();

    User02 selectById(@Param("uid") Integer id);

    Integer insertUser(@Param("user") User02 user);
}
