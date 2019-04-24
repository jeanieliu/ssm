package com.neuedu.handle;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class MyHandle  implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        String uri=  request.getRequestURI();
        System.out.println(uri);
        if(uri.indexOf("login")>-1){
            return  true;
        }else{
            HttpSession session=request.getSession();
            if(session.getAttribute("username")!=null){
                return true;
            }else{
                response.sendRedirect("/user/loginjsp.do");
                return false;
            }

        }


    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        System.out.println("postHandle....");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        System.out.println("afterCompletion....");
    }
}
