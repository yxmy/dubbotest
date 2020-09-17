package com.dubbo.provider.service;

import com.dubbo.provider.entity.UserInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yuanxin
 * @since 2020-09-16
 */
public interface IUserInfoService {

    UserInfo getUserInfo(int id);

    void saveUserInfo(UserInfo userInfo);

    void updateUserInfo(UserInfo userInfo);

    void deleteUserInfo(int id);

}
