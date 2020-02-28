package com.dao.impl;

import com.dao.OrderDao;
import com.entity.Order;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository(value = "orderDao")
public class OrderDaoImpl extends SqlSessionDaoSupport implements OrderDao{
    @Autowired
    protected SqlSessionFactory sqlSessionFactory;

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public SqlSession getSqlSession() {
        return super.getSqlSession();
    }

    @Override
    public long insert(Order entity) {
        return 0;
    }

    @Override
    public long update(Order entity) {
        return this.getSqlSession().update("com.dao.impl.OrderDaoImpl.update",entity);
    }

    @Override
    public Order getBy(Map<String, Object> map) {
        return this.getSqlSession().selectOne("com.dao.impl.OrderDaoImpl.getBy",map);
    }

    @Override
    public List<Order> getListBy(Map<String, Object> map) {
        return this.getSqlSession().selectOne("com.dao.impl.OrderDaoImpl.getListBy", map);
    }
}
