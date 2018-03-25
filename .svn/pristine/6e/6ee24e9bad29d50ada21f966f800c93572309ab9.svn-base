package com.ange.tool;


public class Result {
	
	private boolean expect=true;//结果是正确的
	private String code;//返回的代码
	private String birthplace; //对象创建位置
	private Object msg; //返回的信息
	

	public Result(boolean expect){
		this.expect=expect;
		StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
		birthplace = " "+stacks[2].toString();
	}
	public Result(String msg){
		this.msg=msg;
		StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
		birthplace = " "+stacks[2].toString();
	}
	public Result(boolean expect,String msg){
		this.msg=msg;
		this.expect=expect;
		StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
		birthplace = " "+stacks[2].toString();
	}
	public Result(boolean expect,String code,String msg){
		this.code=code;
		this.msg=msg;
		this.expect=expect;
		StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
		birthplace = " "+stacks[2].toString();
	}
	public Result(boolean expect,Object msg){
		this.expect=expect;
		this.msg=msg;
		StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
		birthplace = " "+stacks[2].toString();
	}
	public Result(boolean expect,String code,Object msg){
		this.code=code;
		this.expect=expect;
		this.msg=msg;
		StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
		birthplace = " "+stacks[2].toString();
	}
	
	public String toString(){
		return Json.tojson(this);
	}

	public boolean isExpect() {
		return expect;
	}
	public void setExpect(boolean expect) {
		this.expect = expect;
	}
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getBirthplace() {
		return birthplace;
	}
	
	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}
	public Object getMsg() {
		return msg;
	}
	public void setMsg(Object msg) {
		this.msg = msg;
	}
	
	
}
