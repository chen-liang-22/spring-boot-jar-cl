package com.example.cl.chenspringboot.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.cl.chenspringboot.bean.Person;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

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
    @Transactional(rollbackFor = RuntimeException.class)
    public boolean send(@RequestParam String message) {
        int i = 1;
        Map<String,Object> map = new HashMap<>();


        while (true) {
            map.put("1","第" + String.valueOf(++i) + "次" + message);
            Person person = new Person();
            person.setId(1);
            person.setPhone("12345678");
            person.setEmail("dsuinvdsuidn");
            ListenableFuture<SendResult<String, Object>> chentopic = kafkaTemplate.send("tantopic", JSONObject.toJSONString(person));
            if ("err".equals(message)) {
                throw new RuntimeException("出错啦");
            }
            if(i == 6){
                throw  new RuntimeException("第六次啦");
            }
            if (i == 10) {
                break;
            }
        }
        return true;

    }

    @GetMapping("/message/send2")
    public void send2(@RequestParam String message) {
        for (int i = 0; i < 5; i++) {
            int finalI = i;
            String result = kafkaTemplate.executeInTransaction(kafkaOperations -> {
                try {
                    if (finalI == 3) {
                        throw new Exception("出错了");
                    }


                    System.out.println(kafkaOperations.send("chentopic", "瓜田李下 事务消息" + finalI).get());

                    return "发送成功";
                } catch (Exception e) {
                    e.printStackTrace();
                    return "发送失败";
                }
            });

//            System.out.println("消息 " + i + "发送结果为：" + result);

        }
    }

}