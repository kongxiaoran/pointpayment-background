package com.controller;

import com.entity.Hotel;
import com.service.FileService;
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

    @Autowired
    FileService fileService;


    /**
     * 获取酒店详情
     * @param id
     * @return
     */
    @RequestMapping(value = "/info",method = RequestMethod.POST)
    public Hotel getInfo(@RequestParam("id") long id){
        return hotelService.getInfo(id);
    }

    /**
     * 更新酒店信息
     * @param hotel
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public boolean update(@RequestBody Hotel hotel){

        hotelService.update(hotel);
        return true;
    }

}
