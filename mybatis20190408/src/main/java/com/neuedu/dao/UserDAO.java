package com.neuedu.dao;

import com.neuedu.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDAO {
/*使用注解的实现
*  @Select
* */
    @Select("select uid,uname,upwd,telephone,address,ulevel from t_user")
    public List<User> selectall();
}
