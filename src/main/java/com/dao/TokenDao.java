package com.dao;

import com.entity.Token;

import java.util.List;
import java.util.Map;

public interface TokenDao {

    public long insert(Token entity);

    public long update(Token entity);

    public Token getBy(Map<String,Object> map);

    public List<Token> getListBy(Map<String,Object> map);

}
