package com.ange.model;

   /**
    * costcode 实体类
    *  dzjin
    *  费用代码类
    */ 


public class Costcode{
	private int id;
	private String costCode;
	private String costName;
	private String costUnit;
	private String costRate;
	private String costType;
	public void setId(int id){
	this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setCostCode(String costCode){
	this.costCode=costCode;
	}
	public String getCostCode(){
		return costCode;
	}
	public void setCostName(String costName){
	this.costName=costName;
	}
	public String getCostName(){
		return costName;
	}
	public void setCostUnit(String costUnit){
	this.costUnit=costUnit;
	}
	public String getCostUnit(){
		return costUnit;
	}
	public void setCostRate(String costRate){
	this.costRate=costRate;
	}
	public String getCostRate(){
		return costRate;
	}
	public void setCostType(String costType){
	this.costType=costType;
	}
	public String getCostType(){
		return costType;
	}
}

