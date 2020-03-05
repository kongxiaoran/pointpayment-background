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
}
