package com.cn.mapper;

import com.cn.entity.TblAdmin;
import com.cn.entity.TblAdminQuery;



import java.util.List;

public interface TblAdminMapper {
	
	/**
	 * ��ѯ������
	 * @param query ����
	 * @return
	 */
	public Integer selectCountByConditionFun(TblAdminQuery query);
	/**
	 * �������Ĳ�ѯ
	 * @param query ����
	 * @return ��ѯ��������
	 */
	public List<TblAdmin> selectByConditionPageFun(TblAdminQuery query);
	
	
	
	
	
	
    int deleteByIdFun(Integer aid);

    void insertFun(TblAdmin tblAdmin);

    TblAdmin selectByIdFun(Integer aid);

    List<TblAdmin> selectAllFun();

    int update(TblAdmin tblAdmin);

	TblAdmin selectByNameFun(String name);
}

