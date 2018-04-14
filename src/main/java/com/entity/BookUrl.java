package com.entity;

/**
 * 书籍地址（根据此类抓取书籍）
 * @author lanyubing
 * @date 2018年4月14日 12:08:41
 */
public class BookUrl {

  private long id;
  private String bookName;
  private String bookUrl;
  private String authorName;
  private String site;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }


  public String getBookUrl() {
    return bookUrl;
  }

  public void setBookUrl(String bookUrl) {
    this.bookUrl = bookUrl;
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
