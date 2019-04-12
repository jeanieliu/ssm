package com.neuedu.dao;

import com.neuedu.entity.Shoppingcart;

public interface ShoppingcartMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Shoppingcart record);

    int insertSelective(Shoppingcart record);

    Shoppingcart selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Shoppingcart record);

    int updateByPrimaryKey(Shoppingcart record);
}