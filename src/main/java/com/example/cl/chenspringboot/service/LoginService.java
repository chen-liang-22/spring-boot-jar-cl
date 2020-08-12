package com.example.cl.chenspringboot.service;

import com.example.cl.chenspringboot.bean.User;

import java.util.List;
import java.util.Map;

/**
 * @Author cl
 * @Date 2020/8/3 16:24
 * @Version 1.0
 */
public interface LoginService {
    List<Map<String, Object>>  getUserByName(String getMapByName);
}
