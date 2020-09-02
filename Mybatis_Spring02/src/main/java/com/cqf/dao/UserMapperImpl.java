package com.cqf.dao;

import com.cqf.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.jws.soap.SOAPBinding;
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
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    //原来使用的sqlsession 的全部都使用SqlSessionTemplate


    @Override
    public List<User> get() {
        User user = new User("x", 6, "13");
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        mapper.adduser(user);
        mapper.delete(2);
        return mapper.get();
    }

    @Override
    public int adduser(User user) {
        return getSqlSession().getMapper(UserMapper.class).adduser(user);
    }

    @Override
    public int delete(int id) {
        return getSqlSession().getMapper(UserMapper.class).delete(id);
    }
}
