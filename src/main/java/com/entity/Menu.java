package com.entity;

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
    private Type typeid;

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

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
