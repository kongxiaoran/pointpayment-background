package com.dao.impl;

import com.dao.MenuDao;
import com.entity.Menu;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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
        return this.getSqlSession().insert("com.dao.impl.MenuDaoImpl.insert",entity);
    }

    @Override
    public int update(Menu entity) {
        return this.getSqlSession().update("com.dao.impl.MenuDaoImpl.update",entity);
    }

    @Override
    public Menu getBy(Menu menu) {
        return this.getSqlSession().selectOne("com.dao.impl.MenuDaoImpl.getBy",menu);
    }

    @Override
    public Menu getById(long id) {
        return this.getSqlSession().selectOne("com.dao.impl.MenuDaoImpl.getById",id);
    }

    @Override
    public List<Menu> getListByType(Menu m) {
        return this.getSqlSession().selectList("com.dao.impl.MenuDaoImpl.getListByType", m);
    }
}
