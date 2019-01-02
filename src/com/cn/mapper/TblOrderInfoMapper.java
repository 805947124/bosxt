package com.cn.mapper;

import com.cn.entity.TblOrderInfo;
import java.util.List;

public interface TblOrderInfoMapper {
    int delete(Integer oid);

    int insertFun(TblOrderInfo tblOrderInfo);

    TblOrderInfo selectByIdFun(Integer oid);

    List<TblOrderInfo> selectAllFun();

    int update(TblOrderInfo tblOrderInfo);
}