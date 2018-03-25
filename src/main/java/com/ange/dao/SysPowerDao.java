package com.ange.dao;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ange.model.SysPower;

public interface SysPowerDao {

	@Insert("insert into sysPower (roleId,url,explains,createtime) values (#{roleId},#{url},#{explains},#{createtime})")
	@Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
	public void addPower(SysPower sysPower);

	@Delete("delete from sysPower where id=#{id}")
	public void deletePower(Integer id);

	@Select("select p.id,p.explains,p.pageUrl,IFNULL(o.createtime,0) createtime from syspage p left join "
			+ "(select * from syspower where roleId=#{roleId}) o on o.url=p.pageUrl")
	public List<Map<String,Object>> getPowerList(Integer roleId);

	@Select("select * from syspower where roleId=#{roleId} and explains=#{explains}")
	public SysPower getSinglePower(@Param("roleId")Integer roleId,@Param("explains")String explains);
	
}
