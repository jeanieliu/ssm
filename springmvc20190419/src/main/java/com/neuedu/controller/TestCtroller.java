package com.neuedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestCtroller {

    @RequestMapping("queryItem.do")
    public String  ceshi(){
        return "liststudent";
    }
}
