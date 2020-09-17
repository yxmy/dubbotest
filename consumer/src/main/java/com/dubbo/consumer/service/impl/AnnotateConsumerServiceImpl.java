package com.dubbo.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.bean.UserInfoBean;
import com.dubbo.api.service.AnnotateService;
import com.dubbo.consumer.service.AnnotateConsumerService;
import org.springframework.stereotype.Service;

/**
 * @author seeyon_yuanxin
 */
@Service
public class AnnotateConsumerServiceImpl implements AnnotateConsumerService {

    @Reference
    private AnnotateService annotateService;

    @Override
    public String callProvider() {
        return annotateService.sayHello("consumer");
    }

    @Override
    public String getUser(int id) {
        UserInfoBean userInfo = this.annotateService.getUserInfo(id);
        return userInfo.toString();
    }

    @Override
    public String createUserInfo(UserInfoBean userInfoBean) {
        return this.annotateService.saveUserInfo(userInfoBean);
    }

    @Override
    public String updateUserInfo(UserInfoBean userInfoBean) {
        return this.annotateService.updateUserInfo(userInfoBean);
    }

    @Override
    public String deleteUserInfo(int id) {
        return this.annotateService.deleteUserInfo(id);
    }
}
