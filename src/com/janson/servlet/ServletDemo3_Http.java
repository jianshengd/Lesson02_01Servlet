package com.janson.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
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
@WebServlet({"/demo3","/demo3/Bak","/demo3/Bak/b2"})
public class ServletDemo3_Http extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("deGet");
        String agent = req.getHeader("user-agent");
        System.out.println("浏览器："+agent);
        //可以用作防盗链。 不明来源地址
        String referer = req.getHeader("referer");
        System.out.println("来源地址："+referer);
        String method = req.getMethod();
        System.out.println("方法："+method);
        String path = req.getContextPath();
        System.out.println("虚拟目录："+path);
        String uri = req.getRequestURI();
        System.out.println("地址："+uri);
        String queryString= req.getQueryString();
        System.out.println("请求参数："+queryString);
        String protocol = req.getProtocol();
        System.out.println("协议："+protocol);
        ServletContext servletContext = req.getServletContext();
        System.out.println("servletContext："+servletContext);
        //转发到demo2，特点：a.浏览器地址没发生变化,b.只能访问内部资源，不能访问服务器外部
        //一般用于一次请求多个资源
        req.getRequestDispatcher("/demo2").forward(req,resp);

        //响应状态码
        /*
            1XX 服务器接收到客户端信息，但没有全接收到，一段时间后返回1xx，多状态码
            2xx 成功。例如：200
            3xx 重定向。例如：302 重定向。 304 访问缓存
            4xx 客户端错误。例如：404 没有请求的资源。 405 请求方式没有对应的doGet或者doPost方法
            5xx 服务器错误。例如：500 服务器内部异常
         */
//        resp.setStatus();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost");
        BufferedReader reader = req.getReader();
        String line;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }
    }
}
