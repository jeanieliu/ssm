package com.neuedu.aspect;

import java.util.Date;

public class InsertBook {

    public  void  create(){
        System.out.println("创建时间："+System.currentTimeMillis());
    }

    public void destroy(){
        System.out.println("失效时间："+System.currentTimeMillis());
    }
}
