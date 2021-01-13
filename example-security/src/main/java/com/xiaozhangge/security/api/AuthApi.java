package com.xiaozhangge.security.api;

import com.xiaozhangge.security.common.ResponseWrapper;
import com.xiaozhangge.security.entity.User;
import com.xiaozhangge.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiaozhangge on 2019-03-25.
 */
@RestController
public class AuthApi {

    @Autowired
    private UserService userService;

    @Value("${jwt.header}")
    private String tokenHeader;

    @PostMapping("/login")
    public ResponseWrapper login(@RequestBody User user) {
        return userService.login(user.getUsername(), user.getPassword());
    }

    @PostMapping("/register")
    public ResponseWrapper register(@RequestBody User user) {
        return userService.register(user);
    }
}
