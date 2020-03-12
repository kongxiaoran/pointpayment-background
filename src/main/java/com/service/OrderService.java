package com.service;

import com.dao.OrderDao;
import com.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: kxr
 * @Date: 2020/3/4
 * @Description
 */
@Component(value = "orderService")
public class OrderService {

    @Autowired
    OrderDao orderDao;

    public List<Order> getListBy(Order order){
        return orderDao.getListBy(order);
    }

    public long insert(Order order){
        return orderDao.insert(order);
    }

    public long update(Order order){
        return orderDao.update(order);
    }


}
