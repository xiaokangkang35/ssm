package com.kang.biz.impl;

import com.kang.biz.Biz;
import com.kang.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BizImpl implements Biz {
    @Autowired
    private Dao dao;

    @Override
    public void transfer(String from, String to, int money) {
        dao.updateAmountByAname(from, (-1) * money);
//        System.out.println(3/0);
        dao.updateAmountByAname(to,money);
    }
}
