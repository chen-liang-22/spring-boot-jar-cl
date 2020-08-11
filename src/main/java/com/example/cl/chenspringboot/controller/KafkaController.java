package com.example.cl.chenspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author cl
 * @Date 2020/8/6 10:38
 * @Version 1.0
 */
@RestController
public class KafkaController {
    @Resource
    private KafkaTemplate<String, Object> kafkaTemplate;

    @GetMapping("/message/send")
    public boolean send(@RequestParam String message) {
        ListenableFuture<SendResult<String, Object>> chentopic = kafkaTemplate.send("chentopic", message);
        if ("err".equals(message)) {
            throw new RuntimeException("出错啦");
        }
        return true;
    }

    @GetMapping("/message/send2")
    public void send2(@RequestParam String message) {
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            String result = kafkaTemplate.executeInTransaction(kafkaOperations -> {
                try {
                    if (finalI == 2) {
                        throw new Exception("出错了");
                    }

                    System.out.println(kafkaOperations.send("chentopic", "瓜田李下 事务消息" + finalI).get());

                    return "发送成功";
                } catch (Exception e) {
                    e.printStackTrace();
                    return "发送失败";
                }
            });

            System.out.println("消息 " + i + "发送结果为：" + result);

        }
    }

}