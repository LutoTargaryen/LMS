package com.second.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class ContactExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContactExample() {
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

        public Criteria andContactidIsNull() {
            addCriterion("ContactID is null");
            return (Criteria) this;
        }

        public Criteria andContactidIsNotNull() {
            addCriterion("ContactID is not null");
            return (Criteria) this;
        }

        public Criteria andContactidEqualTo(Integer value) {
            addCriterion("ContactID =", value, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidNotEqualTo(Integer value) {
            addCriterion("ContactID <>", value, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidGreaterThan(Integer value) {
            addCriterion("ContactID >", value, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ContactID >=", value, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidLessThan(Integer value) {
            addCriterion("ContactID <", value, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidLessThanOrEqualTo(Integer value) {
            addCriterion("ContactID <=", value, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidIn(List<Integer> values) {
            addCriterion("ContactID in", values, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidNotIn(List<Integer> values) {
            addCriterion("ContactID not in", values, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidBetween(Integer value1, Integer value2) {
            addCriterion("ContactID between", value1, value2, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidNotBetween(Integer value1, Integer value2) {
            addCriterion("ContactID not between", value1, value2, "contactid");
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

        public Criteria andFkDriveridIsNull() {
            addCriterion("FK_DriverID is null");
            return (Criteria) this;
        }

        public Criteria andFkDriveridIsNotNull() {
            addCriterion("FK_DriverID is not null");
            return (Criteria) this;
        }

        public Criteria andFkDriveridEqualTo(Integer value) {
            addCriterion("FK_DriverID =", value, "fkDriverid");
            return (Criteria) this;
        }

        public Criteria andFkDriveridNotEqualTo(Integer value) {
            addCriterion("FK_DriverID <>", value, "fkDriverid");
            return (Criteria) this;
        }

        public Criteria andFkDriveridGreaterThan(Integer value) {
            addCriterion("FK_DriverID >", value, "fkDriverid");
            return (Criteria) this;
        }

        public Criteria andFkDriveridGreaterThanOrEqualTo(Integer value) {
            addCriterion("FK_DriverID >=", value, "fkDriverid");
            return (Criteria) this;
        }

        public Criteria andFkDriveridLessThan(Integer value) {
            addCriterion("FK_DriverID <", value, "fkDriverid");
            return (Criteria) this;
        }

        public Criteria andFkDriveridLessThanOrEqualTo(Integer value) {
            addCriterion("FK_DriverID <=", value, "fkDriverid");
            return (Criteria) this;
        }

        public Criteria andFkDriveridIn(List<Integer> values) {
            addCriterion("FK_DriverID in", values, "fkDriverid");
            return (Criteria) this;
        }

        public Criteria andFkDriveridNotIn(List<Integer> values) {
            addCriterion("FK_DriverID not in", values, "fkDriverid");
            return (Criteria) this;
        }

        public Criteria andFkDriveridBetween(Integer value1, Integer value2) {
            addCriterion("FK_DriverID between", value1, value2, "fkDriverid");
            return (Criteria) this;
        }

        public Criteria andFkDriveridNotBetween(Integer value1, Integer value2) {
            addCriterion("FK_DriverID not between", value1, value2, "fkDriverid");
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