package com.whatbi.zq.dal.domain;

import com.common.mybatis.util.Page;
import java.util.ArrayList;
import java.util.List;

public class ZqDebtTransferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    protected String fullOrgPath;

    protected String owner;

    public ZqDebtTransferExample() {
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

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
    }

    public void setFullOrgPath(String fullOrgPath) {
        this.fullOrgPath=fullOrgPath;
    }

    public String getFullOrgPath() {
        return fullOrgPath;
    }

    public void setOwner(String owner) {
        this.owner=owner;
    }

    public String getOwner() {
        return owner;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table zq_debt_transfer
     *
     * @mbggenerated Thu Dec 11 01:56:23 CST 2014
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

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(String value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(String value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(String value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(String value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(String value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(String value) {
            addCriterion("is_deleted like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(String value) {
            addCriterion("is_deleted not like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<String> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<String> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(String value1, String value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(String value1, String value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Long value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Long value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Long value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Long value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Long value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Long value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Long> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Long> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Long value1, Long value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Long value1, Long value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Long value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Long value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Long value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Long value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Long value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Long value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Long> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Long> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Long value1, Long value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Long value1, Long value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andCustLendIdIsNull() {
            addCriterion("cust_lend_id is null");
            return (Criteria) this;
        }

        public Criteria andCustLendIdIsNotNull() {
            addCriterion("cust_lend_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustLendIdEqualTo(Long value) {
            addCriterion("cust_lend_id =", value, "custLendId");
            return (Criteria) this;
        }

        public Criteria andCustLendIdNotEqualTo(Long value) {
            addCriterion("cust_lend_id <>", value, "custLendId");
            return (Criteria) this;
        }

        public Criteria andCustLendIdGreaterThan(Long value) {
            addCriterion("cust_lend_id >", value, "custLendId");
            return (Criteria) this;
        }

        public Criteria andCustLendIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cust_lend_id >=", value, "custLendId");
            return (Criteria) this;
        }

        public Criteria andCustLendIdLessThan(Long value) {
            addCriterion("cust_lend_id <", value, "custLendId");
            return (Criteria) this;
        }

        public Criteria andCustLendIdLessThanOrEqualTo(Long value) {
            addCriterion("cust_lend_id <=", value, "custLendId");
            return (Criteria) this;
        }

        public Criteria andCustLendIdIn(List<Long> values) {
            addCriterion("cust_lend_id in", values, "custLendId");
            return (Criteria) this;
        }

        public Criteria andCustLendIdNotIn(List<Long> values) {
            addCriterion("cust_lend_id not in", values, "custLendId");
            return (Criteria) this;
        }

        public Criteria andCustLendIdBetween(Long value1, Long value2) {
            addCriterion("cust_lend_id between", value1, value2, "custLendId");
            return (Criteria) this;
        }

        public Criteria andCustLendIdNotBetween(Long value1, Long value2) {
            addCriterion("cust_lend_id not between", value1, value2, "custLendId");
            return (Criteria) this;
        }

        public Criteria andCustDebtIdIsNull() {
            addCriterion("cust_debt_id is null");
            return (Criteria) this;
        }

        public Criteria andCustDebtIdIsNotNull() {
            addCriterion("cust_debt_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustDebtIdEqualTo(Long value) {
            addCriterion("cust_debt_id =", value, "custDebtId");
            return (Criteria) this;
        }

        public Criteria andCustDebtIdNotEqualTo(Long value) {
            addCriterion("cust_debt_id <>", value, "custDebtId");
            return (Criteria) this;
        }

        public Criteria andCustDebtIdGreaterThan(Long value) {
            addCriterion("cust_debt_id >", value, "custDebtId");
            return (Criteria) this;
        }

        public Criteria andCustDebtIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cust_debt_id >=", value, "custDebtId");
            return (Criteria) this;
        }

        public Criteria andCustDebtIdLessThan(Long value) {
            addCriterion("cust_debt_id <", value, "custDebtId");
            return (Criteria) this;
        }

        public Criteria andCustDebtIdLessThanOrEqualTo(Long value) {
            addCriterion("cust_debt_id <=", value, "custDebtId");
            return (Criteria) this;
        }

        public Criteria andCustDebtIdIn(List<Long> values) {
            addCriterion("cust_debt_id in", values, "custDebtId");
            return (Criteria) this;
        }

        public Criteria andCustDebtIdNotIn(List<Long> values) {
            addCriterion("cust_debt_id not in", values, "custDebtId");
            return (Criteria) this;
        }

        public Criteria andCustDebtIdBetween(Long value1, Long value2) {
            addCriterion("cust_debt_id between", value1, value2, "custDebtId");
            return (Criteria) this;
        }

        public Criteria andCustDebtIdNotBetween(Long value1, Long value2) {
            addCriterion("cust_debt_id not between", value1, value2, "custDebtId");
            return (Criteria) this;
        }

        public Criteria andProStartdateIsNull() {
            addCriterion("pro_startdate is null");
            return (Criteria) this;
        }

        public Criteria andProStartdateIsNotNull() {
            addCriterion("pro_startdate is not null");
            return (Criteria) this;
        }

        public Criteria andProStartdateEqualTo(Long value) {
            addCriterion("pro_startdate =", value, "proStartdate");
            return (Criteria) this;
        }

        public Criteria andProStartdateNotEqualTo(Long value) {
            addCriterion("pro_startdate <>", value, "proStartdate");
            return (Criteria) this;
        }

        public Criteria andProStartdateGreaterThan(Long value) {
            addCriterion("pro_startdate >", value, "proStartdate");
            return (Criteria) this;
        }

        public Criteria andProStartdateGreaterThanOrEqualTo(Long value) {
            addCriterion("pro_startdate >=", value, "proStartdate");
            return (Criteria) this;
        }

        public Criteria andProStartdateLessThan(Long value) {
            addCriterion("pro_startdate <", value, "proStartdate");
            return (Criteria) this;
        }

        public Criteria andProStartdateLessThanOrEqualTo(Long value) {
            addCriterion("pro_startdate <=", value, "proStartdate");
            return (Criteria) this;
        }

        public Criteria andProStartdateIn(List<Long> values) {
            addCriterion("pro_startdate in", values, "proStartdate");
            return (Criteria) this;
        }

        public Criteria andProStartdateNotIn(List<Long> values) {
            addCriterion("pro_startdate not in", values, "proStartdate");
            return (Criteria) this;
        }

        public Criteria andProStartdateBetween(Long value1, Long value2) {
            addCriterion("pro_startdate between", value1, value2, "proStartdate");
            return (Criteria) this;
        }

        public Criteria andProStartdateNotBetween(Long value1, Long value2) {
            addCriterion("pro_startdate not between", value1, value2, "proStartdate");
            return (Criteria) this;
        }

        public Criteria andProEnddateIsNull() {
            addCriterion("pro_enddate is null");
            return (Criteria) this;
        }

        public Criteria andProEnddateIsNotNull() {
            addCriterion("pro_enddate is not null");
            return (Criteria) this;
        }

        public Criteria andProEnddateEqualTo(Long value) {
            addCriterion("pro_enddate =", value, "proEnddate");
            return (Criteria) this;
        }

        public Criteria andProEnddateNotEqualTo(Long value) {
            addCriterion("pro_enddate <>", value, "proEnddate");
            return (Criteria) this;
        }

        public Criteria andProEnddateGreaterThan(Long value) {
            addCriterion("pro_enddate >", value, "proEnddate");
            return (Criteria) this;
        }

        public Criteria andProEnddateGreaterThanOrEqualTo(Long value) {
            addCriterion("pro_enddate >=", value, "proEnddate");
            return (Criteria) this;
        }

        public Criteria andProEnddateLessThan(Long value) {
            addCriterion("pro_enddate <", value, "proEnddate");
            return (Criteria) this;
        }

        public Criteria andProEnddateLessThanOrEqualTo(Long value) {
            addCriterion("pro_enddate <=", value, "proEnddate");
            return (Criteria) this;
        }

        public Criteria andProEnddateIn(List<Long> values) {
            addCriterion("pro_enddate in", values, "proEnddate");
            return (Criteria) this;
        }

        public Criteria andProEnddateNotIn(List<Long> values) {
            addCriterion("pro_enddate not in", values, "proEnddate");
            return (Criteria) this;
        }

        public Criteria andProEnddateBetween(Long value1, Long value2) {
            addCriterion("pro_enddate between", value1, value2, "proEnddate");
            return (Criteria) this;
        }

        public Criteria andProEnddateNotBetween(Long value1, Long value2) {
            addCriterion("pro_enddate not between", value1, value2, "proEnddate");
            return (Criteria) this;
        }

        public Criteria andProRateIsNull() {
            addCriterion("pro_rate is null");
            return (Criteria) this;
        }

        public Criteria andProRateIsNotNull() {
            addCriterion("pro_rate is not null");
            return (Criteria) this;
        }

        public Criteria andProRateEqualTo(String value) {
            addCriterion("pro_rate =", value, "proRate");
            return (Criteria) this;
        }

        public Criteria andProRateNotEqualTo(String value) {
            addCriterion("pro_rate <>", value, "proRate");
            return (Criteria) this;
        }

        public Criteria andProRateGreaterThan(String value) {
            addCriterion("pro_rate >", value, "proRate");
            return (Criteria) this;
        }

        public Criteria andProRateGreaterThanOrEqualTo(String value) {
            addCriterion("pro_rate >=", value, "proRate");
            return (Criteria) this;
        }

        public Criteria andProRateLessThan(String value) {
            addCriterion("pro_rate <", value, "proRate");
            return (Criteria) this;
        }

        public Criteria andProRateLessThanOrEqualTo(String value) {
            addCriterion("pro_rate <=", value, "proRate");
            return (Criteria) this;
        }

        public Criteria andProRateLike(String value) {
            addCriterion("pro_rate like", value, "proRate");
            return (Criteria) this;
        }

        public Criteria andProRateNotLike(String value) {
            addCriterion("pro_rate not like", value, "proRate");
            return (Criteria) this;
        }

        public Criteria andProRateIn(List<String> values) {
            addCriterion("pro_rate in", values, "proRate");
            return (Criteria) this;
        }

        public Criteria andProRateNotIn(List<String> values) {
            addCriterion("pro_rate not in", values, "proRate");
            return (Criteria) this;
        }

        public Criteria andProRateBetween(String value1, String value2) {
            addCriterion("pro_rate between", value1, value2, "proRate");
            return (Criteria) this;
        }

        public Criteria andProRateNotBetween(String value1, String value2) {
            addCriterion("pro_rate not between", value1, value2, "proRate");
            return (Criteria) this;
        }

        public Criteria andProMoneyIsNull() {
            addCriterion("pro_money is null");
            return (Criteria) this;
        }

        public Criteria andProMoneyIsNotNull() {
            addCriterion("pro_money is not null");
            return (Criteria) this;
        }

        public Criteria andProMoneyEqualTo(Double value) {
            addCriterion("pro_money =", value, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyNotEqualTo(Double value) {
            addCriterion("pro_money <>", value, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyGreaterThan(Double value) {
            addCriterion("pro_money >", value, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("pro_money >=", value, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyLessThan(Double value) {
            addCriterion("pro_money <", value, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyLessThanOrEqualTo(Double value) {
            addCriterion("pro_money <=", value, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyIn(List<Double> values) {
            addCriterion("pro_money in", values, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyNotIn(List<Double> values) {
            addCriterion("pro_money not in", values, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyBetween(Double value1, Double value2) {
            addCriterion("pro_money between", value1, value2, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyNotBetween(Double value1, Double value2) {
            addCriterion("pro_money not between", value1, value2, "proMoney");
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

        public Criteria andRemarkEqualTo(Integer value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(Integer value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(Integer value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(Integer value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(Integer value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<Integer> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<Integer> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(Integer value1, Integer value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(Integer value1, Integer value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table zq_debt_transfer
     *
     * @mbggenerated do_not_delete_during_merge Thu Dec 11 01:56:23 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table zq_debt_transfer
     *
     * @mbggenerated Thu Dec 11 01:56:23 CST 2014
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