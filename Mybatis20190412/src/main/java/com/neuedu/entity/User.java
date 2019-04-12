package com.neuedu.entity;

public class User {
    private Integer uid;

    private String uname;

    private String upwd;

    private String telephone;

    private String address;

    private Byte ulevel;

    public User(Integer uid, String uname, String upwd, String telephone, String address, Byte ulevel) {
        this.uid = uid;
        this.uname = uname;
        this.upwd = upwd;
        this.telephone = telephone;
        this.address = address;
        this.ulevel = ulevel;
    }

    public User() {
        super();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd == null ? null : upwd.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Byte getUlevel() {
        return ulevel;
    }

    public void setUlevel(Byte ulevel) {
        this.ulevel = ulevel;
    }
}