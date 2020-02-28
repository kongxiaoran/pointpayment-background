package com.dao.impl;

import com.dao.QRcodeDao;
import com.entity.QRcode;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository(value = "qrCodeDao")
public class QRcodeDaoImpl extends SqlSessionDaoSupport implements QRcodeDao{
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
    public long insert(QRcode entity) {
        return 0;
    }

    @Override
    public long update(QRcode entity) {
        return this.getSqlSession().update("com.dao.impl.QRcodeDaoImpl.update",entity);
    }

    @Override
    public QRcode getBy(Map<String, Object> map) {
        return this.getSqlSession().selectOne("com.dao.impl.QRcodeDaoImpl.getBy",map);
    }

    @Override
    public List<QRcode> getListBy(Map<String, Object> map) {
        return this.getSqlSession().selectOne("com.dao.impl.QRcodeDaoImpl.getListBy", map);
    }
}
