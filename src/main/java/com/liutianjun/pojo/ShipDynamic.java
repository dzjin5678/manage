package com.liutianjun.pojo;

import java.io.Serializable;

public class ShipDynamic implements Serializable {
    /**
     * ID
     */
    private Integer id;

    /**
     * 航次编号
     */
    private String voyageNumber;

    /**
     * 抵达锚地
     */
    private String arriveAnchorage;

    /**
     * 进港时间
     */
    private String entryTime;

    /**
     * 出港时间
     */
    private String departureTime;

    /**
     * 进港/出港 0-进港 1-出港
     */
    private Integer entryDeparture;

    /**
     * 首缆上岸时间
     */
    private String firstCableTime;

    /**
     * 靠泊完毕时间
     */
    private String berthingTime;

    /**
     * 装/卸 0-装 1-卸
     */
    private Integer loadUnload;

    /**
     * 疏运方式
     */
    private String transportMode;

    /**
     * 上一港
     */
    private String lastPort;

    /**
     * 下一港
     */
    private String nextPort;

    /**
     * 装卸类别
     */
    private String loadUnloadCategory;

    /**
     * 库区
     */
    private String reservoirArea;

    /**
     * 码头
     */
    private String wharf;

    /**
     * 位置
     */
    private String position;

    /**
     * 泊位
     */
    private String berth;

    /**
     * 引水/拖轮 0-引水 1-拖轮
     */
    private Integer waterDiversionTug;

    /**
     * 库区/船代/货代 0-库区 1-船代 2-货代
     */
    private Integer reservoirShippingFreightForwarding;

    /**
     * 上运抵时间
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

    /**
     * 船舶预报ID
     */
    private Integer shipForecastId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVoyageNumber() {
        return voyageNumber;
    }

    public void setVoyageNumber(String voyageNumber) {
        this.voyageNumber = voyageNumber == null ? null : voyageNumber.trim();
    }

    public String getArriveAnchorage() {
        return arriveAnchorage;
    }

    public void setArriveAnchorage(String arriveAnchorage) {
        this.arriveAnchorage = arriveAnchorage == null ? null : arriveAnchorage.trim();
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime == null ? null : entryTime.trim();
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime == null ? null : departureTime.trim();
    }

    public Integer getEntryDeparture() {
        return entryDeparture;
    }

    public void setEntryDeparture(Integer entryDeparture) {
        this.entryDeparture = entryDeparture;
    }

    public String getFirstCableTime() {
        return firstCableTime;
    }

    public void setFirstCableTime(String firstCableTime) {
        this.firstCableTime = firstCableTime == null ? null : firstCableTime.trim();
    }

    public String getBerthingTime() {
        return berthingTime;
    }

    public void setBerthingTime(String berthingTime) {
        this.berthingTime = berthingTime == null ? null : berthingTime.trim();
    }

    public Integer getLoadUnload() {
        return loadUnload;
    }

    public void setLoadUnload(Integer loadUnload) {
        this.loadUnload = loadUnload;
    }

    public String getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode == null ? null : transportMode.trim();
    }

    public String getLastPort() {
        return lastPort;
    }

    public void setLastPort(String lastPort) {
        this.lastPort = lastPort == null ? null : lastPort.trim();
    }

    public String getNextPort() {
        return nextPort;
    }

    public void setNextPort(String nextPort) {
        this.nextPort = nextPort == null ? null : nextPort.trim();
    }

    public String getLoadUnloadCategory() {
        return loadUnloadCategory;
    }

    public void setLoadUnloadCategory(String loadUnloadCategory) {
        this.loadUnloadCategory = loadUnloadCategory == null ? null : loadUnloadCategory.trim();
    }

    public String getReservoirArea() {
        return reservoirArea;
    }

    public void setReservoirArea(String reservoirArea) {
        this.reservoirArea = reservoirArea == null ? null : reservoirArea.trim();
    }

    public String getWharf() {
        return wharf;
    }

    public void setWharf(String wharf) {
        this.wharf = wharf == null ? null : wharf.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getBerth() {
        return berth;
    }

    public void setBerth(String berth) {
        this.berth = berth == null ? null : berth.trim();
    }

    public Integer getWaterDiversionTug() {
        return waterDiversionTug;
    }

    public void setWaterDiversionTug(Integer waterDiversionTug) {
        this.waterDiversionTug = waterDiversionTug;
    }

    public Integer getReservoirShippingFreightForwarding() {
        return reservoirShippingFreightForwarding;
    }

    public void setReservoirShippingFreightForwarding(Integer reservoirShippingFreightForwarding) {
        this.reservoirShippingFreightForwarding = reservoirShippingFreightForwarding;
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

    public Integer getShipForecastId() {
        return shipForecastId;
    }

    public void setShipForecastId(Integer shipForecastId) {
        this.shipForecastId = shipForecastId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", voyageNumber=").append(voyageNumber);
        sb.append(", arriveAnchorage=").append(arriveAnchorage);
        sb.append(", entryTime=").append(entryTime);
        sb.append(", departureTime=").append(departureTime);
        sb.append(", entryDeparture=").append(entryDeparture);
        sb.append(", firstCableTime=").append(firstCableTime);
        sb.append(", berthingTime=").append(berthingTime);
        sb.append(", loadUnload=").append(loadUnload);
        sb.append(", transportMode=").append(transportMode);
        sb.append(", lastPort=").append(lastPort);
        sb.append(", nextPort=").append(nextPort);
        sb.append(", loadUnloadCategory=").append(loadUnloadCategory);
        sb.append(", reservoirArea=").append(reservoirArea);
        sb.append(", wharf=").append(wharf);
        sb.append(", position=").append(position);
        sb.append(", berth=").append(berth);
        sb.append(", waterDiversionTug=").append(waterDiversionTug);
        sb.append(", reservoirShippingFreightForwarding=").append(reservoirShippingFreightForwarding);
        sb.append(", arrivalTime=").append(arrivalTime);
        sb.append(", userId=").append(userId);
        sb.append(", userRealname=").append(userRealname);
        sb.append(", shipForecastId=").append(shipForecastId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}