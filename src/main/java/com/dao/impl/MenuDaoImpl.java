package com.dao.impl;

import com.dao.MenuDao;
import com.entity.Menu;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository(value = "menuDao")
public class MenuDaoImpl extends SqlSessionDaoSupport implements MenuDao{
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
    public long insert(Menu entity) {
        return 0;
    }

    @Override
    public long update(Menu entity) {
        return this.getSqlSession().update("com.dao.impl.MenuDaoImpl.update",entity);
    }

    @Override
    public Menu getBy(Map<String, Object> map) {
        return this.getSqlSession().selectOne("com.dao.impl.MenuDaoImpl.getBy",map);
    }

    @Override
    public List<Menu> getListBy(Map<String, Object> map) {
        return this.getSqlSession().selectOne("com.dao.impl.MenuDaoImpl.getListBy", map);
    }
}
