public class Example {
    /**
     * 实现的步骤
     * 1:导入jar包
     * 2：配置web.xml文件
     *     dispatcherServlet
     *
     *
     *  3:配置springmvc--配置文件 spring-web.xml
     *     扫描注解的
     *       mvc的注解
     *     视图解析配置
     *
     * 功能的实现
     *   1：获取页面数据
     *       1）获取一个数据
     *       2）获取对象的数据
     *   2:将数据封装传入页面
     *     1）ModelAndView
     *     2）Map
     *     3）Model
     *     4)ModelMap
     *     区别1：ModelAndView 需要设置视图名，其他三个不需要
     *          2：ModelAndView：modelAndView.addObject("user",user);
     *             Map：put
     *             Model：addAttribute
     *             ModelMap：put，addAttribute
     *          3：ModelAndView能够作为返回类型，进行跳转
     *             其他三个使用字符串跳转。
     *          4： ModelAndView包：import org.springframework.web.servlet.ModelAndView;
     *              Map：import java.util.Map;
     *              Model:import org.springframework.ui
     *              ModelMap:import org.springframework.ui
     *
     *   3：中文乱码的解决
     *   4:请求转发和重定向
     *      1）请求转发
     *         a: return "result"  --result.jsp(推荐使用)
     *         b：forward：---*.do
     *      2)重定向
     *         redirect
     */
}
