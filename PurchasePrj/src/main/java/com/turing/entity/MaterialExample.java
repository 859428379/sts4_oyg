package com.turing.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialExample() {
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

        public Criteria andMaterialNumIsNull() {
            addCriterion("material_num is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNumIsNotNull() {
            addCriterion("material_num is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNumEqualTo(String value) {
            addCriterion("material_num =", value, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumNotEqualTo(String value) {
            addCriterion("material_num <>", value, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumGreaterThan(String value) {
            addCriterion("material_num >", value, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumGreaterThanOrEqualTo(String value) {
            addCriterion("material_num >=", value, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumLessThan(String value) {
            addCriterion("material_num <", value, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumLessThanOrEqualTo(String value) {
            addCriterion("material_num <=", value, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumLike(String value) {
            addCriterion("material_num like", value, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumNotLike(String value) {
            addCriterion("material_num not like", value, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumIn(List<String> values) {
            addCriterion("material_num in", values, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumNotIn(List<String> values) {
            addCriterion("material_num not in", values, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumBetween(String value1, String value2) {
            addCriterion("material_num between", value1, value2, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNumNotBetween(String value1, String value2) {
            addCriterion("material_num not between", value1, value2, "materialNum");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNull() {
            addCriterion("material_name is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNotNull() {
            addCriterion("material_name is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameEqualTo(String value) {
            addCriterion("material_name =", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotEqualTo(String value) {
            addCriterion("material_name <>", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThan(String value) {
            addCriterion("material_name >", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThanOrEqualTo(String value) {
            addCriterion("material_name >=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThan(String value) {
            addCriterion("material_name <", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThanOrEqualTo(String value) {
            addCriterion("material_name <=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLike(String value) {
            addCriterion("material_name like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotLike(String value) {
            addCriterion("material_name not like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIn(List<String> values) {
            addCriterion("material_name in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotIn(List<String> values) {
            addCriterion("material_name not in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameBetween(String value1, String value2) {
            addCriterion("material_name between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotBetween(String value1, String value2) {
            addCriterion("material_name not between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitIsNull() {
            addCriterion("material_unit is null");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitIsNotNull() {
            addCriterion("material_unit is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitEqualTo(String value) {
            addCriterion("material_unit =", value, "materialUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitNotEqualTo(String value) {
            addCriterion("material_unit <>", value, "materialUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitGreaterThan(String value) {
            addCriterion("material_unit >", value, "materialUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitGreaterThanOrEqualTo(String value) {
            addCriterion("material_unit >=", value, "materialUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitLessThan(String value) {
            addCriterion("material_unit <", value, "materialUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitLessThanOrEqualTo(String value) {
            addCriterion("material_unit <=", value, "materialUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitLike(String value) {
            addCriterion("material_unit like", value, "materialUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitNotLike(String value) {
            addCriterion("material_unit not like", value, "materialUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitIn(List<String> values) {
            addCriterion("material_unit in", values, "materialUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitNotIn(List<String> values) {
            addCriterion("material_unit not in", values, "materialUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitBetween(String value1, String value2) {
            addCriterion("material_unit between", value1, value2, "materialUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitNotBetween(String value1, String value2) {
            addCriterion("material_unit not between", value1, value2, "materialUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialCountIsNull() {
            addCriterion("material_count is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCountIsNotNull() {
            addCriterion("material_count is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCountEqualTo(Long value) {
            addCriterion("material_count =", value, "materialCount");
            return (Criteria) this;
        }

        public Criteria andMaterialCountNotEqualTo(Long value) {
            addCriterion("material_count <>", value, "materialCount");
            return (Criteria) this;
        }

        public Criteria andMaterialCountGreaterThan(Long value) {
            addCriterion("material_count >", value, "materialCount");
            return (Criteria) this;
        }

        public Criteria andMaterialCountGreaterThanOrEqualTo(Long value) {
            addCriterion("material_count >=", value, "materialCount");
            return (Criteria) this;
        }

        public Criteria andMaterialCountLessThan(Long value) {
            addCriterion("material_count <", value, "materialCount");
            return (Criteria) this;
        }

        public Criteria andMaterialCountLessThanOrEqualTo(Long value) {
            addCriterion("material_count <=", value, "materialCount");
            return (Criteria) this;
        }

        public Criteria andMaterialCountIn(List<Long> values) {
            addCriterion("material_count in", values, "materialCount");
            return (Criteria) this;
        }

        public Criteria andMaterialCountNotIn(List<Long> values) {
            addCriterion("material_count not in", values, "materialCount");
            return (Criteria) this;
        }

        public Criteria andMaterialCountBetween(Long value1, Long value2) {
            addCriterion("material_count between", value1, value2, "materialCount");
            return (Criteria) this;
        }

        public Criteria andMaterialCountNotBetween(Long value1, Long value2) {
            addCriterion("material_count not between", value1, value2, "materialCount");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceIsNull() {
            addCriterion("material_price is null");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceIsNotNull() {
            addCriterion("material_price is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceEqualTo(BigDecimal value) {
            addCriterion("material_price =", value, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceNotEqualTo(BigDecimal value) {
            addCriterion("material_price <>", value, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceGreaterThan(BigDecimal value) {
            addCriterion("material_price >", value, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("material_price >=", value, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceLessThan(BigDecimal value) {
            addCriterion("material_price <", value, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("material_price <=", value, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceIn(List<BigDecimal> values) {
            addCriterion("material_price in", values, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceNotIn(List<BigDecimal> values) {
            addCriterion("material_price not in", values, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("material_price between", value1, value2, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("material_price not between", value1, value2, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIsNull() {
            addCriterion("specifications is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIsNotNull() {
            addCriterion("specifications is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsEqualTo(String value) {
            addCriterion("specifications =", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotEqualTo(String value) {
            addCriterion("specifications <>", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsGreaterThan(String value) {
            addCriterion("specifications >", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsGreaterThanOrEqualTo(String value) {
            addCriterion("specifications >=", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLessThan(String value) {
            addCriterion("specifications <", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLessThanOrEqualTo(String value) {
            addCriterion("specifications <=", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLike(String value) {
            addCriterion("specifications like", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotLike(String value) {
            addCriterion("specifications not like", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIn(List<String> values) {
            addCriterion("specifications in", values, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotIn(List<String> values) {
            addCriterion("specifications not in", values, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsBetween(String value1, String value2) {
            addCriterion("specifications between", value1, value2, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotBetween(String value1, String value2) {
            addCriterion("specifications not between", value1, value2, "specifications");
            return (Criteria) this;
        }

        public Criteria andMaterialAtandardIsNull() {
            addCriterion("material_atandard is null");
            return (Criteria) this;
        }

        public Criteria andMaterialAtandardIsNotNull() {
            addCriterion("material_atandard is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialAtandardEqualTo(String value) {
            addCriterion("material_atandard =", value, "materialAtandard");
            return (Criteria) this;
        }

        public Criteria andMaterialAtandardNotEqualTo(String value) {
            addCriterion("material_atandard <>", value, "materialAtandard");
            return (Criteria) this;
        }

        public Criteria andMaterialAtandardGreaterThan(String value) {
            addCriterion("material_atandard >", value, "materialAtandard");
            return (Criteria) this;
        }

        public Criteria andMaterialAtandardGreaterThanOrEqualTo(String value) {
            addCriterion("material_atandard >=", value, "materialAtandard");
            return (Criteria) this;
        }

        public Criteria andMaterialAtandardLessThan(String value) {
            addCriterion("material_atandard <", value, "materialAtandard");
            return (Criteria) this;
        }

        public Criteria andMaterialAtandardLessThanOrEqualTo(String value) {
            addCriterion("material_atandard <=", value, "materialAtandard");
            return (Criteria) this;
        }

        public Criteria andMaterialAtandardLike(String value) {
            addCriterion("material_atandard like", value, "materialAtandard");
            return (Criteria) this;
        }

        public Criteria andMaterialAtandardNotLike(String value) {
            addCriterion("material_atandard not like", value, "materialAtandard");
            return (Criteria) this;
        }

        public Criteria andMaterialAtandardIn(List<String> values) {
            addCriterion("material_atandard in", values, "materialAtandard");
            return (Criteria) this;
        }

        public Criteria andMaterialAtandardNotIn(List<String> values) {
            addCriterion("material_atandard not in", values, "materialAtandard");
            return (Criteria) this;
        }

        public Criteria andMaterialAtandardBetween(String value1, String value2) {
            addCriterion("material_atandard between", value1, value2, "materialAtandard");
            return (Criteria) this;
        }

        public Criteria andMaterialAtandardNotBetween(String value1, String value2) {
            addCriterion("material_atandard not between", value1, value2, "materialAtandard");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionIsNull() {
            addCriterion("material_description is null");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionIsNotNull() {
            addCriterion("material_description is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionEqualTo(String value) {
            addCriterion("material_description =", value, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionNotEqualTo(String value) {
            addCriterion("material_description <>", value, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionGreaterThan(String value) {
            addCriterion("material_description >", value, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("material_description >=", value, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionLessThan(String value) {
            addCriterion("material_description <", value, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionLessThanOrEqualTo(String value) {
            addCriterion("material_description <=", value, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionLike(String value) {
            addCriterion("material_description like", value, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionNotLike(String value) {
            addCriterion("material_description not like", value, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionIn(List<String> values) {
            addCriterion("material_description in", values, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionNotIn(List<String> values) {
            addCriterion("material_description not in", values, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionBetween(String value1, String value2) {
            addCriterion("material_description between", value1, value2, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionNotBetween(String value1, String value2) {
            addCriterion("material_description not between", value1, value2, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIsNull() {
            addCriterion("material_type is null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIsNotNull() {
            addCriterion("material_type is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeEqualTo(String value) {
            addCriterion("material_type =", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotEqualTo(String value) {
            addCriterion("material_type <>", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeGreaterThan(String value) {
            addCriterion("material_type >", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeGreaterThanOrEqualTo(String value) {
            addCriterion("material_type >=", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLessThan(String value) {
            addCriterion("material_type <", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLessThanOrEqualTo(String value) {
            addCriterion("material_type <=", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLike(String value) {
            addCriterion("material_type like", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotLike(String value) {
            addCriterion("material_type not like", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIn(List<String> values) {
            addCriterion("material_type in", values, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotIn(List<String> values) {
            addCriterion("material_type not in", values, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeBetween(String value1, String value2) {
            addCriterion("material_type between", value1, value2, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotBetween(String value1, String value2) {
            addCriterion("material_type not between", value1, value2, "materialType");
            return (Criteria) this;
        }

        public Criteria andTypeUnitIsNull() {
            addCriterion("type_unit is null");
            return (Criteria) this;
        }

        public Criteria andTypeUnitIsNotNull() {
            addCriterion("type_unit is not null");
            return (Criteria) this;
        }

        public Criteria andTypeUnitEqualTo(String value) {
            addCriterion("type_unit =", value, "typeUnit");
            return (Criteria) this;
        }

        public Criteria andTypeUnitNotEqualTo(String value) {
            addCriterion("type_unit <>", value, "typeUnit");
            return (Criteria) this;
        }

        public Criteria andTypeUnitGreaterThan(String value) {
            addCriterion("type_unit >", value, "typeUnit");
            return (Criteria) this;
        }

        public Criteria andTypeUnitGreaterThanOrEqualTo(String value) {
            addCriterion("type_unit >=", value, "typeUnit");
            return (Criteria) this;
        }

        public Criteria andTypeUnitLessThan(String value) {
            addCriterion("type_unit <", value, "typeUnit");
            return (Criteria) this;
        }

        public Criteria andTypeUnitLessThanOrEqualTo(String value) {
            addCriterion("type_unit <=", value, "typeUnit");
            return (Criteria) this;
        }

        public Criteria andTypeUnitLike(String value) {
            addCriterion("type_unit like", value, "typeUnit");
            return (Criteria) this;
        }

        public Criteria andTypeUnitNotLike(String value) {
            addCriterion("type_unit not like", value, "typeUnit");
            return (Criteria) this;
        }

        public Criteria andTypeUnitIn(List<String> values) {
            addCriterion("type_unit in", values, "typeUnit");
            return (Criteria) this;
        }

        public Criteria andTypeUnitNotIn(List<String> values) {
            addCriterion("type_unit not in", values, "typeUnit");
            return (Criteria) this;
        }

        public Criteria andTypeUnitBetween(String value1, String value2) {
            addCriterion("type_unit between", value1, value2, "typeUnit");
            return (Criteria) this;
        }

        public Criteria andTypeUnitNotBetween(String value1, String value2) {
            addCriterion("type_unit not between", value1, value2, "typeUnit");
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