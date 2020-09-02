package com.cqf.Config;

import com.cqf.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/8/279:50
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
@Configuration
public class myConfig {
    @Bean
    public User getuser(){
        return  new User();
    }
}
