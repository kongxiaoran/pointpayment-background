package com.controller;

import com.entity.Menu;
import com.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: kxr
 * @Date: 2020/2/28
 * @Description
 */

@CrossOrigin
@ResponseBody
@RestController
@RequestMapping("/api/menu")
public class MenuController {

    @Autowired
    MenuService menuService;

    /**
     * 通过菜类别名展示菜品列表
     * @param type
     * @return
     */
    @RequestMapping(value = "/listByType",method = RequestMethod.POST)
    public List<Menu> listByType(@RequestBody  String type){

        return menuService.getListBy(type);
    }

    /**
     * 通过菜品编号查询菜品详情
     * @param id
     * @return
     */
    @RequestMapping(value = "/getById",method = RequestMethod.POST)
    public Menu getById(@RequestBody long id){
        return menuService.getById(id);
    }

    /**
     * 菜品编辑
     * @param menu
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public int update(@RequestBody Menu menu){
        return menuService.update(menu);
    }

    /**
     * 新添菜品
     * @param menu
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public long insert(@RequestBody Menu menu){
        return menuService.insert(menu);
    }

    /**
     * 删除菜品
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public boolean delete(@RequestBody long id){
        return menuService.delete(id);
    }
}
