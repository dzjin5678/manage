package com.ange.model;

   /**
    * customsRelease 实体类
    *  ange
    */ 


public class CustomsRelease{
	private int id;
	private String BILL_NO;
	private String I_E_FLAG;
	private String TRANSPORT_ID;
	private String TRANSPORT_NAME;
	private String VOYAGE_NO;
	private String DECL_TRAF_MODE;
	private int PACK_NO;
	private String GROSS_WT;
	private String CREATE_DATE;
	private String CONTA_ID;
	private String FORM_ID;
	private String state;
	private String filePath;
	public void setId(int id){
	this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setBILL_NO(String BILL_NO){
	this.BILL_NO=BILL_NO;
	}
	public String getBILL_NO(){
		return BILL_NO;
	}
	public void setI_E_FLAG(String I_E_FLAG){
	this.I_E_FLAG=I_E_FLAG;
	}
	public String getI_E_FLAG(){
		return I_E_FLAG;
	}
	public void setTRANSPORT_ID(String TRANSPORT_ID){
	this.TRANSPORT_ID=TRANSPORT_ID;
	}
	public String getTRANSPORT_ID(){
		return TRANSPORT_ID;
	}
	public void setTRANSPORT_NAME(String TRANSPORT_NAME){
	this.TRANSPORT_NAME=TRANSPORT_NAME;
	}
	public String getTRANSPORT_NAME(){
		return TRANSPORT_NAME;
	}
	public void setVOYAGE_NO(String VOYAGE_NO){
	this.VOYAGE_NO=VOYAGE_NO;
	}
	public String getVOYAGE_NO(){
		return VOYAGE_NO;
	}
	public void setDECL_TRAF_MODE(String DECL_TRAF_MODE){
	this.DECL_TRAF_MODE=DECL_TRAF_MODE;
	}
	public String getDECL_TRAF_MODE(){
		return DECL_TRAF_MODE;
	}
	public void setPACK_NO(int PACK_NO){
	this.PACK_NO=PACK_NO;
	}
	public int getPACK_NO(){
		return PACK_NO;
	}
	public void setGROSS_WT(String GROSS_WT){
	this.GROSS_WT=GROSS_WT;
	}
	public String getGROSS_WT(){
		return GROSS_WT;
	}
	public void setCREATE_DATE(String CREATE_DATE){
	this.CREATE_DATE=CREATE_DATE;
	}
	public String getCREATE_DATE(){
		return CREATE_DATE;
	}
	public void setCONTA_ID(String CONTA_ID){
	this.CONTA_ID=CONTA_ID;
	}
	public String getCONTA_ID(){
		return CONTA_ID;
	}
	public void setFORM_ID(String FORM_ID){
	this.FORM_ID=FORM_ID;
	}
	public String getFORM_ID(){
		return FORM_ID;
	}
	public void setState(String state){
	this.state=state;
	}
	public String getState(){
		return state;
	}
	public void setFilePath(String filePath){
	this.filePath=filePath;
	}
	public String getFilePath(){
		return filePath;
	}
}

