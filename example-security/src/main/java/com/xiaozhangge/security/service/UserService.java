package com.xiaozhangge.security.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaozhangge.security.common.ResponseWrapper;
import com.xiaozhangge.security.entity.User;
import com.xiaozhangge.security.model.SecurityUser;
import org.springframework.stereotype.Service;

/**
 * Created by xiaozhangge on 2019-03-25.
 */
@Service
public interface UserService extends IService<User> {

    /**
     * 通过用户名查找用户
     *
     * @param username 用户名
     * @return 用户信息
     */
    User findByUserName(String username);

    /**
     * 登录
     *
     * @param username
     * @param password
     * @return
     */
    ResponseWrapper login(String username, String password);


    /**
     * 注册
     *
     * @param user
     * @return
     */
    ResponseWrapper register(User user);


    /**
     * 根据Token获取用户信息
     *
     * @param token
     * @return
     */
    SecurityUser getUserByToken(String token);
}
