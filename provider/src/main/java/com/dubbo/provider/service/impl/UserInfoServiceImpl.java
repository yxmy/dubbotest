package com.dubbo.provider.service.impl;

import com.dubbo.provider.entity.UserInfo;
import com.dubbo.provider.mapper.UserInfoMapper;
import com.dubbo.provider.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
