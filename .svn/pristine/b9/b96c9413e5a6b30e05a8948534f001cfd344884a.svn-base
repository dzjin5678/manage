package com.liutianjun.dao;

import com.liutianjun.pojo.ShipForecast;
import com.liutianjun.pojo.ShipForecastQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShipForecastDao {
    int countByExample(ShipForecastQuery example);

    int deleteByExample(ShipForecastQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShipForecast record);

    int insertSelective(ShipForecast record);

    List<ShipForecast> selectByExample(ShipForecastQuery example);

    ShipForecast selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShipForecast record, @Param("example") ShipForecastQuery example);

    int updateByExample(@Param("record") ShipForecast record, @Param("example") ShipForecastQuery example);

    int updateByPrimaryKeySelective(ShipForecast record);

    int updateByPrimaryKey(ShipForecast record);
}