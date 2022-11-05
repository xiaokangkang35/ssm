package com.kang.dao;

import com.kang.pojo.Book;

import java.util.List;


public interface BookDao {
    int insert(Book book);
    int delete(Book book);
    int update(Book book);
    List<Book> findAllBook();
}
