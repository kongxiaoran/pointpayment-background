package com.dao;

import com.entity.Type;

import java.util.List;

public interface TypeDao {

    public long insert(Type entity);

    public long update(Type entity);

    public Type getBy(Type v);

    public List<Type> getList();

}
