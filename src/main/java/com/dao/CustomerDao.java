package com.dao;

import com.entity.Customer;

import java.util.List;
import java.util.Map;

public interface CustomerDao {


    public long insert(Customer entity);

    public long update(Customer entity);

    public Customer getBy(Map<String,Object> map);

    public List<Customer> getListBy(Map<String,Object> map);

}
