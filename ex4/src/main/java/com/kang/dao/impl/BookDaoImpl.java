package com.kang.dao.impl;

import com.kang.dao.BookDao;
import com.kang.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Book book) {
        int count = jdbcTemplate.update("insert into book values (?,?,?)",book.getName(),book.getAuthor(),book.getPrice());
        return count;
    }

    @Override
    public int delete(Book book) {
        int count = jdbcTemplate.update("delete from book where name=?",book.getName());
        return count;
    }

    @Override
    public int update(Book book) {
        int count = jdbcTemplate.update("update student set name=?,author=?,price=? where name=?",
                book.getName(),book.getAuthor(),book.getPrice(),book.getName());
        return count;
    }

    @Override
    public List<Book> findAllBook() {
        List<Book> book = jdbcTemplate.query("select * from book",new BeanPropertyRowMapper<Book>(Book.class));
        return book;
    }
}
