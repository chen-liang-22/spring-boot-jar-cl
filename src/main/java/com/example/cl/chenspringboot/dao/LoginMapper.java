package com.example.cl.chenspringboot.dao;

import java.util.List;
import java.util.Map;

/**
 * @Author cl
 * @Date 2020/8/12 15:06
 * @Version 1.0
 */
public interface LoginMapper {
    /**
     * 登录用户获取角色和权限
     * @return
     */
    List<Map<String,Object>> byUserDetail(Map<String,Object> param);


}
