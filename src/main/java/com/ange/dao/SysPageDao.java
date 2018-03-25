package com.ange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.ange.model.SysPage;

public interface SysPageDao {

	@Select("select * from sysPage where id=#{id}")
	public SysPage getSinglePage(Integer id);

	@Select("select * from sysPage ")
	public List<SysPage> getAllPage();

	@Select("select p.id,p.explains,p.pageUrl,IFNULL(o.createtime,0) createtime from syspage p "
			+ "left join syspower o on o.url=p.pageUrl where roleId=#{roleId}")
	public List<SysPage> getRoleAllPage(int roleId);

}
