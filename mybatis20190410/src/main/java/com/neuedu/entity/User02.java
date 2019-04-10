package com.neuedu.entity;

public class User02 {
    private Integer u_id;
    private String u_name;
    private String u_pwd;
    private String u_telephone;
    private String u_address;
    private Integer u_level;

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_pwd() {
        return u_pwd;
    }

    public void setU_pwd(String u_pwd) {
        this.u_pwd = u_pwd;
    }

    public String getU_telephone() {
        return u_telephone;
    }

    public void setU_telephone(String u_telephone) {
        this.u_telephone = u_telephone;
    }

    public String getU_address() {
        return u_address;
    }

    public void setU_address(String u_address) {
        this.u_address = u_address;
    }

    public Integer getU_level() {
        return u_level;
    }

    public void setU_level(Integer u_level) {
        this.u_level = u_level;
    }

    @Override
    public String toString() {
        return "User02{" +
                "u_id=" + u_id +
                ", u_name='" + u_name + '\'' +
                ", u_pwd='" + u_pwd + '\'' +
                ", u_telephone='" + u_telephone + '\'' +
                ", u_address='" + u_address + '\'' +
                ", u_level=" + u_level +
                '}';
    }
}
