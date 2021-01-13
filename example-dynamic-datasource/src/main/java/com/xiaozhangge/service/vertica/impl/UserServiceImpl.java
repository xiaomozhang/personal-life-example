package com.xiaozhangge.service.vertica.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaozhangge.entity.User;
import com.xiaozhangge.mapper.vertica.UserMapper;
import com.xiaozhangge.service.vertica.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by xiaozhangge on 2019-03-15.
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
