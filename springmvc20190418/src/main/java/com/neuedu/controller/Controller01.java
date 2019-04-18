package com.neuedu.controller;

import com.neuedu.entity.Student;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import java.util.ArrayList;
import java.util.List;

public class Controller01 implements Controller {
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
             //调用service实现视图。 使用静态的模拟
            List<Student> lists=new ArrayList<Student>();
            Student s1=new Student();
            s1.setAge(18);
            s1.setName("zhang");
            s1.setSex("女");

            Student s2=new Student();
            s2.setAge(18);
            s2.setName("zhang");
            s2.setSex("女");
            lists.add(s1);
            lists.add(s2);
//		//创建一个ModelAndView
            ModelAndView model=new ModelAndView();
            //相当于request.setAttribute方法，
            model.addObject("lists", lists);

            //视图
            model.setViewName("/WEB-INF/jsp/liststudent.jsp");
            return model;
        }

    }


