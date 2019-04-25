package com.neuedu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
/*
*
*   springmvc的基本配置
* */

@Configuration
@EnableWebMvc/*开启webmvc的扫描*/
@ComponentScan("com.neuedu.controller")
public class SpringmvcConfig {

    /*
    *  视图解析器
    * */
    @Bean
    public ViewResolver getViewResolver(){
        InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
