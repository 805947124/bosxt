package com.cn.mapper;

import com.cn.entity.TblAdmin;
<<<<<<< HEAD

public interface TblAdminMapper {

	public TblAdmin selectByNameFun(String name);

}
=======
import java.util.List;

public interface TblAdminMapper {
    int deleteByIdFun(Integer aid);

    int insertFun(TblAdmin tblAdmin);

    TblAdmin selectByIdFun(Integer aid);

    List<TblAdmin> selectAllFun();

    int update(TblAdmin tblAdmin);

	TblAdmin selectByNameFun(String name);
}
>>>>>>> c515e93709d20a06643a7fff910beaab85f2e011
