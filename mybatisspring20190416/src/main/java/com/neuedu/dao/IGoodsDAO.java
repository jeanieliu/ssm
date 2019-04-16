package com.neuedu.dao;

import com.neuedu.entity.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IGoodsDAO {

    /*
    *   根据商品名和内容描述进行查找
    *    条件，商品名必须有，但是内容描述可以没有
    * */

    List<Goods> selectByNameAndDesc(@Param("gname") String gname, @Param("gdesc") String gdesc);


    /*
     *   根据商品名和内容描述进行查找
     *    条件，商品名也可以没有，但是内容描述可以没有
     *
     * */

/*
*
*   进行商品修改的时候，只对部分字段进行修改，
*    可能 商品名，可能 内容描述 ，图片等等
*
*    where gid=
* */

     Integer updateGoods(@Param("goods") Goods goods);



     /*
     *  查询类别是1，或者是1,2 或者1，2，3的
     *    类别的个数不定，使用集合传值
     * */

     List<Goods> selectByCidList(List<Integer> ids);

     /*
     * 分页：
     * 最少传值两个  offset num
     * */

     List<Goods> selectByOffsetAndNum(@Param("offset") int offset, @Param("num") int num);
}
