package com.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @Author: kxr
 * @Date: 2020/3/2
 * @Description
 */
@CrossOrigin
@ResponseBody
@RestController
@RequestMapping("/api/test")
public class TestController {

    @RequestMapping(value = "/resp",method = RequestMethod.POST)
    public String resp(@RequestBody String code){
        System.out.println(code);
        if(code.equals("1")){
            return "测试成功";
        }
        return "测试失败";
    }
}
