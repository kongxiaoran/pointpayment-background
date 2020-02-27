package com.entity;


import java.util.Date;

/**
 * @Author: kxr
 * @Date: 2020/2/25
 * @Description
 */
public class Admin {

    private long id;
    private String account;
    private String password;
    private Integer permisssion;
    private Date createtime;
    private Integer status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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
