package com.dao;


import com.entity.BookUrl;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 对书籍基本信息表进行增删改查
 * @author lanyubing
 * @date 2018年4月14日 17:36:07
 */
@Mapper
@Repository
public interface BookUrlMapper {

    /**
     * 获取所有书籍地址实体类
     *
     * @return
     */
    @Select("SELECT\n" +
            "book_name bookName ,\n" +
            "book_no bookNo , \n" +
            "author_name authorName ,\n" +
            "site\n" +
            "FROM \n" +
            "book_url\n")
    List<BookUrl> getBookUrl();

    @Select("SELECT\n" +
            "book_name bookName ,\n" +
            "book_no bookNo , \n" +
            "author_name authorName ,\n" +
            "site\n" +
            "FROM \n" +
            "book_url\n" +
            "WHERE\n" +
            "authorName =#{authorName}")
    List<BookUrl> getBookUrlByAuthorName(@Param("authorName") String authorName);

    @Select("SELECT\n" +
            "book_name bookName ,\n" +
            "book_no bookNo , \n" +
            "author_name authorName ,\n" +
            "site\n" +
            "FROM \n" +
            "book_url\n" +
            "WHERE\n" +
            "site =#{site}")
    List<BookUrl> getBookUrlBysite(@Param("site") String site);

    @Insert("INSERT INTO book_url(book_name,book_no," +
            "author_name，site) VALUES "
            +
            "(#{bookName},#{bookNo}," +
            "#{authorName}，#{site})")
    int insertBookUrl(BookUrl BookUrl);

    @Insert("<script>" +
            "INSERT INTO book_url(book_name,book_no," +
            "author_name,site) VALUES " +
            "<foreach collection='list' item='item' index='index'  separator=\",\">" +
            "(#{item.bookName},#{item.bookNo}," +
            "#{item.authorName},#{item.site})" +
            "</foreach>" +
            "</script>")
    int insertBookUrlAll(@Param("list") List<BookUrl> bookUrls);

    @Delete("SELECT\n" +
            "book_name bookName ,\n" +
            "book_no bookNo , \n" +
            "author_name authorName ,\n" +
            "site\n" +
            "FROM \n" +
            "book_url\n" +
            "WHERE\n" +
            "bookName =#{bookName}")
    int delectBookUrlBybookName(String bookName);


}
