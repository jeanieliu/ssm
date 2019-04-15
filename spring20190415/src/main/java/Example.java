public class Example {
    /**
     * 1：简单实现了spring
     *   1）jar导入
     *   2）User类
     *   3）配置：spring-config配置
     *   4）调用容器
     *      创建User类的对象
     *
     *  2：创建对象
     *     1）使用无参的构造器
     *         set赋值
     *     2）使用有参的构造器
     *
     * 3: 创建的属性，标签
     *    1）别名 alias
     *    2）*id name
     *    3）*scope
     *
     *    4）class
     *    5）autowire
     * 4： IoC的实现方式 及 与DI的关系？
     (1).IOC 控制反转：把对象交给spring进行配置
     (2).依赖注入(Dependency Injection)：向类的属性中设置值
     (3)关系：依赖注入不能单独存在，需要在ioc基础之上完成操作
     依赖注入就是将服务注入到使用它的地方。对象只提供普通的方法让容器去决定依赖关系，
     容器全权负责组件的装配，它会把符合依赖关系的对象通过属性（JavaBean中的setter）
     或者是构造子传递给需要的对象。相对于IoC而言，依赖注入(DI)更加准确地描述了IoC的设计理念。
     所谓依赖注入，即组件之间的依赖关系由容器在应用系统运行期来决定，
     也就是由容器动态地将某种依赖关系的目标对象实例注入到应用系统中的各个关联的组件之中
     *  实现注入：
     *    1）构造器的注入：
     *        有参构造器和无参构造器的实现
     *     2）set注入
     *         a:常量的注入
     *         b：bean的注入
     *         c:复杂数据类型
     *            数组
     *            list
     *            map
     *            properties
     *          d: null
     *
     *  5:注解实现
     *   1）介绍注解
     *      a：实现bean的功能
     *      @Component：组件（作用在类上）
            @Controller ：web层
            @ Service：业务层
            @ Repository：持久层
           b:@Scope --- bean作用域
           c:@Autowired
             @Resource
           d:声明周期的注解
             @PostConstruct
             功能：为当前Bean 指定init-method 参数
             格式：定义在成员方法的上方，兼容静态方法
             @PreDestroy
             功能：为当前Bean 指定destory-method 参数 格式：定义在成员方法的上方，兼容静态方法

        2）实现注解
           1）导入jar包
           2）配置ApplicationContext文件
             a:引入约束
             b:配置
          3) 创建两个类
             使用注解
          4）测试
      3）案例
          模拟jdbc：
          a:有一个接口 JDBCDATA  方法：print();
          b：子类：MysqlJDBC实现这个接口  print()输出：使用mysql实现jdbc
              子类：OracleJDBC 实现这个接口  print()输出：使用oracle实现jdbc

       6:spring和junit整合
         1）导入jar包
         2）配置测试类
             @RunWith：SpringRunner.class  使用spring进行测试
            @ContextConfiguration("classpath:spring-config03.xml")
                ApplicatianContxt文件所在的路径及其文件。
                从classes中进行查找，
                classpath：就是从classes开始
          3）测试

     */
}
