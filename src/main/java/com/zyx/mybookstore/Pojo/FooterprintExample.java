package com.zyx.mybookstore.Pojo;

import java.util.ArrayList;
import java.util.List;

public class FooterprintExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table footerprint
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table footerprint
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table footerprint
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table footerprint
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public FooterprintExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table footerprint
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table footerprint
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table footerprint
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table footerprint
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table footerprint
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table footerprint
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table footerprint
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
     * This method corresponds to the database table footerprint
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
     * This method corresponds to the database table footerprint
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table footerprint
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
     * This class corresponds to the database table footerprint
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

        public Criteria andFooterprintIsNull() {
            addCriterion("footerprint is null");
            return (Criteria) this;
        }

        public Criteria andFooterprintIsNotNull() {
            addCriterion("footerprint is not null");
            return (Criteria) this;
        }

        public Criteria andFooterprintEqualTo(Integer value) {
            addCriterion("footerprint =", value, "footerprint");
            return (Criteria) this;
        }

        public Criteria andFooterprintNotEqualTo(Integer value) {
            addCriterion("footerprint <>", value, "footerprint");
            return (Criteria) this;
        }

        public Criteria andFooterprintGreaterThan(Integer value) {
            addCriterion("footerprint >", value, "footerprint");
            return (Criteria) this;
        }

        public Criteria andFooterprintGreaterThanOrEqualTo(Integer value) {
            addCriterion("footerprint >=", value, "footerprint");
            return (Criteria) this;
        }

        public Criteria andFooterprintLessThan(Integer value) {
            addCriterion("footerprint <", value, "footerprint");
            return (Criteria) this;
        }

        public Criteria andFooterprintLessThanOrEqualTo(Integer value) {
            addCriterion("footerprint <=", value, "footerprint");
            return (Criteria) this;
        }

        public Criteria andFooterprintIn(List<Integer> values) {
            addCriterion("footerprint in", values, "footerprint");
            return (Criteria) this;
        }

        public Criteria andFooterprintNotIn(List<Integer> values) {
            addCriterion("footerprint not in", values, "footerprint");
            return (Criteria) this;
        }

        public Criteria andFooterprintBetween(Integer value1, Integer value2) {
            addCriterion("footerprint between", value1, value2, "footerprint");
            return (Criteria) this;
        }

        public Criteria andFooterprintNotBetween(Integer value1, Integer value2) {
            addCriterion("footerprint not between", value1, value2, "footerprint");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
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

        public Criteria andFooterprintstateIsNull() {
            addCriterion("footerprintstate is null");
            return (Criteria) this;
        }

        public Criteria andFooterprintstateIsNotNull() {
            addCriterion("footerprintstate is not null");
            return (Criteria) this;
        }

        public Criteria andFooterprintstateEqualTo(String value) {
            addCriterion("footerprintstate =", value, "footerprintstate");
            return (Criteria) this;
        }

        public Criteria andFooterprintstateNotEqualTo(String value) {
            addCriterion("footerprintstate <>", value, "footerprintstate");
            return (Criteria) this;
        }

        public Criteria andFooterprintstateGreaterThan(String value) {
            addCriterion("footerprintstate >", value, "footerprintstate");
            return (Criteria) this;
        }

        public Criteria andFooterprintstateGreaterThanOrEqualTo(String value) {
            addCriterion("footerprintstate >=", value, "footerprintstate");
            return (Criteria) this;
        }

        public Criteria andFooterprintstateLessThan(String value) {
            addCriterion("footerprintstate <", value, "footerprintstate");
            return (Criteria) this;
        }

        public Criteria andFooterprintstateLessThanOrEqualTo(String value) {
            addCriterion("footerprintstate <=", value, "footerprintstate");
            return (Criteria) this;
        }

        public Criteria andFooterprintstateLike(String value) {
            addCriterion("footerprintstate like", value, "footerprintstate");
            return (Criteria) this;
        }

        public Criteria andFooterprintstateNotLike(String value) {
            addCriterion("footerprintstate not like", value, "footerprintstate");
            return (Criteria) this;
        }

        public Criteria andFooterprintstateIn(List<String> values) {
            addCriterion("footerprintstate in", values, "footerprintstate");
            return (Criteria) this;
        }

        public Criteria andFooterprintstateNotIn(List<String> values) {
            addCriterion("footerprintstate not in", values, "footerprintstate");
            return (Criteria) this;
        }

        public Criteria andFooterprintstateBetween(String value1, String value2) {
            addCriterion("footerprintstate between", value1, value2, "footerprintstate");
            return (Criteria) this;
        }

        public Criteria andFooterprintstateNotBetween(String value1, String value2) {
            addCriterion("footerprintstate not between", value1, value2, "footerprintstate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table footerprint
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
     * This class corresponds to the database table footerprint
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