package com.example.cl.chenspringboot.bean;

/**
 * @Author hp
 * @Date 2020/8/4 10:39
 * @Version 1.0
 */
public class Test2  extends Test1{
    private  int aa;
    public Test2() {
        System.out.println(22);
    }

    public Test2(int aa) {
        System.out.println(222222);
        this.aa = aa;
    }
}
