package com.controller;

import com.entity.Cart;
import com.entity.Order;
import com.service.CartService;
import com.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: kxr
 * @Date: 2020/3/4
 * @Description
 */

@CrossOrigin
@ResponseBody
@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    CartService cartService;

    /**
     * 查看每日账单流水（含账单详细信息）
     * @param entity
     * @return
     */
    @RequestMapping(value = "/getListBy",method = RequestMethod.POST)
    public List<Order> getListBy(@RequestBody Order entity){
        List<Order> orders = orderService.getListBy(entity);
        for(Order order:orders){
            order.setCarts(cartService.getListByOrderId(order.getId()));
        }
        return orders;
    }

    /**
     * 提交订单
     * @param entity
     * @return
     */
    @RequestMapping(value = "submitOrder",method = RequestMethod.POST)
    public boolean submitOrder(@RequestBody Order entity){

        orderService.insert(entity);
        long id = entity.getId();

        List<Cart> carts = entity.getCarts();
        for(Cart cart : carts){
            cart.setOrderid(id);
            cartService.insert(cart);
        }
        return true;
    }




}
