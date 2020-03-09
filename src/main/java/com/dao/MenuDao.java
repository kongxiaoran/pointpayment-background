package com.dao;


import com.entity.Menu;

import java.util.List;

public interface MenuDao {

    public long insert(Menu entity);

    public int update(Menu entity);

    public Menu getBy(Menu menu);

    public Menu getById(long id);

    public List<Menu> getListBy(Menu menu);

}
