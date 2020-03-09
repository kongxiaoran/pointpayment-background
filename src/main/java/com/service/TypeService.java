package com.service;

import com.dao.TypeDao;
import com.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: kxr
 * @Date: 2020/3/2
 * @Description
 */
@Component(value = "typeService")
public class TypeService {

    @Autowired
    TypeDao typeDao;

    public List<Type> list(){

        return typeDao.getList();
    }

    public Type getByName(String typeName){

        Type type = new Type();
        type.setTypeName(typeName);
        return typeDao.getBy(type);
    }

    public boolean delete(long id) {
        Type type = new Type();
        type.setId(id);
        type.setStatus(9);
        typeDao.update(type);
        return true;
    }

    public long insert(Type type) {
        return typeDao.insert(type);
    }

    public long update(Type type) {
        return typeDao.update(type);
    }
}
