package com.entity;

import java.util.Date;
import java.util.List;

/**
 * @Author: kxr
 * @Date: 2020/2/25
 * @Description
 */
public class Order {

    private Long id;
    private Long cartid;
    private String wxaccount;
    private Integer tablenumber;
    private Double money;
    private Date createtime;
    private Integer status;
    private List<Cart> listcart;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCartid() {
        return cartid;
    }

    public void setCartid(Long cartid) {
        this.cartid = cartid;
    }

    public String getWxaccount() {
        return wxaccount;
    }

    public void setWxaccount(String wxaccount) {
        this.wxaccount = wxaccount;
    }

    public Integer getTablenumber() {
        return tablenumber;
    }

    public void setTablenumber(Integer tablenumber) {
        this.tablenumber = tablenumber;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
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

    public List<Cart> getListcart() {
        return listcart;
    }

    public void setListcart(List<Cart> listcart) {
        this.listcart = listcart;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", cartid=" + cartid +
                ", wxaccount='" + wxaccount + '\'' +
                ", tablenumber=" + tablenumber +
                ", money=" + money +
                ", createtime=" + createtime +
                ", status=" + status +
                ", listcart=" + listcart +
                '}';
    }
}
