package com.neuedu.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;


import javax.annotation.Resource;
import javax.sql.DataSource;
import java.net.MalformedURLException;

/**
 * 对mybatis+spring整合
 */

@Configuration
public class MybatisSpring {

    /*1:配置数据源*/

    @Bean(name="dataSource")
    public DataSource getDataSource(){
        DruidDataSource druidDataSource=new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/dspt?characterEncoding=utf8");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("123456");

        return druidDataSource;
    }

    @Bean(name="sqlSessionFactory")
    @Resource(name="dataSource")
    public SqlSessionFactoryBean getSqlSessionFactoryBean(DataSource dataSource) throws MalformedURLException {
        SqlSessionFactoryBean sqlSessionFactoryBean=new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage("com.neuedu.entity");

        return sqlSessionFactoryBean;
    }

    @Bean
  public MapperScannerConfigurer getMapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer=new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.neuedu.dao");
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        return mapperScannerConfigurer;
  }




}
