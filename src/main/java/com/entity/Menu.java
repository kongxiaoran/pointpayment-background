package com.entity;

import java.util.Date;

/**
 * @Author: kxr
 * @Date: 2020/2/25
 * @Description
 */
public class Menu {
    private long id;
    private String dishes;
    private Double price;
    private String picture;
    private long typeid;
    private Date createtime;
    private Integer status;
    private Hotel hotelid;
    private Type type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDishes() {
        return dishes;
    }

    public void setDishes(String dishes) {
        this.dishes = dishes;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public long getTypeid() {
        return typeid;
    }

    public void setTypeid(long typeid) {
        this.typeid = typeid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Hotel getHotelid() {
        return hotelid;
    }

    public void setHotelid(Hotel hotelid) {
        this.hotelid = hotelid;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", dishes='" + dishes + '\'' +
                ", price=" + price +
                ", picture='" + picture + '\'' +
                ", typeid=" + typeid +
                ", createtime=" + createtime +
                ", status=" + status +
                ", hotelid=" + hotelid +
                ", type=" + type +
                '}';
    }
}
