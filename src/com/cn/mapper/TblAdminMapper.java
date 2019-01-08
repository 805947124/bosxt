package com.cn.mapper;

import com.cn.entity.TblAdmin;
import com.cn.entity.TblAdminQuery;



import java.util.List;

public interface TblAdminMapper {
	
	/**
	 * 查询总行数
	 * @param query 条件
	 * @return
	 */
	public Integer selectCountByConditionFun(TblAdminQuery query);
	/**
	 * 带条件的查询
	 * @param query 条件
	 * @return 查询到的数据
	 */
	public List<TblAdmin> selectByConditionPageFun(TblAdminQuery query);
	
	
	
	
	
	
    int deleteByIdFun(Integer aid);

    void insertFun(TblAdmin tblAdmin);

    TblAdmin selectByIdFun(Integer aid);

    List<TblAdmin> selectAllFun();

    int update(TblAdmin tblAdmin);

	TblAdmin selectByNameFun(String name);
}

