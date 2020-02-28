package com.dao.impl;

import com.dao.OrderDao;
import com.entity.Order;

import java.util.List;
import java.util.Map;

public class OrderDaoImpl implements OrderDao{
    @Override
    public long insert(Order entity) {
        return 0;
    }

    @Override
    public long update(Order entity) {
        return 0;
    }

    @Override
    public Order getBy(Map<String, Object> map) {
        return null;
    }

    @Override
    public List<Order> getListBy(Map<String, Object> map) {
        return null;
    }
}
