package com.dao;

import com.entity.Cart;

import java.util.List;
import java.util.Map;

public interface CartDao {

    public long insert(Cart entity);

    public long update(Cart entity);

    public Cart getBy(Map<String,Object> map);

    public List<Cart> getListBy(Map<String,Object> map);

}
