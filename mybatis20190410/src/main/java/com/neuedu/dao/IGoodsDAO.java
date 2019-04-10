package com.neuedu.dao;

import com.neuedu.entity.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IGoodsDAO {

    /*
    *   根据商品名和内容描述进行查找
    *    条件，商品名必须有，但是内容描述可以没有
    * */

    List<Goods> selectByNameAndDesc(@Param("gname") String gname,@Param("gdesc") String gdesc);


    /*
     *   根据商品名和内容描述进行查找
     *    条件，商品名也可以没有，但是内容描述可以没有
     *
     * */




}
