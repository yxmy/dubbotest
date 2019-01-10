package com.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.service.AnnotateService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@org.springframework.stereotype.Service
@Service(timeout = 5000)
public class AnnotateServiceImpl implements AnnotateService {

    @Override
    public String sayHello(String name) {
        log.info("{} 请求访问", name);
        return "hello" + name;
    }

}
