package com.dao.impl;

import com.dao.OrderDao;
import com.entity.Order;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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
        return this.getSqlSession().update("com.dao.impl.OrderDaoImpl.insert",entity);
    }

    @Override
    public long update(Order entity) {
        return this.getSqlSession().update("com.dao.impl.OrderDaoImpl.update",entity);
    }

    @Override
    public Order getBy(Order entity) {
        return this.getSqlSession().selectOne("com.dao.impl.OrderDaoImpl.getBy",entity);
    }

    @Override
    public List<Order> getListBy(Order entity) {
        return this.getSqlSession().selectList("com.dao.impl.OrderDaoImpl.getListBy", entity);
    }
}
