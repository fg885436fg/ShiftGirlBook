package com.dao;

import com.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookMapper {

    @Select("SELECT *\n"+
    "FROM\n"+
    "book")
    List<Book> getBook();
}
