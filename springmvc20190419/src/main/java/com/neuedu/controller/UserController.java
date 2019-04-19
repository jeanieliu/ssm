package com.neuedu.controller;

import com.neuedu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

  /*  @GetMapping("list")*//*后缀.do在GetMapping中可以省略当时在请求的路径不能省*//*
    public String list(){
        return "testonedata";
    }*/

    /*
    * 1)传入的参数名与接收的参数名一致
    *     http://localhost:8888/user/login.do?username=tom
    * 2） 传入的参数名与接收的参数名不一致
    *     @RequestParam中的参数要和请求的参数名一致
    * */
  /*  @GetMapping("login")
    public String login(String username){

        System.out.println(username);
        return "result";
    }*/

    /*@GetMapping("login")
    public String login(@RequestParam("username") String uname){

        System.out.println(uname);
        return "result";
    }*/



    @GetMapping("list")
    public String list(){
        return "userdata";
    }
    /*对象，自动装箱*/
   /* @GetMapping("login")
    public String login(User user){

        System.out.println(user);
        return "result";
    }*/

   /*
   *   将数据发送到页面中，进行显示
   *    request.setAttribute（）；
   * */
   /* @GetMapping("login")
    public ModelAndView login(User user){

        System.out.println(user);
        *//*
        *   使用addObject方法：
        *       第一个参数：自定义：name
        *       第二个参数：实际的数据
        * *//*
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("result");
        modelAndView.addObject("user",user);
        return modelAndView;
    }
*/


    /*
    *  Map
    *    使用map传值
    *     其中key就相当于request.setAttribute中的name
    *      value  就相当于request.setAttribute中的value
    * */
   /* @GetMapping("login")
    public String login(User user,
                        Map<String,Object> map){

        System.out.println(user);
        map.put("user",user);

        return "result";
    }*/

   /*
   *  Model
   *     import org.springframework.ui.Model;
   * */
    /*@GetMapping("login")
    public String login(User user,
                        Model model){

        System.out.println(user);
        model.addAttribute("user",user);

        return "result";
    }*/

    /**
     *  ModelMap：将Model和Map功能相结合，
     *             addAttribute
     *             put
     * @param user
     * @param modelMap
     * @return
     */
    @GetMapping("login")
    public String login(User user,
                        ModelMap modelMap){

        System.out.println(user);
      // modelMap.addAttribute("user",user);
         modelMap.put("user",user);
        return "result";
    }

    @PostMapping("loginpost")
    public String loginpost(User user,
                        ModelMap modelMap){

        System.out.println(user);
        // modelMap.addAttribute("user",user);
        modelMap.put("user",user);
        return "result";
    }

}
