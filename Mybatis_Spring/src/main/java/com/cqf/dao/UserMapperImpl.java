package com.cqf.dao;

import com.cqf.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

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
public class UserMapperImpl implements UserMapper {
    //原来使用的sqlsession 的全部都使用SqlSessionTemplate
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> get() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return  mapper.get();
    }
}
