package com.neuedu.service.imple;

import com.neuedu.dao.IGoodsDAO;
import com.neuedu.entity.Goods;
import com.neuedu.service.IGoodsService;
import com.neuedu.util.ImgUtil;
import com.neuedu.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class GoodsService implements IGoodsService {

    @Autowired
    private IGoodsDAO goodsDAO;

    public void add(GoodsVo goodsVo,String servicepath) throws IOException {
        // System.out.println(servicepath);
        /*
         * 2:文件名
         * */
        MultipartFile file=goodsVo.getFile();
        String newFilename=String.valueOf(System.currentTimeMillis())+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        System.out.println(newFilename);

         /*在服务器上传图片*/
        ImgUtil.onloadImg(servicepath,newFilename,file);

        /*在本地上传图片*/
        String localpath="E:\\demo-java\\demo\\ssm\\ssm2019042201\\web\\imgload/";

        ImgUtil.onloadImg(localpath,newFilename,file);

        /*数据添加*/
       Goods goods=new Goods();
       /*类型转换*/
       tranceof(goodsVo,goods,newFilename);

       goodsDAO.insert(goods);
    }

    private void  tranceof(GoodsVo goodsVo,Goods goods,String newfilename){
        goods.setGname(goodsVo.getGname());
        goods.setGprice(goodsVo.getGprice());
        goods.setCid(goodsVo.getCid());
        goods.setGdesc(goodsVo.getGdesc());
        goods.setGstock(goodsVo.getGstock());
        goods.setGsell(goodsVo.getGsell());
        goods.setGnum(goodsVo.getGnum());
        goods.setImgsrc(newfilename);


    }
}
