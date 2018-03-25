package com.liutianjun.dao;

import com.liutianjun.pojo.ShipInformation;
import com.liutianjun.pojo.ShipInformationQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShipInformationDao {
    int countByExample(ShipInformationQuery example);

    int deleteByExample(ShipInformationQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShipInformation record);

    int insertSelective(ShipInformation record);

    List<ShipInformation> selectByExample(ShipInformationQuery example);

    ShipInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShipInformation record, @Param("example") ShipInformationQuery example);

    int updateByExample(@Param("record") ShipInformation record, @Param("example") ShipInformationQuery example);

    int updateByPrimaryKeySelective(ShipInformation record);

    int updateByPrimaryKey(ShipInformation record);
}