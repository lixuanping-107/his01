package org.neuedu.his01.mapper;

import org.neuedu.his01.model.Disecategory;

public interface DisecategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Disecategory record);

    int insertSelective(Disecategory record);

    Disecategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Disecategory record);

    int updateByPrimaryKey(Disecategory record);
}