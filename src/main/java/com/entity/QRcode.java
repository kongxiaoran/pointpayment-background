package com.entity;

import java.util.Date;

/**
 * @Author: kxr
 * @Date: 2020/2/25
 * @Description
 */
public class QRcode {
    private Long id;
    private Integer tablenumber;
    private Date createtime;
    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    @Override
    public String toString() {
        return "QRcode{" +
                "id=" + id +
                ", tablenumber=" + tablenumber +
                ", createtime=" + createtime +
                ", status=" + status +
                '}';
    }
}
