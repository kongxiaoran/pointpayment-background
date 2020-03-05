package com.dao.impl;

import com.dao.HotelDao;
import com.entity.Hotel;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository(value = "hotelDao")
public class HotelDaoImpl extends SqlSessionDaoSupport implements HotelDao{
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
    public long insert(Hotel entity) {
        return 0;
    }

    @Override
    public long update(Hotel entity) {
        return this.getSqlSession().update("com.dao.impl.HotelDaoImpl.update",entity);
    }

    @Override
    public Hotel getBy(Map<String, Object> map) {
        return this.getSqlSession().selectOne("com.dao.impl.HotelDaoImpl.getBy",map);
    }

    @Override
    public List<Hotel> getListBy(Map<String, Object> map) {
        return this.getSqlSession().selectOne("com.dao.impl.HotelDaoImpl.getListBy", map);
    }
}
