package com.dubbo.api.service;

import com.dubbo.api.bean.UserInfoBean;

public interface AnnotateService {

    String sayHello(String name);

    UserInfoBean getUserInfo(int id);

    String saveUserInfo(UserInfoBean userInfoBean);

    String updateUserInfo(UserInfoBean userInfoBean);

    String deleteUserInfo(int id);
}
