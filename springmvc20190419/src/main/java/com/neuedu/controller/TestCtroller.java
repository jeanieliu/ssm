package com.neuedu.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
@Component: 一般用于普通的类中，任何类 ：Bean的功能---spring容器来完成实例化对象
* @Service ：用于service层的标注
  @Repository ：用于dao层的标注
  @Controller：用户controller层的标注
*
* */
@Controller
@RequestMapping("/test")
public class TestCtroller {
/*
* @RequestMapping：
*    1）接口，类 方法
*    2）运行时有效
*  value：(path)映射的路径
*     queryItem.do：queryItem:自定义，根据功能起名
* method:请求的方式
* 相当于 1：<bean name="/queryItem.do" class="com.neuedu.controller.Controller01"></bean>
*        2：<bean class="org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping">
             <property name="beanName" value="/queryItem.do"/>
          </bean>
* */
    /*@RequestMapping(value="queryItem.do",method = RequestMethod.GET)*/
    @GetMapping("queryItem.do")
    public String  ceshi(){
        /* ModelAndView
        *   1:路径地址
        *       通过解析之后的路径
        *        /WEB-INF/jsp/liststudent.jsp
        *      返回的string是jsp文件的名
        * */

        return "liststudent";
    }
}
