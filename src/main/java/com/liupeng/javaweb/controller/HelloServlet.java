package com.liupeng.javaweb.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lenovo on 2017/7/3.
 */
@WebServlet("/hello")
public class HelloServlet  extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException,IOException {
        req.setAttribute("name","111111");
        req.getRequestDispatcher("WEB-INF/view/hello.jsp").forward(req,resp);
    }

}


