package com.neuedu.entity;

import java.math.BigDecimal;

public class Goods {
    private Integer gid;
    private String gnum;
    private String gname;
    private BigDecimal gprice;
    private Integer gstock;
    private Integer gsell;
    private  String gdesc;
    private Integer cid;
    private String imgsrc;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGnum() {
        return gnum;
    }

    public void setGnum(String gnum) {
        this.gnum = gnum;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public BigDecimal getGprice() {
        return gprice;
    }

    public void setGprice(BigDecimal gprice) {
        this.gprice = gprice;
    }

    public Integer getGstock() {
        return gstock;
    }

    public void setGstock(Integer gstock) {
        this.gstock = gstock;
    }

    public Integer getGsell() {
        return gsell;
    }

    public void setGsell(Integer gsell) {
        this.gsell = gsell;
    }

    public String getGdesc() {
        return gdesc;
    }

    public void setGdesc(String gdesc) {
        this.gdesc = gdesc;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "gid=" + gid +
                ", gnum='" + gnum + '\'' +
                ", gname='" + gname + '\'' +
                ", gprice=" + gprice +
                ", gstock=" + gstock +
                ", gsell=" + gsell +
                ", gdesc='" + gdesc + '\'' +
                ", cid=" + cid +
                ", imgsrc='" + imgsrc + '\'' +
                '}';
    }
}
