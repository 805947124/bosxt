package com.cn.mapper;

import com.cn.entity.TblGoodsInfo;
import com.cn.entity.TblGoodsQuery;

import java.util.List;

public interface TblGoodsInfoMapper {
    int deleteByIdFun(Integer gid);

    int insertFun(TblGoodsInfo tblGoodsInfo);

    TblGoodsInfo selectByIdFun(Integer gid);

    List<TblGoodsInfo> selectAllFun();

    int updateByIdFun(TblGoodsInfo tblGoodsInfo);
    
    

	int selectCountByConditionFun(TblGoodsQuery tblGoodsquery);

	List<TblGoodsInfo> selectByConditionPageFun(TblGoodsQuery tblGoodsquery);
}