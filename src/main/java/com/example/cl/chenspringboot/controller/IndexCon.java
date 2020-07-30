package com.example.cl.chenspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author cl
 * @Date 2020/7/30 14:34
 * @Version 1.0
 */
@Controller
public class IndexCon {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
