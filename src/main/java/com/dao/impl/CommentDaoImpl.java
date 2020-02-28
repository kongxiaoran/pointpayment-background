package com.dao.impl;

import com.dao.CommentDao;
import com.entity.Comment;

import java.util.List;
import java.util.Map;

public class CommentDaoImpl implements CommentDao{
    @Override
    public long insert(Comment entity) {
        return 0;
    }

    @Override
    public long update(Comment entity) {
        return 0;
    }

    @Override
    public Comment getBy(Map<String, Object> map) {
        return null;
    }

    @Override
    public List<Comment> getListBy(Map<String, Object> map) {
        return null;
    }
}
