package com.appheader.db;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "GREEN_ARTICLE".
 */
public class GreenArticle {

    private Long id;
    /** Not-null value. */
    private String title;
    private String href;
    private String date;
    private String content;
    private String color;
    private Integer position;

    public GreenArticle() {
    }

    public GreenArticle(Long id) {
        this.id = id;
    }

    public GreenArticle(Long id, String title, String href, String date, String content, String color, Integer position) {
        this.id = id;
        this.title = title;
        this.href = href;
        this.date = date;
        this.content = content;
        this.color = color;
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getTitle() {
        return title;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setTitle(String title) {
        this.title = title;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

}