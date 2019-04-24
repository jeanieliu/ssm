package com.neuedu.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.neuedu.entity.User;
import com.neuedu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("user")
@SessionAttributes("uname")
public class UserController {

    @Autowired
    private IUserService userService;
/*
*//*    @Autowired
    private HttpServletRequest request;*/
/*
*  分页的时候
*    pageNum num可能没有传入值，使用默认值：@RequestParam(required = false,defaultValue = "1")
*
 * */
    @GetMapping("list")
    public String list(@RequestParam(required = false,defaultValue = "1") int pageNum,
                       @RequestParam(required = false,defaultValue = "3")int num,
                       ModelMap modelMap){
        /*提取数据*/
        PageInfo<User> lists=userService.getVipAll(pageNum,num);
        List<User> listuser=lists.getList();

        modelMap.put("pages",lists);

          return "userlist";
    }

    @GetMapping("addlist")
    public String addlist(){
        return "useradd";
    }

    @PostMapping("add")
    public String add(User user){
        user.setUlevel(1);
        System.out.println(user);
        userService.add(user);
        return "redirect:list.do";
    }

    /*用户名的验证
    *   返回类型：String  {"flag":true}
    * */

    @PostMapping("checkName")
    @ResponseBody
    public String checkName(String uname){
       List<User> userList= userService.getAll();
       boolean flag=true;/*可用*/
       for(User user:userList){
           if(uname.equals(user.getUname())){
               flag=false;
               break;
           }
       }

       String jsonString="{\"flag\":"+flag+"}";
        System.out.println(jsonString);

        return jsonString;
    }



    /*删除*/
    @GetMapping("/{id}/delete")
    public String deleteById(@PathVariable("id") Integer uid){
        userService.delete(uid);
        return "redirect:/user/list.do";
    }
/*
* Session设置：
*   1：使用HttpServletRequest对象完成
* */
  /*  @PostMapping("login")
    public String login(String username,String password,String ifsave,HttpServletRequest request){
        boolean flag=userService.checklogin(username,password);
        if(flag){

            HttpSession session=request.getSession();
            session.setAttribute("username",username);
            return "redirect:/user/list.do";
        }else{
            return "redirect:/user/loinjsp.do";
        }
    }*/

    @PostMapping("login")
    public String login(String username,String password,String ifsave,HttpSession session){
        boolean flag=userService.checklogin(username,password);
        if(flag){
            session.setAttribute("username",username);
            return "redirect:/user/list.do";
        }else{
            return "redirect:/user/loinjsp.do";
        }
    }
/*
*   2：使用SpringMVC提供
* */
   /* @PostMapping("login")
    public String login(String username,
                        String password,
                        String ifsave,
                        Model model){
        boolean flag=userService.checklogin(username,password);
        if(flag){

           model.addAttribute("uname",username);
            return "redirect:/user/list.do";
        }else{
            return "redirect:/user/loinjsp.do";
        }
    }*/
    @GetMapping("loinjsp")
    public String loginjsp(){
        return "login";
    }

    @GetMapping("getSession")
    public String getSessionValue(@ModelAttribute("uname")String name){
        System.out.println(name);
        return "redirect:/user/list.do";
    }

}
