package com.entity;

/**
 * @Author: kxr
 * @Date: 2020/2/25
 * @Description
 */
public class Type {
    private long id;
    private String typename;
    private Integer quantity;
    private Date date;
    private Integer status;
    private List<Menu> listmenu;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
