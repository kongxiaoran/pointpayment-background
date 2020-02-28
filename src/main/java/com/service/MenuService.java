package com.service;

import com.dao.MenuDao;
import com.dao.TypeDao;
import com.entity.Menu;
import com.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: kxr
 * @Date: 2020/2/28
 * @Description
 */
@Component(value = "adminService")
public class MenuService {

    @Autowired
    MenuDao menuDao;

    @Autowired
    TypeDao typeDao;

    public List<Menu> getListByType(String type){

        Map<String,Object> map = new HashMap<>();
        map.put("typename",type);
        Type tp = typeDao.getBy(map);
        map.clear();

        map.put("typeid",tp.getId());
        List<Menu> menus = menuDao.getListBy(map);
        return menus;
    }
}
