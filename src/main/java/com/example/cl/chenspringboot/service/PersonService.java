package com.example.cl.chenspringboot.service;

import com.example.cl.chenspringboot.bean.Person;

import java.util.List;

/**
 * @Author cl
 * @Date 2020/8/4 17:13
 * @Version 1.0
 */
public interface PersonService {
    /**
     17      * @desc 查询所有的用户
     18      * @return
     1      */
    List<Person> findAll();
}
