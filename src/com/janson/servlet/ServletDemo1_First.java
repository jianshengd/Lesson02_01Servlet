package com.janson.servlet;

import javax.servlet.*;
import java.io.IOException;

/*
 * 最简单的Servelt demo
 * 配置：web.xml中配置demo1
 *  @author Janson
 * @date 2020/5/3 19:11
 */
public class ServletDemo1_First implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        //情况1，第一次访问时，创建。 web.xml-> <servlet>-><load-on-startup>负数</load-on-startup>
        //情况2，服务器创建时，创建。 web.xml-> <servlet>-><load-on-startup>大等于0</load-on-startup>
        System.out.println("init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hello servlet demo1");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        //服务器正常关闭
        System.out.println("destroy");
    }
}
