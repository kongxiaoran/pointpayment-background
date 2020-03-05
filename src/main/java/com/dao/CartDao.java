package com.dao;

import com.entity.Cart;

import java.util.List;

public interface CartDao {

    public long insert(Cart entity);

    public long update(Cart entity);

    public Cart getBy(Cart cart);

    public List<Cart> getListBy(Cart cart);

    public List<Cart> getListByOrderId(long orderid);

}
