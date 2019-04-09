package com.neuedu.dao;

import com.neuedu.entity.User;

import java.util.List;

public interface IUserDAO {

    List<User> selectAll();
}
