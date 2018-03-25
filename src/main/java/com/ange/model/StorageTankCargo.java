package com.ange.model;

   /**
    * storageTankCargo 实体类
    *  dzjin
    */ 

public class StorageTankCargo{
	private int id;
	private int storageTankTaskId;
	private String task;
	private String cargoType;
	private String transportType;
	private double planNum;
	private double actualNum;
	public void setId(int id){
	this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setStorageTankTaskId(int storageTankTaskId){
	this.storageTankTaskId=storageTankTaskId;
	}
	public int getStorageTankTaskId(){
		return storageTankTaskId;
	}
	public void setTask(String task){
	this.task=task;
	}
	public String getTask(){
		return task;
	}
	public void setCargoType(String cargoType){
	this.cargoType=cargoType;
	}
	public String getCargoType(){
		return cargoType;
	}
	public void setTransportType(String transportType){
	this.transportType=transportType;
	}
	public String getTransportType(){
		return transportType;
	}
	public void setPlanNum(double planNum){
	this.planNum=planNum;
	}
	public double getPlanNum(){
		return planNum;
	}
	public void setActualNum(double actualNum){
	this.actualNum=actualNum;
	}
	public double getActualNum(){
		return actualNum;
	}
}

