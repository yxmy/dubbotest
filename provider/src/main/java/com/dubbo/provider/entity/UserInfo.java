package com.dubbo.provider.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yuanxin
 * @since 2020-09-16
 */
@Data
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private String name;

    private Integer age;

    private String address;


}
