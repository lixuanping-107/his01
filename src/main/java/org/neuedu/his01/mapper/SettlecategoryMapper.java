package org.neuedu.his01.mapper;

import org.neuedu.his01.model.Settlecategory;

public interface SettlecategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Settlecategory record);

    int insertSelective(Settlecategory record);

    Settlecategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Settlecategory record);

    int updateByPrimaryKey(Settlecategory record);
}