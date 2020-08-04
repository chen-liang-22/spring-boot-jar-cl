package com.example.cl.chenspringboot.MyExceptionHandler;

import com.example.cl.chenspringboot.ChenSpringBootApplication;
import org.apache.shiro.authz.AuthorizationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author cl
 * @Date 2020/8/3 16:49
 * @Version 1.0
 */
@ControllerAdvice
public class MyExceptionHandler {
    Logger logger = LoggerFactory.getLogger(MyExceptionHandler.class);

    @ExceptionHandler
    @ResponseBody
    public String ErrorHandler(AuthorizationException e) {
        logger.error("没有通过权限验证！", e);
        return "没有通过权限验证！";
    }
}
