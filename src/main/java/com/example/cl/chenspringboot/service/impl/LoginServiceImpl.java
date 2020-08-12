package com.example.cl.chenspringboot.service.impl;

import com.example.cl.chenspringboot.bean.Role;
import com.example.cl.chenspringboot.bean.User;
import com.example.cl.chenspringboot.dao.LoginMapper;
import com.example.cl.chenspringboot.service.LoginService;
import com.example.cl.chenspringboot.shiro.Permissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @Author cl
 * @Date 2020/8/3 16:23
 * @Version 1.0
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginMapper loginMapper;

    @Override
    public List<Map<String, Object>>  getUserByName(String getMapByName) {
        //模拟数据库查询，正常情况此处是从数据库或者缓存查询。
        return getMapByName(getMapByName);
    }

    /**
     * 模拟数据库查询
     * @param userName
     * @return
     */
    private List<Map<String, Object>>  getMapByName(String userName){
        Map<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("userName",userName);
        List<Map<String, Object>> userNamemap = loginMapper.byUserDetail(objectObjectHashMap);
        //共添加两个用户，两个用户都是admin一个角色，
        //wsl有query和add权限，zhangsan只有一个query权限
//        Permissions permissions1 = new Permissions("1","query");
//        Permissions permissions2 = new Permissions("2","add");
//        Set<Permissions> permissionsSet = new HashSet<>();
//        permissionsSet.add(permissions1);
//        permissionsSet.add(permissions2);
//        Role role = new Role("1","admin",permissionsSet);
//        Set<Role> roleSet = new HashSet<>();
//        roleSet.add(role);
//        User user = new User("1","wsl","123456",roleSet);
//        Map<String ,User> map = new HashMap<>();
//        map.put(user.getUserName(), user);
//
//        Permissions permissions3 = new Permissions("3","query");
//        Set<Permissions> permissionsSet1 = new HashSet<>();
//        permissionsSet1.add(permissions3);
//        Role role1 = new Role("2","user",permissionsSet1);
//        Set<Role> roleSet1 = new HashSet<>();
//        roleSet1.add(role1);
//        User user1 = new User("2","zhangsan","123456",roleSet1);
//        map.put(user1.getUserName(), user1);
//        return map.get(userName);
        return userNamemap;
    }
}
