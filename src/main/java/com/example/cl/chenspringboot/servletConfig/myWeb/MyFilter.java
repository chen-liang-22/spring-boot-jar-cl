package com.example.cl.chenspringboot.servletConfig.myWeb;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author cl
 * @Date 2020/7/30 14:47
 * @Version 1.0
 */
public class MyFilter  implements Filter {
    Logger logger = LoggerFactory.getLogger(MyFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("Fileter拦截成功==========================================");
    }

    @Override
    public void destroy() {

    }
}
