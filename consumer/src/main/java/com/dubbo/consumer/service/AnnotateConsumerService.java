package com.dubbo.consumer.service;

import com.dubbo.api.bean.UserInfoBean;

public interface AnnotateConsumerService {

    String callProvider();

    String getUser(int id);

    String createUserInfo(UserInfoBean userInfoBean);

    String updateUserInfo(UserInfoBean userInfoBean);

    String deleteUserInfo(int id);

}
