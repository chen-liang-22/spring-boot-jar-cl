package com.example.cl.chenspringboot.servletConfig.myWeb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Author cl
 * @Date 2020/7/30 14:56
 * @Version 1.0
 */
public class MyListener implements ServletContextListener {
    Logger logger = LoggerFactory.getLogger(MyListener.class);
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("监听启动成功==========================================");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        logger.info("监听注销成功==========================================");
    }
}
