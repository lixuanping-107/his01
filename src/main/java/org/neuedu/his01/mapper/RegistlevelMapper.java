package org.neuedu.his01.mapper;

import org.neuedu.his01.model.Registlevel;

public interface RegistlevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Registlevel record);

    int insertSelective(Registlevel record);

    Registlevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Registlevel record);

    int updateByPrimaryKey(Registlevel record);
}