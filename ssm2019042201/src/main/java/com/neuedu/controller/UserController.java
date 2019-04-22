package com.neuedu.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.neuedu.entity.User;
import com.neuedu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;
/*
*  分页的时候
*    pageNum num可能没有传入值，使用默认值：@RequestParam(required = false,defaultValue = "1")
*
 * */
    @GetMapping("list")
    public String list(@RequestParam(required = false,defaultValue = "1") int pageNum,
                       @RequestParam(required = false,defaultValue = "3")int num,
                       ModelMap modelMap){
        /*提取数据*/
        PageInfo<User> lists=userService.getVipAll(pageNum,num);
        List<User> listuser=lists.getList();

        modelMap.put("pages",lists);

          return "userlist";
    }

    @GetMapping("addlist")
    public String addlist(){
        return "useradd";
    }

    @PostMapping("add")
    public String add(User user){
        user.setUlevel(1);
        System.out.println(user);
        userService.add(user);
        return "redirect:list.do";
    }

}
