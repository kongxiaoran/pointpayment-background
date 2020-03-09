package com.service;

import com.dao.HotelDao;
import com.entity.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: kxr
 * @Date: 2020/2/28
 * @Description
 */

@Component(value = "hotelService")
public class HotelService {

    @Autowired
    HotelDao hotelDao;

    public Hotel getInfo(long id){
        Map<String,Object> map = new HashMap<>();
        map.put("id",id);
        Hotel by = hotelDao.getBy(map);
        return by;
    }

    public long update(Hotel hotel) {
        return hotelDao.update(hotel);
    }
}
