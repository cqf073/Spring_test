package com.cqf.dao;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/8/2520:06
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class Address {
    private String address;

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
