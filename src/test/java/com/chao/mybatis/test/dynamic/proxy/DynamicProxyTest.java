package com.chao.mybatis.test.dynamic.proxy;

import org.junit.Test;

public class DynamicProxyTest {

    @Test
    public void test() {
        // 创建提个 GunDog 对象作为 target
        Dog target = new GunDog();
        Dog dog = (Dog) MyProxyFactory.getProxy(target);
        dog.info();
        dog.run();
    }
}
