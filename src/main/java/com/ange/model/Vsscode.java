package com.ange.model;

   /**
    * vsscode 实体类
    *  dzjin
    *  船舶类
    */ 


public class Vsscode{
	private int id;
	private String vssCode;
	private String vssCname;
	private String vssEname;
	private String nationality;
	private String caption;
	private String width;
	private String tonnage;
	private String cargoType;
	private String loadline;
	private String distance_outfall_bow;
	private String unitCode;
	private String agency;
	private String remark;
	public void setId(int id){
	this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setVssCode(String vssCode){
	this.vssCode=vssCode;
	}
	public String getVssCode(){
		return vssCode;
	}
	public void setVssCname(String vssCname){
	this.vssCname=vssCname;
	}
	public String getVssCname(){
		return vssCname;
	}
	public void setVssEname(String vssEname){
	this.vssEname=vssEname;
	}
	public String getVssEname(){
		return vssEname;
	}
	public void setNationality(String nationality){
	this.nationality=nationality;
	}
	public String getNationality(){
		return nationality;
	}
	public void setCaption(String caption){
	this.caption=caption;
	}
	public String getCaption(){
		return caption;
	}
	public void setWidth(String width){
	this.width=width;
	}
	public String getWidth(){
		return width;
	}
	public void setTonnage(String tonnage){
	this.tonnage=tonnage;
	}
	public String getTonnage(){
		return tonnage;
	}
	public void setCargoType(String cargoType){
	this.cargoType=cargoType;
	}
	public String getCargoType(){
		return cargoType;
	}
	public void setLoadline(String loadline){
	this.loadline=loadline;
	}
	public String getLoadline(){
		return loadline;
	}
	public void setDistance_outfall_bow(String distance_outfall_bow){
	this.distance_outfall_bow=distance_outfall_bow;
	}
	public String getDistance_outfall_bow(){
		return distance_outfall_bow;
	}
	public void setUnitCode(String unitCode){
	this.unitCode=unitCode;
	}
	public String getUnitCode(){
		return unitCode;
	}
	public void setAgency(String agency){
	this.agency=agency;
	}
	public String getAgency(){
		return agency;
	}
	public void setRemark(String remark){
	this.remark=remark;
	}
	public String getRemark(){
		return remark;
	}
	@Override
	public String toString() {
		return "Vsscode [id=" + id + ", vssCode=" + vssCode + ", vssCname=" + vssCname + ", vssEname=" + vssEname
				+ ", nationality=" + nationality + ", caption=" + caption + ", width=" + width + ", tonnage=" + tonnage
				+ ", cargoType=" + cargoType + ", loadline=" + loadline + ", distance_outfall_bow="
				+ distance_outfall_bow + ", unitCode=" + unitCode + ", agency=" + agency + ", remark=" + remark + "]";
	}
	
	
}

