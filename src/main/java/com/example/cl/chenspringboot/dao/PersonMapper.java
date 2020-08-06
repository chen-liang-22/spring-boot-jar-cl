package com.example.cl.chenspringboot.dao;

import com.example.cl.chenspringboot.bean.Person;

import java.util.List;

/**
 * @Author hp
 * @Date 2020/8/4 16:59
 * @Version 1.0
 */
public interface PersonMapper {
    /**
     * @return
     * @desc 查询所有的用户
     */
    List<Person> findAll();
}
