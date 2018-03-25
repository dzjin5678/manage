package com.liutianjun.pojo;

import java.io.Serializable;

public class ShipForeignTradeBill implements Serializable {
    /**
     * ID
     */
    private Integer id;

    /**
     * 船舶信息表ID
     */
    private Integer shipInformationId;

    /**
     * 提单号
     */
    private String billNumber;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShipInformationId() {
        return shipInformationId;
    }

    public void setShipInformationId(Integer shipInformationId) {
        this.shipInformationId = shipInformationId;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber == null ? null : billNumber.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", shipInformationId=").append(shipInformationId);
        sb.append(", billNumber=").append(billNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}