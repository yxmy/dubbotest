package com.dubbo.provider.mapper;

import com.dubbo.provider.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yuanxin
 * @since 2020-09-16
 */
@Mapper
@Component
public interface UserInfoMapper {

    UserInfo selectUser(int id);

    void insertUser(UserInfo userInfo);

    void updateUser(UserInfo userInfo);

    void deleteUser(int id);

}
