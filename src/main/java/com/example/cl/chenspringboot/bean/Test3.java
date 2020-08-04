package com.example.cl.chenspringboot.bean;

/**
 * @Author hp
 * @Date 2020/8/4 10:40
 * @Version 1.0
 */
public class Test3 extends Test2 {
    int a;
    public Test3() {
        System.out.println(33333);
    }
    public Test3(int a) {
        super(a);
        System.out.println(33333);
    }
}