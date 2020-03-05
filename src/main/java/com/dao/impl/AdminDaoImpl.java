package com.dao.impl;

import com.dao.AdminDao;
import com.entity.Admin;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Author: kxr
 * @Date: 2020/2/27
 * @Description
 */
@Repository(value = "adminDao")
public class AdminDaoImpl extends SqlSessionDaoSupport implements AdminDao {

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
    public long insert(Admin entity) {
        return 0;
    }

    @Override
    public long update(Admin entity) {
        return this.getSqlSession().update("com.dao.impl.AdminDaoImpl.update",entity);
    }

    @Override
    public Admin getBy(Admin entity) {
        return this.getSqlSession().selectOne("com.dao.impl.AdminDaoImpl.getBy",entity);
    }


}
