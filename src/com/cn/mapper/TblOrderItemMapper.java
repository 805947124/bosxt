package com.cn.mapper;

import com.cn.entity.TblOrderItem;
import java.util.List;

public interface TblOrderItemMapper {
    int delete(Integer oiid);

    int insertFun(TblOrderItem tblOrderItem);

    TblOrderItem selectByIdFun(Integer oiid);

    List<TblOrderItem> selectAllFun();

    int update(TblOrderItem tblOrderItem);
}