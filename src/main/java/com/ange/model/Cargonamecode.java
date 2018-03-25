package com.ange.model;

   /**
    * cargonamecode 实体类
    *  dzjin
    *  货物名称类
    */ 


public class Cargonamecode{
	private int id;
	private String cargoNameCode;
	private String cargoName;
	private String cargoTypeBelonged;
	public void setId(int id){
	this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setCargoNameCode(String cargoNameCode){
	this.cargoNameCode=cargoNameCode;
	}
	public String getCargoNameCode(){
		return cargoNameCode;
	}
	public void setCargoName(String cargoName){
	this.cargoName=cargoName;
	}
	public String getCargoName(){
		return cargoName;
	}
	public void setCargoTypeBelonged(String cargoTypeBelonged){
	this.cargoTypeBelonged=cargoTypeBelonged;
	}
	public String getCargoTypeBelonged(){
		return cargoTypeBelonged;
	}
}

