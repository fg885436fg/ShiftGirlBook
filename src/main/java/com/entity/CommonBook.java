package com.entity;

/**
 * 通用书籍实体类，用于容纳不同网站的书籍信息
 *
 * @author lanyubing
 * @date 2018年4月14日 12:41:30
 */
public class CommonBook {

    private long id;
    private long bookId;
    private String site;
    private String tag;
    private String party;
    private long words;
    private String url;
    private java.sql.Date updateDate;
    private String introduction;
    private String status;
    private long siteClickNum;
    /**
     * 图片地址
     */
    private String picurl;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }


    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }


    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }


    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }


    public long getWords() {
        return words;
    }

    public void setWords(long words) {
        this.words = words;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public java.sql.Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(java.sql.Date updateDate) {
        this.updateDate = updateDate;
    }


    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getSiteClickNum() {
        return siteClickNum;
    }

    public void setSiteClickNum(long siteClickNum) {
        this.siteClickNum = siteClickNum;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }
}
