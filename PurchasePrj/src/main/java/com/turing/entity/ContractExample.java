package com.turing.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractExample() {
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

        public Criteria andContNumIsNull() {
            addCriterion("cont_num is null");
            return (Criteria) this;
        }

        public Criteria andContNumIsNotNull() {
            addCriterion("cont_num is not null");
            return (Criteria) this;
        }

        public Criteria andContNumEqualTo(String value) {
            addCriterion("cont_num =", value, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumNotEqualTo(String value) {
            addCriterion("cont_num <>", value, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumGreaterThan(String value) {
            addCriterion("cont_num >", value, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumGreaterThanOrEqualTo(String value) {
            addCriterion("cont_num >=", value, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumLessThan(String value) {
            addCriterion("cont_num <", value, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumLessThanOrEqualTo(String value) {
            addCriterion("cont_num <=", value, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumLike(String value) {
            addCriterion("cont_num like", value, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumNotLike(String value) {
            addCriterion("cont_num not like", value, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumIn(List<String> values) {
            addCriterion("cont_num in", values, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumNotIn(List<String> values) {
            addCriterion("cont_num not in", values, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumBetween(String value1, String value2) {
            addCriterion("cont_num between", value1, value2, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumNotBetween(String value1, String value2) {
            addCriterion("cont_num not between", value1, value2, "contNum");
            return (Criteria) this;
        }

        public Criteria andBuyerIsNull() {
            addCriterion("buyer is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIsNotNull() {
            addCriterion("buyer is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerEqualTo(String value) {
            addCriterion("buyer =", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotEqualTo(String value) {
            addCriterion("buyer <>", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerGreaterThan(String value) {
            addCriterion("buyer >", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerGreaterThanOrEqualTo(String value) {
            addCriterion("buyer >=", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerLessThan(String value) {
            addCriterion("buyer <", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerLessThanOrEqualTo(String value) {
            addCriterion("buyer <=", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerLike(String value) {
            addCriterion("buyer like", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotLike(String value) {
            addCriterion("buyer not like", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerIn(List<String> values) {
            addCriterion("buyer in", values, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotIn(List<String> values) {
            addCriterion("buyer not in", values, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerBetween(String value1, String value2) {
            addCriterion("buyer between", value1, value2, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotBetween(String value1, String value2) {
            addCriterion("buyer not between", value1, value2, "buyer");
            return (Criteria) this;
        }

        public Criteria andSellerIsNull() {
            addCriterion("seller is null");
            return (Criteria) this;
        }

        public Criteria andSellerIsNotNull() {
            addCriterion("seller is not null");
            return (Criteria) this;
        }

        public Criteria andSellerEqualTo(String value) {
            addCriterion("seller =", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotEqualTo(String value) {
            addCriterion("seller <>", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerGreaterThan(String value) {
            addCriterion("seller >", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerGreaterThanOrEqualTo(String value) {
            addCriterion("seller >=", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerLessThan(String value) {
            addCriterion("seller <", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerLessThanOrEqualTo(String value) {
            addCriterion("seller <=", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerLike(String value) {
            addCriterion("seller like", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotLike(String value) {
            addCriterion("seller not like", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerIn(List<String> values) {
            addCriterion("seller in", values, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotIn(List<String> values) {
            addCriterion("seller not in", values, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerBetween(String value1, String value2) {
            addCriterion("seller between", value1, value2, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotBetween(String value1, String value2) {
            addCriterion("seller not between", value1, value2, "seller");
            return (Criteria) this;
        }

        public Criteria andSupplierNumIsNull() {
            addCriterion("supplier_num is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNumIsNotNull() {
            addCriterion("supplier_num is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNumEqualTo(String value) {
            addCriterion("supplier_num =", value, "supplierNum");
            return (Criteria) this;
        }

        public Criteria andSupplierNumNotEqualTo(String value) {
            addCriterion("supplier_num <>", value, "supplierNum");
            return (Criteria) this;
        }

        public Criteria andSupplierNumGreaterThan(String value) {
            addCriterion("supplier_num >", value, "supplierNum");
            return (Criteria) this;
        }

        public Criteria andSupplierNumGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_num >=", value, "supplierNum");
            return (Criteria) this;
        }

        public Criteria andSupplierNumLessThan(String value) {
            addCriterion("supplier_num <", value, "supplierNum");
            return (Criteria) this;
        }

        public Criteria andSupplierNumLessThanOrEqualTo(String value) {
            addCriterion("supplier_num <=", value, "supplierNum");
            return (Criteria) this;
        }

        public Criteria andSupplierNumLike(String value) {
            addCriterion("supplier_num like", value, "supplierNum");
            return (Criteria) this;
        }

        public Criteria andSupplierNumNotLike(String value) {
            addCriterion("supplier_num not like", value, "supplierNum");
            return (Criteria) this;
        }

        public Criteria andSupplierNumIn(List<String> values) {
            addCriterion("supplier_num in", values, "supplierNum");
            return (Criteria) this;
        }

        public Criteria andSupplierNumNotIn(List<String> values) {
            addCriterion("supplier_num not in", values, "supplierNum");
            return (Criteria) this;
        }

        public Criteria andSupplierNumBetween(String value1, String value2) {
            addCriterion("supplier_num between", value1, value2, "supplierNum");
            return (Criteria) this;
        }

        public Criteria andSupplierNumNotBetween(String value1, String value2) {
            addCriterion("supplier_num not between", value1, value2, "supplierNum");
            return (Criteria) this;
        }

        public Criteria andContDateIsNull() {
            addCriterion("cont_date is null");
            return (Criteria) this;
        }

        public Criteria andContDateIsNotNull() {
            addCriterion("cont_date is not null");
            return (Criteria) this;
        }

        public Criteria andContDateEqualTo(Date value) {
            addCriterion("cont_date =", value, "contDate");
            return (Criteria) this;
        }

        public Criteria andContDateNotEqualTo(Date value) {
            addCriterion("cont_date <>", value, "contDate");
            return (Criteria) this;
        }

        public Criteria andContDateGreaterThan(Date value) {
            addCriterion("cont_date >", value, "contDate");
            return (Criteria) this;
        }

        public Criteria andContDateGreaterThanOrEqualTo(Date value) {
            addCriterion("cont_date >=", value, "contDate");
            return (Criteria) this;
        }

        public Criteria andContDateLessThan(Date value) {
            addCriterion("cont_date <", value, "contDate");
            return (Criteria) this;
        }

        public Criteria andContDateLessThanOrEqualTo(Date value) {
            addCriterion("cont_date <=", value, "contDate");
            return (Criteria) this;
        }

        public Criteria andContDateIn(List<Date> values) {
            addCriterion("cont_date in", values, "contDate");
            return (Criteria) this;
        }

        public Criteria andContDateNotIn(List<Date> values) {
            addCriterion("cont_date not in", values, "contDate");
            return (Criteria) this;
        }

        public Criteria andContDateBetween(Date value1, Date value2) {
            addCriterion("cont_date between", value1, value2, "contDate");
            return (Criteria) this;
        }

        public Criteria andContDateNotBetween(Date value1, Date value2) {
            addCriterion("cont_date not between", value1, value2, "contDate");
            return (Criteria) this;
        }

        public Criteria andContTypeIsNull() {
            addCriterion("cont_type is null");
            return (Criteria) this;
        }

        public Criteria andContTypeIsNotNull() {
            addCriterion("cont_type is not null");
            return (Criteria) this;
        }

        public Criteria andContTypeEqualTo(String value) {
            addCriterion("cont_type =", value, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeNotEqualTo(String value) {
            addCriterion("cont_type <>", value, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeGreaterThan(String value) {
            addCriterion("cont_type >", value, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cont_type >=", value, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeLessThan(String value) {
            addCriterion("cont_type <", value, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeLessThanOrEqualTo(String value) {
            addCriterion("cont_type <=", value, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeLike(String value) {
            addCriterion("cont_type like", value, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeNotLike(String value) {
            addCriterion("cont_type not like", value, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeIn(List<String> values) {
            addCriterion("cont_type in", values, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeNotIn(List<String> values) {
            addCriterion("cont_type not in", values, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeBetween(String value1, String value2) {
            addCriterion("cont_type between", value1, value2, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeNotBetween(String value1, String value2) {
            addCriterion("cont_type not between", value1, value2, "contType");
            return (Criteria) this;
        }

        public Criteria andStockTypeIsNull() {
            addCriterion("stock_type is null");
            return (Criteria) this;
        }

        public Criteria andStockTypeIsNotNull() {
            addCriterion("stock_type is not null");
            return (Criteria) this;
        }

        public Criteria andStockTypeEqualTo(String value) {
            addCriterion("stock_type =", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotEqualTo(String value) {
            addCriterion("stock_type <>", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeGreaterThan(String value) {
            addCriterion("stock_type >", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_type >=", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeLessThan(String value) {
            addCriterion("stock_type <", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeLessThanOrEqualTo(String value) {
            addCriterion("stock_type <=", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeLike(String value) {
            addCriterion("stock_type like", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotLike(String value) {
            addCriterion("stock_type not like", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeIn(List<String> values) {
            addCriterion("stock_type in", values, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotIn(List<String> values) {
            addCriterion("stock_type not in", values, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeBetween(String value1, String value2) {
            addCriterion("stock_type between", value1, value2, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotBetween(String value1, String value2) {
            addCriterion("stock_type not between", value1, value2, "stockType");
            return (Criteria) this;
        }

        public Criteria andContItemIsNull() {
            addCriterion("cont_item is null");
            return (Criteria) this;
        }

        public Criteria andContItemIsNotNull() {
            addCriterion("cont_item is not null");
            return (Criteria) this;
        }

        public Criteria andContItemEqualTo(String value) {
            addCriterion("cont_item =", value, "contItem");
            return (Criteria) this;
        }

        public Criteria andContItemNotEqualTo(String value) {
            addCriterion("cont_item <>", value, "contItem");
            return (Criteria) this;
        }

        public Criteria andContItemGreaterThan(String value) {
            addCriterion("cont_item >", value, "contItem");
            return (Criteria) this;
        }

        public Criteria andContItemGreaterThanOrEqualTo(String value) {
            addCriterion("cont_item >=", value, "contItem");
            return (Criteria) this;
        }

        public Criteria andContItemLessThan(String value) {
            addCriterion("cont_item <", value, "contItem");
            return (Criteria) this;
        }

        public Criteria andContItemLessThanOrEqualTo(String value) {
            addCriterion("cont_item <=", value, "contItem");
            return (Criteria) this;
        }

        public Criteria andContItemLike(String value) {
            addCriterion("cont_item like", value, "contItem");
            return (Criteria) this;
        }

        public Criteria andContItemNotLike(String value) {
            addCriterion("cont_item not like", value, "contItem");
            return (Criteria) this;
        }

        public Criteria andContItemIn(List<String> values) {
            addCriterion("cont_item in", values, "contItem");
            return (Criteria) this;
        }

        public Criteria andContItemNotIn(List<String> values) {
            addCriterion("cont_item not in", values, "contItem");
            return (Criteria) this;
        }

        public Criteria andContItemBetween(String value1, String value2) {
            addCriterion("cont_item between", value1, value2, "contItem");
            return (Criteria) this;
        }

        public Criteria andContItemNotBetween(String value1, String value2) {
            addCriterion("cont_item not between", value1, value2, "contItem");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("money like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("money not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNull() {
            addCriterion("tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNotNull() {
            addCriterion("tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(String value) {
            addCriterion("tax_rate =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotEqualTo(String value) {
            addCriterion("tax_rate <>", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThan(String value) {
            addCriterion("tax_rate >", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThanOrEqualTo(String value) {
            addCriterion("tax_rate >=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThan(String value) {
            addCriterion("tax_rate <", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThanOrEqualTo(String value) {
            addCriterion("tax_rate <=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLike(String value) {
            addCriterion("tax_rate like", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotLike(String value) {
            addCriterion("tax_rate not like", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIn(List<String> values) {
            addCriterion("tax_rate in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotIn(List<String> values) {
            addCriterion("tax_rate not in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateBetween(String value1, String value2) {
            addCriterion("tax_rate between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotBetween(String value1, String value2) {
            addCriterion("tax_rate not between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andWrapBackIsNull() {
            addCriterion("wrap_back is null");
            return (Criteria) this;
        }

        public Criteria andWrapBackIsNotNull() {
            addCriterion("wrap_back is not null");
            return (Criteria) this;
        }

        public Criteria andWrapBackEqualTo(String value) {
            addCriterion("wrap_back =", value, "wrapBack");
            return (Criteria) this;
        }

        public Criteria andWrapBackNotEqualTo(String value) {
            addCriterion("wrap_back <>", value, "wrapBack");
            return (Criteria) this;
        }

        public Criteria andWrapBackGreaterThan(String value) {
            addCriterion("wrap_back >", value, "wrapBack");
            return (Criteria) this;
        }

        public Criteria andWrapBackGreaterThanOrEqualTo(String value) {
            addCriterion("wrap_back >=", value, "wrapBack");
            return (Criteria) this;
        }

        public Criteria andWrapBackLessThan(String value) {
            addCriterion("wrap_back <", value, "wrapBack");
            return (Criteria) this;
        }

        public Criteria andWrapBackLessThanOrEqualTo(String value) {
            addCriterion("wrap_back <=", value, "wrapBack");
            return (Criteria) this;
        }

        public Criteria andWrapBackLike(String value) {
            addCriterion("wrap_back like", value, "wrapBack");
            return (Criteria) this;
        }

        public Criteria andWrapBackNotLike(String value) {
            addCriterion("wrap_back not like", value, "wrapBack");
            return (Criteria) this;
        }

        public Criteria andWrapBackIn(List<String> values) {
            addCriterion("wrap_back in", values, "wrapBack");
            return (Criteria) this;
        }

        public Criteria andWrapBackNotIn(List<String> values) {
            addCriterion("wrap_back not in", values, "wrapBack");
            return (Criteria) this;
        }

        public Criteria andWrapBackBetween(String value1, String value2) {
            addCriterion("wrap_back between", value1, value2, "wrapBack");
            return (Criteria) this;
        }

        public Criteria andWrapBackNotBetween(String value1, String value2) {
            addCriterion("wrap_back not between", value1, value2, "wrapBack");
            return (Criteria) this;
        }

        public Criteria andVerifyStandIsNull() {
            addCriterion("verify_stand is null");
            return (Criteria) this;
        }

        public Criteria andVerifyStandIsNotNull() {
            addCriterion("verify_stand is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyStandEqualTo(String value) {
            addCriterion("verify_stand =", value, "verifyStand");
            return (Criteria) this;
        }

        public Criteria andVerifyStandNotEqualTo(String value) {
            addCriterion("verify_stand <>", value, "verifyStand");
            return (Criteria) this;
        }

        public Criteria andVerifyStandGreaterThan(String value) {
            addCriterion("verify_stand >", value, "verifyStand");
            return (Criteria) this;
        }

        public Criteria andVerifyStandGreaterThanOrEqualTo(String value) {
            addCriterion("verify_stand >=", value, "verifyStand");
            return (Criteria) this;
        }

        public Criteria andVerifyStandLessThan(String value) {
            addCriterion("verify_stand <", value, "verifyStand");
            return (Criteria) this;
        }

        public Criteria andVerifyStandLessThanOrEqualTo(String value) {
            addCriterion("verify_stand <=", value, "verifyStand");
            return (Criteria) this;
        }

        public Criteria andVerifyStandLike(String value) {
            addCriterion("verify_stand like", value, "verifyStand");
            return (Criteria) this;
        }

        public Criteria andVerifyStandNotLike(String value) {
            addCriterion("verify_stand not like", value, "verifyStand");
            return (Criteria) this;
        }

        public Criteria andVerifyStandIn(List<String> values) {
            addCriterion("verify_stand in", values, "verifyStand");
            return (Criteria) this;
        }

        public Criteria andVerifyStandNotIn(List<String> values) {
            addCriterion("verify_stand not in", values, "verifyStand");
            return (Criteria) this;
        }

        public Criteria andVerifyStandBetween(String value1, String value2) {
            addCriterion("verify_stand between", value1, value2, "verifyStand");
            return (Criteria) this;
        }

        public Criteria andVerifyStandNotBetween(String value1, String value2) {
            addCriterion("verify_stand not between", value1, value2, "verifyStand");
            return (Criteria) this;
        }

        public Criteria andModeIsNull() {
            addCriterion("`mode` is null");
            return (Criteria) this;
        }

        public Criteria andModeIsNotNull() {
            addCriterion("`mode` is not null");
            return (Criteria) this;
        }

        public Criteria andModeEqualTo(String value) {
            addCriterion("`mode` =", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotEqualTo(String value) {
            addCriterion("`mode` <>", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeGreaterThan(String value) {
            addCriterion("`mode` >", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeGreaterThanOrEqualTo(String value) {
            addCriterion("`mode` >=", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLessThan(String value) {
            addCriterion("`mode` <", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLessThanOrEqualTo(String value) {
            addCriterion("`mode` <=", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLike(String value) {
            addCriterion("`mode` like", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotLike(String value) {
            addCriterion("`mode` not like", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeIn(List<String> values) {
            addCriterion("`mode` in", values, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotIn(List<String> values) {
            addCriterion("`mode` not in", values, "mode");
            return (Criteria) this;
        }

        public Criteria andModeBetween(String value1, String value2) {
            addCriterion("`mode` between", value1, value2, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotBetween(String value1, String value2) {
            addCriterion("`mode` not between", value1, value2, "mode");
            return (Criteria) this;
        }

        public Criteria andPayCondIsNull() {
            addCriterion("pay_cond is null");
            return (Criteria) this;
        }

        public Criteria andPayCondIsNotNull() {
            addCriterion("pay_cond is not null");
            return (Criteria) this;
        }

        public Criteria andPayCondEqualTo(String value) {
            addCriterion("pay_cond =", value, "payCond");
            return (Criteria) this;
        }

        public Criteria andPayCondNotEqualTo(String value) {
            addCriterion("pay_cond <>", value, "payCond");
            return (Criteria) this;
        }

        public Criteria andPayCondGreaterThan(String value) {
            addCriterion("pay_cond >", value, "payCond");
            return (Criteria) this;
        }

        public Criteria andPayCondGreaterThanOrEqualTo(String value) {
            addCriterion("pay_cond >=", value, "payCond");
            return (Criteria) this;
        }

        public Criteria andPayCondLessThan(String value) {
            addCriterion("pay_cond <", value, "payCond");
            return (Criteria) this;
        }

        public Criteria andPayCondLessThanOrEqualTo(String value) {
            addCriterion("pay_cond <=", value, "payCond");
            return (Criteria) this;
        }

        public Criteria andPayCondLike(String value) {
            addCriterion("pay_cond like", value, "payCond");
            return (Criteria) this;
        }

        public Criteria andPayCondNotLike(String value) {
            addCriterion("pay_cond not like", value, "payCond");
            return (Criteria) this;
        }

        public Criteria andPayCondIn(List<String> values) {
            addCriterion("pay_cond in", values, "payCond");
            return (Criteria) this;
        }

        public Criteria andPayCondNotIn(List<String> values) {
            addCriterion("pay_cond not in", values, "payCond");
            return (Criteria) this;
        }

        public Criteria andPayCondBetween(String value1, String value2) {
            addCriterion("pay_cond between", value1, value2, "payCond");
            return (Criteria) this;
        }

        public Criteria andPayCondNotBetween(String value1, String value2) {
            addCriterion("pay_cond not between", value1, value2, "payCond");
            return (Criteria) this;
        }

        public Criteria andVerifyDateIsNull() {
            addCriterion("verify_date is null");
            return (Criteria) this;
        }

        public Criteria andVerifyDateIsNotNull() {
            addCriterion("verify_date is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyDateEqualTo(Date value) {
            addCriterion("verify_date =", value, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateNotEqualTo(Date value) {
            addCriterion("verify_date <>", value, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateGreaterThan(Date value) {
            addCriterion("verify_date >", value, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("verify_date >=", value, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateLessThan(Date value) {
            addCriterion("verify_date <", value, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateLessThanOrEqualTo(Date value) {
            addCriterion("verify_date <=", value, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateIn(List<Date> values) {
            addCriterion("verify_date in", values, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateNotIn(List<Date> values) {
            addCriterion("verify_date not in", values, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateBetween(Date value1, Date value2) {
            addCriterion("verify_date between", value1, value2, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateNotBetween(Date value1, Date value2) {
            addCriterion("verify_date not between", value1, value2, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andQualityStandIsNull() {
            addCriterion("quality_stand is null");
            return (Criteria) this;
        }

        public Criteria andQualityStandIsNotNull() {
            addCriterion("quality_stand is not null");
            return (Criteria) this;
        }

        public Criteria andQualityStandEqualTo(String value) {
            addCriterion("quality_stand =", value, "qualityStand");
            return (Criteria) this;
        }

        public Criteria andQualityStandNotEqualTo(String value) {
            addCriterion("quality_stand <>", value, "qualityStand");
            return (Criteria) this;
        }

        public Criteria andQualityStandGreaterThan(String value) {
            addCriterion("quality_stand >", value, "qualityStand");
            return (Criteria) this;
        }

        public Criteria andQualityStandGreaterThanOrEqualTo(String value) {
            addCriterion("quality_stand >=", value, "qualityStand");
            return (Criteria) this;
        }

        public Criteria andQualityStandLessThan(String value) {
            addCriterion("quality_stand <", value, "qualityStand");
            return (Criteria) this;
        }

        public Criteria andQualityStandLessThanOrEqualTo(String value) {
            addCriterion("quality_stand <=", value, "qualityStand");
            return (Criteria) this;
        }

        public Criteria andQualityStandLike(String value) {
            addCriterion("quality_stand like", value, "qualityStand");
            return (Criteria) this;
        }

        public Criteria andQualityStandNotLike(String value) {
            addCriterion("quality_stand not like", value, "qualityStand");
            return (Criteria) this;
        }

        public Criteria andQualityStandIn(List<String> values) {
            addCriterion("quality_stand in", values, "qualityStand");
            return (Criteria) this;
        }

        public Criteria andQualityStandNotIn(List<String> values) {
            addCriterion("quality_stand not in", values, "qualityStand");
            return (Criteria) this;
        }

        public Criteria andQualityStandBetween(String value1, String value2) {
            addCriterion("quality_stand between", value1, value2, "qualityStand");
            return (Criteria) this;
        }

        public Criteria andQualityStandNotBetween(String value1, String value2) {
            addCriterion("quality_stand not between", value1, value2, "qualityStand");
            return (Criteria) this;
        }

        public Criteria andStandardNoIsNull() {
            addCriterion("standard_no is null");
            return (Criteria) this;
        }

        public Criteria andStandardNoIsNotNull() {
            addCriterion("standard_no is not null");
            return (Criteria) this;
        }

        public Criteria andStandardNoEqualTo(String value) {
            addCriterion("standard_no =", value, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoNotEqualTo(String value) {
            addCriterion("standard_no <>", value, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoGreaterThan(String value) {
            addCriterion("standard_no >", value, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoGreaterThanOrEqualTo(String value) {
            addCriterion("standard_no >=", value, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoLessThan(String value) {
            addCriterion("standard_no <", value, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoLessThanOrEqualTo(String value) {
            addCriterion("standard_no <=", value, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoLike(String value) {
            addCriterion("standard_no like", value, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoNotLike(String value) {
            addCriterion("standard_no not like", value, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoIn(List<String> values) {
            addCriterion("standard_no in", values, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoNotIn(List<String> values) {
            addCriterion("standard_no not in", values, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoBetween(String value1, String value2) {
            addCriterion("standard_no between", value1, value2, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoNotBetween(String value1, String value2) {
            addCriterion("standard_no not between", value1, value2, "standardNo");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNull() {
            addCriterion("place is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("place is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("place =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("place <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("place >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("place >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("place <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("place <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("place like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("place not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("place in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("place not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("place between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("place not between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andContPriceIsNull() {
            addCriterion("cont_price is null");
            return (Criteria) this;
        }

        public Criteria andContPriceIsNotNull() {
            addCriterion("cont_price is not null");
            return (Criteria) this;
        }

        public Criteria andContPriceEqualTo(BigDecimal value) {
            addCriterion("cont_price =", value, "contPrice");
            return (Criteria) this;
        }

        public Criteria andContPriceNotEqualTo(BigDecimal value) {
            addCriterion("cont_price <>", value, "contPrice");
            return (Criteria) this;
        }

        public Criteria andContPriceGreaterThan(BigDecimal value) {
            addCriterion("cont_price >", value, "contPrice");
            return (Criteria) this;
        }

        public Criteria andContPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cont_price >=", value, "contPrice");
            return (Criteria) this;
        }

        public Criteria andContPriceLessThan(BigDecimal value) {
            addCriterion("cont_price <", value, "contPrice");
            return (Criteria) this;
        }

        public Criteria andContPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cont_price <=", value, "contPrice");
            return (Criteria) this;
        }

        public Criteria andContPriceIn(List<BigDecimal> values) {
            addCriterion("cont_price in", values, "contPrice");
            return (Criteria) this;
        }

        public Criteria andContPriceNotIn(List<BigDecimal> values) {
            addCriterion("cont_price not in", values, "contPrice");
            return (Criteria) this;
        }

        public Criteria andContPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cont_price between", value1, value2, "contPrice");
            return (Criteria) this;
        }

        public Criteria andContPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cont_price not between", value1, value2, "contPrice");
            return (Criteria) this;
        }

        public Criteria andTransportIsNull() {
            addCriterion("transport is null");
            return (Criteria) this;
        }

        public Criteria andTransportIsNotNull() {
            addCriterion("transport is not null");
            return (Criteria) this;
        }

        public Criteria andTransportEqualTo(String value) {
            addCriterion("transport =", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportNotEqualTo(String value) {
            addCriterion("transport <>", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportGreaterThan(String value) {
            addCriterion("transport >", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportGreaterThanOrEqualTo(String value) {
            addCriterion("transport >=", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportLessThan(String value) {
            addCriterion("transport <", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportLessThanOrEqualTo(String value) {
            addCriterion("transport <=", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportLike(String value) {
            addCriterion("transport like", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportNotLike(String value) {
            addCriterion("transport not like", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportIn(List<String> values) {
            addCriterion("transport in", values, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportNotIn(List<String> values) {
            addCriterion("transport not in", values, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportBetween(String value1, String value2) {
            addCriterion("transport between", value1, value2, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportNotBetween(String value1, String value2) {
            addCriterion("transport not between", value1, value2, "transport");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNull() {
            addCriterion("pay_way is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("pay_way is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(String value) {
            addCriterion("pay_way =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(String value) {
            addCriterion("pay_way <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(String value) {
            addCriterion("pay_way >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(String value) {
            addCriterion("pay_way >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(String value) {
            addCriterion("pay_way <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(String value) {
            addCriterion("pay_way <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLike(String value) {
            addCriterion("pay_way like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotLike(String value) {
            addCriterion("pay_way not like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<String> values) {
            addCriterion("pay_way in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<String> values) {
            addCriterion("pay_way not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(String value1, String value2) {
            addCriterion("pay_way between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(String value1, String value2) {
            addCriterion("pay_way not between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andOutPermIsNull() {
            addCriterion("out_perm is null");
            return (Criteria) this;
        }

        public Criteria andOutPermIsNotNull() {
            addCriterion("out_perm is not null");
            return (Criteria) this;
        }

        public Criteria andOutPermEqualTo(String value) {
            addCriterion("out_perm =", value, "outPerm");
            return (Criteria) this;
        }

        public Criteria andOutPermNotEqualTo(String value) {
            addCriterion("out_perm <>", value, "outPerm");
            return (Criteria) this;
        }

        public Criteria andOutPermGreaterThan(String value) {
            addCriterion("out_perm >", value, "outPerm");
            return (Criteria) this;
        }

        public Criteria andOutPermGreaterThanOrEqualTo(String value) {
            addCriterion("out_perm >=", value, "outPerm");
            return (Criteria) this;
        }

        public Criteria andOutPermLessThan(String value) {
            addCriterion("out_perm <", value, "outPerm");
            return (Criteria) this;
        }

        public Criteria andOutPermLessThanOrEqualTo(String value) {
            addCriterion("out_perm <=", value, "outPerm");
            return (Criteria) this;
        }

        public Criteria andOutPermLike(String value) {
            addCriterion("out_perm like", value, "outPerm");
            return (Criteria) this;
        }

        public Criteria andOutPermNotLike(String value) {
            addCriterion("out_perm not like", value, "outPerm");
            return (Criteria) this;
        }

        public Criteria andOutPermIn(List<String> values) {
            addCriterion("out_perm in", values, "outPerm");
            return (Criteria) this;
        }

        public Criteria andOutPermNotIn(List<String> values) {
            addCriterion("out_perm not in", values, "outPerm");
            return (Criteria) this;
        }

        public Criteria andOutPermBetween(String value1, String value2) {
            addCriterion("out_perm between", value1, value2, "outPerm");
            return (Criteria) this;
        }

        public Criteria andOutPermNotBetween(String value1, String value2) {
            addCriterion("out_perm not between", value1, value2, "outPerm");
            return (Criteria) this;
        }

        public Criteria andOutDayIsNull() {
            addCriterion("out_day is null");
            return (Criteria) this;
        }

        public Criteria andOutDayIsNotNull() {
            addCriterion("out_day is not null");
            return (Criteria) this;
        }

        public Criteria andOutDayEqualTo(String value) {
            addCriterion("out_day =", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayNotEqualTo(String value) {
            addCriterion("out_day <>", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayGreaterThan(String value) {
            addCriterion("out_day >", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayGreaterThanOrEqualTo(String value) {
            addCriterion("out_day >=", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayLessThan(String value) {
            addCriterion("out_day <", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayLessThanOrEqualTo(String value) {
            addCriterion("out_day <=", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayLike(String value) {
            addCriterion("out_day like", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayNotLike(String value) {
            addCriterion("out_day not like", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayIn(List<String> values) {
            addCriterion("out_day in", values, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayNotIn(List<String> values) {
            addCriterion("out_day not in", values, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayBetween(String value1, String value2) {
            addCriterion("out_day between", value1, value2, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayNotBetween(String value1, String value2) {
            addCriterion("out_day not between", value1, value2, "outDay");
            return (Criteria) this;
        }

        public Criteria andWrapRequireIsNull() {
            addCriterion("wrap_require is null");
            return (Criteria) this;
        }

        public Criteria andWrapRequireIsNotNull() {
            addCriterion("wrap_require is not null");
            return (Criteria) this;
        }

        public Criteria andWrapRequireEqualTo(String value) {
            addCriterion("wrap_require =", value, "wrapRequire");
            return (Criteria) this;
        }

        public Criteria andWrapRequireNotEqualTo(String value) {
            addCriterion("wrap_require <>", value, "wrapRequire");
            return (Criteria) this;
        }

        public Criteria andWrapRequireGreaterThan(String value) {
            addCriterion("wrap_require >", value, "wrapRequire");
            return (Criteria) this;
        }

        public Criteria andWrapRequireGreaterThanOrEqualTo(String value) {
            addCriterion("wrap_require >=", value, "wrapRequire");
            return (Criteria) this;
        }

        public Criteria andWrapRequireLessThan(String value) {
            addCriterion("wrap_require <", value, "wrapRequire");
            return (Criteria) this;
        }

        public Criteria andWrapRequireLessThanOrEqualTo(String value) {
            addCriterion("wrap_require <=", value, "wrapRequire");
            return (Criteria) this;
        }

        public Criteria andWrapRequireLike(String value) {
            addCriterion("wrap_require like", value, "wrapRequire");
            return (Criteria) this;
        }

        public Criteria andWrapRequireNotLike(String value) {
            addCriterion("wrap_require not like", value, "wrapRequire");
            return (Criteria) this;
        }

        public Criteria andWrapRequireIn(List<String> values) {
            addCriterion("wrap_require in", values, "wrapRequire");
            return (Criteria) this;
        }

        public Criteria andWrapRequireNotIn(List<String> values) {
            addCriterion("wrap_require not in", values, "wrapRequire");
            return (Criteria) this;
        }

        public Criteria andWrapRequireBetween(String value1, String value2) {
            addCriterion("wrap_require between", value1, value2, "wrapRequire");
            return (Criteria) this;
        }

        public Criteria andWrapRequireNotBetween(String value1, String value2) {
            addCriterion("wrap_require not between", value1, value2, "wrapRequire");
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