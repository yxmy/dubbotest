package com.dubbo.provider.service.impl;

import com.dubbo.provider.entity.UserInfo;
import com.dubbo.provider.mapper.UserInfoMapper;
import com.dubbo.provider.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yuanxin
 * @since 2020-09-16
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService {

    private final UserInfoMapper userInfoMapper;
    @Autowired
    public UserInfoServiceImpl (UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }

    @Override
    public UserInfo getUserInfo(int id) {
        return userInfoMapper.selectUser(id);
    }

    @Override
    public void saveUserInfo(UserInfo userInfo) {
        this.userInfoMapper.insertUser(userInfo);
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        this.userInfoMapper.updateUser(userInfo);
    }

    @Override
    public void deleteUserInfo(int id) {
        this.userInfoMapper.deleteUser(id);
    }
}
