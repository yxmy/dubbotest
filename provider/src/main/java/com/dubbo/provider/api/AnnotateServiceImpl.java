package com.dubbo.provider.api;

import com.dubbo.api.bean.UserInfoBean;
import com.dubbo.provider.entity.UserInfo;
import com.dubbo.api.service.AnnotateService;
import com.dubbo.provider.service.IUserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 微服务对外接口
 */
@Slf4j
@Service
@com.alibaba.dubbo.config.annotation.Service
public class AnnotateServiceImpl implements AnnotateService {

    private IUserInfoService userInfoService;
    @Autowired
    public AnnotateServiceImpl(IUserInfoService userInfoService){
        this.userInfoService = userInfoService;
    }

    @Override
    public String sayHello(String name) {
        log.info("{} 请求访问", name);
        return "hello" + name;
    }

    @Override
    public UserInfoBean getUserInfo(int id) {
        UserInfo userInfo = userInfoService.getUserInfo(id);
        UserInfoBean userInfoBean = new UserInfoBean();
        BeanUtils.copyProperties(userInfo, userInfoBean);
        return userInfoBean;
    }

    @Override
    public String saveUserInfo(UserInfoBean userInfoBean) {
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(userInfoBean, userInfo);
        this.userInfoService.saveUserInfo(userInfo);
        return "success";
    }

    @Override
    public String updateUserInfo(UserInfoBean userInfoBean) {
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(userInfoBean, userInfo);
        this.userInfoService.updateUserInfo(userInfo);
        return "success";
    }

    @Override
    public String deleteUserInfo(int id) {
        this.userInfoService.deleteUserInfo(id);
        return "success";
    }

}
