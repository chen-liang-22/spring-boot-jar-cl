package com.example.cl.chenspringboot.shiro.customRealm;

import com.example.cl.chenspringboot.bean.Role;
import com.example.cl.chenspringboot.bean.User;
import com.example.cl.chenspringboot.service.LoginService;
import com.example.cl.chenspringboot.shiro.Permissions;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * @Author cl
 * @Date 2020/8/3 16:29
 * @Version 1.0
 */
public class CustomRealm extends AuthorizingRealm {
    @Autowired
    private LoginService loginService;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        /*登录认证*/
        //加这一步的目的是在Post请求的时候会先进认证，然后在到请求
        if (authenticationToken.getPrincipal() == null) {
            return null;
        }
        //获取用户信息
        String name = authenticationToken.getPrincipal().toString();
        List<Map<String, Object>> userByName = loginService.getUserByName(name);
        if (userByName == null || userByName.size() == 0) {
            //这里返回后会报出对应异常
            return null;
        } else {
            //这里验证authenticationToken和simpleAuthenticationInfo的信息
            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(name, userByName.get(0).get("password"), getName());
            return simpleAuthenticationInfo;
        }
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        权限认证
        //获取登录用户名
        String name = (String) principalCollection.getPrimaryPrincipal();
        //根据用户名去数据库查询用户信息
        List<Map<String, Object>> userByName = loginService.getUserByName(name);
        //添加角色和权限（根据用户获取所有权限并返回）
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        for (Map<String, Object> map : userByName) {
            //添加角色
            simpleAuthorizationInfo.addRole((String) map.get("roleName"));
            //添加权限
            simpleAuthorizationInfo.addStringPermission((String) map.get("permissionsName"));

        }
        return simpleAuthorizationInfo;
    }

}
