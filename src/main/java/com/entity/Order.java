package com.entity;

import java.util.List;

/**
 * @Author: kxr
 * @Date: 2020/2/25
 * @Description
 */
public class Order {

    private Long id;
    private String wxaccount;
    private String openId;
    private Integer tablenumber;
    private Double money;
    private String createtime;
    private Integer status;

    private List<Cart> carts;

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

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
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

    public List<Cart> getCarts() {
        return carts;
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }
}
