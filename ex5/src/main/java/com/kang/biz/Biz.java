package com.kang.biz;

import org.springframework.stereotype.Repository;

public interface Biz {
    public void transfer(String from,String to,int money);
}
