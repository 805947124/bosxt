package com.cn.mapper;

import com.cn.entity.TblSecondType;
import java.util.List;

public interface TblSecondTypeMapper {
    int deleteByPrimaryKey(Integer tsid);

    /*int insert(TblSecondType tblSecondType);*/

    TblSecondType selectByIdFun(Integer id);

    List<TblSecondType> selectAllFun();

    int updateByPrimaryKey(TblSecondType tblSecondType);
}