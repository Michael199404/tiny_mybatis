package com.chao.mybatis.test;

import com.chao.mybatis.binding.MapperRegistry;
import com.chao.mybatis.session.SqlSession;
import com.chao.mybatis.session.defaults.DefaultSqlSessionFactory;
import com.chao.mybatis.test.dao.IUserDao;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_MapperProxyFactory() {
        // 1. 注册 Mapper
        MapperRegistry registry = new MapperRegistry();
        registry.addMappers("com.chao.mybatis.test.dao");

        // 2. 从 SqlSession 工厂获取一个 Session
        DefaultSqlSessionFactory sqlSessionFactory = new DefaultSqlSessionFactory(registry);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3. 获取映射器对象
        IUserDao iUserDao = sqlSession.getMapper(IUserDao.class);

        // 4. 测试验证
        String res = iUserDao.queryUserName("10001");
        logger.info("测试结果：", res);
    }
}
