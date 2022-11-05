package com.kang.biz.impl;

import com.kang.biz.AccountsBiz;
import com.kang.dao.AccountsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.beans.Transient;

@Repository
@Service
//@ContextConfiguration("classpath:applicationContext.xml")
public class AccountsBizImpl implements AccountsBiz {
    @Autowired
    private AccountsDao accountsDao;

//    @Autowired
//    private PlatformTransactionManager transactionManager;
    @Transactional
    public void transfer(String from, String to, int money) {
//        TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
//        TransactionStatus status = transactionManager.getTransaction(transactionDefinition);
//        try {
            accountsDao.updateAmountByAname(from, (-1) * money);
//            System.out.println(3 / 0);
            accountsDao.updateAmountByAname(to, money);
//            transactionManager.commit(status);
//        }catch (Exception e){
//            transactionManager.rollback(status);
//        }
    }
}
