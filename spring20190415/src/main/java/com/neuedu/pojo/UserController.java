package com.neuedu.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userController")/*<bean>*/
public class UserController {

    @Autowired  /*使用注解实现实例对象   user=new User()*/
    private User user;
    @Autowired  /*使用注解实现实例对象   user=new User()*/
    private User user01;
    public void print(){
        user.setUname("测试");
        System.out.println(user.getUname());

        System.out.println(user);
        System.out.println(user01);
    }
}
