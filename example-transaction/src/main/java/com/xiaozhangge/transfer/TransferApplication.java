package com.xiaozhangge.transfer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by xiaozhangge on 2020/2/16.
 */
@SpringBootApplication
@MapperScan("com.xiaozhangge.transfer.mapper")
public class TransferApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransferApplication.class, args);
    }
}
