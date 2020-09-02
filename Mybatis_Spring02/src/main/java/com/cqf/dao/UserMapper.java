package com.cqf.dao;

import com.cqf.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/9/119:29
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public interface UserMapper {
    public List<User> get();
    public  int adduser(@Param("er") User user);
    public int delete(@Param("id") int id);
}
