package org.neuedu.his01.mapper;

import org.neuedu.his01.model.RegistWork;

public interface RegistWorkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegistWork record);

    int insertSelective(RegistWork record);

    RegistWork selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegistWork record);

    int updateByPrimaryKey(RegistWork record);
}