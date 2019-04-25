package com.neuedu.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class WebApplication extends AbstractAnnotationConfigDispatcherServletInitializer {
  /*
  * spring
  * */
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class,MybatisSpring.class,DataSourceTrancation.class};
    }

    /*
    *  springmvc
    * */
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringmvcConfig.class};
    }

    /*
    * DispatcherServlet的映射路径
    * */
    protected String[] getServletMappings() {
        return new String[]{"*.do"};
    }
}
