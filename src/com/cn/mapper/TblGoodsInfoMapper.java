package com.cn.mapper;

import com.cn.entity.TblGoodsInfo;
import java.util.List;

public interface TblGoodsInfoMapper {
    int deleteByIdFun(Integer gid);

    int insertFun(TblGoodsInfo tblGoodsInfo);

    TblGoodsInfo selectByIdFun(Integer gid);

    List<TblGoodsInfo> selectAllFun();

    int updateByIdFun(TblGoodsInfo tblGoodsInfo);
}