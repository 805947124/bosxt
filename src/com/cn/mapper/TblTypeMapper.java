package com.cn.mapper;
import com.cn.entity.TblType;
import com.cn.entity.TblTypeQuery;

import java.util.List;

public interface TblTypeMapper {
	int deleteByIdFun(Integer tid);

    int insertFun(TblType tblType);

    TblType selectByIdFun(Integer tid);

    List<TblType> selectAllFun();

    int updateByIdFun(TblType tblType);
    
    /**
	 * 查询总行数
	 * @param query 条件
	 * @return
	 */
	public Integer selectCountByConditionFun(TblTypeQuery query);
	
	/**
	 * 带条件的查询
	 * @param query 条件
	 * @return 查询到的数据
	 */
	public List<TblType> selectByConditionPageFun(TblTypeQuery query);
}