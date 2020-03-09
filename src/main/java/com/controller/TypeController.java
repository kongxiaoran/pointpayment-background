package com.controller;

import com.entity.Type;
import com.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: kxr
 * @Date: 2020/3/2
 * @Description
 */

@CrossOrigin
@ResponseBody
@RestController
@RequestMapping("/api/type")
public class TypeController {

    @Autowired
    TypeService typeService;

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public List<Type> list(){
        return typeService.list();
    }

    @RequestMapping(value = "/getByName",method = RequestMethod.POST)
    public Type getBy(@RequestBody String type){
        return typeService.getByName(type);
    }

    /**
     * 菜品类别编辑
     * @param type
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public long update(@RequestBody Type type){
        return typeService.update(type);
    }

    /**
     * 新添菜品类别
     * @param type
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public long insert(@RequestBody Type type){
        typeService.insert(type);
        return type.getId();
    }

    /**
     * 删除菜品类别
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public boolean delete(@RequestParam("id") long id){
        return typeService.delete(id);
    }
}
