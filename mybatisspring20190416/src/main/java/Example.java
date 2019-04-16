public class Example {
    /**
     * 1：mybatis+spring整合
     *   1）jar包
     *     mybatis 相关
     *     spring  相关
     *     mybatis-spring 相关
     *     测试包
     *     日志包
     *   2）spring-mapper  对mybatis与spring整合
     *      a：DataSource 数据源
     *      b：SqlSessionFactory 对象
     *      c：SqlSession
     *          mapper映射
     *   3）测试
     *      spring-test测试
     *
     *   4） service接口
     *       service实现类
     *       sprint-service配置
     *            扫描包
     *       测试
     *
     *
     *       业务逻辑的概念：
     *         如：删除一个分类 id=1删除
     *             1）有没有商品：如果有，不能删除
     *             2）有没有商品：如果有，商品删除，然后分类
     *       moveCategory（Integer cid）{
     *           int count=调用商品查找
     *           if（count！=0）{
     *               delete 删除商品
     *
     *           }
     *            delete  分类
     *
     *       }
     *
     *
     *
     *
     *
     *
     */
}
