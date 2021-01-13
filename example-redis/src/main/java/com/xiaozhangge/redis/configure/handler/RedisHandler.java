package com.xiaozhangge.redis.configure.handler;

import com.xiaozhangge.redis.configure.util.RedisOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by xiaozhangge on 2020-01-10.
 */
@Component
public class RedisHandler {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisTemplate redisTemplateDB_2;

    private RedisOperations redisOperations, redisDB2Operations;

    public RedisOperations redisOperations() {
        if (redisOperations == null) {
            redisOperations = new RedisOperations(redisTemplate);
        }
        return redisOperations;
    }

    public RedisOperations redisDB2Operations() {
        if (redisDB2Operations == null) {
            redisDB2Operations = new RedisOperations(redisTemplateDB_2);
        }
        return redisDB2Operations;
    }
}
