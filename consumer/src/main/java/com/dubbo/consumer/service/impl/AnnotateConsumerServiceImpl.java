package com.dubbo.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.service.AnnotateService;
import com.dubbo.consumer.service.AnnotateConsumerService;
import org.springframework.stereotype.Service;

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
