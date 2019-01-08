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
	 * ��ѯ������
	 * @param query ����
	 * @return
	 */
	public Integer selectCountByConditionFun(TblTypeQuery query);
	
	/**
	 * �������Ĳ�ѯ
	 * @param query ����
	 * @return ��ѯ��������
	 */
	public List<TblType> selectByConditionPageFun(TblTypeQuery query);
}