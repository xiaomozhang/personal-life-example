package com.xiaozhangge.service.mysql.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaozhangge.entity.SysUser;
import com.xiaozhangge.mapper.mysql.SysUserMapper;
import com.xiaozhangge.service.mysql.SysUserService;
import org.springframework.stereotype.Service;

/**
 * Created by xiaozhangge on 2019-03-19.
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
}
