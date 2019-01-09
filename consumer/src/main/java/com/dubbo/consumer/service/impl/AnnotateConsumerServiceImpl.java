package com.dubbo.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.consumer.service.AnnotateConsumerService;
import com.dubbo.consumer.service.AnnotateService;

@Service
public class AnnotateConsumerServiceImpl implements AnnotateConsumerService {

    @Reference
    private AnnotateService annotateService;

    @Override
    public String callProvider() {
        String hello = annotateService.sayHello("consumer");
        return hello;
    }
}
