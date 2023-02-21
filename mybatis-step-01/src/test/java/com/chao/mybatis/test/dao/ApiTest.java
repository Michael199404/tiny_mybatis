package com.chao.mybatis.test.dao;

import com.chao.mybatis.MapperProxyFactory;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ApiTest {

    @Test
    public void test_MapperProxyFactory() {
        MapperProxyFactory<IUserDao> factory = new MapperProxyFactory<>(IUserDao.class);
        Map<String, String> sqlSession = new HashMap<>();

        sqlSession.put("com.chao.mybatis.test.dao.IUserDao.queryUserName", "模拟执行Mapper.xml中sql语句的操作：查询用户姓名");
        sqlSession.put("com.chao.mybatis.test.dao.IUserDao.queryUserAge", "模拟执行Mapper.xml中sql语句的操作：查询用户年龄");

        IUserDao iUserDao = factory.newInstance(sqlSession);

        String res = iUserDao.queryUserName("10001");
        System.out.println(res);
    }
}
