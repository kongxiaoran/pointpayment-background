package com.entity;

/**
 * @Author: kxr
 * @Date: 2020/2/25
 * @Description
 */
public class Hotel {
    private long id;
    private String name;
    private String address;
    private Date createtime;
    private Integer status;
    private List<Comment> listcoment;
    private List<Menu> listmenu;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public List<Comment> getListcoment() {
        return listcoment;
    }

    public void setListcoment(List<Comment> listcoment) {
        this.listcoment = listcoment;
    }

    public List<Menu> getListmenu() {
        return listmenu;
    }

    public void setListmenu(List<Menu> listmenu) {
        this.listmenu = listmenu;
    }
}
