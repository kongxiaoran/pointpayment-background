package com.service;

import com.dao.AdminDao;
import com.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: kxr
 * @Date: 2020/2/27
 * @Description
 */
@Component(value = "adminService")
public class AdminService {

    @Autowired
    AdminDao adminDao;

    public void update(Admin shared){
        adminDao.update(shared);
    }
}
