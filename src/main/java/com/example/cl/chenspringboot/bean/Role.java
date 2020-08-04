package com.example.cl.chenspringboot.bean;

import com.example.cl.chenspringboot.shiro.Permissions;

import java.util.Set;

/**
 * @Author hp
 * @Date 2020/8/3 16:20
 * @Version 1.0
 */
public class Role {
    private String id;
    private String roleName;
    /**
     * 角色对应权限集合
     */
    private Set<Permissions> permissions;
    //省略set、get方法等.....


    public Role(String id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public Role(String id, String roleName, Set<Permissions> permissions) {
        this.id = id;
        this.roleName = roleName;
        this.permissions = permissions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<Permissions> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permissions> permissions) {
        this.permissions = permissions;
    }
}
