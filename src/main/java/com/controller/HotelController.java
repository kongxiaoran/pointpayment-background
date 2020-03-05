package com.controller;

import com.entity.Hotel;
import com.service.HotelService;
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
@RequestMapping("/api/hotel")
public class HotelController {

    @Autowired
    HotelService hotelService;

    @RequestMapping(value = "/info",method = RequestMethod.POST)
    public Hotel getInfo(@RequestBody long id){
        return hotelService.getInfo(id);
    }

}
