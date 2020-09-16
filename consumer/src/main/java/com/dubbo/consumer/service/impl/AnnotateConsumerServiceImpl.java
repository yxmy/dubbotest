package com.dubbo.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.bo.UserBo;
import com.dubbo.api.service.AnnotateService;
import com.dubbo.consumer.service.AnnotateConsumerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnotateConsumerServiceImpl implements AnnotateConsumerService {

    @Reference
    private AnnotateService annotateService;

    @Override
    public String callProvider() {
        String hello = annotateService.sayHello("consumer");
        return hello;
    }

    @Override
    public String getAllUser() {
        List<UserBo> allUserInfo = this.annotateService.getAllUserInfo();
        return allUserInfo.toString();
    }
}
