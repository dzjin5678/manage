package com.jiangjin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarWeighQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public CarWeighQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        public void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        public void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        public void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberIsNull() {
            addCriterion("voyage_number is null");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberIsNotNull() {
            addCriterion("voyage_number is not null");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberEqualTo(String value) {
            addCriterion("voyage_number =", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberNotEqualTo(String value) {
            addCriterion("voyage_number <>", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberGreaterThan(String value) {
            addCriterion("voyage_number >", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberGreaterThanOrEqualTo(String value) {
            addCriterion("voyage_number >=", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberLessThan(String value) {
            addCriterion("voyage_number <", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberLessThanOrEqualTo(String value) {
            addCriterion("voyage_number <=", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberLike(String value) {
            addCriterion("voyage_number like", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberNotLike(String value) {
            addCriterion("voyage_number not like", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberIn(List<String> values) {
            addCriterion("voyage_number in", values, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberNotIn(List<String> values) {
            addCriterion("voyage_number not in", values, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberBetween(String value1, String value2) {
            addCriterion("voyage_number between", value1, value2, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberNotBetween(String value1, String value2) {
            addCriterion("voyage_number not between", value1, value2, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andArriveAnchorageIsNull() {
            addCriterion("arrive_anchorage is null");
            return (Criteria) this;
        }

        public Criteria andArriveAnchorageIsNotNull() {
            addCriterion("arrive_anchorage is not null");
            return (Criteria) this;
        }

        public Criteria andArriveAnchorageEqualTo(String value) {
            addCriterion("arrive_anchorage =", value, "arriveAnchorage");
            return (Criteria) this;
        }

        public Criteria andArriveAnchorageNotEqualTo(String value) {
            addCriterion("arrive_anchorage <>", value, "arriveAnchorage");
            return (Criteria) this;
        }

        public Criteria andArriveAnchorageGreaterThan(String value) {
            addCriterion("arrive_anchorage >", value, "arriveAnchorage");
            return (Criteria) this;
        }

        public Criteria andArriveAnchorageGreaterThanOrEqualTo(String value) {
            addCriterion("arrive_anchorage >=", value, "arriveAnchorage");
            return (Criteria) this;
        }

        public Criteria andArriveAnchorageLessThan(String value) {
            addCriterion("arrive_anchorage <", value, "arriveAnchorage");
            return (Criteria) this;
        }

        public Criteria andArriveAnchorageLessThanOrEqualTo(String value) {
            addCriterion("arrive_anchorage <=", value, "arriveAnchorage");
            return (Criteria) this;
        }

        public Criteria andArriveAnchorageLike(String value) {
            addCriterion("arrive_anchorage like", value, "arriveAnchorage");
            return (Criteria) this;
        }

        public Criteria andArriveAnchorageNotLike(String value) {
            addCriterion("arrive_anchorage not like", value, "arriveAnchorage");
            return (Criteria) this;
        }

        public Criteria andArriveAnchorageIn(List<String> values) {
            addCriterion("arrive_anchorage in", values, "arriveAnchorage");
            return (Criteria) this;
        }

        public Criteria andArriveAnchorageNotIn(List<String> values) {
            addCriterion("arrive_anchorage not in", values, "arriveAnchorage");
            return (Criteria) this;
        }

        public Criteria andArriveAnchorageBetween(String value1, String value2) {
            addCriterion("arrive_anchorage between", value1, value2, "arriveAnchorage");
            return (Criteria) this;
        }

        public Criteria andArriveAnchorageNotBetween(String value1, String value2) {
            addCriterion("arrive_anchorage not between", value1, value2, "arriveAnchorage");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNull() {
            addCriterion("entry_time is null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNotNull() {
            addCriterion("entry_time is not null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeEqualTo(Date value) {
            addCriterion("entry_time =", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotEqualTo(Date value) {
            addCriterion("entry_time <>", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThan(Date value) {
            addCriterion("entry_time >", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("entry_time >=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThan(Date value) {
            addCriterion("entry_time <", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThanOrEqualTo(Date value) {
            addCriterion("entry_time <=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIn(List<Date> values) {
            addCriterion("entry_time in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotIn(List<Date> values) {
            addCriterion("entry_time not in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeBetween(Date value1, Date value2) {
            addCriterion("entry_time between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotBetween(Date value1, Date value2) {
            addCriterion("entry_time not between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeIsNull() {
            addCriterion("departure_time is null");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeIsNotNull() {
            addCriterion("departure_time is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeEqualTo(Date value) {
            addCriterion("departure_time =", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeNotEqualTo(Date value) {
            addCriterion("departure_time <>", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeGreaterThan(Date value) {
            addCriterion("departure_time >", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("departure_time >=", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeLessThan(Date value) {
            addCriterion("departure_time <", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeLessThanOrEqualTo(Date value) {
            addCriterion("departure_time <=", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeIn(List<Date> values) {
            addCriterion("departure_time in", values, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeNotIn(List<Date> values) {
            addCriterion("departure_time not in", values, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeBetween(Date value1, Date value2) {
            addCriterion("departure_time between", value1, value2, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeNotBetween(Date value1, Date value2) {
            addCriterion("departure_time not between", value1, value2, "departureTime");
            return (Criteria) this;
        }

        public Criteria andEntryDepartureIsNull() {
            addCriterion("entry_departure is null");
            return (Criteria) this;
        }

        public Criteria andEntryDepartureIsNotNull() {
            addCriterion("entry_departure is not null");
            return (Criteria) this;
        }

        public Criteria andEntryDepartureEqualTo(Integer value) {
            addCriterion("entry_departure =", value, "entryDeparture");
            return (Criteria) this;
        }

        public Criteria andEntryDepartureNotEqualTo(Integer value) {
            addCriterion("entry_departure <>", value, "entryDeparture");
            return (Criteria) this;
        }

        public Criteria andEntryDepartureGreaterThan(Integer value) {
            addCriterion("entry_departure >", value, "entryDeparture");
            return (Criteria) this;
        }

        public Criteria andEntryDepartureGreaterThanOrEqualTo(Integer value) {
            addCriterion("entry_departure >=", value, "entryDeparture");
            return (Criteria) this;
        }

        public Criteria andEntryDepartureLessThan(Integer value) {
            addCriterion("entry_departure <", value, "entryDeparture");
            return (Criteria) this;
        }

        public Criteria andEntryDepartureLessThanOrEqualTo(Integer value) {
            addCriterion("entry_departure <=", value, "entryDeparture");
            return (Criteria) this;
        }

        public Criteria andEntryDepartureIn(List<Integer> values) {
            addCriterion("entry_departure in", values, "entryDeparture");
            return (Criteria) this;
        }

        public Criteria andEntryDepartureNotIn(List<Integer> values) {
            addCriterion("entry_departure not in", values, "entryDeparture");
            return (Criteria) this;
        }

        public Criteria andEntryDepartureBetween(Integer value1, Integer value2) {
            addCriterion("entry_departure between", value1, value2, "entryDeparture");
            return (Criteria) this;
        }

        public Criteria andEntryDepartureNotBetween(Integer value1, Integer value2) {
            addCriterion("entry_departure not between", value1, value2, "entryDeparture");
            return (Criteria) this;
        }

        public Criteria andFirstCableTimeIsNull() {
            addCriterion("first_cable_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstCableTimeIsNotNull() {
            addCriterion("first_cable_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCableTimeEqualTo(Date value) {
            addCriterion("first_cable_time =", value, "firstCableTime");
            return (Criteria) this;
        }

        public Criteria andFirstCableTimeNotEqualTo(Date value) {
            addCriterion("first_cable_time <>", value, "firstCableTime");
            return (Criteria) this;
        }

        public Criteria andFirstCableTimeGreaterThan(Date value) {
            addCriterion("first_cable_time >", value, "firstCableTime");
            return (Criteria) this;
        }

        public Criteria andFirstCableTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("first_cable_time >=", value, "firstCableTime");
            return (Criteria) this;
        }

        public Criteria andFirstCableTimeLessThan(Date value) {
            addCriterion("first_cable_time <", value, "firstCableTime");
            return (Criteria) this;
        }

        public Criteria andFirstCableTimeLessThanOrEqualTo(Date value) {
            addCriterion("first_cable_time <=", value, "firstCableTime");
            return (Criteria) this;
        }

        public Criteria andFirstCableTimeIn(List<Date> values) {
            addCriterion("first_cable_time in", values, "firstCableTime");
            return (Criteria) this;
        }

        public Criteria andFirstCableTimeNotIn(List<Date> values) {
            addCriterion("first_cable_time not in", values, "firstCableTime");
            return (Criteria) this;
        }

        public Criteria andFirstCableTimeBetween(Date value1, Date value2) {
            addCriterion("first_cable_time between", value1, value2, "firstCableTime");
            return (Criteria) this;
        }

        public Criteria andFirstCableTimeNotBetween(Date value1, Date value2) {
            addCriterion("first_cable_time not between", value1, value2, "firstCableTime");
            return (Criteria) this;
        }

        public Criteria andBerthingTimeIsNull() {
            addCriterion("berthing_time is null");
            return (Criteria) this;
        }

        public Criteria andBerthingTimeIsNotNull() {
            addCriterion("berthing_time is not null");
            return (Criteria) this;
        }

        public Criteria andBerthingTimeEqualTo(Date value) {
            addCriterion("berthing_time =", value, "berthingTime");
            return (Criteria) this;
        }

        public Criteria andBerthingTimeNotEqualTo(Date value) {
            addCriterion("berthing_time <>", value, "berthingTime");
            return (Criteria) this;
        }

        public Criteria andBerthingTimeGreaterThan(Date value) {
            addCriterion("berthing_time >", value, "berthingTime");
            return (Criteria) this;
        }

        public Criteria andBerthingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("berthing_time >=", value, "berthingTime");
            return (Criteria) this;
        }

        public Criteria andBerthingTimeLessThan(Date value) {
            addCriterion("berthing_time <", value, "berthingTime");
            return (Criteria) this;
        }

        public Criteria andBerthingTimeLessThanOrEqualTo(Date value) {
            addCriterion("berthing_time <=", value, "berthingTime");
            return (Criteria) this;
        }

        public Criteria andBerthingTimeIn(List<Date> values) {
            addCriterion("berthing_time in", values, "berthingTime");
            return (Criteria) this;
        }

        public Criteria andBerthingTimeNotIn(List<Date> values) {
            addCriterion("berthing_time not in", values, "berthingTime");
            return (Criteria) this;
        }

        public Criteria andBerthingTimeBetween(Date value1, Date value2) {
            addCriterion("berthing_time between", value1, value2, "berthingTime");
            return (Criteria) this;
        }

        public Criteria andBerthingTimeNotBetween(Date value1, Date value2) {
            addCriterion("berthing_time not between", value1, value2, "berthingTime");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadIsNull() {
            addCriterion("load_unload is null");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadIsNotNull() {
            addCriterion("load_unload is not null");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadEqualTo(Integer value) {
            addCriterion("load_unload =", value, "loadUnload");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadNotEqualTo(Integer value) {
            addCriterion("load_unload <>", value, "loadUnload");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadGreaterThan(Integer value) {
            addCriterion("load_unload >", value, "loadUnload");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadGreaterThanOrEqualTo(Integer value) {
            addCriterion("load_unload >=", value, "loadUnload");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadLessThan(Integer value) {
            addCriterion("load_unload <", value, "loadUnload");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadLessThanOrEqualTo(Integer value) {
            addCriterion("load_unload <=", value, "loadUnload");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadIn(List<Integer> values) {
            addCriterion("load_unload in", values, "loadUnload");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadNotIn(List<Integer> values) {
            addCriterion("load_unload not in", values, "loadUnload");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadBetween(Integer value1, Integer value2) {
            addCriterion("load_unload between", value1, value2, "loadUnload");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadNotBetween(Integer value1, Integer value2) {
            addCriterion("load_unload not between", value1, value2, "loadUnload");
            return (Criteria) this;
        }

        public Criteria andTransportModeIsNull() {
            addCriterion("transport_mode is null");
            return (Criteria) this;
        }

        public Criteria andTransportModeIsNotNull() {
            addCriterion("transport_mode is not null");
            return (Criteria) this;
        }

        public Criteria andTransportModeEqualTo(String value) {
            addCriterion("transport_mode =", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeNotEqualTo(String value) {
            addCriterion("transport_mode <>", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeGreaterThan(String value) {
            addCriterion("transport_mode >", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeGreaterThanOrEqualTo(String value) {
            addCriterion("transport_mode >=", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeLessThan(String value) {
            addCriterion("transport_mode <", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeLessThanOrEqualTo(String value) {
            addCriterion("transport_mode <=", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeLike(String value) {
            addCriterion("transport_mode like", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeNotLike(String value) {
            addCriterion("transport_mode not like", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeIn(List<String> values) {
            addCriterion("transport_mode in", values, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeNotIn(List<String> values) {
            addCriterion("transport_mode not in", values, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeBetween(String value1, String value2) {
            addCriterion("transport_mode between", value1, value2, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeNotBetween(String value1, String value2) {
            addCriterion("transport_mode not between", value1, value2, "transportMode");
            return (Criteria) this;
        }

        public Criteria andLastPortIsNull() {
            addCriterion("last_port is null");
            return (Criteria) this;
        }

        public Criteria andLastPortIsNotNull() {
            addCriterion("last_port is not null");
            return (Criteria) this;
        }

        public Criteria andLastPortEqualTo(String value) {
            addCriterion("last_port =", value, "lastPort");
            return (Criteria) this;
        }

        public Criteria andLastPortNotEqualTo(String value) {
            addCriterion("last_port <>", value, "lastPort");
            return (Criteria) this;
        }

        public Criteria andLastPortGreaterThan(String value) {
            addCriterion("last_port >", value, "lastPort");
            return (Criteria) this;
        }

        public Criteria andLastPortGreaterThanOrEqualTo(String value) {
            addCriterion("last_port >=", value, "lastPort");
            return (Criteria) this;
        }

        public Criteria andLastPortLessThan(String value) {
            addCriterion("last_port <", value, "lastPort");
            return (Criteria) this;
        }

        public Criteria andLastPortLessThanOrEqualTo(String value) {
            addCriterion("last_port <=", value, "lastPort");
            return (Criteria) this;
        }

        public Criteria andLastPortLike(String value) {
            addCriterion("last_port like", value, "lastPort");
            return (Criteria) this;
        }

        public Criteria andLastPortNotLike(String value) {
            addCriterion("last_port not like", value, "lastPort");
            return (Criteria) this;
        }

        public Criteria andLastPortIn(List<String> values) {
            addCriterion("last_port in", values, "lastPort");
            return (Criteria) this;
        }

        public Criteria andLastPortNotIn(List<String> values) {
            addCriterion("last_port not in", values, "lastPort");
            return (Criteria) this;
        }

        public Criteria andLastPortBetween(String value1, String value2) {
            addCriterion("last_port between", value1, value2, "lastPort");
            return (Criteria) this;
        }

        public Criteria andLastPortNotBetween(String value1, String value2) {
            addCriterion("last_port not between", value1, value2, "lastPort");
            return (Criteria) this;
        }

        public Criteria andNextPortIsNull() {
            addCriterion("next_port is null");
            return (Criteria) this;
        }

        public Criteria andNextPortIsNotNull() {
            addCriterion("next_port is not null");
            return (Criteria) this;
        }

        public Criteria andNextPortEqualTo(String value) {
            addCriterion("next_port =", value, "nextPort");
            return (Criteria) this;
        }

        public Criteria andNextPortNotEqualTo(String value) {
            addCriterion("next_port <>", value, "nextPort");
            return (Criteria) this;
        }

        public Criteria andNextPortGreaterThan(String value) {
            addCriterion("next_port >", value, "nextPort");
            return (Criteria) this;
        }

        public Criteria andNextPortGreaterThanOrEqualTo(String value) {
            addCriterion("next_port >=", value, "nextPort");
            return (Criteria) this;
        }

        public Criteria andNextPortLessThan(String value) {
            addCriterion("next_port <", value, "nextPort");
            return (Criteria) this;
        }

        public Criteria andNextPortLessThanOrEqualTo(String value) {
            addCriterion("next_port <=", value, "nextPort");
            return (Criteria) this;
        }

        public Criteria andNextPortLike(String value) {
            addCriterion("next_port like", value, "nextPort");
            return (Criteria) this;
        }

        public Criteria andNextPortNotLike(String value) {
            addCriterion("next_port not like", value, "nextPort");
            return (Criteria) this;
        }

        public Criteria andNextPortIn(List<String> values) {
            addCriterion("next_port in", values, "nextPort");
            return (Criteria) this;
        }

        public Criteria andNextPortNotIn(List<String> values) {
            addCriterion("next_port not in", values, "nextPort");
            return (Criteria) this;
        }

        public Criteria andNextPortBetween(String value1, String value2) {
            addCriterion("next_port between", value1, value2, "nextPort");
            return (Criteria) this;
        }

        public Criteria andNextPortNotBetween(String value1, String value2) {
            addCriterion("next_port not between", value1, value2, "nextPort");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadCategoryIsNull() {
            addCriterion("load_unload_category is null");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadCategoryIsNotNull() {
            addCriterion("load_unload_category is not null");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadCategoryEqualTo(Integer value) {
            addCriterion("load_unload_category =", value, "loadUnloadCategory");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadCategoryNotEqualTo(Integer value) {
            addCriterion("load_unload_category <>", value, "loadUnloadCategory");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadCategoryGreaterThan(Integer value) {
            addCriterion("load_unload_category >", value, "loadUnloadCategory");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("load_unload_category >=", value, "loadUnloadCategory");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadCategoryLessThan(Integer value) {
            addCriterion("load_unload_category <", value, "loadUnloadCategory");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("load_unload_category <=", value, "loadUnloadCategory");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadCategoryIn(List<Integer> values) {
            addCriterion("load_unload_category in", values, "loadUnloadCategory");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadCategoryNotIn(List<Integer> values) {
            addCriterion("load_unload_category not in", values, "loadUnloadCategory");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadCategoryBetween(Integer value1, Integer value2) {
            addCriterion("load_unload_category between", value1, value2, "loadUnloadCategory");
            return (Criteria) this;
        }

        public Criteria andLoadUnloadCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("load_unload_category not between", value1, value2, "loadUnloadCategory");
            return (Criteria) this;
        }

        public Criteria andReservoirAreaIsNull() {
            addCriterion("reservoir_area is null");
            return (Criteria) this;
        }

        public Criteria andReservoirAreaIsNotNull() {
            addCriterion("reservoir_area is not null");
            return (Criteria) this;
        }

        public Criteria andReservoirAreaEqualTo(String value) {
            addCriterion("reservoir_area =", value, "reservoirArea");
            return (Criteria) this;
        }

        public Criteria andReservoirAreaNotEqualTo(String value) {
            addCriterion("reservoir_area <>", value, "reservoirArea");
            return (Criteria) this;
        }

        public Criteria andReservoirAreaGreaterThan(String value) {
            addCriterion("reservoir_area >", value, "reservoirArea");
            return (Criteria) this;
        }

        public Criteria andReservoirAreaGreaterThanOrEqualTo(String value) {
            addCriterion("reservoir_area >=", value, "reservoirArea");
            return (Criteria) this;
        }

        public Criteria andReservoirAreaLessThan(String value) {
            addCriterion("reservoir_area <", value, "reservoirArea");
            return (Criteria) this;
        }

        public Criteria andReservoirAreaLessThanOrEqualTo(String value) {
            addCriterion("reservoir_area <=", value, "reservoirArea");
            return (Criteria) this;
        }

        public Criteria andReservoirAreaLike(String value) {
            addCriterion("reservoir_area like", value, "reservoirArea");
            return (Criteria) this;
        }

        public Criteria andReservoirAreaNotLike(String value) {
            addCriterion("reservoir_area not like", value, "reservoirArea");
            return (Criteria) this;
        }

        public Criteria andReservoirAreaIn(List<String> values) {
            addCriterion("reservoir_area in", values, "reservoirArea");
            return (Criteria) this;
        }

        public Criteria andReservoirAreaNotIn(List<String> values) {
            addCriterion("reservoir_area not in", values, "reservoirArea");
            return (Criteria) this;
        }

        public Criteria andReservoirAreaBetween(String value1, String value2) {
            addCriterion("reservoir_area between", value1, value2, "reservoirArea");
            return (Criteria) this;
        }

        public Criteria andReservoirAreaNotBetween(String value1, String value2) {
            addCriterion("reservoir_area not between", value1, value2, "reservoirArea");
            return (Criteria) this;
        }

        public Criteria andWharfIsNull() {
            addCriterion("wharf is null");
            return (Criteria) this;
        }

        public Criteria andWharfIsNotNull() {
            addCriterion("wharf is not null");
            return (Criteria) this;
        }

        public Criteria andWharfEqualTo(String value) {
            addCriterion("wharf =", value, "wharf");
            return (Criteria) this;
        }

        public Criteria andWharfNotEqualTo(String value) {
            addCriterion("wharf <>", value, "wharf");
            return (Criteria) this;
        }

        public Criteria andWharfGreaterThan(String value) {
            addCriterion("wharf >", value, "wharf");
            return (Criteria) this;
        }

        public Criteria andWharfGreaterThanOrEqualTo(String value) {
            addCriterion("wharf >=", value, "wharf");
            return (Criteria) this;
        }

        public Criteria andWharfLessThan(String value) {
            addCriterion("wharf <", value, "wharf");
            return (Criteria) this;
        }

        public Criteria andWharfLessThanOrEqualTo(String value) {
            addCriterion("wharf <=", value, "wharf");
            return (Criteria) this;
        }

        public Criteria andWharfLike(String value) {
            addCriterion("wharf like", value, "wharf");
            return (Criteria) this;
        }

        public Criteria andWharfNotLike(String value) {
            addCriterion("wharf not like", value, "wharf");
            return (Criteria) this;
        }

        public Criteria andWharfIn(List<String> values) {
            addCriterion("wharf in", values, "wharf");
            return (Criteria) this;
        }

        public Criteria andWharfNotIn(List<String> values) {
            addCriterion("wharf not in", values, "wharf");
            return (Criteria) this;
        }

        public Criteria andWharfBetween(String value1, String value2) {
            addCriterion("wharf between", value1, value2, "wharf");
            return (Criteria) this;
        }

        public Criteria andWharfNotBetween(String value1, String value2) {
            addCriterion("wharf not between", value1, value2, "wharf");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andBerthIsNull() {
            addCriterion("berth is null");
            return (Criteria) this;
        }

        public Criteria andBerthIsNotNull() {
            addCriterion("berth is not null");
            return (Criteria) this;
        }

        public Criteria andBerthEqualTo(String value) {
            addCriterion("berth =", value, "berth");
            return (Criteria) this;
        }

        public Criteria andBerthNotEqualTo(String value) {
            addCriterion("berth <>", value, "berth");
            return (Criteria) this;
        }

        public Criteria andBerthGreaterThan(String value) {
            addCriterion("berth >", value, "berth");
            return (Criteria) this;
        }

        public Criteria andBerthGreaterThanOrEqualTo(String value) {
            addCriterion("berth >=", value, "berth");
            return (Criteria) this;
        }

        public Criteria andBerthLessThan(String value) {
            addCriterion("berth <", value, "berth");
            return (Criteria) this;
        }

        public Criteria andBerthLessThanOrEqualTo(String value) {
            addCriterion("berth <=", value, "berth");
            return (Criteria) this;
        }

        public Criteria andBerthLike(String value) {
            addCriterion("berth like", value, "berth");
            return (Criteria) this;
        }

        public Criteria andBerthNotLike(String value) {
            addCriterion("berth not like", value, "berth");
            return (Criteria) this;
        }

        public Criteria andBerthIn(List<String> values) {
            addCriterion("berth in", values, "berth");
            return (Criteria) this;
        }

        public Criteria andBerthNotIn(List<String> values) {
            addCriterion("berth not in", values, "berth");
            return (Criteria) this;
        }

        public Criteria andBerthBetween(String value1, String value2) {
            addCriterion("berth between", value1, value2, "berth");
            return (Criteria) this;
        }

        public Criteria andBerthNotBetween(String value1, String value2) {
            addCriterion("berth not between", value1, value2, "berth");
            return (Criteria) this;
        }

        public Criteria andWaterDiversionTugIsNull() {
            addCriterion("water_diversion_tug is null");
            return (Criteria) this;
        }

        public Criteria andWaterDiversionTugIsNotNull() {
            addCriterion("water_diversion_tug is not null");
            return (Criteria) this;
        }

        public Criteria andWaterDiversionTugEqualTo(Integer value) {
            addCriterion("water_diversion_tug =", value, "waterDiversionTug");
            return (Criteria) this;
        }

        public Criteria andWaterDiversionTugNotEqualTo(Integer value) {
            addCriterion("water_diversion_tug <>", value, "waterDiversionTug");
            return (Criteria) this;
        }

        public Criteria andWaterDiversionTugGreaterThan(Integer value) {
            addCriterion("water_diversion_tug >", value, "waterDiversionTug");
            return (Criteria) this;
        }

        public Criteria andWaterDiversionTugGreaterThanOrEqualTo(Integer value) {
            addCriterion("water_diversion_tug >=", value, "waterDiversionTug");
            return (Criteria) this;
        }

        public Criteria andWaterDiversionTugLessThan(Integer value) {
            addCriterion("water_diversion_tug <", value, "waterDiversionTug");
            return (Criteria) this;
        }

        public Criteria andWaterDiversionTugLessThanOrEqualTo(Integer value) {
            addCriterion("water_diversion_tug <=", value, "waterDiversionTug");
            return (Criteria) this;
        }

        public Criteria andWaterDiversionTugIn(List<Integer> values) {
            addCriterion("water_diversion_tug in", values, "waterDiversionTug");
            return (Criteria) this;
        }

        public Criteria andWaterDiversionTugNotIn(List<Integer> values) {
            addCriterion("water_diversion_tug not in", values, "waterDiversionTug");
            return (Criteria) this;
        }

        public Criteria andWaterDiversionTugBetween(Integer value1, Integer value2) {
            addCriterion("water_diversion_tug between", value1, value2, "waterDiversionTug");
            return (Criteria) this;
        }

        public Criteria andWaterDiversionTugNotBetween(Integer value1, Integer value2) {
            addCriterion("water_diversion_tug not between", value1, value2, "waterDiversionTug");
            return (Criteria) this;
        }

        public Criteria andReservoirShippingFreightForwardingIsNull() {
            addCriterion("reservoir_shipping_freight_forwarding is null");
            return (Criteria) this;
        }

        public Criteria andReservoirShippingFreightForwardingIsNotNull() {
            addCriterion("reservoir_shipping_freight_forwarding is not null");
            return (Criteria) this;
        }

        public Criteria andReservoirShippingFreightForwardingEqualTo(Integer value) {
            addCriterion("reservoir_shipping_freight_forwarding =", value, "reservoirShippingFreightForwarding");
            return (Criteria) this;
        }

        public Criteria andReservoirShippingFreightForwardingNotEqualTo(Integer value) {
            addCriterion("reservoir_shipping_freight_forwarding <>", value, "reservoirShippingFreightForwarding");
            return (Criteria) this;
        }

        public Criteria andReservoirShippingFreightForwardingGreaterThan(Integer value) {
            addCriterion("reservoir_shipping_freight_forwarding >", value, "reservoirShippingFreightForwarding");
            return (Criteria) this;
        }

        public Criteria andReservoirShippingFreightForwardingGreaterThanOrEqualTo(Integer value) {
            addCriterion("reservoir_shipping_freight_forwarding >=", value, "reservoirShippingFreightForwarding");
            return (Criteria) this;
        }

        public Criteria andReservoirShippingFreightForwardingLessThan(Integer value) {
            addCriterion("reservoir_shipping_freight_forwarding <", value, "reservoirShippingFreightForwarding");
            return (Criteria) this;
        }

        public Criteria andReservoirShippingFreightForwardingLessThanOrEqualTo(Integer value) {
            addCriterion("reservoir_shipping_freight_forwarding <=", value, "reservoirShippingFreightForwarding");
            return (Criteria) this;
        }

        public Criteria andReservoirShippingFreightForwardingIn(List<Integer> values) {
            addCriterion("reservoir_shipping_freight_forwarding in", values, "reservoirShippingFreightForwarding");
            return (Criteria) this;
        }

        public Criteria andReservoirShippingFreightForwardingNotIn(List<Integer> values) {
            addCriterion("reservoir_shipping_freight_forwarding not in", values, "reservoirShippingFreightForwarding");
            return (Criteria) this;
        }

        public Criteria andReservoirShippingFreightForwardingBetween(Integer value1, Integer value2) {
            addCriterion("reservoir_shipping_freight_forwarding between", value1, value2, "reservoirShippingFreightForwarding");
            return (Criteria) this;
        }

        public Criteria andReservoirShippingFreightForwardingNotBetween(Integer value1, Integer value2) {
            addCriterion("reservoir_shipping_freight_forwarding not between", value1, value2, "reservoirShippingFreightForwarding");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIsNull() {
            addCriterion("arrival_time is null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIsNotNull() {
            addCriterion("arrival_time is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeEqualTo(Date value) {
            addCriterion("arrival_time =", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotEqualTo(Date value) {
            addCriterion("arrival_time <>", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeGreaterThan(Date value) {
            addCriterion("arrival_time >", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("arrival_time >=", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLessThan(Date value) {
            addCriterion("arrival_time <", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLessThanOrEqualTo(Date value) {
            addCriterion("arrival_time <=", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIn(List<Date> values) {
            addCriterion("arrival_time in", values, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotIn(List<Date> values) {
            addCriterion("arrival_time not in", values, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeBetween(Date value1, Date value2) {
            addCriterion("arrival_time between", value1, value2, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotBetween(Date value1, Date value2) {
            addCriterion("arrival_time not between", value1, value2, "arrivalTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}