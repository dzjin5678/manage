package com.ange.model;

   /**
    * user 实体类
    *  ange
    */ 


public class User{
	private int id;
	private String userName;
	private String password;
	private String realName;
	private int role;
	private String department;
	private String state;
	public void setId(int id){
	this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setUserName(String userName){
	this.userName=userName;
	}
	public String getUserName(){
		return userName;
	}
	public void setPassword(String password){
	this.password=password;
	}
	public String getPassword(){
		return password;
	}
	public void setRealName(String realName){
	this.realName=realName;
	}
	public String getRealName(){
		return realName;
	}
	public void setRole(int role){
	this.role=role;
	}
	public int getRole(){
		return role;
	}
	public void setDepartment(String department){
	this.department=department;
	}
	public String getDepartment(){
		return department;
	}
	public void setState(String state){
	this.state=state;
	}
	public String getState(){
		return state;
	}
}

