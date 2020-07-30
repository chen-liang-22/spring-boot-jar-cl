package com.example.cl.chenspringboot.servletConfig;

import com.example.cl.chenspringboot.servletConfig.myWeb.MyFilter;
import com.example.cl.chenspringboot.servletConfig.myWeb.MyListener;
import com.example.cl.chenspringboot.servletConfig.myWeb.MyServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @Author cl
 * @Date 2020/7/30 14:38
 * @Version 1.0
 */
@Configuration
public class WebServlet {
    Logger logger = LoggerFactory.getLogger(WebServlet.class);
    //注册三大组件
    @Bean
    public ServletRegistrationBean myServlet(){
//        logger.info("myServlet==============================================启动");
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new MyServlet(),"/myServlet");
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean myFilter(){
//        logger.info("myFilter==============================================启动");
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new MyFilter());
        registrationBean.setUrlPatterns(Arrays.asList("/hello","/myFilter"));
        return registrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean myListener(){
//        logger.info("myListener==============================================启动");
        ServletListenerRegistrationBean<MyListener> registrationBean = new ServletListenerRegistrationBean<>(new MyListener());
        return registrationBean;
    }

}
