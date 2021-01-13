package com.xiaozhangge.aop.api;

import com.xiaozhangge.aop.service.DogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by xiaozhangge on 2020/2/16.
 */
@RestController
@RequestMapping("/api/aspect")
public class AspectApi {

    @Resource
    private DogService dogService;

    @GetMapping("/sayHi")
    public String sayHi(String name) {
        return dogService.sayHi(name);
    }

    @GetMapping("/e")
    public void e() {
        dogService.throwsException();
    }
}
