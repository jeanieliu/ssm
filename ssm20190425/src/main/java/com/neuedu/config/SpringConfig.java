package com.neuedu.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
/*
* spring注解扫描
* */
@Configuration
@ComponentScan(basePackages = {"com.neuedu.service"},excludeFilters={@Filter(type= FilterType.ANNOTATION,value=EnableWebMvc.class)})
public class SpringConfig {
}
