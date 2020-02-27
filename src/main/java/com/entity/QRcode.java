package com.entity;

/**
 * @Author: kxr
 * @Date: 2020/2/25
 * @Description
 */
public class QRcode {
    private long id;
    private Integer tablenumber;
    private Date createtime;
    private Integer status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getTablenumber() {
        return tablenumber;
    }

    public void setTablenumber(Integer tablenumber) {
        this.tablenumber = tablenumber;
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
