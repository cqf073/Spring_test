package com.cqf.service;

import com.cqf.dao.Userdao;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/8/2510:15
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class serviceImpl implements  service {
    private Userdao userdao;

    public void setUserdao(Userdao userdao) {
        this.userdao = userdao;
    }

    @Override
    public void getService() {
        userdao.getUser();

    }
}
