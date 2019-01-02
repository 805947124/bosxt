package com.cn.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.entity.TblAdmin;

import com.cn.mapper.TblAdminMapper;

@Service
public class TblAdminBizImpl {
	@Autowired
	private TblAdminMapper tblAdminMapper;
	
	/**
	 * 登录
	 * @param name 用户名
	 * @param apwd 密码
	 * @return 用户信息 null，用户名或密码错误
	 */
	public TblAdmin login(String aname, String apwd) {
		TblAdmin tblAdmin = tblAdminMapper.selectByNameFun(aname);

		if (tblAdmin != null && tblAdmin.getApwd().equals(apwd)) {
			return tblAdmin;
		} else {
			return null;
		}
	}
}
