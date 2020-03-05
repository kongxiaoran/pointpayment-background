package com.dao;

import com.entity.Order;

import java.util.List;

public interface OrderDao {

    public long insert(Order entity);

    public long update(Order entity);

    public Order getBy(Order entity);

    public List<Order> getListBy(Order entity);
}
