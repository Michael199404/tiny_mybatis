package com.chao.mybatis.test.dynamic.proxy;

public class GunDog implements Dog {


    @Override
    public void info() {
        System.out.println("I am d gun dog");
    }

    @Override
    public void run() {
        System.out.println("I run fast");
    }
}
