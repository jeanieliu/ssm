package com.neuedu.dao;

import com.neuedu.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDAO02 {

    @Select("select uid,uname,upwd,telephone,address,ulevel from t_user")
    List<User> selectAll();

    @Select("select uid,uname,upwd,telephone,address,ulevel " +
            "from t_user "+
             "where uid=#{name}")
    User selectById( Integer id);

    @Insert("insert into t_user (uname,upwd,telephone,address,ulevel) " +
            "values (#{uname},#{upwd},#{telephone},#{address},#{ulevel})")
    Integer insertUser( User user);
}
