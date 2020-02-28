package com.dao.impl;

import com.dao.TokenDao;
import com.entity.Token;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository(value = "tokenDao")
public class TokenDaoImpl extends SqlSessionDaoSupport implements TokenDao{
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
    public long insert(Token entity) {
        return 0;
    }

    @Override
    public long update(Token entity) {
        return this.getSqlSession().update("com.dao.impl.TokenDaoImpl.update",entity);
    }

    @Override
    public Token getBy(Map<String, Object> map) {
        return this.getSqlSession().selectOne("com.dao.impl.TokenDaoImpl.getBy",map);
    }

    @Override
    public List<Token> getListBy(Map<String, Object> map) {
        return this.getSqlSession().selectOne("com.dao.impl.TokenDaoImpl.getListBy", map);
    }
}
