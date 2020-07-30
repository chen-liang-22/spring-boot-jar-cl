package com.example.cl.chenspringboot.servletConfig.myWeb;

import com.example.cl.chenspringboot.config.MyMvcConfig;
import com.example.cl.chenspringboot.servletConfig.WebServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author cl
 * @Date 2020/7/30 14:39
 * @Version 1.0
 */
public class MyServlet extends HttpServlet {
    Logger logger = LoggerFactory.getLogger(MyServlet.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("配置servlet成功=========================================");
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("配置servlet成功");
    }
}
