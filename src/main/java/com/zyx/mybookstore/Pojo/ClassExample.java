package com.zyx.mybookstore.Pojo;

import java.util.ArrayList;
import java.util.List;

public class ClassExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table class
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table class
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table class
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public ClassExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table class
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
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

        public Criteria andClassidIsNull() {
            addCriterion("classid is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("classid is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(Integer value) {
            addCriterion("classid =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(Integer value) {
            addCriterion("classid <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(Integer value) {
            addCriterion("classid >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("classid >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(Integer value) {
            addCriterion("classid <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(Integer value) {
            addCriterion("classid <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<Integer> values) {
            addCriterion("classid in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<Integer> values) {
            addCriterion("classid not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(Integer value1, Integer value2) {
            addCriterion("classid between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(Integer value1, Integer value2) {
            addCriterion("classid not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClass1nameIsNull() {
            addCriterion("class1name is null");
            return (Criteria) this;
        }

        public Criteria andClass1nameIsNotNull() {
            addCriterion("class1name is not null");
            return (Criteria) this;
        }

        public Criteria andClass1nameEqualTo(String value) {
            addCriterion("class1name =", value, "class1name");
            return (Criteria) this;
        }

        public Criteria andClass1nameNotEqualTo(String value) {
            addCriterion("class1name <>", value, "class1name");
            return (Criteria) this;
        }

        public Criteria andClass1nameGreaterThan(String value) {
            addCriterion("class1name >", value, "class1name");
            return (Criteria) this;
        }

        public Criteria andClass1nameGreaterThanOrEqualTo(String value) {
            addCriterion("class1name >=", value, "class1name");
            return (Criteria) this;
        }

        public Criteria andClass1nameLessThan(String value) {
            addCriterion("class1name <", value, "class1name");
            return (Criteria) this;
        }

        public Criteria andClass1nameLessThanOrEqualTo(String value) {
            addCriterion("class1name <=", value, "class1name");
            return (Criteria) this;
        }

        public Criteria andClass1nameLike(String value) {
            addCriterion("class1name like", value, "class1name");
            return (Criteria) this;
        }

        public Criteria andClass1nameNotLike(String value) {
            addCriterion("class1name not like", value, "class1name");
            return (Criteria) this;
        }

        public Criteria andClass1nameIn(List<String> values) {
            addCriterion("class1name in", values, "class1name");
            return (Criteria) this;
        }

        public Criteria andClass1nameNotIn(List<String> values) {
            addCriterion("class1name not in", values, "class1name");
            return (Criteria) this;
        }

        public Criteria andClass1nameBetween(String value1, String value2) {
            addCriterion("class1name between", value1, value2, "class1name");
            return (Criteria) this;
        }

        public Criteria andClass1nameNotBetween(String value1, String value2) {
            addCriterion("class1name not between", value1, value2, "class1name");
            return (Criteria) this;
        }

        public Criteria andClass2nameIsNull() {
            addCriterion("class2name is null");
            return (Criteria) this;
        }

        public Criteria andClass2nameIsNotNull() {
            addCriterion("class2name is not null");
            return (Criteria) this;
        }

        public Criteria andClass2nameEqualTo(String value) {
            addCriterion("class2name =", value, "class2name");
            return (Criteria) this;
        }

        public Criteria andClass2nameNotEqualTo(String value) {
            addCriterion("class2name <>", value, "class2name");
            return (Criteria) this;
        }

        public Criteria andClass2nameGreaterThan(String value) {
            addCriterion("class2name >", value, "class2name");
            return (Criteria) this;
        }

        public Criteria andClass2nameGreaterThanOrEqualTo(String value) {
            addCriterion("class2name >=", value, "class2name");
            return (Criteria) this;
        }

        public Criteria andClass2nameLessThan(String value) {
            addCriterion("class2name <", value, "class2name");
            return (Criteria) this;
        }

        public Criteria andClass2nameLessThanOrEqualTo(String value) {
            addCriterion("class2name <=", value, "class2name");
            return (Criteria) this;
        }

        public Criteria andClass2nameLike(String value) {
            addCriterion("class2name like", value, "class2name");
            return (Criteria) this;
        }

        public Criteria andClass2nameNotLike(String value) {
            addCriterion("class2name not like", value, "class2name");
            return (Criteria) this;
        }

        public Criteria andClass2nameIn(List<String> values) {
            addCriterion("class2name in", values, "class2name");
            return (Criteria) this;
        }

        public Criteria andClass2nameNotIn(List<String> values) {
            addCriterion("class2name not in", values, "class2name");
            return (Criteria) this;
        }

        public Criteria andClass2nameBetween(String value1, String value2) {
            addCriterion("class2name between", value1, value2, "class2name");
            return (Criteria) this;
        }

        public Criteria andClass2nameNotBetween(String value1, String value2) {
            addCriterion("class2name not between", value1, value2, "class2name");
            return (Criteria) this;
        }

        public Criteria andClass3nameIsNull() {
            addCriterion("class3name is null");
            return (Criteria) this;
        }

        public Criteria andClass3nameIsNotNull() {
            addCriterion("class3name is not null");
            return (Criteria) this;
        }

        public Criteria andClass3nameEqualTo(String value) {
            addCriterion("class3name =", value, "class3name");
            return (Criteria) this;
        }

        public Criteria andClass3nameNotEqualTo(String value) {
            addCriterion("class3name <>", value, "class3name");
            return (Criteria) this;
        }

        public Criteria andClass3nameGreaterThan(String value) {
            addCriterion("class3name >", value, "class3name");
            return (Criteria) this;
        }

        public Criteria andClass3nameGreaterThanOrEqualTo(String value) {
            addCriterion("class3name >=", value, "class3name");
            return (Criteria) this;
        }

        public Criteria andClass3nameLessThan(String value) {
            addCriterion("class3name <", value, "class3name");
            return (Criteria) this;
        }

        public Criteria andClass3nameLessThanOrEqualTo(String value) {
            addCriterion("class3name <=", value, "class3name");
            return (Criteria) this;
        }

        public Criteria andClass3nameLike(String value) {
            addCriterion("class3name like", value, "class3name");
            return (Criteria) this;
        }

        public Criteria andClass3nameNotLike(String value) {
            addCriterion("class3name not like", value, "class3name");
            return (Criteria) this;
        }

        public Criteria andClass3nameIn(List<String> values) {
            addCriterion("class3name in", values, "class3name");
            return (Criteria) this;
        }

        public Criteria andClass3nameNotIn(List<String> values) {
            addCriterion("class3name not in", values, "class3name");
            return (Criteria) this;
        }

        public Criteria andClass3nameBetween(String value1, String value2) {
            addCriterion("class3name between", value1, value2, "class3name");
            return (Criteria) this;
        }

        public Criteria andClass3nameNotBetween(String value1, String value2) {
            addCriterion("class3name not between", value1, value2, "class3name");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table class
     *
     * @mbg.generated do_not_delete_during_merge Thu Sep 05 18:11:44 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table class
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
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