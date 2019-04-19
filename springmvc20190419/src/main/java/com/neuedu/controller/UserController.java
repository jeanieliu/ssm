package com.neuedu.controller;

import com.neuedu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("user")
public class UserController {

  /*  @GetMapping("list")*//*后缀.do在GetMapping中可以省略当时在请求的路径不能省*//*
    public String list(){
        return "testonedata";
    }*/

    /*
    * 1)传入的参数名与接收的参数名一致
    *     http://localhost:8888/user/login.do?username=tom
    * 2） 传入的参数名与接收的参数名不一致
    *     @RequestParam中的参数要和请求的参数名一致
    * */
  /*  @GetMapping("login")
    public String login(String username){

        System.out.println(username);
        return "result";
    }*/

    /*@GetMapping("login")
    public String login(@RequestParam("username") String uname){

        System.out.println(uname);
        return "result";
    }*/



    @GetMapping("list")
    public String list(){
        return "userdata";
    }
    /*对象，自动装箱*/
    @GetMapping("login")
    public String login(User user){

        System.out.println(user);
        return "result";
    }



}
