package com.neuedu.entity;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void usertest(){
        /*  1:创建一个ApplicationContext对象*/
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        /*2：User对象的创建:     context.getBean中的值为xml中bean标签的id值
     */
        User user=(User)context.getBean("user");

        user.say();
    }


    @Test
    public  void  usersettest(){
        /*  1:创建一个ApplicationContext对象*/
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        /*2：User对象的创建:     context.getBean中的值为xml中bean标签的id值
         */
        User user=(User)context.getBean("user");

        System.out.println(user.getUid()+"  "+user.getUname()+ "   "+user.getUpwd());;
    }


    @Test
    public  void  usertestbean(){
        /*  1:创建一个ApplicationContext对象*/
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        /*2：User对象的创建:     context.getBean中的值为xml中bean标签的id值
         */
        /*User user=(User)context.getBean("vipuser");*/
        User user=(User)context.getBean("user2 user3 user4");
        System.out.println(user.getUid()+"  "+user.getUname()+ "   "+user.getUpwd());;
    }


    @Test
    public  void  usertestscope(){
        /*  1:创建一个ApplicationContext对象*/
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        /*2：User对象的创建:     context.getBean中的值为xml中bean标签的id值
         */
        /*User user=(User)context.getBean("vipuser");*/
        User user=(User)context.getBean("user");
        User user2=(User)context.getBean("user");
        System.out.println(user);
        System.out.println(user2);
    }

    @Test
    public  void  usertestautowire(){
        /*  1:创建一个ApplicationContext对象*/
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        /*2：User对象的创建:     context.getBean中的值为xml中bean标签的id值
         */

        User user=(User)context.getBean("user");

        System.out.println(user.getUname());

    }
}
