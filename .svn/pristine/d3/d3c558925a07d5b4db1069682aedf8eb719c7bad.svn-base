package com.liutianjun.dao;

import com.liutianjun.pojo.ShipDynamic;
import com.liutianjun.pojo.ShipDynamicQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShipDynamicDao {
    int countByExample(ShipDynamicQuery example);

    int deleteByExample(ShipDynamicQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShipDynamic record);

    int insertSelective(ShipDynamic record);

    List<ShipDynamic> selectByExample(ShipDynamicQuery example);

    ShipDynamic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShipDynamic record, @Param("example") ShipDynamicQuery example);

    int updateByExample(@Param("record") ShipDynamic record, @Param("example") ShipDynamicQuery example);

    int updateByPrimaryKeySelective(ShipDynamic record);

    int updateByPrimaryKey(ShipDynamic record);
}