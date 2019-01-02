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
	 * ��¼
	 * @param name �û���
	 * @param apwd ����
	 * @return �û���Ϣ null���û������������
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
