package com.entity;

/**
 * 反馈实体类
 * @author lanyubing
 * @date
 */
public class Feedback {

  private long id;
  private String bookUrl;
  private String bookname;
  private java.sql.Date date;
  private String ip;
  private String text;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getBookUrl() {
    return bookUrl;
  }

  public void setBookUrl(String bookUrl) {
    this.bookUrl = bookUrl;
  }


  public String getBookname() {
    return bookname;
  }

  public void setBookname(String bookname) {
    this.bookname = bookname;
  }


  public java.sql.Date getDate() {
    return date;
  }

  public void setDate(java.sql.Date date) {
    this.date = date;
  }


  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

}
