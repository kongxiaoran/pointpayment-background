package com.dao;

import com.entity.Admin;

/**
 * @Author: kxr
 * @Date: 2020/2/27
 * @Description
 */
public interface AdminDao {

    public long insert(Admin entity);

    public long update(Admin entity);

    public Admin getBy(Admin entity);


}
