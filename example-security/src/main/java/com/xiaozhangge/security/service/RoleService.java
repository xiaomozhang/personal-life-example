package com.xiaozhangge.security.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaozhangge.security.entity.Role;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiaozhangge on 2019-03-25.
 */
@Service
public interface RoleService extends IService<Role> {

    List<Role> findRoleByUserId(Long userId);
}
