package org.neuedu.his01.mapper;

import org.neuedu.his01.model.Patientcosts;

public interface PatientcostsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Patientcosts record);

    int insertSelective(Patientcosts record);

    Patientcosts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Patientcosts record);

    int updateByPrimaryKey(Patientcosts record);
}