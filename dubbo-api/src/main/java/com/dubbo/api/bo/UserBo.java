package com.dubbo.api.bo;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserBo implements Serializable {

    public UserBo(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    private String name;
    private int age;
    private String address;
}
