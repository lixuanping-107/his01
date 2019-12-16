package org.neuedu.his01.mapper;

import org.neuedu.his01.model.Constantitem;

public interface ConstantitemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Constantitem record);

    int insertSelective(Constantitem record);

    Constantitem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Constantitem record);

    int updateByPrimaryKey(Constantitem record);
}