package com.kang.dao.impl;

import com.kang.dao.AccountsDao;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountsDaoImpl implements AccountsDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void updateAmountByAname(String aname, int amount) {
        jdbcTemplate.update("update accounts set amount=amount+? where aname=?",amount,aname);

//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        dataSource.setDriverClass(aname);
//        dataSource.setJdbcUrl(aname);
//        dataSource.setUser(aname);
//        dataSource.setPassword(aname);
//        JdbcTemplate jdbcTemplate= new JdbcTemplate();
//        jdbcTemplate.setDataSource(dataSource);
    }
}
