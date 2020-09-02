package com.cqf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/9/119:24
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private int id;
    private String pwd;
}
