package com.dubbo.provider.service.impl;

import com.dubbo.api.bo.UserBo;
import com.dubbo.api.service.AnnotateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@com.alibaba.dubbo.config.annotation.Service
public class AnnotateServiceImpl implements AnnotateService {

    @Override
    public String sayHello(String name) {
        log.info("{} 请求访问", name);
        return "hello" + name;
    }

    @Override
    public List<UserBo> getAllUserInfo() {
        List<UserBo> list = new ArrayList<>();
        list.add(new UserBo("小明",24,"北京市"));
        list.add(new UserBo("小红",24,"上海市"));
        list.add(new UserBo("小胖",24,"广州市"));
        return list;
    }

}
