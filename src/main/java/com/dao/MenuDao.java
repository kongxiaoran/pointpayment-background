package com.dao;

import com.entity.Menu;

import java.util.List;
import java.util.Map;

public interface MenuDao {
    public long insert(Menu entity);
    public long update(Menu entity);
    public Menu getBy(Map<String,Object> map);
    public List<Menu> getListBy(Map<String,Object> map);
}
