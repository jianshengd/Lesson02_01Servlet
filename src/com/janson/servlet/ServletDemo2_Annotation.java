package com.janson.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/*
 * 注解配置的Servelt demo
 *  @author Janson
 * @date 2020/5/3 19:11
 */
//方法一：urlPatterns 配置地址
//@WebServlet(urlPatterns = "/demo2")
//方法二：value 配置地址
//多地址
//@WebServlet({"/demo32","/demo2/Bak","/demo2/Bak/b2"})
//demo2/接任意值都可以访问到，*是通配符
//@WebServlet("/demo2/*"})
//任意地址都可以访问到的地址，但优先级最低
//@WebServlet("/*"})
//任意地址.aa都可以访问到
//@WebServlet("*.aa"})
@WebServlet("/demo2")
public class ServletDemo2_Annotation implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("annotation servlet demo2");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
    }
}
