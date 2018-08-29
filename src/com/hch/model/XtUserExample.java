package com.hch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XtUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XtUserExample() {
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

        public Criteria andXtUserIdIsNull() {
            addCriterion("xt_user_id is null");
            return (Criteria) this;
        }

        public Criteria andXtUserIdIsNotNull() {
            addCriterion("xt_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andXtUserIdEqualTo(String value) {
            addCriterion("xt_user_id =", value, "xtUserId");
            return (Criteria) this;
        }

        public Criteria andXtUserIdNotEqualTo(String value) {
            addCriterion("xt_user_id <>", value, "xtUserId");
            return (Criteria) this;
        }

        public Criteria andXtUserIdGreaterThan(String value) {
            addCriterion("xt_user_id >", value, "xtUserId");
            return (Criteria) this;
        }

        public Criteria andXtUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("xt_user_id >=", value, "xtUserId");
            return (Criteria) this;
        }

        public Criteria andXtUserIdLessThan(String value) {
            addCriterion("xt_user_id <", value, "xtUserId");
            return (Criteria) this;
        }

        public Criteria andXtUserIdLessThanOrEqualTo(String value) {
            addCriterion("xt_user_id <=", value, "xtUserId");
            return (Criteria) this;
        }

        public Criteria andXtUserIdLike(String value) {
            addCriterion("xt_user_id like", value, "xtUserId");
            return (Criteria) this;
        }

        public Criteria andXtUserIdNotLike(String value) {
            addCriterion("xt_user_id not like", value, "xtUserId");
            return (Criteria) this;
        }

        public Criteria andXtUserIdIn(List<String> values) {
            addCriterion("xt_user_id in", values, "xtUserId");
            return (Criteria) this;
        }

        public Criteria andXtUserIdNotIn(List<String> values) {
            addCriterion("xt_user_id not in", values, "xtUserId");
            return (Criteria) this;
        }

        public Criteria andXtUserIdBetween(String value1, String value2) {
            addCriterion("xt_user_id between", value1, value2, "xtUserId");
            return (Criteria) this;
        }

        public Criteria andXtUserIdNotBetween(String value1, String value2) {
            addCriterion("xt_user_id not between", value1, value2, "xtUserId");
            return (Criteria) this;
        }

        public Criteria andXtUserCreateIdIsNull() {
            addCriterion("xt_user_create_id is null");
            return (Criteria) this;
        }

        public Criteria andXtUserCreateIdIsNotNull() {
            addCriterion("xt_user_create_id is not null");
            return (Criteria) this;
        }

        public Criteria andXtUserCreateIdEqualTo(String value) {
            addCriterion("xt_user_create_id =", value, "xtUserCreateId");
            return (Criteria) this;
        }

        public Criteria andXtUserCreateIdNotEqualTo(String value) {
            addCriterion("xt_user_create_id <>", value, "xtUserCreateId");
            return (Criteria) this;
        }

        public Criteria andXtUserCreateIdGreaterThan(String value) {
            addCriterion("xt_user_create_id >", value, "xtUserCreateId");
            return (Criteria) this;
        }

        public Criteria andXtUserCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("xt_user_create_id >=", value, "xtUserCreateId");
            return (Criteria) this;
        }

        public Criteria andXtUserCreateIdLessThan(String value) {
            addCriterion("xt_user_create_id <", value, "xtUserCreateId");
            return (Criteria) this;
        }

        public Criteria andXtUserCreateIdLessThanOrEqualTo(String value) {
            addCriterion("xt_user_create_id <=", value, "xtUserCreateId");
            return (Criteria) this;
        }

        public Criteria andXtUserCreateIdLike(String value) {
            addCriterion("xt_user_create_id like", value, "xtUserCreateId");
            return (Criteria) this;
        }

        public Criteria andXtUserCreateIdNotLike(String value) {
            addCriterion("xt_user_create_id not like", value, "xtUserCreateId");
            return (Criteria) this;
        }

        public Criteria andXtUserCreateIdIn(List<String> values) {
            addCriterion("xt_user_create_id in", values, "xtUserCreateId");
            return (Criteria) this;
        }

        public Criteria andXtUserCreateIdNotIn(List<String> values) {
            addCriterion("xt_user_create_id not in", values, "xtUserCreateId");
            return (Criteria) this;
        }

        public Criteria andXtUserCreateIdBetween(String value1, String value2) {
            addCriterion("xt_user_create_id between", value1, value2, "xtUserCreateId");
            return (Criteria) this;
        }

        public Criteria andXtUserCreateIdNotBetween(String value1, String value2) {
            addCriterion("xt_user_create_id not between", value1, value2, "xtUserCreateId");
            return (Criteria) this;
        }

        public Criteria andXtUserNameIsNull() {
            addCriterion("xt_user_name is null");
            return (Criteria) this;
        }

        public Criteria andXtUserNameIsNotNull() {
            addCriterion("xt_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andXtUserNameEqualTo(String value) {
            addCriterion("xt_user_name =", value, "xtUserName");
            return (Criteria) this;
        }

        public Criteria andXtUserNameNotEqualTo(String value) {
            addCriterion("xt_user_name <>", value, "xtUserName");
            return (Criteria) this;
        }

        public Criteria andXtUserNameGreaterThan(String value) {
            addCriterion("xt_user_name >", value, "xtUserName");
            return (Criteria) this;
        }

        public Criteria andXtUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("xt_user_name >=", value, "xtUserName");
            return (Criteria) this;
        }

        public Criteria andXtUserNameLessThan(String value) {
            addCriterion("xt_user_name <", value, "xtUserName");
            return (Criteria) this;
        }

        public Criteria andXtUserNameLessThanOrEqualTo(String value) {
            addCriterion("xt_user_name <=", value, "xtUserName");
            return (Criteria) this;
        }

        public Criteria andXtUserNameLike(String value) {
            addCriterion("xt_user_name like", value, "xtUserName");
            return (Criteria) this;
        }

        public Criteria andXtUserNameNotLike(String value) {
            addCriterion("xt_user_name not like", value, "xtUserName");
            return (Criteria) this;
        }

        public Criteria andXtUserNameIn(List<String> values) {
            addCriterion("xt_user_name in", values, "xtUserName");
            return (Criteria) this;
        }

        public Criteria andXtUserNameNotIn(List<String> values) {
            addCriterion("xt_user_name not in", values, "xtUserName");
            return (Criteria) this;
        }

        public Criteria andXtUserNameBetween(String value1, String value2) {
            addCriterion("xt_user_name between", value1, value2, "xtUserName");
            return (Criteria) this;
        }

        public Criteria andXtUserNameNotBetween(String value1, String value2) {
            addCriterion("xt_user_name not between", value1, value2, "xtUserName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andContactnumberIsNull() {
            addCriterion("contactnumber is null");
            return (Criteria) this;
        }

        public Criteria andContactnumberIsNotNull() {
            addCriterion("contactnumber is not null");
            return (Criteria) this;
        }

        public Criteria andContactnumberEqualTo(String value) {
            addCriterion("contactnumber =", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotEqualTo(String value) {
            addCriterion("contactnumber <>", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberGreaterThan(String value) {
            addCriterion("contactnumber >", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberGreaterThanOrEqualTo(String value) {
            addCriterion("contactnumber >=", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLessThan(String value) {
            addCriterion("contactnumber <", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLessThanOrEqualTo(String value) {
            addCriterion("contactnumber <=", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLike(String value) {
            addCriterion("contactnumber like", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotLike(String value) {
            addCriterion("contactnumber not like", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberIn(List<String> values) {
            addCriterion("contactnumber in", values, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotIn(List<String> values) {
            addCriterion("contactnumber not in", values, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberBetween(String value1, String value2) {
            addCriterion("contactnumber between", value1, value2, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotBetween(String value1, String value2) {
            addCriterion("contactnumber not between", value1, value2, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
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