package com.neuedu.dao;

import com.neuedu.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserDAO {

    List<User> selectAll();

    User selectById(@Param("uid") Integer id);

    Integer insertUser(@Param("user") User user);
}
