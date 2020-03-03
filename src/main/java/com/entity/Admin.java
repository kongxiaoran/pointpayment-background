package com.entity;


/**
 * @Author: kxr
 * @Date: 2020/2/25
 * @Description
 */
public class Admin {

    private Long id;
    private String account;
    private String password;
    private Integer permisssion;
    private String createtime;
    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}
