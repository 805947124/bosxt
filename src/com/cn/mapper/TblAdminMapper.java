package com.cn.mapper;

import com.cn.entity.TblAdmin;
import java.util.List;

public interface TblAdminMapper {
    int deleteByIdFun(Integer aid);

    int insertFun(TblAdmin tblAdmin);

    TblAdmin selectByIdFun(Integer aid);

    List<TblAdmin> selectAllFun();

    int update(TblAdmin tblAdmin);

	TblAdmin selectByNameFun(String name);
}