package com.neuedu.entity;

public class User {
    private Integer uid;
    private String  uname;
    private String upwd;

    public User(){

    }
    public User(Integer uid,String uname,String upwd){
       this.uid=uid;
       this.uname=uname;
       this.upwd=upwd;
    }

    public Integer getUid() {
        return uid;
    }

   /*public void setUid(Integer uid) {
        this.uid = uid;
    }*/

    public String getUname() {
        return uname;
    }

    /*public void setUname(String uname) {
        this.uname = uname;
    }*/

    public String getUpwd() {
        return upwd;
    }

    /*public void setUpwd(String upwd) {
        this.upwd = upwd;
    }*/

    public void  say(){
        System.out.println("spring的IOC的简单实现");
    }

}
