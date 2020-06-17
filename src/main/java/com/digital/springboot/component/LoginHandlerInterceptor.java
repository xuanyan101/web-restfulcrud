package com.digital.springboot.component;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {


    // 目标方法执行之前
    //@Override
    //public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    //    Object user = request.getSession().getAttribute("loginUser");
    //    if (user == null){
    //        // 未登录状态,返回登录页
    //        request.setAttribute("msg","没有权限请先登录");
    //        request.getRequestDispatcher("/index.html").forward(request,response);
    //        return false;
    //    }else {
    //        //已经登录，放行
    //        return true;
    //    }
    //
    //}

}
