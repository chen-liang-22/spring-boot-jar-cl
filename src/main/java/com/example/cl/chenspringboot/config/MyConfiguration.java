package com.example.cl.chenspringboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @Author cl
 * @Date 2020/8/4 9:31
 * @Version 1.0
 *  解决controller返回字符串中文乱码问题
 */
@Configuration
public class MyConfiguration extends WebMvcConfigurationSupport {
    @Override
    protected void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        // 解决controller返回字符串中文乱码问题
        for (HttpMessageConverter<?> converter : converters) {
            if (converter instanceof StringHttpMessageConverter) {
                ((StringHttpMessageConverter)converter).setDefaultCharset(StandardCharsets.UTF_8);
            }
        }
    }
}
