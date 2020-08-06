package com.example.cl.chenspringboot.bean;

/**
 * @Author cl
 * @Date 2020/8/4 16:57
 * @Version 1.0
 */
public class Person {
    private Integer id;
     private String username;
     private String zone;
     private String email;
     private String sex;
     private String phone;

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String createTime;
}
