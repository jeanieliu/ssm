package com.neuedu.dao;

import com.neuedu.entity.User02;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDAO04 {
   /*别名*/

    @Select("select uid as u_id,"+
            "uname as u_name,"+
            "upwd u_pwd,"+
            "telephone u_telehone,"+
             "address u_address,"+
              "ulevel u_level "+
             "from t_user")
    List<User02> selectAll();


    @Results(value = {
            @Result(property = "u_id",column = "uid"),
            @Result(property="u_name", column="uname"),
            @Result(property="u_pwd" ,column="upwd"),
            @Result(property="u_telephone" ,column="telephone"),
            @Result(property="u_address", column="address"),
            @Result( property="u_level", column="ulevel")
    })
    @Select("select uid,uname,upwd,telephone,address,ulevel from t_user where uid=#{id}")
    User02 selectById(Integer id);

    Integer insertUser(@Param("user") User02 user);
}
