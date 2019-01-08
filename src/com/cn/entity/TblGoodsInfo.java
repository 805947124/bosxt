package com.cn.entity;

import java.math.BigDecimal;

public class TblGoodsInfo {
    private Integer gid;

    private String gname;

    private BigDecimal gprice;

    private BigDecimal greprice;

    private String gimage;

    private String gintroduction;

    private Boolean ghot;

    private Integer tsid;
    
    
    
    private String tsname;
    private String gimagepath;

    public String getGimagepath() {
		return gimagepath;
	}

	public void setGimagepath(String gimagepath) {
		this.gimagepath = gimagepath;
	}

	public String getTsname() {
		return tsname;
	}

	public void setTsname(String tsname) {
		this.tsname = tsname;
	}

	public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
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

    public BigDecimal getGreprice() {
        return greprice;
    }

    public void setGreprice(BigDecimal greprice) {
        this.greprice = greprice;
    }

    public String getGimage() {
        return gimage;
    }

    public void setGimage(String gimage) {
        this.gimage = gimage;
    }

    public String getGintroduction() {
        return gintroduction;
    }

    public void setGintroduction(String gintroduction) {
        this.gintroduction = gintroduction;
    }

    public Boolean getGhot() {
        return ghot;
    }

    public void setGhot(Boolean ghot) {
        this.ghot = ghot;
    }

    public Integer getTsid() {
        return tsid;
    }

    public void setTsid(Integer tsid) {
        this.tsid = tsid;
    }
}