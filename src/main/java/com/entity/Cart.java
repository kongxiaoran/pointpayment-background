package com.entity;

import java.util.Date;

/**
 * @Author: kxr
 * @Date: 2020/2/25
 * @Description
 */
public class Cart {

    private Long id;
    private String dishes;
    private String password;
    private Integer permisssion;
    private Long orderid;
    private Date createtime;
    private Integer status;
    private Order order;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
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

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", dishes='" + dishes + '\'' +
                ", password='" + password + '\'' +
                ", permisssion=" + permisssion +
                ", orderid=" + orderid +
                ", createtime=" + createtime +
                ", status=" + status +
                ", order=" + order +
                '}';
    }
}
