package com.dao;

import com.entity.Order;

import java.util.List;
import java.util.Map;

public interface OrderDao {

    public long insert(Order entity);

    public long update(Order entity);

    public Order getBy(Map<String,Object> map);

    public List<Order> getListBy(Map<String,Object> map);
}
