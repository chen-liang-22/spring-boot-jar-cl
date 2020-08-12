package com.example.cl.chenspringboot.kafkaListener;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.example.cl.chenspringboot.bean.Person;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.KafkaListeners;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author cl
 * @Date 2020/8/6 10:46
 * @Version 1.0
 */
@Component
public class KafkaListenerConsumer {

    @KafkaListener(id = "",topics = "tantopic")
    public void onMessage(@Payload String message, @Headers MessageHeaders headers){
        //insertIntoDb(buffer);//这里为插入数据库代码
        Person person = JSON.parseObject(message,new TypeReference<Person>() {});
        System.out.println("接收到消息:"+person);
    }
}
