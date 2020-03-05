package com.dao;

import com.entity.Hotel;

import java.util.List;
import java.util.Map;

public interface HotelDao {

    public long insert(Hotel entity);

    public long update(Hotel entity);

    public Hotel getBy(Map<String,Object> map);

    public List<Hotel> getListBy(Map<String,Object> map);
}
