package com.dao;

import com.entity.Comment;

import java.util.List;
import java.util.Map;

public interface CommentDao {
    public long insert(Comment entity);
    public long update(Comment entity);
    public Comment getBy(Map<String,Object> map);
    public List<Comment> getListBy(Map<String,Object> map);
}
