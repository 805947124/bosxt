package com.cn.mapper;

import com.cn.entity.TblUser;
import com.cn.entity.TblUserQuery;

import java.util.List;

public interface TblUserMapper {
    int deleteByIdFun(Integer userid);

    int insertFun(TblUser tblUser);

    TblUser selectByIdFun(Integer userid);

    List<TblUser> selectAllFun();

    int updateByIdFun(TblUser tblUser);
    
    TblUser selectByNameFun(String name);
    
    

	int selectCountByConditionFun(TblUserQuery tblUserQuery);

	List<TblUser> selectByConditionPageFun(TblUserQuery tblUserQuery);
}