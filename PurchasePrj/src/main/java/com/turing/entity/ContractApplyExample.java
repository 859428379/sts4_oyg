package com.turing.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractApplyExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andContAppNumIsNull() {
            addCriterion("cont_app_num is null");
            return (Criteria) this;
        }

        public Criteria andContAppNumIsNotNull() {
            addCriterion("cont_app_num is not null");
            return (Criteria) this;
        }

        public Criteria andContAppNumEqualTo(String value) {
            addCriterion("cont_app_num =", value, "contAppNum");
            return (Criteria) this;
        }

        public Criteria andContAppNumNotEqualTo(String value) {
            addCriterion("cont_app_num <>", value, "contAppNum");
            return (Criteria) this;
        }

        public Criteria andContAppNumGreaterThan(String value) {
            addCriterion("cont_app_num >", value, "contAppNum");
            return (Criteria) this;
        }

        public Criteria andContAppNumGreaterThanOrEqualTo(String value) {
            addCriterion("cont_app_num >=", value, "contAppNum");
            return (Criteria) this;
        }

        public Criteria andContAppNumLessThan(String value) {
            addCriterion("cont_app_num <", value, "contAppNum");
            return (Criteria) this;
        }

        public Criteria andContAppNumLessThanOrEqualTo(String value) {
            addCriterion("cont_app_num <=", value, "contAppNum");
            return (Criteria) this;
        }

        public Criteria andContAppNumLike(String value) {
            addCriterion("cont_app_num like", value, "contAppNum");
            return (Criteria) this;
        }

        public Criteria andContAppNumNotLike(String value) {
            addCriterion("cont_app_num not like", value, "contAppNum");
            return (Criteria) this;
        }

        public Criteria andContAppNumIn(List<String> values) {
            addCriterion("cont_app_num in", values, "contAppNum");
            return (Criteria) this;
        }

        public Criteria andContAppNumNotIn(List<String> values) {
            addCriterion("cont_app_num not in", values, "contAppNum");
            return (Criteria) this;
        }

        public Criteria andContAppNumBetween(String value1, String value2) {
            addCriterion("cont_app_num between", value1, value2, "contAppNum");
            return (Criteria) this;
        }

        public Criteria andContAppNumNotBetween(String value1, String value2) {
            addCriterion("cont_app_num not between", value1, value2, "contAppNum");
            return (Criteria) this;
        }

        public Criteria andStatQuoteIsNull() {
            addCriterion("stat_quote is null");
            return (Criteria) this;
        }

        public Criteria andStatQuoteIsNotNull() {
            addCriterion("stat_quote is not null");
            return (Criteria) this;
        }

        public Criteria andStatQuoteEqualTo(String value) {
            addCriterion("stat_quote =", value, "statQuote");
            return (Criteria) this;
        }

        public Criteria andStatQuoteNotEqualTo(String value) {
            addCriterion("stat_quote <>", value, "statQuote");
            return (Criteria) this;
        }

        public Criteria andStatQuoteGreaterThan(String value) {
            addCriterion("stat_quote >", value, "statQuote");
            return (Criteria) this;
        }

        public Criteria andStatQuoteGreaterThanOrEqualTo(String value) {
            addCriterion("stat_quote >=", value, "statQuote");
            return (Criteria) this;
        }

        public Criteria andStatQuoteLessThan(String value) {
            addCriterion("stat_quote <", value, "statQuote");
            return (Criteria) this;
        }

        public Criteria andStatQuoteLessThanOrEqualTo(String value) {
            addCriterion("stat_quote <=", value, "statQuote");
            return (Criteria) this;
        }

        public Criteria andStatQuoteLike(String value) {
            addCriterion("stat_quote like", value, "statQuote");
            return (Criteria) this;
        }

        public Criteria andStatQuoteNotLike(String value) {
            addCriterion("stat_quote not like", value, "statQuote");
            return (Criteria) this;
        }

        public Criteria andStatQuoteIn(List<String> values) {
            addCriterion("stat_quote in", values, "statQuote");
            return (Criteria) this;
        }

        public Criteria andStatQuoteNotIn(List<String> values) {
            addCriterion("stat_quote not in", values, "statQuote");
            return (Criteria) this;
        }

        public Criteria andStatQuoteBetween(String value1, String value2) {
            addCriterion("stat_quote between", value1, value2, "statQuote");
            return (Criteria) this;
        }

        public Criteria andStatQuoteNotBetween(String value1, String value2) {
            addCriterion("stat_quote not between", value1, value2, "statQuote");
            return (Criteria) this;
        }

        public Criteria andTopQuoteIsNull() {
            addCriterion("top_quote is null");
            return (Criteria) this;
        }

        public Criteria andTopQuoteIsNotNull() {
            addCriterion("top_quote is not null");
            return (Criteria) this;
        }

        public Criteria andTopQuoteEqualTo(String value) {
            addCriterion("top_quote =", value, "topQuote");
            return (Criteria) this;
        }

        public Criteria andTopQuoteNotEqualTo(String value) {
            addCriterion("top_quote <>", value, "topQuote");
            return (Criteria) this;
        }

        public Criteria andTopQuoteGreaterThan(String value) {
            addCriterion("top_quote >", value, "topQuote");
            return (Criteria) this;
        }

        public Criteria andTopQuoteGreaterThanOrEqualTo(String value) {
            addCriterion("top_quote >=", value, "topQuote");
            return (Criteria) this;
        }

        public Criteria andTopQuoteLessThan(String value) {
            addCriterion("top_quote <", value, "topQuote");
            return (Criteria) this;
        }

        public Criteria andTopQuoteLessThanOrEqualTo(String value) {
            addCriterion("top_quote <=", value, "topQuote");
            return (Criteria) this;
        }

        public Criteria andTopQuoteLike(String value) {
            addCriterion("top_quote like", value, "topQuote");
            return (Criteria) this;
        }

        public Criteria andTopQuoteNotLike(String value) {
            addCriterion("top_quote not like", value, "topQuote");
            return (Criteria) this;
        }

        public Criteria andTopQuoteIn(List<String> values) {
            addCriterion("top_quote in", values, "topQuote");
            return (Criteria) this;
        }

        public Criteria andTopQuoteNotIn(List<String> values) {
            addCriterion("top_quote not in", values, "topQuote");
            return (Criteria) this;
        }

        public Criteria andTopQuoteBetween(String value1, String value2) {
            addCriterion("top_quote between", value1, value2, "topQuote");
            return (Criteria) this;
        }

        public Criteria andTopQuoteNotBetween(String value1, String value2) {
            addCriterion("top_quote not between", value1, value2, "topQuote");
            return (Criteria) this;
        }

        public Criteria andLowQuoteIsNull() {
            addCriterion("low_quote is null");
            return (Criteria) this;
        }

        public Criteria andLowQuoteIsNotNull() {
            addCriterion("low_quote is not null");
            return (Criteria) this;
        }

        public Criteria andLowQuoteEqualTo(String value) {
            addCriterion("low_quote =", value, "lowQuote");
            return (Criteria) this;
        }

        public Criteria andLowQuoteNotEqualTo(String value) {
            addCriterion("low_quote <>", value, "lowQuote");
            return (Criteria) this;
        }

        public Criteria andLowQuoteGreaterThan(String value) {
            addCriterion("low_quote >", value, "lowQuote");
            return (Criteria) this;
        }

        public Criteria andLowQuoteGreaterThanOrEqualTo(String value) {
            addCriterion("low_quote >=", value, "lowQuote");
            return (Criteria) this;
        }

        public Criteria andLowQuoteLessThan(String value) {
            addCriterion("low_quote <", value, "lowQuote");
            return (Criteria) this;
        }

        public Criteria andLowQuoteLessThanOrEqualTo(String value) {
            addCriterion("low_quote <=", value, "lowQuote");
            return (Criteria) this;
        }

        public Criteria andLowQuoteLike(String value) {
            addCriterion("low_quote like", value, "lowQuote");
            return (Criteria) this;
        }

        public Criteria andLowQuoteNotLike(String value) {
            addCriterion("low_quote not like", value, "lowQuote");
            return (Criteria) this;
        }

        public Criteria andLowQuoteIn(List<String> values) {
            addCriterion("low_quote in", values, "lowQuote");
            return (Criteria) this;
        }

        public Criteria andLowQuoteNotIn(List<String> values) {
            addCriterion("low_quote not in", values, "lowQuote");
            return (Criteria) this;
        }

        public Criteria andLowQuoteBetween(String value1, String value2) {
            addCriterion("low_quote between", value1, value2, "lowQuote");
            return (Criteria) this;
        }

        public Criteria andLowQuoteNotBetween(String value1, String value2) {
            addCriterion("low_quote not between", value1, value2, "lowQuote");
            return (Criteria) this;
        }

        public Criteria andAllSumPriceIsNull() {
            addCriterion("all_sum_price is null");
            return (Criteria) this;
        }

        public Criteria andAllSumPriceIsNotNull() {
            addCriterion("all_sum_price is not null");
            return (Criteria) this;
        }

        public Criteria andAllSumPriceEqualTo(BigDecimal value) {
            addCriterion("all_sum_price =", value, "allSumPrice");
            return (Criteria) this;
        }

        public Criteria andAllSumPriceNotEqualTo(BigDecimal value) {
            addCriterion("all_sum_price <>", value, "allSumPrice");
            return (Criteria) this;
        }

        public Criteria andAllSumPriceGreaterThan(BigDecimal value) {
            addCriterion("all_sum_price >", value, "allSumPrice");
            return (Criteria) this;
        }

        public Criteria andAllSumPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("all_sum_price >=", value, "allSumPrice");
            return (Criteria) this;
        }

        public Criteria andAllSumPriceLessThan(BigDecimal value) {
            addCriterion("all_sum_price <", value, "allSumPrice");
            return (Criteria) this;
        }

        public Criteria andAllSumPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("all_sum_price <=", value, "allSumPrice");
            return (Criteria) this;
        }

        public Criteria andAllSumPriceIn(List<BigDecimal> values) {
            addCriterion("all_sum_price in", values, "allSumPrice");
            return (Criteria) this;
        }

        public Criteria andAllSumPriceNotIn(List<BigDecimal> values) {
            addCriterion("all_sum_price not in", values, "allSumPrice");
            return (Criteria) this;
        }

        public Criteria andAllSumPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_sum_price between", value1, value2, "allSumPrice");
            return (Criteria) this;
        }

        public Criteria andAllSumPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_sum_price not between", value1, value2, "allSumPrice");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNull() {
            addCriterion("author_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNotNull() {
            addCriterion("author_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdEqualTo(String value) {
            addCriterion("author_id =", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotEqualTo(String value) {
            addCriterion("author_id <>", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThan(String value) {
            addCriterion("author_id >", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThanOrEqualTo(String value) {
            addCriterion("author_id >=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThan(String value) {
            addCriterion("author_id <", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThanOrEqualTo(String value) {
            addCriterion("author_id <=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLike(String value) {
            addCriterion("author_id like", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotLike(String value) {
            addCriterion("author_id not like", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIn(List<String> values) {
            addCriterion("author_id in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotIn(List<String> values) {
            addCriterion("author_id not in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdBetween(String value1, String value2) {
            addCriterion("author_id between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotBetween(String value1, String value2) {
            addCriterion("author_id not between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andPlanerIdIsNull() {
            addCriterion("planer_id is null");
            return (Criteria) this;
        }

        public Criteria andPlanerIdIsNotNull() {
            addCriterion("planer_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlanerIdEqualTo(String value) {
            addCriterion("planer_id =", value, "planerId");
            return (Criteria) this;
        }

        public Criteria andPlanerIdNotEqualTo(String value) {
            addCriterion("planer_id <>", value, "planerId");
            return (Criteria) this;
        }

        public Criteria andPlanerIdGreaterThan(String value) {
            addCriterion("planer_id >", value, "planerId");
            return (Criteria) this;
        }

        public Criteria andPlanerIdGreaterThanOrEqualTo(String value) {
            addCriterion("planer_id >=", value, "planerId");
            return (Criteria) this;
        }

        public Criteria andPlanerIdLessThan(String value) {
            addCriterion("planer_id <", value, "planerId");
            return (Criteria) this;
        }

        public Criteria andPlanerIdLessThanOrEqualTo(String value) {
            addCriterion("planer_id <=", value, "planerId");
            return (Criteria) this;
        }

        public Criteria andPlanerIdLike(String value) {
            addCriterion("planer_id like", value, "planerId");
            return (Criteria) this;
        }

        public Criteria andPlanerIdNotLike(String value) {
            addCriterion("planer_id not like", value, "planerId");
            return (Criteria) this;
        }

        public Criteria andPlanerIdIn(List<String> values) {
            addCriterion("planer_id in", values, "planerId");
            return (Criteria) this;
        }

        public Criteria andPlanerIdNotIn(List<String> values) {
            addCriterion("planer_id not in", values, "planerId");
            return (Criteria) this;
        }

        public Criteria andPlanerIdBetween(String value1, String value2) {
            addCriterion("planer_id between", value1, value2, "planerId");
            return (Criteria) this;
        }

        public Criteria andPlanerIdNotBetween(String value1, String value2) {
            addCriterion("planer_id not between", value1, value2, "planerId");
            return (Criteria) this;
        }

        public Criteria andPlanerIsNull() {
            addCriterion("planer is null");
            return (Criteria) this;
        }

        public Criteria andPlanerIsNotNull() {
            addCriterion("planer is not null");
            return (Criteria) this;
        }

        public Criteria andPlanerEqualTo(String value) {
            addCriterion("planer =", value, "planer");
            return (Criteria) this;
        }

        public Criteria andPlanerNotEqualTo(String value) {
            addCriterion("planer <>", value, "planer");
            return (Criteria) this;
        }

        public Criteria andPlanerGreaterThan(String value) {
            addCriterion("planer >", value, "planer");
            return (Criteria) this;
        }

        public Criteria andPlanerGreaterThanOrEqualTo(String value) {
            addCriterion("planer >=", value, "planer");
            return (Criteria) this;
        }

        public Criteria andPlanerLessThan(String value) {
            addCriterion("planer <", value, "planer");
            return (Criteria) this;
        }

        public Criteria andPlanerLessThanOrEqualTo(String value) {
            addCriterion("planer <=", value, "planer");
            return (Criteria) this;
        }

        public Criteria andPlanerLike(String value) {
            addCriterion("planer like", value, "planer");
            return (Criteria) this;
        }

        public Criteria andPlanerNotLike(String value) {
            addCriterion("planer not like", value, "planer");
            return (Criteria) this;
        }

        public Criteria andPlanerIn(List<String> values) {
            addCriterion("planer in", values, "planer");
            return (Criteria) this;
        }

        public Criteria andPlanerNotIn(List<String> values) {
            addCriterion("planer not in", values, "planer");
            return (Criteria) this;
        }

        public Criteria andPlanerBetween(String value1, String value2) {
            addCriterion("planer between", value1, value2, "planer");
            return (Criteria) this;
        }

        public Criteria andPlanerNotBetween(String value1, String value2) {
            addCriterion("planer not between", value1, value2, "planer");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeIsNull() {
            addCriterion("plan_agree is null");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeIsNotNull() {
            addCriterion("plan_agree is not null");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeEqualTo(String value) {
            addCriterion("plan_agree =", value, "planAgree");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeNotEqualTo(String value) {
            addCriterion("plan_agree <>", value, "planAgree");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeGreaterThan(String value) {
            addCriterion("plan_agree >", value, "planAgree");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeGreaterThanOrEqualTo(String value) {
            addCriterion("plan_agree >=", value, "planAgree");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeLessThan(String value) {
            addCriterion("plan_agree <", value, "planAgree");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeLessThanOrEqualTo(String value) {
            addCriterion("plan_agree <=", value, "planAgree");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeLike(String value) {
            addCriterion("plan_agree like", value, "planAgree");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeNotLike(String value) {
            addCriterion("plan_agree not like", value, "planAgree");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeIn(List<String> values) {
            addCriterion("plan_agree in", values, "planAgree");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeNotIn(List<String> values) {
            addCriterion("plan_agree not in", values, "planAgree");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeBetween(String value1, String value2) {
            addCriterion("plan_agree between", value1, value2, "planAgree");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeNotBetween(String value1, String value2) {
            addCriterion("plan_agree not between", value1, value2, "planAgree");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionIsNull() {
            addCriterion("plan_opinion is null");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionIsNotNull() {
            addCriterion("plan_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionEqualTo(String value) {
            addCriterion("plan_opinion =", value, "planOpinion");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionNotEqualTo(String value) {
            addCriterion("plan_opinion <>", value, "planOpinion");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionGreaterThan(String value) {
            addCriterion("plan_opinion >", value, "planOpinion");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("plan_opinion >=", value, "planOpinion");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionLessThan(String value) {
            addCriterion("plan_opinion <", value, "planOpinion");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionLessThanOrEqualTo(String value) {
            addCriterion("plan_opinion <=", value, "planOpinion");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionLike(String value) {
            addCriterion("plan_opinion like", value, "planOpinion");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionNotLike(String value) {
            addCriterion("plan_opinion not like", value, "planOpinion");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionIn(List<String> values) {
            addCriterion("plan_opinion in", values, "planOpinion");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionNotIn(List<String> values) {
            addCriterion("plan_opinion not in", values, "planOpinion");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionBetween(String value1, String value2) {
            addCriterion("plan_opinion between", value1, value2, "planOpinion");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionNotBetween(String value1, String value2) {
            addCriterion("plan_opinion not between", value1, value2, "planOpinion");
            return (Criteria) this;
        }

        public Criteria andPlanDateIsNull() {
            addCriterion("plan_date is null");
            return (Criteria) this;
        }

        public Criteria andPlanDateIsNotNull() {
            addCriterion("plan_date is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDateEqualTo(Date value) {
            addCriterion("plan_date =", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotEqualTo(Date value) {
            addCriterion("plan_date <>", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThan(Date value) {
            addCriterion("plan_date >", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_date >=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThan(Date value) {
            addCriterion("plan_date <", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThanOrEqualTo(Date value) {
            addCriterion("plan_date <=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateIn(List<Date> values) {
            addCriterion("plan_date in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotIn(List<Date> values) {
            addCriterion("plan_date not in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateBetween(Date value1, Date value2) {
            addCriterion("plan_date between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotBetween(Date value1, Date value2) {
            addCriterion("plan_date not between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andLeaderIdIsNull() {
            addCriterion("leader_id is null");
            return (Criteria) this;
        }

        public Criteria andLeaderIdIsNotNull() {
            addCriterion("leader_id is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderIdEqualTo(String value) {
            addCriterion("leader_id =", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdNotEqualTo(String value) {
            addCriterion("leader_id <>", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdGreaterThan(String value) {
            addCriterion("leader_id >", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdGreaterThanOrEqualTo(String value) {
            addCriterion("leader_id >=", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdLessThan(String value) {
            addCriterion("leader_id <", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdLessThanOrEqualTo(String value) {
            addCriterion("leader_id <=", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdLike(String value) {
            addCriterion("leader_id like", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdNotLike(String value) {
            addCriterion("leader_id not like", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdIn(List<String> values) {
            addCriterion("leader_id in", values, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdNotIn(List<String> values) {
            addCriterion("leader_id not in", values, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdBetween(String value1, String value2) {
            addCriterion("leader_id between", value1, value2, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdNotBetween(String value1, String value2) {
            addCriterion("leader_id not between", value1, value2, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNull() {
            addCriterion("leader is null");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNotNull() {
            addCriterion("leader is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderEqualTo(String value) {
            addCriterion("leader =", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotEqualTo(String value) {
            addCriterion("leader <>", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThan(String value) {
            addCriterion("leader >", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("leader >=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThan(String value) {
            addCriterion("leader <", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThanOrEqualTo(String value) {
            addCriterion("leader <=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLike(String value) {
            addCriterion("leader like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotLike(String value) {
            addCriterion("leader not like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderIn(List<String> values) {
            addCriterion("leader in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotIn(List<String> values) {
            addCriterion("leader not in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderBetween(String value1, String value2) {
            addCriterion("leader between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotBetween(String value1, String value2) {
            addCriterion("leader not between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeIsNull() {
            addCriterion("lead_agree is null");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeIsNotNull() {
            addCriterion("lead_agree is not null");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeEqualTo(String value) {
            addCriterion("lead_agree =", value, "leadAgree");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeNotEqualTo(String value) {
            addCriterion("lead_agree <>", value, "leadAgree");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeGreaterThan(String value) {
            addCriterion("lead_agree >", value, "leadAgree");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeGreaterThanOrEqualTo(String value) {
            addCriterion("lead_agree >=", value, "leadAgree");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeLessThan(String value) {
            addCriterion("lead_agree <", value, "leadAgree");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeLessThanOrEqualTo(String value) {
            addCriterion("lead_agree <=", value, "leadAgree");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeLike(String value) {
            addCriterion("lead_agree like", value, "leadAgree");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeNotLike(String value) {
            addCriterion("lead_agree not like", value, "leadAgree");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeIn(List<String> values) {
            addCriterion("lead_agree in", values, "leadAgree");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeNotIn(List<String> values) {
            addCriterion("lead_agree not in", values, "leadAgree");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeBetween(String value1, String value2) {
            addCriterion("lead_agree between", value1, value2, "leadAgree");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeNotBetween(String value1, String value2) {
            addCriterion("lead_agree not between", value1, value2, "leadAgree");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionIsNull() {
            addCriterion("lead_opinion is null");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionIsNotNull() {
            addCriterion("lead_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionEqualTo(String value) {
            addCriterion("lead_opinion =", value, "leadOpinion");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionNotEqualTo(String value) {
            addCriterion("lead_opinion <>", value, "leadOpinion");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionGreaterThan(String value) {
            addCriterion("lead_opinion >", value, "leadOpinion");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("lead_opinion >=", value, "leadOpinion");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionLessThan(String value) {
            addCriterion("lead_opinion <", value, "leadOpinion");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionLessThanOrEqualTo(String value) {
            addCriterion("lead_opinion <=", value, "leadOpinion");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionLike(String value) {
            addCriterion("lead_opinion like", value, "leadOpinion");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionNotLike(String value) {
            addCriterion("lead_opinion not like", value, "leadOpinion");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionIn(List<String> values) {
            addCriterion("lead_opinion in", values, "leadOpinion");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionNotIn(List<String> values) {
            addCriterion("lead_opinion not in", values, "leadOpinion");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionBetween(String value1, String value2) {
            addCriterion("lead_opinion between", value1, value2, "leadOpinion");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionNotBetween(String value1, String value2) {
            addCriterion("lead_opinion not between", value1, value2, "leadOpinion");
            return (Criteria) this;
        }

        public Criteria andLeadDateIsNull() {
            addCriterion("lead_date is null");
            return (Criteria) this;
        }

        public Criteria andLeadDateIsNotNull() {
            addCriterion("lead_date is not null");
            return (Criteria) this;
        }

        public Criteria andLeadDateEqualTo(Date value) {
            addCriterion("lead_date =", value, "leadDate");
            return (Criteria) this;
        }

        public Criteria andLeadDateNotEqualTo(Date value) {
            addCriterion("lead_date <>", value, "leadDate");
            return (Criteria) this;
        }

        public Criteria andLeadDateGreaterThan(Date value) {
            addCriterion("lead_date >", value, "leadDate");
            return (Criteria) this;
        }

        public Criteria andLeadDateGreaterThanOrEqualTo(Date value) {
            addCriterion("lead_date >=", value, "leadDate");
            return (Criteria) this;
        }

        public Criteria andLeadDateLessThan(Date value) {
            addCriterion("lead_date <", value, "leadDate");
            return (Criteria) this;
        }

        public Criteria andLeadDateLessThanOrEqualTo(Date value) {
            addCriterion("lead_date <=", value, "leadDate");
            return (Criteria) this;
        }

        public Criteria andLeadDateIn(List<Date> values) {
            addCriterion("lead_date in", values, "leadDate");
            return (Criteria) this;
        }

        public Criteria andLeadDateNotIn(List<Date> values) {
            addCriterion("lead_date not in", values, "leadDate");
            return (Criteria) this;
        }

        public Criteria andLeadDateBetween(Date value1, Date value2) {
            addCriterion("lead_date between", value1, value2, "leadDate");
            return (Criteria) this;
        }

        public Criteria andLeadDateNotBetween(Date value1, Date value2) {
            addCriterion("lead_date not between", value1, value2, "leadDate");
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