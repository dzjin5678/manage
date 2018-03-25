package com.ange.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ange.model.Goods;

public interface GoodsDao {

	@Insert("insert into goods (forecastId, number, shipper, freightForwarding, carryOrder, goodsName,goodType, weight, volume, uninstallWeight,"
			+ " uninstallVolume, signName, releaseTime, extractDate, remarks,realName, userid,time,state,filePath) values "
			+ "(#{forecastId},#{number},#{shipper},#{freightForwarding},#{carryOrder},#{goodsName},#{goodType},#{weight},#{volume},#{uninstallWeight},"
			+ "#{uninstallVolume},#{signName},#{releaseTime},#{extractDate},#{remarks},#{realName},#{userid},#{time},#{state},#{filePath})")
	public void addGoods(@Param("forecastId") Integer forecastId, @Param("number") String number,
			@Param("shipper") String shipper, @Param("freightForwarding") String freightForwarding,
			@Param("carryOrder") String carryOrder, @Param("goodsName") String goodsName,
			@Param("goodType") String goodType, @Param("weight") String weight, @Param("volume") String volume,
			@Param("uninstallWeight") String uninstallWeight, @Param("uninstallVolume") String uninstallVolume,
			@Param("signName") String signName, @Param("releaseTime") String releaseTime,
			@Param("extractDate") String extractDate, @Param("remarks") String remarks,
			@Param("realName") String realName, @Param("userid") String userid, @Param("time") String time,
			@Param("state") String state, @Param("filePath")String filePath);

	@Select("select * from goods where forecastId=#{forecastId} order by id desc")
	public List<Goods> getGoodsList(Integer forecastId);

	@Select("select * from goods where id=#{id}")
	public Goods getGoodsInfo(Integer id);

	@Update("update goods set number=#{number}, shipper=#{shipper}, freightForwarding=#{freightForwarding}, carryOrder=#{carryOrder}, "
			+ "goodsName=#{goodsName},goodType=#{goodType}, weight=#{weight}, volume=#{volume}, uninstallWeight=#{uninstallWeight},"
			+ "uninstallVolume=#{uninstallVolume}, signName=#{signName}, releaseTime=#{releaseTime}, extractDate=#{extractDate}, "
			+ "remarks=#{remarks},realName=#{realName}, userid=#{userid} where id=#{id}")
	public void updateGoods(@Param("id") Integer id, @Param("number") String number, @Param("shipper") String shipper,
			@Param("freightForwarding") String freightForwarding, @Param("carryOrder") String carryOrder,
			@Param("goodsName") String goodsName, @Param("goodType") String goodType, @Param("weight") String weight,
			@Param("volume") String volume, @Param("uninstallWeight") String uninstallWeight,
			@Param("uninstallVolume") String uninstallVolume, @Param("signName") String signName,
			@Param("releaseTime") String releaseTime, @Param("extractDate") String extractDate,
			@Param("remarks") String remarks, @Param("realName") String realName, @Param("userid") String userid);

	@Delete("delete from goods where id=#{id}")
	public void deleteGoods(Integer id);

	@Select("select g.id from goods g left join ship_forecast f on g.forecastId=f.id left join vsscode v on v.vssCode=f.ship_code "
			+ "where g.carryOrder=#{BILL_NO} and v.vssEname=#{TRANSPORT_NAME} and f.voyage_number=#{VOYAGE_NO} ")
	public Integer byCustomsReleaseGetGoods(Map<String, String> map);

	@Update("update goods set state=#{state},filePath=#{fileName} where id=#{goodsId}")
	public void updateState(@Param("goodsId") Integer goodsId, @Param("state") String state,@Param("fileName") String fileName);

	@Select("select c.id,c.filePath from (select * from ship_forecast where id=#{forecastId}) f left join customsrelease c on c.VOYAGE_NO=f.voyage_number "
			+ "left join vsscode v on v.vssCode=f.ship_code where c.BILL_NO=#{carryOrder} and v.vssEname=c.TRANSPORT_NAME")
	public Map<String,Object> getCustomReleaseId(@Param("forecastId")Integer forecastId,@Param("carryOrder")String carryOrder);

	@Select("select i_f_trade from ship_forecast where id=#{forecastId}")
	public Integer getI_f_trade(Integer forecastId);

}
