package com.neuedu;

public class Example {
    /**
     * 1：maven生命周期：
     *    clean:清理
     *    package：打包：jar。war等
     *    install：生成maven能够使用的jar包
     *     <groupId>com.neuedu.ssm</groupId>
     <artifactId>mybatis20190408</artifactId>
     <version>1.0-SNAPSHOT</version>
         compile:编译 main java进行编译
         test:  test中的代码进行的编译
     2：单元测试
         1）jar导入
         2）使用
             单元测试一般应用在方法上，这个方法：没有返回类型和参数的方法
          @Test:注解
          import org.junit.Test;

     @Before
     @After

     shift+ctrl+T  生成测试类
      3：mybatis的简单应用

         1）导入jar包
             mysql
             mybatis
        2）配置mybatis-congfig.xml
        3）mybatis-config测试
     String resource = "mybatis-config.xml";//mybatis-config.xml路径
     InputStream inputStream = Resources.getResourceAsStream(resource);//输入流

     SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
       3）使用的是注解实现select功能
       4） 测试select功能

     */
}
