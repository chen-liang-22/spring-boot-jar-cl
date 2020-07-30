package com.example.cl.chenspringboot;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ChenSpringBootApplicationTests {

    @Test
    void contextLoads() {
        Logger logger = LoggerFactory.getLogger(ChenSpringBootApplicationTests.class);
        logger.info("测试");
    }

}
