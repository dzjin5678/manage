package com.jiangjin.model;

import java.io.Serializable;
import java.util.Date;

public class CarRelease implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 11212121L;
	//主键
	private Integer id;
	//车牌号
	private String carCode;
	//装卸类型  0装 1卸
	private Integer handlingType;
	//创建时间
	private Date createTime;
	//放行类型  1 预约放行  2 卸车放行  3 装车放行  4 卸车海关放行  5 装车海关放行
	private Integer releaseType;
	//放行记录回调id
	private String releaseRecordId;
	//放行开始时间
	private String releaseStartTime;
	//放行结束时间
	private String releaseEndTime;
	//货类
	private String cargotype;
	//数量
	private String amount;
	private Integer isCancel;
	public String getIsCancelStr(){
		if(isCancel==null){
			return "";
		}
			if(0==isCancel){
				return "未取消";
			}else if(1==isCancel){
				return "已取消";
			}else
				return "";
	}
	
	public String getHandlingTypeStr(){
		if(handlingType==null){
			return "";
		}
		if(0==handlingType){
			return "装车";
		}else if(1==handlingType){
			return "卸车";
		}else
			return "";
	}
	public String getReleaseTypeStr(){
		if(releaseType==null){
			return "";
		}
		switch(releaseType){
		case 1:return "预约放行";
		case 2:return "卸车放行";
		case 3:return "装车放行 ";
		case 4:return "卸车海关放行";
		case 5:return "装车海关放行";
		default:return "";
		}
	}
	public Integer getIsCancel() {
		return isCancel;
	}
	public void setIsCancel(Integer isCancel) {
		this.isCancel = isCancel;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCarCode() {
		return carCode;
	}
	public void setCarCode(String carCode) {
		this.carCode = carCode;
	}
	public Integer getHandlingType() {
		return handlingType;
	}
	public void setHandlingType(Integer handlingType) {
		this.handlingType = handlingType;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getReleaseType() {
		return releaseType;
	}
	public void setReleaseType(Integer releaseType) {
		this.releaseType = releaseType;
	}
	public String getReleaseRecordId() {
		return releaseRecordId;
	}
	public void setReleaseRecordId(String releaseRecordId) {
		this.releaseRecordId = releaseRecordId;
	}

	public String getReleaseStartTime() {
		return releaseStartTime;
	}

	public void setReleaseStartTime(String releaseStartTime) {
		this.releaseStartTime = releaseStartTime;
	}

	public String getReleaseEndTime() {
		return releaseEndTime;
	}

	public void setReleaseEndTime(String releaseEndTime) {
		this.releaseEndTime = releaseEndTime;
	}

	public String getCargotype() {
		return cargotype;
	}

	public void setCargotype(String cargotype) {
		this.cargotype = cargotype;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
}
