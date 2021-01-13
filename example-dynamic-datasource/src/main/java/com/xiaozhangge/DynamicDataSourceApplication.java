package com.xiaozhangge;

import com.xiaozhangge.entity.SysUser;
import com.xiaozhangge.mapper.mysql.SysUserMapper;
import com.xiaozhangge.mapper.vertica.UserMapper;
import com.xiaozhangge.service.mysql.SysUserService;
import com.xiaozhangge.util.IdHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaozhangge on 2019-03-15.
 */
@Slf4j
@SpringBootApplication
public class DynamicDataSourceApplication implements CommandLineRunner {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private SysUserService sysUserService;


    public static void main(String[] args) {
        SpringApplication.run(DynamicDataSourceApplication.class, args);
    }

    @Override
    public void run(String... args) {


        List<SysUser> sysUsers = new ArrayList<>();
        LocalDateTime now = LocalDateTime.now();
        for (int i = 0; i < 10; i++) {
            sysUsers.add(new SysUser(IdHelper.id(), "小花脸-" + IdHelper.uuid(), now));
        }
        sysUserService.saveBatch(sysUsers);

        List<SysUser> userList = sysUserService.list();
        log.info("{}", userList.size());


//        int i = userMapper.insert(new User(IdHelper.id(), "小花脸-" + IdHelper.uuid(), "description-" + IdHelper.uuid()));
//        // 使用自定义的查询方法
//        List<User> list = userMapper.list();
//        log.info("insert result:{} list.size:{}", i, list.size());
//
//
//        boolean b = sysUserMapper.save(new SysUser(IdHelper.id(), "小花脸-" + IdHelper.uuid(), LocalDateTime.now()));
//        // 使用MyBatis-Plus提供的查询方法
//        List<SysUser> users = sysUserMapper.selectList(null);
//        log.info("insert result:{} list.size:{}", b, users.size());
//        users.forEach(x -> log.info(x.toString()));
    }
}
