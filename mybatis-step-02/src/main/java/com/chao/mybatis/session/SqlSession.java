package com.chao.mybatis.session;

/**
 * 1. 用于定义执行sql标准
 * 2. 获取映射器
 */
public interface SqlSession {

    /**
     * 根据指定的SqlID获取一条记录的封装对象
     * @param statement
     * @param <T>
     * @return
     */
    <T> T selectOne(String statement);

    <T> T selectOne(String statement, Object paramter);

    <T> T getMapper(Class<T> type);
}
