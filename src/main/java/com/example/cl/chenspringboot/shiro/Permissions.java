package com.example.cl.chenspringboot.shiro;

/**
 * @Author cl
 * @Date 2020/8/3 16:21
 * @Version 1.0
 */
public class Permissions {
    private String id;
    private String permissionsName;

    public Permissions(String id, String permissionsName) {
        this.id = id;
        this.permissionsName = permissionsName;
    }
    //省略set、get方法等.....


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPermissionsName() {
        return permissionsName;
    }

    public void setPermissionsName(String permissionsName) {
        this.permissionsName = permissionsName;
    }
}
