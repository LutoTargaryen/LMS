package com.second.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SchedulingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchedulingExample() {
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

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSchedulingidIsNull() {
            addCriterion("SchedulingID is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingidIsNotNull() {
            addCriterion("SchedulingID is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingidEqualTo(Integer value) {
            addCriterion("SchedulingID =", value, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidNotEqualTo(Integer value) {
            addCriterion("SchedulingID <>", value, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidGreaterThan(Integer value) {
            addCriterion("SchedulingID >", value, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SchedulingID >=", value, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidLessThan(Integer value) {
            addCriterion("SchedulingID <", value, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidLessThanOrEqualTo(Integer value) {
            addCriterion("SchedulingID <=", value, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidIn(List<Integer> values) {
            addCriterion("SchedulingID in", values, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidNotIn(List<Integer> values) {
            addCriterion("SchedulingID not in", values, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidBetween(Integer value1, Integer value2) {
            addCriterion("SchedulingID between", value1, value2, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidNotBetween(Integer value1, Integer value2) {
            addCriterion("SchedulingID not between", value1, value2, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("StartTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("StartTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("StartTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("StartTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("StartTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("StartTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("StartTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("StartTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("StartTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("StartTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("StartTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("StartTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andFkCarriersidIsNull() {
            addCriterion("FK_CarriersID is null");
            return (Criteria) this;
        }

        public Criteria andFkCarriersidIsNotNull() {
            addCriterion("FK_CarriersID is not null");
            return (Criteria) this;
        }

        public Criteria andFkCarriersidEqualTo(Integer value) {
            addCriterion("FK_CarriersID =", value, "fkCarriersid");
            return (Criteria) this;
        }

        public Criteria andFkCarriersidNotEqualTo(Integer value) {
            addCriterion("FK_CarriersID <>", value, "fkCarriersid");
            return (Criteria) this;
        }

        public Criteria andFkCarriersidGreaterThan(Integer value) {
            addCriterion("FK_CarriersID >", value, "fkCarriersid");
            return (Criteria) this;
        }

        public Criteria andFkCarriersidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FK_CarriersID >=", value, "fkCarriersid");
            return (Criteria) this;
        }

        public Criteria andFkCarriersidLessThan(Integer value) {
            addCriterion("FK_CarriersID <", value, "fkCarriersid");
            return (Criteria) this;
        }

        public Criteria andFkCarriersidLessThanOrEqualTo(Integer value) {
            addCriterion("FK_CarriersID <=", value, "fkCarriersid");
            return (Criteria) this;
        }

        public Criteria andFkCarriersidIn(List<Integer> values) {
            addCriterion("FK_CarriersID in", values, "fkCarriersid");
            return (Criteria) this;
        }

        public Criteria andFkCarriersidNotIn(List<Integer> values) {
            addCriterion("FK_CarriersID not in", values, "fkCarriersid");
            return (Criteria) this;
        }

        public Criteria andFkCarriersidBetween(Integer value1, Integer value2) {
            addCriterion("FK_CarriersID between", value1, value2, "fkCarriersid");
            return (Criteria) this;
        }

        public Criteria andFkCarriersidNotBetween(Integer value1, Integer value2) {
            addCriterion("FK_CarriersID not between", value1, value2, "fkCarriersid");
            return (Criteria) this;
        }

        public Criteria andFkTruckidIsNull() {
            addCriterion("FK_TruckID is null");
            return (Criteria) this;
        }

        public Criteria andFkTruckidIsNotNull() {
            addCriterion("FK_TruckID is not null");
            return (Criteria) this;
        }

        public Criteria andFkTruckidEqualTo(Integer value) {
            addCriterion("FK_TruckID =", value, "fkTruckid");
            return (Criteria) this;
        }

        public Criteria andFkTruckidNotEqualTo(Integer value) {
            addCriterion("FK_TruckID <>", value, "fkTruckid");
            return (Criteria) this;
        }

        public Criteria andFkTruckidGreaterThan(Integer value) {
            addCriterion("FK_TruckID >", value, "fkTruckid");
            return (Criteria) this;
        }

        public Criteria andFkTruckidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FK_TruckID >=", value, "fkTruckid");
            return (Criteria) this;
        }

        public Criteria andFkTruckidLessThan(Integer value) {
            addCriterion("FK_TruckID <", value, "fkTruckid");
            return (Criteria) this;
        }

        public Criteria andFkTruckidLessThanOrEqualTo(Integer value) {
            addCriterion("FK_TruckID <=", value, "fkTruckid");
            return (Criteria) this;
        }

        public Criteria andFkTruckidIn(List<Integer> values) {
            addCriterion("FK_TruckID in", values, "fkTruckid");
            return (Criteria) this;
        }

        public Criteria andFkTruckidNotIn(List<Integer> values) {
            addCriterion("FK_TruckID not in", values, "fkTruckid");
            return (Criteria) this;
        }

        public Criteria andFkTruckidBetween(Integer value1, Integer value2) {
            addCriterion("FK_TruckID between", value1, value2, "fkTruckid");
            return (Criteria) this;
        }

        public Criteria andFkTruckidNotBetween(Integer value1, Integer value2) {
            addCriterion("FK_TruckID not between", value1, value2, "fkTruckid");
            return (Criteria) this;
        }

        public Criteria andOilcostIsNull() {
            addCriterion("OilCost is null");
            return (Criteria) this;
        }

        public Criteria andOilcostIsNotNull() {
            addCriterion("OilCost is not null");
            return (Criteria) this;
        }

        public Criteria andOilcostEqualTo(Float value) {
            addCriterion("OilCost =", value, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostNotEqualTo(Float value) {
            addCriterion("OilCost <>", value, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostGreaterThan(Float value) {
            addCriterion("OilCost >", value, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostGreaterThanOrEqualTo(Float value) {
            addCriterion("OilCost >=", value, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostLessThan(Float value) {
            addCriterion("OilCost <", value, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostLessThanOrEqualTo(Float value) {
            addCriterion("OilCost <=", value, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostIn(List<Float> values) {
            addCriterion("OilCost in", values, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostNotIn(List<Float> values) {
            addCriterion("OilCost not in", values, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostBetween(Float value1, Float value2) {
            addCriterion("OilCost between", value1, value2, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostNotBetween(Float value1, Float value2) {
            addCriterion("OilCost not between", value1, value2, "oilcost");
            return (Criteria) this;
        }

        public Criteria andTollIsNull() {
            addCriterion("Toll is null");
            return (Criteria) this;
        }

        public Criteria andTollIsNotNull() {
            addCriterion("Toll is not null");
            return (Criteria) this;
        }

        public Criteria andTollEqualTo(Float value) {
            addCriterion("Toll =", value, "toll");
            return (Criteria) this;
        }

        public Criteria andTollNotEqualTo(Float value) {
            addCriterion("Toll <>", value, "toll");
            return (Criteria) this;
        }

        public Criteria andTollGreaterThan(Float value) {
            addCriterion("Toll >", value, "toll");
            return (Criteria) this;
        }

        public Criteria andTollGreaterThanOrEqualTo(Float value) {
            addCriterion("Toll >=", value, "toll");
            return (Criteria) this;
        }

        public Criteria andTollLessThan(Float value) {
            addCriterion("Toll <", value, "toll");
            return (Criteria) this;
        }

        public Criteria andTollLessThanOrEqualTo(Float value) {
            addCriterion("Toll <=", value, "toll");
            return (Criteria) this;
        }

        public Criteria andTollIn(List<Float> values) {
            addCriterion("Toll in", values, "toll");
            return (Criteria) this;
        }

        public Criteria andTollNotIn(List<Float> values) {
            addCriterion("Toll not in", values, "toll");
            return (Criteria) this;
        }

        public Criteria andTollBetween(Float value1, Float value2) {
            addCriterion("Toll between", value1, value2, "toll");
            return (Criteria) this;
        }

        public Criteria andTollNotBetween(Float value1, Float value2) {
            addCriterion("Toll not between", value1, value2, "toll");
            return (Criteria) this;
        }

        public Criteria andFineIsNull() {
            addCriterion("Fine is null");
            return (Criteria) this;
        }

        public Criteria andFineIsNotNull() {
            addCriterion("Fine is not null");
            return (Criteria) this;
        }

        public Criteria andFineEqualTo(Float value) {
            addCriterion("Fine =", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotEqualTo(Float value) {
            addCriterion("Fine <>", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineGreaterThan(Float value) {
            addCriterion("Fine >", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineGreaterThanOrEqualTo(Float value) {
            addCriterion("Fine >=", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineLessThan(Float value) {
            addCriterion("Fine <", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineLessThanOrEqualTo(Float value) {
            addCriterion("Fine <=", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineIn(List<Float> values) {
            addCriterion("Fine in", values, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotIn(List<Float> values) {
            addCriterion("Fine not in", values, "fine");
            return (Criteria) this;
        }

        public Criteria andFineBetween(Float value1, Float value2) {
            addCriterion("Fine between", value1, value2, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotBetween(Float value1, Float value2) {
            addCriterion("Fine not between", value1, value2, "fine");
            return (Criteria) this;
        }

        public Criteria andOthercostIsNull() {
            addCriterion("OtherCost is null");
            return (Criteria) this;
        }

        public Criteria andOthercostIsNotNull() {
            addCriterion("OtherCost is not null");
            return (Criteria) this;
        }

        public Criteria andOthercostEqualTo(Float value) {
            addCriterion("OtherCost =", value, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostNotEqualTo(Float value) {
            addCriterion("OtherCost <>", value, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostGreaterThan(Float value) {
            addCriterion("OtherCost >", value, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostGreaterThanOrEqualTo(Float value) {
            addCriterion("OtherCost >=", value, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostLessThan(Float value) {
            addCriterion("OtherCost <", value, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostLessThanOrEqualTo(Float value) {
            addCriterion("OtherCost <=", value, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostIn(List<Float> values) {
            addCriterion("OtherCost in", values, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostNotIn(List<Float> values) {
            addCriterion("OtherCost not in", values, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostBetween(Float value1, Float value2) {
            addCriterion("OtherCost between", value1, value2, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostNotBetween(Float value1, Float value2) {
            addCriterion("OtherCost not between", value1, value2, "othercost");
            return (Criteria) this;
        }

        public Criteria andTotalcostIsNull() {
            addCriterion("TotalCost is null");
            return (Criteria) this;
        }

        public Criteria andTotalcostIsNotNull() {
            addCriterion("TotalCost is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcostEqualTo(Float value) {
            addCriterion("TotalCost =", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotEqualTo(Float value) {
            addCriterion("TotalCost <>", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostGreaterThan(Float value) {
            addCriterion("TotalCost >", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostGreaterThanOrEqualTo(Float value) {
            addCriterion("TotalCost >=", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostLessThan(Float value) {
            addCriterion("TotalCost <", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostLessThanOrEqualTo(Float value) {
            addCriterion("TotalCost <=", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostIn(List<Float> values) {
            addCriterion("TotalCost in", values, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotIn(List<Float> values) {
            addCriterion("TotalCost not in", values, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostBetween(Float value1, Float value2) {
            addCriterion("TotalCost between", value1, value2, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotBetween(Float value1, Float value2) {
            addCriterion("TotalCost not between", value1, value2, "totalcost");
            return (Criteria) this;
        }

        public Criteria andFkUseridIsNull() {
            addCriterion("FK_UserID is null");
            return (Criteria) this;
        }

        public Criteria andFkUseridIsNotNull() {
            addCriterion("FK_UserID is not null");
            return (Criteria) this;
        }

        public Criteria andFkUseridEqualTo(Integer value) {
            addCriterion("FK_UserID =", value, "fkUserid");
            return (Criteria) this;
        }

        public Criteria andFkUseridNotEqualTo(Integer value) {
            addCriterion("FK_UserID <>", value, "fkUserid");
            return (Criteria) this;
        }

        public Criteria andFkUseridGreaterThan(Integer value) {
            addCriterion("FK_UserID >", value, "fkUserid");
            return (Criteria) this;
        }

        public Criteria andFkUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("FK_UserID >=", value, "fkUserid");
            return (Criteria) this;
        }

        public Criteria andFkUseridLessThan(Integer value) {
            addCriterion("FK_UserID <", value, "fkUserid");
            return (Criteria) this;
        }

        public Criteria andFkUseridLessThanOrEqualTo(Integer value) {
            addCriterion("FK_UserID <=", value, "fkUserid");
            return (Criteria) this;
        }

        public Criteria andFkUseridIn(List<Integer> values) {
            addCriterion("FK_UserID in", values, "fkUserid");
            return (Criteria) this;
        }

        public Criteria andFkUseridNotIn(List<Integer> values) {
            addCriterion("FK_UserID not in", values, "fkUserid");
            return (Criteria) this;
        }

        public Criteria andFkUseridBetween(Integer value1, Integer value2) {
            addCriterion("FK_UserID between", value1, value2, "fkUserid");
            return (Criteria) this;
        }

        public Criteria andFkUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("FK_UserID not between", value1, value2, "fkUserid");
            return (Criteria) this;
        }

        public Criteria andCheckintimeIsNull() {
            addCriterion("CheckInTime is null");
            return (Criteria) this;
        }

        public Criteria andCheckintimeIsNotNull() {
            addCriterion("CheckInTime is not null");
            return (Criteria) this;
        }

        public Criteria andCheckintimeEqualTo(Date value) {
            addCriterion("CheckInTime =", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeNotEqualTo(Date value) {
            addCriterion("CheckInTime <>", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeGreaterThan(Date value) {
            addCriterion("CheckInTime >", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CheckInTime >=", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeLessThan(Date value) {
            addCriterion("CheckInTime <", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeLessThanOrEqualTo(Date value) {
            addCriterion("CheckInTime <=", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeIn(List<Date> values) {
            addCriterion("CheckInTime in", values, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeNotIn(List<Date> values) {
            addCriterion("CheckInTime not in", values, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeBetween(Date value1, Date value2) {
            addCriterion("CheckInTime between", value1, value2, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeNotBetween(Date value1, Date value2) {
            addCriterion("CheckInTime not between", value1, value2, "checkintime");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("IsDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("IsDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Integer value) {
            addCriterion("IsDelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Integer value) {
            addCriterion("IsDelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Integer value) {
            addCriterion("IsDelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsDelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Integer value) {
            addCriterion("IsDelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("IsDelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Integer> values) {
            addCriterion("IsDelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Integer> values) {
            addCriterion("IsDelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("IsDelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("IsDelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andAltertimeIsNull() {
            addCriterion("AlterTime is null");
            return (Criteria) this;
        }

        public Criteria andAltertimeIsNotNull() {
            addCriterion("AlterTime is not null");
            return (Criteria) this;
        }

        public Criteria andAltertimeEqualTo(Date value) {
            addCriterion("AlterTime =", value, "altertime");
            return (Criteria) this;
        }

        public Criteria andAltertimeNotEqualTo(Date value) {
            addCriterion("AlterTime <>", value, "altertime");
            return (Criteria) this;
        }

        public Criteria andAltertimeGreaterThan(Date value) {
            addCriterion("AlterTime >", value, "altertime");
            return (Criteria) this;
        }

        public Criteria andAltertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AlterTime >=", value, "altertime");
            return (Criteria) this;
        }

        public Criteria andAltertimeLessThan(Date value) {
            addCriterion("AlterTime <", value, "altertime");
            return (Criteria) this;
        }

        public Criteria andAltertimeLessThanOrEqualTo(Date value) {
            addCriterion("AlterTime <=", value, "altertime");
            return (Criteria) this;
        }

        public Criteria andAltertimeIn(List<Date> values) {
            addCriterion("AlterTime in", values, "altertime");
            return (Criteria) this;
        }

        public Criteria andAltertimeNotIn(List<Date> values) {
            addCriterion("AlterTime not in", values, "altertime");
            return (Criteria) this;
        }

        public Criteria andAltertimeBetween(Date value1, Date value2) {
            addCriterion("AlterTime between", value1, value2, "altertime");
            return (Criteria) this;
        }

        public Criteria andAltertimeNotBetween(Date value1, Date value2) {
            addCriterion("AlterTime not between", value1, value2, "altertime");
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