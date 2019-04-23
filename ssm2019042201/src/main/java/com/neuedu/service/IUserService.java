package com.neuedu.service;

import com.github.pagehelper.PageInfo;
import com.neuedu.entity.User;

import java.util.List;

public interface IUserService {
    /*业务逻辑层： 设置方法：*/

    public PageInfo<User> getVipAll(int start, int num);


    public List<User> getAdminAll();

    public void  modify(User user);

    public void add(User user);

    public List<User> getAll();

}
