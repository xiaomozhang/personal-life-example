package com.xiaozhangge.transfer.service;

/**
 * Created by xiaozhangge on 2020/2/16.
 * <p>
 * 转账业务接口
 */
public interface TransferService {

    void transfer(String in, String out, float money);
}
