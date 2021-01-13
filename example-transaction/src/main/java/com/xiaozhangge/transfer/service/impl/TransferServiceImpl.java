package com.xiaozhangge.transfer.service.impl;

import com.xiaozhangge.transfer.jpa.TransferRepository;
import com.xiaozhangge.transfer.mapper.TransferMapper;
import com.xiaozhangge.transfer.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Created by xiaozhangge on 2020/2/16.
 */
@Service
public class TransferServiceImpl implements TransferService {

    @Autowired
    private TransferRepository transferRepository;

    @Autowired
    private TransferMapper transferMapper;

    @Autowired
    private TransactionTemplate transactionTemplate;

    @Override
    @Transactional
    public void transfer(String in, String out, float money) {
        // 这里使用的是MyBatis-Plus操作数据库
        transferMapper.outMoney(out, money);
        transferMapper.inMoney(in, money);
    }
}
