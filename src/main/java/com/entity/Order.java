package com.entity;

/**
 * @Author: kxr
 * @Date: 2020/2/25
 * @Description
 */
public class Order {
    private long id;
    private long cartid;
    private String wxaccount;
    private Integer tablenumber;
    private Double money;
    private Date createtime;
    private Integer status;
    private List<Cart> listcart;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCartid() {
        return cartid;
    }

    public void setCartid(long cartid) {
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
}
