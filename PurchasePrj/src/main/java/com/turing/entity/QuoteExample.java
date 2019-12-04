package com.turing.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuoteExample() {
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

        public Criteria andQuoteNumIsNull() {
            addCriterion("quote_num is null");
            return (Criteria) this;
        }

        public Criteria andQuoteNumIsNotNull() {
            addCriterion("quote_num is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteNumEqualTo(String value) {
            addCriterion("quote_num =", value, "quoteNum");
            return (Criteria) this;
        }

        public Criteria andQuoteNumNotEqualTo(String value) {
            addCriterion("quote_num <>", value, "quoteNum");
            return (Criteria) this;
        }

        public Criteria andQuoteNumGreaterThan(String value) {
            addCriterion("quote_num >", value, "quoteNum");
            return (Criteria) this;
        }

        public Criteria andQuoteNumGreaterThanOrEqualTo(String value) {
            addCriterion("quote_num >=", value, "quoteNum");
            return (Criteria) this;
        }

        public Criteria andQuoteNumLessThan(String value) {
            addCriterion("quote_num <", value, "quoteNum");
            return (Criteria) this;
        }

        public Criteria andQuoteNumLessThanOrEqualTo(String value) {
            addCriterion("quote_num <=", value, "quoteNum");
            return (Criteria) this;
        }

        public Criteria andQuoteNumLike(String value) {
            addCriterion("quote_num like", value, "quoteNum");
            return (Criteria) this;
        }

        public Criteria andQuoteNumNotLike(String value) {
            addCriterion("quote_num not like", value, "quoteNum");
            return (Criteria) this;
        }

        public Criteria andQuoteNumIn(List<String> values) {
            addCriterion("quote_num in", values, "quoteNum");
            return (Criteria) this;
        }

        public Criteria andQuoteNumNotIn(List<String> values) {
            addCriterion("quote_num not in", values, "quoteNum");
            return (Criteria) this;
        }

        public Criteria andQuoteNumBetween(String value1, String value2) {
            addCriterion("quote_num between", value1, value2, "quoteNum");
            return (Criteria) this;
        }

        public Criteria andQuoteNumNotBetween(String value1, String value2) {
            addCriterion("quote_num not between", value1, value2, "quoteNum");
            return (Criteria) this;
        }

        public Criteria andEnquireIdIsNull() {
            addCriterion("enquire_id is null");
            return (Criteria) this;
        }

        public Criteria andEnquireIdIsNotNull() {
            addCriterion("enquire_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnquireIdEqualTo(Long value) {
            addCriterion("enquire_id =", value, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdNotEqualTo(Long value) {
            addCriterion("enquire_id <>", value, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdGreaterThan(Long value) {
            addCriterion("enquire_id >", value, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdGreaterThanOrEqualTo(Long value) {
            addCriterion("enquire_id >=", value, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdLessThan(Long value) {
            addCriterion("enquire_id <", value, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdLessThanOrEqualTo(Long value) {
            addCriterion("enquire_id <=", value, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdIn(List<Long> values) {
            addCriterion("enquire_id in", values, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdNotIn(List<Long> values) {
            addCriterion("enquire_id not in", values, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdBetween(Long value1, Long value2) {
            addCriterion("enquire_id between", value1, value2, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdNotBetween(Long value1, Long value2) {
            addCriterion("enquire_id not between", value1, value2, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireNameIsNull() {
            addCriterion("enquire_name is null");
            return (Criteria) this;
        }

        public Criteria andEnquireNameIsNotNull() {
            addCriterion("enquire_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnquireNameEqualTo(String value) {
            addCriterion("enquire_name =", value, "enquireName");
            return (Criteria) this;
        }

        public Criteria andEnquireNameNotEqualTo(String value) {
            addCriterion("enquire_name <>", value, "enquireName");
            return (Criteria) this;
        }

        public Criteria andEnquireNameGreaterThan(String value) {
            addCriterion("enquire_name >", value, "enquireName");
            return (Criteria) this;
        }

        public Criteria andEnquireNameGreaterThanOrEqualTo(String value) {
            addCriterion("enquire_name >=", value, "enquireName");
            return (Criteria) this;
        }

        public Criteria andEnquireNameLessThan(String value) {
            addCriterion("enquire_name <", value, "enquireName");
            return (Criteria) this;
        }

        public Criteria andEnquireNameLessThanOrEqualTo(String value) {
            addCriterion("enquire_name <=", value, "enquireName");
            return (Criteria) this;
        }

        public Criteria andEnquireNameLike(String value) {
            addCriterion("enquire_name like", value, "enquireName");
            return (Criteria) this;
        }

        public Criteria andEnquireNameNotLike(String value) {
            addCriterion("enquire_name not like", value, "enquireName");
            return (Criteria) this;
        }

        public Criteria andEnquireNameIn(List<String> values) {
            addCriterion("enquire_name in", values, "enquireName");
            return (Criteria) this;
        }

        public Criteria andEnquireNameNotIn(List<String> values) {
            addCriterion("enquire_name not in", values, "enquireName");
            return (Criteria) this;
        }

        public Criteria andEnquireNameBetween(String value1, String value2) {
            addCriterion("enquire_name between", value1, value2, "enquireName");
            return (Criteria) this;
        }

        public Criteria andEnquireNameNotBetween(String value1, String value2) {
            addCriterion("enquire_name not between", value1, value2, "enquireName");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Long value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Long value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Long value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Long value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Long value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Long> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Long> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Long value1, Long value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Long value1, Long value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyIsNull() {
            addCriterion("quo_company is null");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyIsNotNull() {
            addCriterion("quo_company is not null");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyEqualTo(String value) {
            addCriterion("quo_company =", value, "quoCompany");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyNotEqualTo(String value) {
            addCriterion("quo_company <>", value, "quoCompany");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyGreaterThan(String value) {
            addCriterion("quo_company >", value, "quoCompany");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("quo_company >=", value, "quoCompany");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyLessThan(String value) {
            addCriterion("quo_company <", value, "quoCompany");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyLessThanOrEqualTo(String value) {
            addCriterion("quo_company <=", value, "quoCompany");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyLike(String value) {
            addCriterion("quo_company like", value, "quoCompany");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyNotLike(String value) {
            addCriterion("quo_company not like", value, "quoCompany");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyIn(List<String> values) {
            addCriterion("quo_company in", values, "quoCompany");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyNotIn(List<String> values) {
            addCriterion("quo_company not in", values, "quoCompany");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyBetween(String value1, String value2) {
            addCriterion("quo_company between", value1, value2, "quoCompany");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyNotBetween(String value1, String value2) {
            addCriterion("quo_company not between", value1, value2, "quoCompany");
            return (Criteria) this;
        }

        public Criteria andQuoAddressIsNull() {
            addCriterion("quo_address is null");
            return (Criteria) this;
        }

        public Criteria andQuoAddressIsNotNull() {
            addCriterion("quo_address is not null");
            return (Criteria) this;
        }

        public Criteria andQuoAddressEqualTo(String value) {
            addCriterion("quo_address =", value, "quoAddress");
            return (Criteria) this;
        }

        public Criteria andQuoAddressNotEqualTo(String value) {
            addCriterion("quo_address <>", value, "quoAddress");
            return (Criteria) this;
        }

        public Criteria andQuoAddressGreaterThan(String value) {
            addCriterion("quo_address >", value, "quoAddress");
            return (Criteria) this;
        }

        public Criteria andQuoAddressGreaterThanOrEqualTo(String value) {
            addCriterion("quo_address >=", value, "quoAddress");
            return (Criteria) this;
        }

        public Criteria andQuoAddressLessThan(String value) {
            addCriterion("quo_address <", value, "quoAddress");
            return (Criteria) this;
        }

        public Criteria andQuoAddressLessThanOrEqualTo(String value) {
            addCriterion("quo_address <=", value, "quoAddress");
            return (Criteria) this;
        }

        public Criteria andQuoAddressLike(String value) {
            addCriterion("quo_address like", value, "quoAddress");
            return (Criteria) this;
        }

        public Criteria andQuoAddressNotLike(String value) {
            addCriterion("quo_address not like", value, "quoAddress");
            return (Criteria) this;
        }

        public Criteria andQuoAddressIn(List<String> values) {
            addCriterion("quo_address in", values, "quoAddress");
            return (Criteria) this;
        }

        public Criteria andQuoAddressNotIn(List<String> values) {
            addCriterion("quo_address not in", values, "quoAddress");
            return (Criteria) this;
        }

        public Criteria andQuoAddressBetween(String value1, String value2) {
            addCriterion("quo_address between", value1, value2, "quoAddress");
            return (Criteria) this;
        }

        public Criteria andQuoAddressNotBetween(String value1, String value2) {
            addCriterion("quo_address not between", value1, value2, "quoAddress");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanIsNull() {
            addCriterion("quo_linkman is null");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanIsNotNull() {
            addCriterion("quo_linkman is not null");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanEqualTo(String value) {
            addCriterion("quo_linkman =", value, "quoLinkman");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanNotEqualTo(String value) {
            addCriterion("quo_linkman <>", value, "quoLinkman");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanGreaterThan(String value) {
            addCriterion("quo_linkman >", value, "quoLinkman");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("quo_linkman >=", value, "quoLinkman");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanLessThan(String value) {
            addCriterion("quo_linkman <", value, "quoLinkman");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanLessThanOrEqualTo(String value) {
            addCriterion("quo_linkman <=", value, "quoLinkman");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanLike(String value) {
            addCriterion("quo_linkman like", value, "quoLinkman");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanNotLike(String value) {
            addCriterion("quo_linkman not like", value, "quoLinkman");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanIn(List<String> values) {
            addCriterion("quo_linkman in", values, "quoLinkman");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanNotIn(List<String> values) {
            addCriterion("quo_linkman not in", values, "quoLinkman");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanBetween(String value1, String value2) {
            addCriterion("quo_linkman between", value1, value2, "quoLinkman");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanNotBetween(String value1, String value2) {
            addCriterion("quo_linkman not between", value1, value2, "quoLinkman");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneIsNull() {
            addCriterion("quo_phone is null");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneIsNotNull() {
            addCriterion("quo_phone is not null");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneEqualTo(String value) {
            addCriterion("quo_phone =", value, "quoPhone");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneNotEqualTo(String value) {
            addCriterion("quo_phone <>", value, "quoPhone");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneGreaterThan(String value) {
            addCriterion("quo_phone >", value, "quoPhone");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("quo_phone >=", value, "quoPhone");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneLessThan(String value) {
            addCriterion("quo_phone <", value, "quoPhone");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneLessThanOrEqualTo(String value) {
            addCriterion("quo_phone <=", value, "quoPhone");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneLike(String value) {
            addCriterion("quo_phone like", value, "quoPhone");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneNotLike(String value) {
            addCriterion("quo_phone not like", value, "quoPhone");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneIn(List<String> values) {
            addCriterion("quo_phone in", values, "quoPhone");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneNotIn(List<String> values) {
            addCriterion("quo_phone not in", values, "quoPhone");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneBetween(String value1, String value2) {
            addCriterion("quo_phone between", value1, value2, "quoPhone");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneNotBetween(String value1, String value2) {
            addCriterion("quo_phone not between", value1, value2, "quoPhone");
            return (Criteria) this;
        }

        public Criteria andQuoFaxIsNull() {
            addCriterion("quo_fax is null");
            return (Criteria) this;
        }

        public Criteria andQuoFaxIsNotNull() {
            addCriterion("quo_fax is not null");
            return (Criteria) this;
        }

        public Criteria andQuoFaxEqualTo(String value) {
            addCriterion("quo_fax =", value, "quoFax");
            return (Criteria) this;
        }

        public Criteria andQuoFaxNotEqualTo(String value) {
            addCriterion("quo_fax <>", value, "quoFax");
            return (Criteria) this;
        }

        public Criteria andQuoFaxGreaterThan(String value) {
            addCriterion("quo_fax >", value, "quoFax");
            return (Criteria) this;
        }

        public Criteria andQuoFaxGreaterThanOrEqualTo(String value) {
            addCriterion("quo_fax >=", value, "quoFax");
            return (Criteria) this;
        }

        public Criteria andQuoFaxLessThan(String value) {
            addCriterion("quo_fax <", value, "quoFax");
            return (Criteria) this;
        }

        public Criteria andQuoFaxLessThanOrEqualTo(String value) {
            addCriterion("quo_fax <=", value, "quoFax");
            return (Criteria) this;
        }

        public Criteria andQuoFaxLike(String value) {
            addCriterion("quo_fax like", value, "quoFax");
            return (Criteria) this;
        }

        public Criteria andQuoFaxNotLike(String value) {
            addCriterion("quo_fax not like", value, "quoFax");
            return (Criteria) this;
        }

        public Criteria andQuoFaxIn(List<String> values) {
            addCriterion("quo_fax in", values, "quoFax");
            return (Criteria) this;
        }

        public Criteria andQuoFaxNotIn(List<String> values) {
            addCriterion("quo_fax not in", values, "quoFax");
            return (Criteria) this;
        }

        public Criteria andQuoFaxBetween(String value1, String value2) {
            addCriterion("quo_fax between", value1, value2, "quoFax");
            return (Criteria) this;
        }

        public Criteria andQuoFaxNotBetween(String value1, String value2) {
            addCriterion("quo_fax not between", value1, value2, "quoFax");
            return (Criteria) this;
        }

        public Criteria andQuoEmailIsNull() {
            addCriterion("quo_email is null");
            return (Criteria) this;
        }

        public Criteria andQuoEmailIsNotNull() {
            addCriterion("quo_email is not null");
            return (Criteria) this;
        }

        public Criteria andQuoEmailEqualTo(String value) {
            addCriterion("quo_email =", value, "quoEmail");
            return (Criteria) this;
        }

        public Criteria andQuoEmailNotEqualTo(String value) {
            addCriterion("quo_email <>", value, "quoEmail");
            return (Criteria) this;
        }

        public Criteria andQuoEmailGreaterThan(String value) {
            addCriterion("quo_email >", value, "quoEmail");
            return (Criteria) this;
        }

        public Criteria andQuoEmailGreaterThanOrEqualTo(String value) {
            addCriterion("quo_email >=", value, "quoEmail");
            return (Criteria) this;
        }

        public Criteria andQuoEmailLessThan(String value) {
            addCriterion("quo_email <", value, "quoEmail");
            return (Criteria) this;
        }

        public Criteria andQuoEmailLessThanOrEqualTo(String value) {
            addCriterion("quo_email <=", value, "quoEmail");
            return (Criteria) this;
        }

        public Criteria andQuoEmailLike(String value) {
            addCriterion("quo_email like", value, "quoEmail");
            return (Criteria) this;
        }

        public Criteria andQuoEmailNotLike(String value) {
            addCriterion("quo_email not like", value, "quoEmail");
            return (Criteria) this;
        }

        public Criteria andQuoEmailIn(List<String> values) {
            addCriterion("quo_email in", values, "quoEmail");
            return (Criteria) this;
        }

        public Criteria andQuoEmailNotIn(List<String> values) {
            addCriterion("quo_email not in", values, "quoEmail");
            return (Criteria) this;
        }

        public Criteria andQuoEmailBetween(String value1, String value2) {
            addCriterion("quo_email between", value1, value2, "quoEmail");
            return (Criteria) this;
        }

        public Criteria andQuoEmailNotBetween(String value1, String value2) {
            addCriterion("quo_email not between", value1, value2, "quoEmail");
            return (Criteria) this;
        }

        public Criteria andQueTitleIsNull() {
            addCriterion("que_title is null");
            return (Criteria) this;
        }

        public Criteria andQueTitleIsNotNull() {
            addCriterion("que_title is not null");
            return (Criteria) this;
        }

        public Criteria andQueTitleEqualTo(String value) {
            addCriterion("que_title =", value, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleNotEqualTo(String value) {
            addCriterion("que_title <>", value, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleGreaterThan(String value) {
            addCriterion("que_title >", value, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleGreaterThanOrEqualTo(String value) {
            addCriterion("que_title >=", value, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleLessThan(String value) {
            addCriterion("que_title <", value, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleLessThanOrEqualTo(String value) {
            addCriterion("que_title <=", value, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleLike(String value) {
            addCriterion("que_title like", value, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleNotLike(String value) {
            addCriterion("que_title not like", value, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleIn(List<String> values) {
            addCriterion("que_title in", values, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleNotIn(List<String> values) {
            addCriterion("que_title not in", values, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleBetween(String value1, String value2) {
            addCriterion("que_title between", value1, value2, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleNotBetween(String value1, String value2) {
            addCriterion("que_title not between", value1, value2, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueDateIsNull() {
            addCriterion("que_date is null");
            return (Criteria) this;
        }

        public Criteria andQueDateIsNotNull() {
            addCriterion("que_date is not null");
            return (Criteria) this;
        }

        public Criteria andQueDateEqualTo(Date value) {
            addCriterion("que_date =", value, "queDate");
            return (Criteria) this;
        }

        public Criteria andQueDateNotEqualTo(Date value) {
            addCriterion("que_date <>", value, "queDate");
            return (Criteria) this;
        }

        public Criteria andQueDateGreaterThan(Date value) {
            addCriterion("que_date >", value, "queDate");
            return (Criteria) this;
        }

        public Criteria andQueDateGreaterThanOrEqualTo(Date value) {
            addCriterion("que_date >=", value, "queDate");
            return (Criteria) this;
        }

        public Criteria andQueDateLessThan(Date value) {
            addCriterion("que_date <", value, "queDate");
            return (Criteria) this;
        }

        public Criteria andQueDateLessThanOrEqualTo(Date value) {
            addCriterion("que_date <=", value, "queDate");
            return (Criteria) this;
        }

        public Criteria andQueDateIn(List<Date> values) {
            addCriterion("que_date in", values, "queDate");
            return (Criteria) this;
        }

        public Criteria andQueDateNotIn(List<Date> values) {
            addCriterion("que_date not in", values, "queDate");
            return (Criteria) this;
        }

        public Criteria andQueDateBetween(Date value1, Date value2) {
            addCriterion("que_date between", value1, value2, "queDate");
            return (Criteria) this;
        }

        public Criteria andQueDateNotBetween(Date value1, Date value2) {
            addCriterion("que_date not between", value1, value2, "queDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andSumAmountIsNull() {
            addCriterion("sum_amount is null");
            return (Criteria) this;
        }

        public Criteria andSumAmountIsNotNull() {
            addCriterion("sum_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSumAmountEqualTo(Integer value) {
            addCriterion("sum_amount =", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountNotEqualTo(Integer value) {
            addCriterion("sum_amount <>", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountGreaterThan(Integer value) {
            addCriterion("sum_amount >", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_amount >=", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountLessThan(Integer value) {
            addCriterion("sum_amount <", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountLessThanOrEqualTo(Integer value) {
            addCriterion("sum_amount <=", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountIn(List<Integer> values) {
            addCriterion("sum_amount in", values, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountNotIn(List<Integer> values) {
            addCriterion("sum_amount not in", values, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountBetween(Integer value1, Integer value2) {
            addCriterion("sum_amount between", value1, value2, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_amount not between", value1, value2, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andOverallPriceIsNull() {
            addCriterion("overall_price is null");
            return (Criteria) this;
        }

        public Criteria andOverallPriceIsNotNull() {
            addCriterion("overall_price is not null");
            return (Criteria) this;
        }

        public Criteria andOverallPriceEqualTo(BigDecimal value) {
            addCriterion("overall_price =", value, "overallPrice");
            return (Criteria) this;
        }

        public Criteria andOverallPriceNotEqualTo(BigDecimal value) {
            addCriterion("overall_price <>", value, "overallPrice");
            return (Criteria) this;
        }

        public Criteria andOverallPriceGreaterThan(BigDecimal value) {
            addCriterion("overall_price >", value, "overallPrice");
            return (Criteria) this;
        }

        public Criteria andOverallPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overall_price >=", value, "overallPrice");
            return (Criteria) this;
        }

        public Criteria andOverallPriceLessThan(BigDecimal value) {
            addCriterion("overall_price <", value, "overallPrice");
            return (Criteria) this;
        }

        public Criteria andOverallPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overall_price <=", value, "overallPrice");
            return (Criteria) this;
        }

        public Criteria andOverallPriceIn(List<BigDecimal> values) {
            addCriterion("overall_price in", values, "overallPrice");
            return (Criteria) this;
        }

        public Criteria andOverallPriceNotIn(List<BigDecimal> values) {
            addCriterion("overall_price not in", values, "overallPrice");
            return (Criteria) this;
        }

        public Criteria andOverallPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overall_price between", value1, value2, "overallPrice");
            return (Criteria) this;
        }

        public Criteria andOverallPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overall_price not between", value1, value2, "overallPrice");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkIsNull() {
            addCriterion("quo_remark is null");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkIsNotNull() {
            addCriterion("quo_remark is not null");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkEqualTo(String value) {
            addCriterion("quo_remark =", value, "quoRemark");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkNotEqualTo(String value) {
            addCriterion("quo_remark <>", value, "quoRemark");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkGreaterThan(String value) {
            addCriterion("quo_remark >", value, "quoRemark");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("quo_remark >=", value, "quoRemark");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkLessThan(String value) {
            addCriterion("quo_remark <", value, "quoRemark");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkLessThanOrEqualTo(String value) {
            addCriterion("quo_remark <=", value, "quoRemark");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkLike(String value) {
            addCriterion("quo_remark like", value, "quoRemark");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkNotLike(String value) {
            addCriterion("quo_remark not like", value, "quoRemark");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkIn(List<String> values) {
            addCriterion("quo_remark in", values, "quoRemark");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkNotIn(List<String> values) {
            addCriterion("quo_remark not in", values, "quoRemark");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkBetween(String value1, String value2) {
            addCriterion("quo_remark between", value1, value2, "quoRemark");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkNotBetween(String value1, String value2) {
            addCriterion("quo_remark not between", value1, value2, "quoRemark");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
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