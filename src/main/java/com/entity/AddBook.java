package com.entity;

/**
 * 用户添加的书籍信息
 * @author 蓝宇冰
 * @date 2018年4月14日
 */
public class AddBook {

  private long id;
  private String url;
  private String bookName;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

}
