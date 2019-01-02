package com.cn.mapper;

import com.cn.entity.TblType;
import java.util.List;

public interface TblTypeMapper {
	int deleteByIdFun(Integer tid);

    int insertFun(TblType tblType);

    TblType selectByIdFun(Integer tid);

    List<TblType> selectAllFun();

    int updateByIdFun(TblType tblType);
}