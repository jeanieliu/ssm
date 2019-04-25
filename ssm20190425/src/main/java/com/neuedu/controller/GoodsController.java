package com.neuedu.controller;

import com.neuedu.entity.Goods;
import com.neuedu.service.IGoodsService;
import com.neuedu.util.ImgUtil;
import com.neuedu.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("goods")
public class GoodsController {

    @Autowired
  private IGoodsService goodsService;


    @Autowired
    HttpServletRequest request;

    @GetMapping("goodsadd")
    public String add(){
        return "goodsadd";
    }

    @PostMapping("add")
    public String modifyAdd(GoodsVo goodsVo) throws IOException {
     /*   System.out.println(goodsVo);*/

       /* MultipartFile file=goodsVo.getFile();
        System.out.println(file.getName());*//*标签中name的值*//*
        System.out.println(file.getOriginalFilename());*//*上传过来的文件的名字*//*
        System.out.println(file.getInputStream());*//*文件内容，流*/
       /*
       *  1：服务器的路径
       * */
        String servicepath=request.getServletContext().getRealPath("/")+"imgload/";

        goodsService.add(goodsVo,servicepath);



        return "redirect:/user/list.do";
    }



}
