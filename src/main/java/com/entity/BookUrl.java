package com.entity;

/**
 * 书籍地址（根据此类抓取书籍）
 *
 * @author lanyubing
 * @date 2018年4月14日 12:08:41
 */
public class BookUrl {



    private String bookName;

    /**
     * 书号
     */
    private String bookNo;

    private String authorName;
    private String site;



    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookNo() {
        return bookNo;
    }

    public void setBookNo(String bookNo) {
        this.bookNo = bookNo;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }


    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

}
