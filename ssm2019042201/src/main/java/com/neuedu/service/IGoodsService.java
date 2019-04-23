package com.neuedu.service;

import com.neuedu.entity.Goods;
import com.neuedu.vo.GoodsVo;

import java.io.IOException;

public interface IGoodsService {
    void add(GoodsVo goodsVo,String newfilename) throws IOException;
}
