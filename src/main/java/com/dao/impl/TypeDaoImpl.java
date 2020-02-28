package com.dao.impl;

import com.dao.TypeDao;
import com.entity.Type;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository(value = "typeDao")
public class TypeDaoImpl extends SqlSessionDaoSupport implements TypeDao{
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
    public long insert(Type entity) {
        return 0;
    }

    @Override
    public long update(Type entity) {
        return this.getSqlSession().update("com.dao.impl.TypeDaoImpl.update",entity);
    }

    @Override
    public Type getBy(Map<String, Object> map) {
        return this.getSqlSession().selectOne("com.dao.impl.TypeDaoImpl.getBy",map);
    }

    @Override
    public List<Type> getListBy(Map<String, Object> map) {
        return this.getSqlSession().selectOne("com.dao.impl.TypeDaoImpl.getListBy", map);
    }
}
