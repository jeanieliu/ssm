package com.neuedu.service;

import com.neuedu.entity.User;

import java.util.List;

public interface IUserService {
    /*业务逻辑层： 设置方法：*/

    public List<User> getVipAll();


    public List<User> getAdminAll();

    public void  modify(User user);

}
