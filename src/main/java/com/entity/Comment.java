package com.entity;

import java.util.List;

/**
 * @Author: kxr
 * @Date: 2020/2/25
 * @Description
 */
public class Comment {
    private Long id;
    private String wxaccount;
    private Integer hid;
    private String dishes;
    private Float marks;
    private String comment;
    private String createtime;
    private Integer status;

    private List<String> pics;

    public List<String> getPics() {
        return pics;
    }

    public void setPics(List<String> pics) {
        this.pics = pics;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWxaccount() {
        return wxaccount;
    }

    public void setWxaccount(String wxaccount) {
        this.wxaccount = wxaccount;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getDishes() {
        return dishes;
    }

    public void setDishes(String dishes) {
        this.dishes = dishes;
    }

    public Float getMarks() {
        return marks;
    }

    public void setMarks(Float marks) {
        this.marks = marks;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
