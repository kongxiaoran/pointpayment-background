package com.controller;

import com.entity.Hotel;
import com.service.FileService;
import com.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

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
     * @param file
     * @param name
     * @param address
     * @param phone
     * @param info
     * @param time
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public boolean update(@RequestParam("file")MultipartFile file,
                          @RequestParam("id")long id,
                          @RequestParam("name")String name,@RequestParam("address")String address,
                          @RequestParam("phone")String phone,@RequestParam("info")String info,
                          @RequestParam("time")String time){
        MultipartFile[] files = new MultipartFile[1];
        files[0] = file;

        List<String> pic = fileService.uploadFile(files, "logo");
        Hotel hotel = new Hotel();
        hotel.setId(id);
        hotel.setAddress(address);
        hotel.setInfo(info);
        hotel.setName(name);
        hotel.setPhone(phone);
        hotel.setPic(pic.get(0));
        hotel.setTime(time);

        hotelService.update(hotel);
        return true;
    }

}
