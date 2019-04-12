package com.neuedu.entity;

public class Shoppingcart {
    private Integer sid;

    private Integer gid;

    private Integer uid;

    private Integer num;

    public Shoppingcart(Integer sid, Integer gid, Integer uid, Integer num) {
        this.sid = sid;
        this.gid = gid;
        this.uid = uid;
        this.num = num;
    }

    public Shoppingcart() {
        super();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}