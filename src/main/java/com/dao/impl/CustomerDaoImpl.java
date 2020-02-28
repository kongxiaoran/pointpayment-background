package com.dao.impl;

import com.dao.CustomerDao;
import com.entity.Customer;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository(value = "customerDao")
public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao{
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
    public long insert(Customer entity) {
        return 0;
    }

    @Override
    public long update(Customer entity) {
        return this.getSqlSession().update("com.dao.impl.CustomerDaoImpl.update",entity);
    }

    @Override
    public Customer getBy(Map<String, Object> map) {
        return this.getSqlSession().selectOne("com.dao.impl.CustomerDaoImpl.getBy",map);
    }

    @Override
    public List<Customer> getListBy(Map<String, Object> map) {
        return this.getSqlSession().selectOne("com.dao.impl.CustomerDaoImpl.getListBy", map);
    }
}
