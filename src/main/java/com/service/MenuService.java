package com.service;

import com.dao.MenuDao;
import com.dao.TypeDao;
import com.entity.Menu;
import com.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: kxr
 * @Date: 2020/2/28
 * @Description
 */
@Component(value = "menuService")
public class MenuService {

    @Autowired
    MenuDao menuDao;

    @Autowired
    TypeDao typeDao;

    public List<Menu> getListByTypeName(String typeName){

        Type type = new Type();
        type.setTypename(typeName);
        Type tp = typeDao.getBy(type);

        Menu menu = new Menu();
        menu.setTypeid(tp.getId());
        List<Menu> menus = menuDao.getListBy(menu);
        return menus;
    }

    public Menu getById(long id) {
        return menuDao.getById(id);
    }

    public int update(Menu menu) {
        return menuDao.update(menu);
    }

    public long insert(Menu menu) {
        return menuDao.insert(menu);
    }

    public boolean delete(long id) {
        Menu menu = new Menu();
        menu.setId(id);
        menu.setStatus(9);
        menuDao.update(menu);
        return true;
    }

    public List<Menu> getListByName(String name) {
        Menu menu = new Menu();
        menu.setDishes(name);
        List<Menu> menus = menuDao.getListBy(menu);
        return menus;
    }
}
