package com.zyx.mybookstore.Pojo;

import java.util.ArrayList;
import java.util.List;

public class PressExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table press
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table press
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table press
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table press
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public PressExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table press
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table press
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table press
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table press
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table press
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table press
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table press
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
     * This method corresponds to the database table press
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
     * This method corresponds to the database table press
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table press
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
     * This class corresponds to the database table press
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

        public Criteria andPressidIsNull() {
            addCriterion("pressid is null");
            return (Criteria) this;
        }

        public Criteria andPressidIsNotNull() {
            addCriterion("pressid is not null");
            return (Criteria) this;
        }

        public Criteria andPressidEqualTo(Integer value) {
            addCriterion("pressid =", value, "pressid");
            return (Criteria) this;
        }

        public Criteria andPressidNotEqualTo(Integer value) {
            addCriterion("pressid <>", value, "pressid");
            return (Criteria) this;
        }

        public Criteria andPressidGreaterThan(Integer value) {
            addCriterion("pressid >", value, "pressid");
            return (Criteria) this;
        }

        public Criteria andPressidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pressid >=", value, "pressid");
            return (Criteria) this;
        }

        public Criteria andPressidLessThan(Integer value) {
            addCriterion("pressid <", value, "pressid");
            return (Criteria) this;
        }

        public Criteria andPressidLessThanOrEqualTo(Integer value) {
            addCriterion("pressid <=", value, "pressid");
            return (Criteria) this;
        }

        public Criteria andPressidIn(List<Integer> values) {
            addCriterion("pressid in", values, "pressid");
            return (Criteria) this;
        }

        public Criteria andPressidNotIn(List<Integer> values) {
            addCriterion("pressid not in", values, "pressid");
            return (Criteria) this;
        }

        public Criteria andPressidBetween(Integer value1, Integer value2) {
            addCriterion("pressid between", value1, value2, "pressid");
            return (Criteria) this;
        }

        public Criteria andPressidNotBetween(Integer value1, Integer value2) {
            addCriterion("pressid not between", value1, value2, "pressid");
            return (Criteria) this;
        }

        public Criteria andPressnameIsNull() {
            addCriterion("pressname is null");
            return (Criteria) this;
        }

        public Criteria andPressnameIsNotNull() {
            addCriterion("pressname is not null");
            return (Criteria) this;
        }

        public Criteria andPressnameEqualTo(String value) {
            addCriterion("pressname =", value, "pressname");
            return (Criteria) this;
        }

        public Criteria andPressnameNotEqualTo(String value) {
            addCriterion("pressname <>", value, "pressname");
            return (Criteria) this;
        }

        public Criteria andPressnameGreaterThan(String value) {
            addCriterion("pressname >", value, "pressname");
            return (Criteria) this;
        }

        public Criteria andPressnameGreaterThanOrEqualTo(String value) {
            addCriterion("pressname >=", value, "pressname");
            return (Criteria) this;
        }

        public Criteria andPressnameLessThan(String value) {
            addCriterion("pressname <", value, "pressname");
            return (Criteria) this;
        }

        public Criteria andPressnameLessThanOrEqualTo(String value) {
            addCriterion("pressname <=", value, "pressname");
            return (Criteria) this;
        }

        public Criteria andPressnameLike(String value) {
            addCriterion("pressname like", value, "pressname");
            return (Criteria) this;
        }

        public Criteria andPressnameNotLike(String value) {
            addCriterion("pressname not like", value, "pressname");
            return (Criteria) this;
        }

        public Criteria andPressnameIn(List<String> values) {
            addCriterion("pressname in", values, "pressname");
            return (Criteria) this;
        }

        public Criteria andPressnameNotIn(List<String> values) {
            addCriterion("pressname not in", values, "pressname");
            return (Criteria) this;
        }

        public Criteria andPressnameBetween(String value1, String value2) {
            addCriterion("pressname between", value1, value2, "pressname");
            return (Criteria) this;
        }

        public Criteria andPressnameNotBetween(String value1, String value2) {
            addCriterion("pressname not between", value1, value2, "pressname");
            return (Criteria) this;
        }

        public Criteria andPressimgIsNull() {
            addCriterion("pressimg is null");
            return (Criteria) this;
        }

        public Criteria andPressimgIsNotNull() {
            addCriterion("pressimg is not null");
            return (Criteria) this;
        }

        public Criteria andPressimgEqualTo(String value) {
            addCriterion("pressimg =", value, "pressimg");
            return (Criteria) this;
        }

        public Criteria andPressimgNotEqualTo(String value) {
            addCriterion("pressimg <>", value, "pressimg");
            return (Criteria) this;
        }

        public Criteria andPressimgGreaterThan(String value) {
            addCriterion("pressimg >", value, "pressimg");
            return (Criteria) this;
        }

        public Criteria andPressimgGreaterThanOrEqualTo(String value) {
            addCriterion("pressimg >=", value, "pressimg");
            return (Criteria) this;
        }

        public Criteria andPressimgLessThan(String value) {
            addCriterion("pressimg <", value, "pressimg");
            return (Criteria) this;
        }

        public Criteria andPressimgLessThanOrEqualTo(String value) {
            addCriterion("pressimg <=", value, "pressimg");
            return (Criteria) this;
        }

        public Criteria andPressimgLike(String value) {
            addCriterion("pressimg like", value, "pressimg");
            return (Criteria) this;
        }

        public Criteria andPressimgNotLike(String value) {
            addCriterion("pressimg not like", value, "pressimg");
            return (Criteria) this;
        }

        public Criteria andPressimgIn(List<String> values) {
            addCriterion("pressimg in", values, "pressimg");
            return (Criteria) this;
        }

        public Criteria andPressimgNotIn(List<String> values) {
            addCriterion("pressimg not in", values, "pressimg");
            return (Criteria) this;
        }

        public Criteria andPressimgBetween(String value1, String value2) {
            addCriterion("pressimg between", value1, value2, "pressimg");
            return (Criteria) this;
        }

        public Criteria andPressimgNotBetween(String value1, String value2) {
            addCriterion("pressimg not between", value1, value2, "pressimg");
            return (Criteria) this;
        }

        public Criteria andBooknameIsNull() {
            addCriterion("bookname is null");
            return (Criteria) this;
        }

        public Criteria andBooknameIsNotNull() {
            addCriterion("bookname is not null");
            return (Criteria) this;
        }

        public Criteria andBooknameEqualTo(String value) {
            addCriterion("bookname =", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotEqualTo(String value) {
            addCriterion("bookname <>", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThan(String value) {
            addCriterion("bookname >", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThanOrEqualTo(String value) {
            addCriterion("bookname >=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThan(String value) {
            addCriterion("bookname <", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThanOrEqualTo(String value) {
            addCriterion("bookname <=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLike(String value) {
            addCriterion("bookname like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotLike(String value) {
            addCriterion("bookname not like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameIn(List<String> values) {
            addCriterion("bookname in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotIn(List<String> values) {
            addCriterion("bookname not in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameBetween(String value1, String value2) {
            addCriterion("bookname between", value1, value2, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotBetween(String value1, String value2) {
            addCriterion("bookname not between", value1, value2, "bookname");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table press
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
     * This class corresponds to the database table press
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