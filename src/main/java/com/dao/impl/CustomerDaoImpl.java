package com.dao.impl;

import com.dao.CustomerDao;
import com.entity.Customer;

import java.util.List;
import java.util.Map;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public long insert(Customer entity) {
        return 0;
    }

    @Override
    public long update(Customer entity) {
        return 0;
    }

    @Override
    public Customer getBy(Map<String, Object> map) {
        return null;
    }

    @Override
    public List<Customer> getListBy(Map<String, Object> map) {
        return null;
    }
}
