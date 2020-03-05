package com.entity;

/**
 * @Author: kxr
 * @Date: 2020/3/3
 * @Description
 */
public class CommentPic {

    private long id;
    private long commentid;
    private String picture;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCommentid() {
        return commentid;
    }

    public void setCommentid(long commentid) {
        this.commentid = commentid;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
