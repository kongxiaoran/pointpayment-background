package com.dao.impl;

import com.dao.CartDao;
import com.entity.Cart;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 */

@Repository(value = "cartDao")
public class CartDaoImpl extends SqlSessionDaoSupport implements CartDao {
    
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
    public long insert(Cart entity) {
        return 0;
    }

    @Override
    public long update(Cart entity) {
        return this.getSqlSession().update("com.dao.impl.CartDaoImpl.update",entity);
    }

    @Override
    public Cart getBy(Cart entity) {
        return this.getSqlSession().selectOne("com.dao.impl.CartDaoImpl.getBy",entity);
    }

    @Override
    public List<Cart> getListBy(Cart entity) {
        return this.getSqlSession().selectList("com.dao.impl.CartDaoImpl.getListBy",entity);
    }

    @Override
    public List<Cart> getListByOrderId(long orderid) {
        return this.getSqlSession().selectList("com.dao.impl.CartDaoImpl.getListByOrderId",orderid);
    }
}
