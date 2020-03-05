package com.service;

import com.dao.CartDao;
import com.entity.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: kxr
 * @Date: 2020/3/4
 * @Description
 */

@Component(value = "cartService")
public class CartService {

    @Autowired
    CartDao cartDao;

    public List<Cart> getListByOrderId(long orderId){
        return cartDao.getListByOrderId(orderId);
    }

    public long insert(Cart entity) {
        return cartDao.insert(entity);
    }
}
