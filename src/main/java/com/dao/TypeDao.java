package com.dao;

import com.entity.Type;

import java.util.List;
import java.util.Map;

public interface TypeDao {

    public long insert(Type entity);

    public long update(Type entity);

    public Type getBy(Map<String,Object> map);

    public List<Type> getListBy(Map<String,Object> map);

}
