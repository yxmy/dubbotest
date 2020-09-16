package com.dubbo.api.service;

import com.dubbo.api.bo.UserBo;

import java.util.List;

public interface AnnotateService {

    String sayHello(String name);

    List<UserBo> getAllUserInfo();
}
