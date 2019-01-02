package com.cn.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.entity.TblAdmin;
import com.cn.mapper.TblAdminMapper;

@Service
public class TblAdminBiz {

	@Autowired
	private TblAdminMapper tblAdminMapper;
	
	public boolean viewByName(String name){
		TblAdmin tblAdmin = tblAdminMapper.selectByNameFun(name);
		if(tblAdmin==null)
			return false;
		else
			return true;
	}
	
	/**
	 * 登录
	 * @param name 用户名
	 * @param password 密码
	 * @return 用户信息 null，用户名或密码错误
	 */
	public TblAdmin login(String name, String password) {
		TblAdmin tblAdmin = tblAdminMapper.selectByNameFun(name);

		if (tblAdmin != null && tblAdmin.getApwd().equals(password)) {
			return tblAdmin;
		} else {
			return null;
		}
	}
}
