package com.cn.entity;

import java.math.BigDecimal;

public class TblOrderItem {
    private Integer oiid;

    private Integer oid;

    private Integer gid;

    private BigDecimal oprice;

    private Integer orderamount;

    public Integer getOiid() {
        return oiid;
    }

    public void setOiid(Integer oiid) {
        this.oiid = oiid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public BigDecimal getOprice() {
        return oprice;
    }

    public void setOprice(BigDecimal oprice) {
        this.oprice = oprice;
    }

    public Integer getOrderamount() {
        return orderamount;
    }

    public void setOrderamount(Integer orderamount) {
        this.orderamount = orderamount;
    }
}