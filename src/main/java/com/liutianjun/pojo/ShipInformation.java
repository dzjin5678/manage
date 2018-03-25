package com.liutianjun.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class ShipInformation implements Serializable {
    /**
     * ID
     */
    private Integer id;

    /**
     * 船舶代码
     */
    private String shipCode;

    /**
     * 航次编号
     */
    private String voyageNumber;

    /**
     * 进口航次
     */
    private String importVoyage;

    /**
     * 出口航次
     */
    private String exportVoyage;

    /**
     * 通知编号
     */
    private String noticeNumber;

    /**
     * 所属公司
     */
    private String affiliatedCompany;

    /**
     * 代理
     */
    private String proxy;

    /**
     * 内外贸
     */
    private Integer iFTrade;

    /**
     * 总吨
     */
    private BigDecimal grossWeight;

    /**
     * 净重
     */
    private BigDecimal netWeight;

    /**
     * 进港时间
     */
    private String arrivalTime;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String userRealname;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShipCode() {
        return shipCode;
    }

    public void setShipCode(String shipCode) {
        this.shipCode = shipCode == null ? null : shipCode.trim();
    }

    public String getVoyageNumber() {
        return voyageNumber;
    }

    public void setVoyageNumber(String voyageNumber) {
        this.voyageNumber = voyageNumber == null ? null : voyageNumber.trim();
    }

    public String getImportVoyage() {
        return importVoyage;
    }

    public void setImportVoyage(String importVoyage) {
        this.importVoyage = importVoyage == null ? null : importVoyage.trim();
    }

    public String getExportVoyage() {
        return exportVoyage;
    }

    public void setExportVoyage(String exportVoyage) {
        this.exportVoyage = exportVoyage == null ? null : exportVoyage.trim();
    }

    public String getNoticeNumber() {
        return noticeNumber;
    }

    public void setNoticeNumber(String noticeNumber) {
        this.noticeNumber = noticeNumber == null ? null : noticeNumber.trim();
    }

    public String getAffiliatedCompany() {
        return affiliatedCompany;
    }

    public void setAffiliatedCompany(String affiliatedCompany) {
        this.affiliatedCompany = affiliatedCompany == null ? null : affiliatedCompany.trim();
    }

    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy == null ? null : proxy.trim();
    }

    public Integer getiFTrade() {
        return iFTrade;
    }

    public void setiFTrade(Integer iFTrade) {
        this.iFTrade = iFTrade;
    }

    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    public BigDecimal getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime == null ? null : arrivalTime.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserRealname() {
        return userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname == null ? null : userRealname.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", shipCode=").append(shipCode);
        sb.append(", voyageNumber=").append(voyageNumber);
        sb.append(", importVoyage=").append(importVoyage);
        sb.append(", exportVoyage=").append(exportVoyage);
        sb.append(", noticeNumber=").append(noticeNumber);
        sb.append(", affiliatedCompany=").append(affiliatedCompany);
        sb.append(", proxy=").append(proxy);
        sb.append(", iFTrade=").append(iFTrade);
        sb.append(", grossWeight=").append(grossWeight);
        sb.append(", netWeight=").append(netWeight);
        sb.append(", arrivalTime=").append(arrivalTime);
        sb.append(", userId=").append(userId);
        sb.append(", userRealname=").append(userRealname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}