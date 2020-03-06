package com.dao.impl;

import com.dao.CommentDao;
import com.entity.Comment;
import com.entity.CommentPic;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository(value = "commentDao")
public class CommentDaoImpl extends SqlSessionDaoSupport implements CommentDao {
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
    public long insert(Comment entity) {
        return this.getSqlSession().insert("com.dao.impl.CommentDaoImpl.insert",entity);
    }

    @Override
    public long update(Comment entity) {
        return this.getSqlSession().update("com.dao.impl.CommentDaoImpl.update", entity);
    }

    @Override
    public Comment getBy(Map<String, Object> map) {
        return this.getSqlSession().selectOne("com.dao.impl.CommentDaoImpl.getBy", map);
    }

    @Override
    public List<Comment> getListBy(Map<String, Object> map) {
        return this.getSqlSession().selectList("com.dao.impl.CommentDaoImpl.getListBy", map);
    }

    @Override
    public List<Comment> list() {
        return this.getSqlSession().selectList("com.dao.impl.CommentDaoImpl.list");
    }

    @Override
    public List<String> getCommentPic(long commentId) {
        return this.getSqlSession().selectList("com.dao.impl.CommentDaoImpl.getCommentPic",commentId);
    }

    @Override
    public long insertPic(CommentPic commentPic) {
        return this.getSqlSession().insert("com.dao.impl.CommentDaoImpl.insertPic",commentPic);
    }
}
