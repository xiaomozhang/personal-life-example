package com.xiaozhangge.h2;

import com.example.h2.H2DbApplication;
import com.example.h2.entity.UserEntity;
import com.example.h2.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by xiaozhangge on 2020-01-05.
 */
@Slf4j
@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest(classes = H2DbApplication.class)
public class H2DbApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() {
        // 新增数据
        UserEntity entity = userRepository.save(new UserEntity("小花脸" + UUID.randomUUID().toString(), LocalDateTime.now(), "新增测试"));
        log.info("新增结果:{}\n", entity);

        // 修改数据
        entity = userRepository.save(new UserEntity(1L, "哈哈哈哈", LocalDateTime.now(), "修改以后的结果"));
        log.info("按照id修改结果:{}\n", entity);


        // 按照id查询
        Optional<UserEntity> optional = userRepository.findById(1L);
        optional.ifPresent(x -> log.info("按照id查询结果:{}\n", x));

        // 查询所有
        log.info("查询所有");
        Iterable<UserEntity> iterable = userRepository.findAll();
        iterable.forEach(x -> log.info("item:{}", x));


        // 删除数据
        userRepository.deleteById(1L);


        // 删除id=1的数据以后
        System.out.println();
        log.info("删除id=1的数据以后");
        iterable = userRepository.findAll();
        iterable.forEach(x -> log.info("item:{}", x));
    }
}
