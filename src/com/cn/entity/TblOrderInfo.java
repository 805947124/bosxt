package com.cn.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TblOrderInfo {
    private Integer oid;

    private Integer userid;

    private String linkman;

    private String address;

    private String tel;

    private BigDecimal oprice;

    private Date oretetime;

    private String ostate;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public BigDecimal getOprice() {
        return oprice;
    }

    public void setOprice(BigDecimal oprice) {
        this.oprice = oprice;
    }

    public Date getOretetime() {
        return oretetime;
    }

    public void setOretetime(Date oretetime) {
        this.oretetime = oretetime;
    }

    public String getOstate() {
        return ostate;
    }

    public void setOstate(String ostate) {
        this.ostate = ostate;
    }
}