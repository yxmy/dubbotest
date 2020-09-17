package com.dubbo.api.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author seeyon_yuanxin
 */
@Data
public class UserInfoBean implements Serializable {

    private int id;
    private String name;
    private int age;
    private String address;
}
