package com.kang.dao.impl;

import com.kang.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl implements Dao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void updateAmountByAname(String aname, int amount) {
        jdbcTemplate.update("update accounts set amount=amount+? where aname=?",amount,aname);
    }
}
