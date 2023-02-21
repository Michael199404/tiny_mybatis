package com.chao.mybatis.test.dao;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class ProxyTest {

    @Test
    public void test() {
        // 创建一个 InvocationHandler 对象
        MyInvocationHandler handler = new MyInvocationHandler();
        // 使用指定的 InvocationHandler 来生成一个动态代理对象
        Person person = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class[]{Person.class}, handler);
        // 调用动态代理对象的 walk() 和 sayHello() 方法
        person.walk();
        person.sayHello("老孙");
    }

}
