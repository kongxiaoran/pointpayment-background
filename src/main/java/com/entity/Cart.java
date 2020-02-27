package com.entity;

import java.util.Date;

/**
 * @Author: kxr
 * @Date: 2020/2/25
 * @Description
 */
public class Cart {

    private long id;
    private String dishes;
    private String password;
    private Integer permisssion;
    private long orderid;
    private Date createtime;
    private Integer status;
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPermisssion() {
        return permisssion;
    }

    public void setPermisssion(Integer permisssion) {
        this.permisssion = permisssion;
    }

    public long getOrderid() {
        return orderid;
    }

    public void setOrderid(long orderid) {
        this.orderid = orderid;
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
}
