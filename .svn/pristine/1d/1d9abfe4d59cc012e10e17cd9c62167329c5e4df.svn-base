package com.ange.dao;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ange.model.CustomsRelease;

public interface CustomsReleaseDao {

	@Select("insert into customsRelease (BILL_NO,I_E_FLAG,TRANSPORT_ID,TRANSPORT_NAME,VOYAGE_NO,DECL_TRAF_MODE,PACK_NO,GROSS_WT,CREATE_DATE,CONTA_ID,FORM_ID,state,filePath) values "
			+ "(#{BILL_NO},#{I_E_FLAG},#{TRANSPORT_ID},#{TRANSPORT_NAME},#{VOYAGE_NO},#{DECL_TRAF_MODE},#{PACK_NO},#{GROSS_WT},#{CREATE_DATE},#{CONTA_ID},#{FORM_ID},#{state},#{filePath})")
	@Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
	public void addCustomsRelease(CustomsRelease customsRelease);

	@Update("update customsRelease set state=#{state} where id=#{customReleaseId}")
	public void updateState(@Param("customReleaseId")Integer customReleaseId,@Param("state")String state);

	@Select("select * from customsRelease where BILL_NO=#{BILL_NO} and TRANSPORT_NAME=#{TRANSPORT_NAME} and VOYAGE_NO=#{VOYAGE_NO}")
	public CustomsRelease getCustomsRelease(CustomsRelease customsRelease);

}
