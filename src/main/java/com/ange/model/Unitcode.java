package com.ange.model;

   /**
    * unitcode 实体类
    *  dzjin
    */ 

public class Unitcode{
	private int id;
	private String unitCode;
	private String unitName;
	private String unitType;
	private String unitEname;
	private String address;
	private String phone;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUnitCode(String unitCode){
	this.unitCode=unitCode;
	}
	public String getUnitCode(){
		return unitCode;
	}
	public void setUnitName(String unitName){
	this.unitName=unitName;
	}
	public String getUnitName(){
		return unitName;
	}
	public void setUnitType(String unitType){
	this.unitType=unitType;
	}
	public String getUnitType(){
		return unitType;
	}
	public void setUnitEname(String unitEname){
	this.unitEname=unitEname;
	}
	public String getUnitEname(){
		return unitEname;
	}
	public void setAddress(String address){
	this.address=address;
	}
	public String getAddress(){
		return address;
	}
	public void setPhone(String phone){
	this.phone=phone;
	}
	public String getPhone(){
		return phone;
	}
}

