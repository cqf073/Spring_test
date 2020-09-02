package com.cqf.dao;

import com.cqf.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/9/122:30
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class UserMapperImpl2  extends SqlSessionDaoSupport implements UserMapper {
    //原来使用的sqlsession 的全部都使用SqlSessionTemplate


    @Override
    public List<User> get() {
        SqlSession sqlSession = getSqlSession();
        return sqlSession.getMapper(UserMapper.class).get();
    }
}
