package com.neuedu;

public class Example {
    /*
    *
    * 1：xml实现
    * 2：注解的实现
    * 3:对mybatis-config的完善
    *   properties（属性）
        settings（设置）
        typeAliases（类型别名）
        typeHandlers（类型处理器）
        objectFactory（对象工厂）
        plugins（插件）
        environments（环境配置）
        environment（环境变量）
        transactionManager（事务管理器）
        dataSource（数据源）
        databaseIdProvider（数据库厂商标识）
        mappers（映射器）
        这是config中能够添加添加的标签
         添加这些标签时：标签的顺序一定要保持与上面以上，可以省，但不能调换
    *   1）数据库的连接信息放在单独的文件中
    *       poperties
    *   2)给实体类起别名
    *       typeAliases（类型别名）
    *   3) 环境变量：
    *        environments
    *           environment（环境变量）
                transactionManager（事务管理器）
                dataSource（数据源）
    *   4） 映射
     *       mappers（映射器）
    *
    * */
}
