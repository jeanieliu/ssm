package com.neuedu.entity;

import java.math.BigDecimal;

public class Goods {
    private Integer gid;

    private String gnum;

    private String gname;

    private BigDecimal gprice;

    private Integer gstock;

    private Integer gsell;

    private String gdesc;

    private Integer cid;

    private String imgsrc;

    public Goods(Integer gid, String gnum, String gname, BigDecimal gprice, Integer gstock, Integer gsell, String gdesc, Integer cid, String imgsrc) {
        this.gid = gid;
        this.gnum = gnum;
        this.gname = gname;
        this.gprice = gprice;
        this.gstock = gstock;
        this.gsell = gsell;
        this.gdesc = gdesc;
        this.cid = cid;
        this.imgsrc = imgsrc;
    }

    public Goods() {
        super();
    }

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
        this.gnum = gnum == null ? null : gnum.trim();
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
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
        this.gdesc = gdesc == null ? null : gdesc.trim();
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
        this.imgsrc = imgsrc == null ? null : imgsrc.trim();
    }
}