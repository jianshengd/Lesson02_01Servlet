package com.janson.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

/*
 *  HTTP get和 post请求的servelt封装类
 *  @author Janson
 * @date 2020/5/3 19:48
 */
@WebServlet("/demo4")
public class ServletDemo4_Redirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("deGet 重定向。。。");
        //方法1
//        resp.setStatus(302);
//        resp.setHeader("location","/01Servlet/demo2");
        //方法2
        resp.sendRedirect("/01Servlet/demo2");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost");
    }
}
