package com.chao.mybatis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * 调用接口方法的时候，实际是调用invoke方法
 * 实现了接口具体需要实现的操作数据库的方法
 * @param <T>
 */
public class MapperProxy<T> implements InvocationHandler {

    private Map<String, String> sqlSession;
    private final Class<T> mapperInterface;

    public MapperProxy(Map<String, String> sqlSession, Class<T> mapperInterface) {
        this.sqlSession = sqlSession;
        this.mapperInterface = mapperInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return "你被代理了！" + sqlSession.get(mapperInterface.getName() + "." + method.getName());
    }
}
