package com.chao.mybatis.session.defaults;

import com.chao.mybatis.binding.MapperRegistry;
import com.chao.mybatis.session.SqlSession;
import com.chao.mybatis.session.SqlSessionFactory;

/**
 * SqlSessionFactory 是一个简单的工厂模式，用于提供 SqlSession 服务，屏蔽创建细节，延迟创建过程
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final MapperRegistry mapperRegistry;

    public DefaultSqlSessionFactory(MapperRegistry mapperRegistry) {
        this.mapperRegistry = mapperRegistry;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(mapperRegistry);
    }
}
