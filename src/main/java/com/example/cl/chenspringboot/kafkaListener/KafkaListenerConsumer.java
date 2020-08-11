package com.example.cl.chenspringboot.kafkaListener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.KafkaListeners;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * @Author cl
 * @Date 2020/8/6 10:46
 * @Version 1.0
 */
@Component
public class KafkaListenerConsumer {

    @KafkaListener(id = "",topics = "chentopic")
    public void onMessage(@Payload String message, @Headers MessageHeaders headers){
        //insertIntoDb(buffer);//这里为插入数据库代码
        System.out.println(message);
    }
}
