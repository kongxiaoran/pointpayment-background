package com.dao.impl;

import com.dao.TypeDao;
import com.entity.Type;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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
        return this.getSqlSession().insert("com.dao.impl.TypeDaoImpl.insert",entity);
    }

    @Override
    public long update(Type entity) {
        return this.getSqlSession().update("com.dao.impl.TypeDaoImpl.update",entity);
    }

    @Override
    public Type getBy(Type type) {
        return this.getSqlSession().selectOne("com.dao.impl.TypeDaoImpl.getBy",type);
    }

    @Override
    public List<Type> getList() {
        return this.getSqlSession().selectList("com.dao.impl.TypeDaoImpl.getList");
    }
}
