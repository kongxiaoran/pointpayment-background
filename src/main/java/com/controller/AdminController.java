package com.controller;

import com.entity.Admin;
import com.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: kxr
 * @Date: 2020/2/28
 * @Description
 */

@CrossOrigin
@ResponseBody
@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    /**
     * 权限控制:返回0表示登陆失败，如果登陆成功则返回响应的权限值(非0)。
     */
    @RequestMapping(value = "/verify",method = RequestMethod.POST)
    public int login(@RequestBody Admin admin){
        return adminService.verify(admin);
    }


}
