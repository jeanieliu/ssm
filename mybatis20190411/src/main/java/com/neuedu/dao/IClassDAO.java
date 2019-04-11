package com.neuedu.dao;

import com.neuedu.entity.TClass;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IClassDAO {

    List<TClass>  selectById(@Param("cid") Integer cid);
}
