package com.entity;

/**
 * @Author: kxr
 * @Date: 2020/2/25
 * @Description
 */
public class Customer {
    private long id;
    private String wxaccount;
    private Date createtime;
    private Integer status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWxaccount() {
        return wxaccount;
    }

    public void setWxaccount(String wxaccount) {
        this.wxaccount = wxaccount;
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
