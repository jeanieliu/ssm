package com.neuedu.entity;

import com.neuedu.jdbc.UserJDBC;
import com.neuedu.pojo.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PoJoTest {

    @Test
    public void userConroller(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config03.xml");
        UserController  userController=(UserController) context.getBean("userController");
        userController.print();
    }

    @Test
    public void jdbctest(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config03.xml");
        UserJDBC userController=(UserJDBC) context.getBean("userjdbc");
        userController.printjdbc();
    }
}
