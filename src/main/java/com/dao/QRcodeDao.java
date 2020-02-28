package com.dao;

import com.entity.QRcode;

import java.util.List;
import java.util.Map;

public interface QRcodeDao {
    public long insert(QRcode entity);

    public long update(QRcode entity);

    public QRcode getBy(Map<String,Object> map);

    public List<QRcode> getListBy(Map<String,Object> map);
}
