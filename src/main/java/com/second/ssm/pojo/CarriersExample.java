package com.second.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarriersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarriersExample() {
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

        public Criteria andCarriersidIsNull() {
            addCriterion("CarriersID is null");
            return (Criteria) this;
        }

        public Criteria andCarriersidIsNotNull() {
            addCriterion("CarriersID is not null");
            return (Criteria) this;
        }

        public Criteria andCarriersidEqualTo(Integer value) {
            addCriterion("CarriersID =", value, "carriersid");
            return (Criteria) this;
        }

        public Criteria andCarriersidNotEqualTo(Integer value) {
            addCriterion("CarriersID <>", value, "carriersid");
            return (Criteria) this;
        }

        public Criteria andCarriersidGreaterThan(Integer value) {
            addCriterion("CarriersID >", value, "carriersid");
            return (Criteria) this;
        }

        public Criteria andCarriersidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CarriersID >=", value, "carriersid");
            return (Criteria) this;
        }

        public Criteria andCarriersidLessThan(Integer value) {
            addCriterion("CarriersID <", value, "carriersid");
            return (Criteria) this;
        }

        public Criteria andCarriersidLessThanOrEqualTo(Integer value) {
            addCriterion("CarriersID <=", value, "carriersid");
            return (Criteria) this;
        }

        public Criteria andCarriersidIn(List<Integer> values) {
            addCriterion("CarriersID in", values, "carriersid");
            return (Criteria) this;
        }

        public Criteria andCarriersidNotIn(List<Integer> values) {
            addCriterion("CarriersID not in", values, "carriersid");
            return (Criteria) this;
        }

        public Criteria andCarriersidBetween(Integer value1, Integer value2) {
            addCriterion("CarriersID between", value1, value2, "carriersid");
            return (Criteria) this;
        }

        public Criteria andCarriersidNotBetween(Integer value1, Integer value2) {
            addCriterion("CarriersID not between", value1, value2, "carriersid");
            return (Criteria) this;
        }

        public Criteria andSendcompanyIsNull() {
            addCriterion("SendCompany is null");
            return (Criteria) this;
        }

        public Criteria andSendcompanyIsNotNull() {
            addCriterion("SendCompany is not null");
            return (Criteria) this;
        }

        public Criteria andSendcompanyEqualTo(String value) {
            addCriterion("SendCompany =", value, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyNotEqualTo(String value) {
            addCriterion("SendCompany <>", value, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyGreaterThan(String value) {
            addCriterion("SendCompany >", value, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("SendCompany >=", value, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyLessThan(String value) {
            addCriterion("SendCompany <", value, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyLessThanOrEqualTo(String value) {
            addCriterion("SendCompany <=", value, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyLike(String value) {
            addCriterion("SendCompany like", value, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyNotLike(String value) {
            addCriterion("SendCompany not like", value, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyIn(List<String> values) {
            addCriterion("SendCompany in", values, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyNotIn(List<String> values) {
            addCriterion("SendCompany not in", values, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyBetween(String value1, String value2) {
            addCriterion("SendCompany between", value1, value2, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyNotBetween(String value1, String value2) {
            addCriterion("SendCompany not between", value1, value2, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendaddressIsNull() {
            addCriterion("SendAddress is null");
            return (Criteria) this;
        }

        public Criteria andSendaddressIsNotNull() {
            addCriterion("SendAddress is not null");
            return (Criteria) this;
        }

        public Criteria andSendaddressEqualTo(String value) {
            addCriterion("SendAddress =", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressNotEqualTo(String value) {
            addCriterion("SendAddress <>", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressGreaterThan(String value) {
            addCriterion("SendAddress >", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressGreaterThanOrEqualTo(String value) {
            addCriterion("SendAddress >=", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressLessThan(String value) {
            addCriterion("SendAddress <", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressLessThanOrEqualTo(String value) {
            addCriterion("SendAddress <=", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressLike(String value) {
            addCriterion("SendAddress like", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressNotLike(String value) {
            addCriterion("SendAddress not like", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressIn(List<String> values) {
            addCriterion("SendAddress in", values, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressNotIn(List<String> values) {
            addCriterion("SendAddress not in", values, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressBetween(String value1, String value2) {
            addCriterion("SendAddress between", value1, value2, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressNotBetween(String value1, String value2) {
            addCriterion("SendAddress not between", value1, value2, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanIsNull() {
            addCriterion("SendLinkman is null");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanIsNotNull() {
            addCriterion("SendLinkman is not null");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanEqualTo(String value) {
            addCriterion("SendLinkman =", value, "sendlinkman");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanNotEqualTo(String value) {
            addCriterion("SendLinkman <>", value, "sendlinkman");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanGreaterThan(String value) {
            addCriterion("SendLinkman >", value, "sendlinkman");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("SendLinkman >=", value, "sendlinkman");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanLessThan(String value) {
            addCriterion("SendLinkman <", value, "sendlinkman");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanLessThanOrEqualTo(String value) {
            addCriterion("SendLinkman <=", value, "sendlinkman");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanLike(String value) {
            addCriterion("SendLinkman like", value, "sendlinkman");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanNotLike(String value) {
            addCriterion("SendLinkman not like", value, "sendlinkman");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanIn(List<String> values) {
            addCriterion("SendLinkman in", values, "sendlinkman");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanNotIn(List<String> values) {
            addCriterion("SendLinkman not in", values, "sendlinkman");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanBetween(String value1, String value2) {
            addCriterion("SendLinkman between", value1, value2, "sendlinkman");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanNotBetween(String value1, String value2) {
            addCriterion("SendLinkman not between", value1, value2, "sendlinkman");
            return (Criteria) this;
        }

        public Criteria andSendphoneIsNull() {
            addCriterion("SendPhone is null");
            return (Criteria) this;
        }

        public Criteria andSendphoneIsNotNull() {
            addCriterion("SendPhone is not null");
            return (Criteria) this;
        }

        public Criteria andSendphoneEqualTo(String value) {
            addCriterion("SendPhone =", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneNotEqualTo(String value) {
            addCriterion("SendPhone <>", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneGreaterThan(String value) {
            addCriterion("SendPhone >", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneGreaterThanOrEqualTo(String value) {
            addCriterion("SendPhone >=", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneLessThan(String value) {
            addCriterion("SendPhone <", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneLessThanOrEqualTo(String value) {
            addCriterion("SendPhone <=", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneLike(String value) {
            addCriterion("SendPhone like", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneNotLike(String value) {
            addCriterion("SendPhone not like", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneIn(List<String> values) {
            addCriterion("SendPhone in", values, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneNotIn(List<String> values) {
            addCriterion("SendPhone not in", values, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneBetween(String value1, String value2) {
            addCriterion("SendPhone between", value1, value2, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneNotBetween(String value1, String value2) {
            addCriterion("SendPhone not between", value1, value2, "sendphone");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyIsNull() {
            addCriterion("ReceiveCompany is null");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyIsNotNull() {
            addCriterion("ReceiveCompany is not null");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyEqualTo(String value) {
            addCriterion("ReceiveCompany =", value, "receivecompany");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyNotEqualTo(String value) {
            addCriterion("ReceiveCompany <>", value, "receivecompany");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyGreaterThan(String value) {
            addCriterion("ReceiveCompany >", value, "receivecompany");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyGreaterThanOrEqualTo(String value) {
            addCriterion("ReceiveCompany >=", value, "receivecompany");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyLessThan(String value) {
            addCriterion("ReceiveCompany <", value, "receivecompany");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyLessThanOrEqualTo(String value) {
            addCriterion("ReceiveCompany <=", value, "receivecompany");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyLike(String value) {
            addCriterion("ReceiveCompany like", value, "receivecompany");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyNotLike(String value) {
            addCriterion("ReceiveCompany not like", value, "receivecompany");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyIn(List<String> values) {
            addCriterion("ReceiveCompany in", values, "receivecompany");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyNotIn(List<String> values) {
            addCriterion("ReceiveCompany not in", values, "receivecompany");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyBetween(String value1, String value2) {
            addCriterion("ReceiveCompany between", value1, value2, "receivecompany");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyNotBetween(String value1, String value2) {
            addCriterion("ReceiveCompany not between", value1, value2, "receivecompany");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressIsNull() {
            addCriterion("FK_ReceiveAddress is null");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressIsNotNull() {
            addCriterion("FK_ReceiveAddress is not null");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressEqualTo(String value) {
            addCriterion("FK_ReceiveAddress =", value, "fkReceiveaddress");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressNotEqualTo(String value) {
            addCriterion("FK_ReceiveAddress <>", value, "fkReceiveaddress");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressGreaterThan(String value) {
            addCriterion("FK_ReceiveAddress >", value, "fkReceiveaddress");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressGreaterThanOrEqualTo(String value) {
            addCriterion("FK_ReceiveAddress >=", value, "fkReceiveaddress");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressLessThan(String value) {
            addCriterion("FK_ReceiveAddress <", value, "fkReceiveaddress");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressLessThanOrEqualTo(String value) {
            addCriterion("FK_ReceiveAddress <=", value, "fkReceiveaddress");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressLike(String value) {
            addCriterion("FK_ReceiveAddress like", value, "fkReceiveaddress");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressNotLike(String value) {
            addCriterion("FK_ReceiveAddress not like", value, "fkReceiveaddress");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressIn(List<String> values) {
            addCriterion("FK_ReceiveAddress in", values, "fkReceiveaddress");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressNotIn(List<String> values) {
            addCriterion("FK_ReceiveAddress not in", values, "fkReceiveaddress");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressBetween(String value1, String value2) {
            addCriterion("FK_ReceiveAddress between", value1, value2, "fkReceiveaddress");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressNotBetween(String value1, String value2) {
            addCriterion("FK_ReceiveAddress not between", value1, value2, "fkReceiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanIsNull() {
            addCriterion("ReceiveLinkman is null");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanIsNotNull() {
            addCriterion("ReceiveLinkman is not null");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanEqualTo(String value) {
            addCriterion("ReceiveLinkman =", value, "receivelinkman");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanNotEqualTo(String value) {
            addCriterion("ReceiveLinkman <>", value, "receivelinkman");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanGreaterThan(String value) {
            addCriterion("ReceiveLinkman >", value, "receivelinkman");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("ReceiveLinkman >=", value, "receivelinkman");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanLessThan(String value) {
            addCriterion("ReceiveLinkman <", value, "receivelinkman");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanLessThanOrEqualTo(String value) {
            addCriterion("ReceiveLinkman <=", value, "receivelinkman");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanLike(String value) {
            addCriterion("ReceiveLinkman like", value, "receivelinkman");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanNotLike(String value) {
            addCriterion("ReceiveLinkman not like", value, "receivelinkman");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanIn(List<String> values) {
            addCriterion("ReceiveLinkman in", values, "receivelinkman");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanNotIn(List<String> values) {
            addCriterion("ReceiveLinkman not in", values, "receivelinkman");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanBetween(String value1, String value2) {
            addCriterion("ReceiveLinkman between", value1, value2, "receivelinkman");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanNotBetween(String value1, String value2) {
            addCriterion("ReceiveLinkman not between", value1, value2, "receivelinkman");
            return (Criteria) this;
        }

        public Criteria andReceivephoneIsNull() {
            addCriterion("ReceivePhone is null");
            return (Criteria) this;
        }

        public Criteria andReceivephoneIsNotNull() {
            addCriterion("ReceivePhone is not null");
            return (Criteria) this;
        }

        public Criteria andReceivephoneEqualTo(String value) {
            addCriterion("ReceivePhone =", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneNotEqualTo(String value) {
            addCriterion("ReceivePhone <>", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneGreaterThan(String value) {
            addCriterion("ReceivePhone >", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneGreaterThanOrEqualTo(String value) {
            addCriterion("ReceivePhone >=", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneLessThan(String value) {
            addCriterion("ReceivePhone <", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneLessThanOrEqualTo(String value) {
            addCriterion("ReceivePhone <=", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneLike(String value) {
            addCriterion("ReceivePhone like", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneNotLike(String value) {
            addCriterion("ReceivePhone not like", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneIn(List<String> values) {
            addCriterion("ReceivePhone in", values, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneNotIn(List<String> values) {
            addCriterion("ReceivePhone not in", values, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneBetween(String value1, String value2) {
            addCriterion("ReceivePhone between", value1, value2, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneNotBetween(String value1, String value2) {
            addCriterion("ReceivePhone not between", value1, value2, "receivephone");
            return (Criteria) this;
        }

        public Criteria andLeaverdateIsNull() {
            addCriterion("LeaverDate is null");
            return (Criteria) this;
        }

        public Criteria andLeaverdateIsNotNull() {
            addCriterion("LeaverDate is not null");
            return (Criteria) this;
        }

        public Criteria andLeaverdateEqualTo(Date value) {
            addCriterion("LeaverDate =", value, "leaverdate");
            return (Criteria) this;
        }

        public Criteria andLeaverdateNotEqualTo(Date value) {
            addCriterion("LeaverDate <>", value, "leaverdate");
            return (Criteria) this;
        }

        public Criteria andLeaverdateGreaterThan(Date value) {
            addCriterion("LeaverDate >", value, "leaverdate");
            return (Criteria) this;
        }

        public Criteria andLeaverdateGreaterThanOrEqualTo(Date value) {
            addCriterion("LeaverDate >=", value, "leaverdate");
            return (Criteria) this;
        }

        public Criteria andLeaverdateLessThan(Date value) {
            addCriterion("LeaverDate <", value, "leaverdate");
            return (Criteria) this;
        }

        public Criteria andLeaverdateLessThanOrEqualTo(Date value) {
            addCriterion("LeaverDate <=", value, "leaverdate");
            return (Criteria) this;
        }

        public Criteria andLeaverdateIn(List<Date> values) {
            addCriterion("LeaverDate in", values, "leaverdate");
            return (Criteria) this;
        }

        public Criteria andLeaverdateNotIn(List<Date> values) {
            addCriterion("LeaverDate not in", values, "leaverdate");
            return (Criteria) this;
        }

        public Criteria andLeaverdateBetween(Date value1, Date value2) {
            addCriterion("LeaverDate between", value1, value2, "leaverdate");
            return (Criteria) this;
        }

        public Criteria andLeaverdateNotBetween(Date value1, Date value2) {
            addCriterion("LeaverDate not between", value1, value2, "leaverdate");
            return (Criteria) this;
        }

        public Criteria andReceivedateIsNull() {
            addCriterion("ReceiveDate is null");
            return (Criteria) this;
        }

        public Criteria andReceivedateIsNotNull() {
            addCriterion("ReceiveDate is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedateEqualTo(Date value) {
            addCriterion("ReceiveDate =", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateNotEqualTo(Date value) {
            addCriterion("ReceiveDate <>", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateGreaterThan(Date value) {
            addCriterion("ReceiveDate >", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateGreaterThanOrEqualTo(Date value) {
            addCriterion("ReceiveDate >=", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateLessThan(Date value) {
            addCriterion("ReceiveDate <", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateLessThanOrEqualTo(Date value) {
            addCriterion("ReceiveDate <=", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateIn(List<Date> values) {
            addCriterion("ReceiveDate in", values, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateNotIn(List<Date> values) {
            addCriterion("ReceiveDate not in", values, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateBetween(Date value1, Date value2) {
            addCriterion("ReceiveDate between", value1, value2, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateNotBetween(Date value1, Date value2) {
            addCriterion("ReceiveDate not between", value1, value2, "receivedate");
            return (Criteria) this;
        }

        public Criteria andFinishedstateIsNull() {
            addCriterion("FinishedState is null");
            return (Criteria) this;
        }

        public Criteria andFinishedstateIsNotNull() {
            addCriterion("FinishedState is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedstateEqualTo(Integer value) {
            addCriterion("FinishedState =", value, "finishedstate");
            return (Criteria) this;
        }

        public Criteria andFinishedstateNotEqualTo(Integer value) {
            addCriterion("FinishedState <>", value, "finishedstate");
            return (Criteria) this;
        }

        public Criteria andFinishedstateGreaterThan(Integer value) {
            addCriterion("FinishedState >", value, "finishedstate");
            return (Criteria) this;
        }

        public Criteria andFinishedstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("FinishedState >=", value, "finishedstate");
            return (Criteria) this;
        }

        public Criteria andFinishedstateLessThan(Integer value) {
            addCriterion("FinishedState <", value, "finishedstate");
            return (Criteria) this;
        }

        public Criteria andFinishedstateLessThanOrEqualTo(Integer value) {
            addCriterion("FinishedState <=", value, "finishedstate");
            return (Criteria) this;
        }

        public Criteria andFinishedstateIn(List<Integer> values) {
            addCriterion("FinishedState in", values, "finishedstate");
            return (Criteria) this;
        }

        public Criteria andFinishedstateNotIn(List<Integer> values) {
            addCriterion("FinishedState not in", values, "finishedstate");
            return (Criteria) this;
        }

        public Criteria andFinishedstateBetween(Integer value1, Integer value2) {
            addCriterion("FinishedState between", value1, value2, "finishedstate");
            return (Criteria) this;
        }

        public Criteria andFinishedstateNotBetween(Integer value1, Integer value2) {
            addCriterion("FinishedState not between", value1, value2, "finishedstate");
            return (Criteria) this;
        }

        public Criteria andInsurancecostIsNull() {
            addCriterion("InsuranceCost is null");
            return (Criteria) this;
        }

        public Criteria andInsurancecostIsNotNull() {
            addCriterion("InsuranceCost is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancecostEqualTo(Float value) {
            addCriterion("InsuranceCost =", value, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostNotEqualTo(Float value) {
            addCriterion("InsuranceCost <>", value, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostGreaterThan(Float value) {
            addCriterion("InsuranceCost >", value, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostGreaterThanOrEqualTo(Float value) {
            addCriterion("InsuranceCost >=", value, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostLessThan(Float value) {
            addCriterion("InsuranceCost <", value, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostLessThanOrEqualTo(Float value) {
            addCriterion("InsuranceCost <=", value, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostIn(List<Float> values) {
            addCriterion("InsuranceCost in", values, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostNotIn(List<Float> values) {
            addCriterion("InsuranceCost not in", values, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostBetween(Float value1, Float value2) {
            addCriterion("InsuranceCost between", value1, value2, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostNotBetween(Float value1, Float value2) {
            addCriterion("InsuranceCost not between", value1, value2, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andTransportcostIsNull() {
            addCriterion("TransportCost is null");
            return (Criteria) this;
        }

        public Criteria andTransportcostIsNotNull() {
            addCriterion("TransportCost is not null");
            return (Criteria) this;
        }

        public Criteria andTransportcostEqualTo(Float value) {
            addCriterion("TransportCost =", value, "transportcost");
            return (Criteria) this;
        }

        public Criteria andTransportcostNotEqualTo(Float value) {
            addCriterion("TransportCost <>", value, "transportcost");
            return (Criteria) this;
        }

        public Criteria andTransportcostGreaterThan(Float value) {
            addCriterion("TransportCost >", value, "transportcost");
            return (Criteria) this;
        }

        public Criteria andTransportcostGreaterThanOrEqualTo(Float value) {
            addCriterion("TransportCost >=", value, "transportcost");
            return (Criteria) this;
        }

        public Criteria andTransportcostLessThan(Float value) {
            addCriterion("TransportCost <", value, "transportcost");
            return (Criteria) this;
        }

        public Criteria andTransportcostLessThanOrEqualTo(Float value) {
            addCriterion("TransportCost <=", value, "transportcost");
            return (Criteria) this;
        }

        public Criteria andTransportcostIn(List<Float> values) {
            addCriterion("TransportCost in", values, "transportcost");
            return (Criteria) this;
        }

        public Criteria andTransportcostNotIn(List<Float> values) {
            addCriterion("TransportCost not in", values, "transportcost");
            return (Criteria) this;
        }

        public Criteria andTransportcostBetween(Float value1, Float value2) {
            addCriterion("TransportCost between", value1, value2, "transportcost");
            return (Criteria) this;
        }

        public Criteria andTransportcostNotBetween(Float value1, Float value2) {
            addCriterion("TransportCost not between", value1, value2, "transportcost");
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