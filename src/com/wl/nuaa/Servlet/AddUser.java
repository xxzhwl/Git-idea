package com.wl.nuaa.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName: ${ClassName}
 * @Author：wl
 * @Date：2019/7/8
 * @Description:${PACKAGE_NAME}
 */
@WebServlet(name = "AddUser",urlPatterns = "/addUser")
public class AddUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.print("用户名:"+userName+"  密码："+password);
        System.out.println("用户名:"+userName);
        System.out.println("密码："+password);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
