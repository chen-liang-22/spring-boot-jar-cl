package com.example.cl.chenspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.context.annotation.Conditional;

/*springboot应用注解，主配置类，运行main方法启动springboot
*  包含@SpringBootConfiguration配置注解@EnableAutoConfiguration自动配置
*
*程序启动扫描加载主程序类所在的包以及下面所有子包的组件
* */
@SpringBootApplication
public class ChenSpringBootApplication {

    public static void main(String[] args) {
        /*参数必须是@SpringBootApplication注解的类*/
        SpringApplication.run(ChenSpringBootApplication.class, args);
        Logger logger = LoggerFactory.getLogger(ChenSpringBootApplication.class);
        logger.info("==================================  spring-boot启动 =====================================================");
    }

}
