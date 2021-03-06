package com.ange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ange.model.Vsscode;

public interface VsscodeDao {
	
	@Insert("insert into Vsscode(vssCode,vssCname,vssEname,nationality,caption,"
			+ "width,tonnage,cargoType,loadline,distance_outfall_bow,"
			+ "unitCode,agency,remark) "
			+ "values(#{vssCode},#{vssCname},#{vssEname},#{nationality},#{caption},"
			+ "#{width},#{tonnage},#{cargoType},#{loadline},#{distance_outfall_bow},"
			+ "#{unitCode},#{agency},#{remark})")
	public int insertVssCode(
			@Param("vssCode")String vssCode ,
			@Param("vssCname")String vssCname ,
			@Param("vssEname")String vssEname ,
			@Param("nationality")String nationality ,
			@Param("caption")String caption,
			@Param("width")String width ,
			@Param("tonnage")String tonnage ,
			@Param("cargoType")String cargoType ,
			@Param("loadline")String loadline ,
			@Param("distance_outfall_bow")String distance_outfall_bow , 
			@Param("unitCode")String unitCode ,
			@Param("agency")String agency ,
			@Param("remark")String remark);
	
	@Update("update Vsscode set vssCode=#{vssCode},vssCname=#{vssCname},"
			+ "vssEname=#{vssEname},nationality=#{nationality},caption=#{caption},"
			+ "width=#{width},tonnage=#{tonnage},cargoType=#{cargoType},"
			+ "loadline=#{loadline},distance_outfall_bow=#{distance_outfall_bow},"
			+ "unitCode=#{unitCode},agency=#{agency},remark=#{remark} where id=#{id}")
	public int updateVssCode(
			@Param("id")String id ,
			@Param("vssCode")String vssCode ,
			@Param("vssCname")String vssCname ,
			@Param("vssEname")String vssEname ,
			@Param("nationality")String nationality ,
			@Param("caption")String caption,
			@Param("width")String width ,
			@Param("tonnage")String tonnage ,
			@Param("cargoType")String cargoType ,
			@Param("loadline")String loadline ,
			@Param("distance_outfall_bow")String distance_outfall_bow , 
			@Param("unitCode")String unitCode ,
			@Param("agency")String agency ,
			@Param("remark")String remark);
	
	@Select("select * from VssCode  order by id desc")
	public List<Vsscode> queryVssCode();
	
	@Select("select * from vssCode where id=#{id}")
	public Vsscode getVssCode(@Param("id")String id);
	
	
	@Delete("delete from VssCode where id =#{id}")
	public int deleteVssCode(@Param("id")String id);

}
