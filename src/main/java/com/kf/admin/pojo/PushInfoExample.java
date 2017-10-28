package com.kf.admin.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PushInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PushInfoExample() {
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

        public Criteria andPiIdIsNull() {
            addCriterion("pi_id is null");
            return (Criteria) this;
        }

        public Criteria andPiIdIsNotNull() {
            addCriterion("pi_id is not null");
            return (Criteria) this;
        }

        public Criteria andPiIdEqualTo(Integer value) {
            addCriterion("pi_id =", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdNotEqualTo(Integer value) {
            addCriterion("pi_id <>", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdGreaterThan(Integer value) {
            addCriterion("pi_id >", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pi_id >=", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdLessThan(Integer value) {
            addCriterion("pi_id <", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdLessThanOrEqualTo(Integer value) {
            addCriterion("pi_id <=", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdIn(List<Integer> values) {
            addCriterion("pi_id in", values, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdNotIn(List<Integer> values) {
            addCriterion("pi_id not in", values, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdBetween(Integer value1, Integer value2) {
            addCriterion("pi_id between", value1, value2, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pi_id not between", value1, value2, "piId");
            return (Criteria) this;
        }

        public Criteria andPiTitleIsNull() {
            addCriterion("pi_title is null");
            return (Criteria) this;
        }

        public Criteria andPiTitleIsNotNull() {
            addCriterion("pi_title is not null");
            return (Criteria) this;
        }

        public Criteria andPiTitleEqualTo(String value) {
            addCriterion("pi_title =", value, "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiTitleNotEqualTo(String value) {
            addCriterion("pi_title <>", value, "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiTitleGreaterThan(String value) {
            addCriterion("pi_title >", value, "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiTitleGreaterThanOrEqualTo(String value) {
            addCriterion("pi_title >=", value, "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiTitleLessThan(String value) {
            addCriterion("pi_title <", value, "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiTitleLessThanOrEqualTo(String value) {
            addCriterion("pi_title <=", value, "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiTitleLike(String value) {
            addCriterion("pi_title like", value, "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiTitleNotLike(String value) {
            addCriterion("pi_title not like", value, "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiTitleIn(List<String> values) {
            addCriterion("pi_title in", values, "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiTitleNotIn(List<String> values) {
            addCriterion("pi_title not in", values, "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiTitleBetween(String value1, String value2) {
            addCriterion("pi_title between", value1, value2, "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiTitleNotBetween(String value1, String value2) {
            addCriterion("pi_title not between", value1, value2, "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiContentIsNull() {
            addCriterion("pi_content is null");
            return (Criteria) this;
        }

        public Criteria andPiContentIsNotNull() {
            addCriterion("pi_content is not null");
            return (Criteria) this;
        }

        public Criteria andPiContentEqualTo(String value) {
            addCriterion("pi_content =", value, "piContent");
            return (Criteria) this;
        }

        public Criteria andPiContentNotEqualTo(String value) {
            addCriterion("pi_content <>", value, "piContent");
            return (Criteria) this;
        }

        public Criteria andPiContentGreaterThan(String value) {
            addCriterion("pi_content >", value, "piContent");
            return (Criteria) this;
        }

        public Criteria andPiContentGreaterThanOrEqualTo(String value) {
            addCriterion("pi_content >=", value, "piContent");
            return (Criteria) this;
        }

        public Criteria andPiContentLessThan(String value) {
            addCriterion("pi_content <", value, "piContent");
            return (Criteria) this;
        }

        public Criteria andPiContentLessThanOrEqualTo(String value) {
            addCriterion("pi_content <=", value, "piContent");
            return (Criteria) this;
        }

        public Criteria andPiContentLike(String value) {
            addCriterion("pi_content like", value, "piContent");
            return (Criteria) this;
        }

        public Criteria andPiContentNotLike(String value) {
            addCriterion("pi_content not like", value, "piContent");
            return (Criteria) this;
        }

        public Criteria andPiContentIn(List<String> values) {
            addCriterion("pi_content in", values, "piContent");
            return (Criteria) this;
        }

        public Criteria andPiContentNotIn(List<String> values) {
            addCriterion("pi_content not in", values, "piContent");
            return (Criteria) this;
        }

        public Criteria andPiContentBetween(String value1, String value2) {
            addCriterion("pi_content between", value1, value2, "piContent");
            return (Criteria) this;
        }

        public Criteria andPiContentNotBetween(String value1, String value2) {
            addCriterion("pi_content not between", value1, value2, "piContent");
            return (Criteria) this;
        }

        public Criteria andPiMcIsNull() {
            addCriterion("pi_mc is null");
            return (Criteria) this;
        }

        public Criteria andPiMcIsNotNull() {
            addCriterion("pi_mc is not null");
            return (Criteria) this;
        }

        public Criteria andPiMcEqualTo(Integer value) {
            addCriterion("pi_mc =", value, "piMc");
            return (Criteria) this;
        }

        public Criteria andPiMcNotEqualTo(Integer value) {
            addCriterion("pi_mc <>", value, "piMc");
            return (Criteria) this;
        }

        public Criteria andPiMcGreaterThan(Integer value) {
            addCriterion("pi_mc >", value, "piMc");
            return (Criteria) this;
        }

        public Criteria andPiMcGreaterThanOrEqualTo(Integer value) {
            addCriterion("pi_mc >=", value, "piMc");
            return (Criteria) this;
        }

        public Criteria andPiMcLessThan(Integer value) {
            addCriterion("pi_mc <", value, "piMc");
            return (Criteria) this;
        }

        public Criteria andPiMcLessThanOrEqualTo(Integer value) {
            addCriterion("pi_mc <=", value, "piMc");
            return (Criteria) this;
        }

        public Criteria andPiMcIn(List<Integer> values) {
            addCriterion("pi_mc in", values, "piMc");
            return (Criteria) this;
        }

        public Criteria andPiMcNotIn(List<Integer> values) {
            addCriterion("pi_mc not in", values, "piMc");
            return (Criteria) this;
        }

        public Criteria andPiMcBetween(Integer value1, Integer value2) {
            addCriterion("pi_mc between", value1, value2, "piMc");
            return (Criteria) this;
        }

        public Criteria andPiMcNotBetween(Integer value1, Integer value2) {
            addCriterion("pi_mc not between", value1, value2, "piMc");
            return (Criteria) this;
        }

        public Criteria andPiScIsNull() {
            addCriterion("pi_sc is null");
            return (Criteria) this;
        }

        public Criteria andPiScIsNotNull() {
            addCriterion("pi_sc is not null");
            return (Criteria) this;
        }

        public Criteria andPiScEqualTo(Integer value) {
            addCriterion("pi_sc =", value, "piSc");
            return (Criteria) this;
        }

        public Criteria andPiScNotEqualTo(Integer value) {
            addCriterion("pi_sc <>", value, "piSc");
            return (Criteria) this;
        }

        public Criteria andPiScGreaterThan(Integer value) {
            addCriterion("pi_sc >", value, "piSc");
            return (Criteria) this;
        }

        public Criteria andPiScGreaterThanOrEqualTo(Integer value) {
            addCriterion("pi_sc >=", value, "piSc");
            return (Criteria) this;
        }

        public Criteria andPiScLessThan(Integer value) {
            addCriterion("pi_sc <", value, "piSc");
            return (Criteria) this;
        }

        public Criteria andPiScLessThanOrEqualTo(Integer value) {
            addCriterion("pi_sc <=", value, "piSc");
            return (Criteria) this;
        }

        public Criteria andPiScIn(List<Integer> values) {
            addCriterion("pi_sc in", values, "piSc");
            return (Criteria) this;
        }

        public Criteria andPiScNotIn(List<Integer> values) {
            addCriterion("pi_sc not in", values, "piSc");
            return (Criteria) this;
        }

        public Criteria andPiScBetween(Integer value1, Integer value2) {
            addCriterion("pi_sc between", value1, value2, "piSc");
            return (Criteria) this;
        }

        public Criteria andPiScNotBetween(Integer value1, Integer value2) {
            addCriterion("pi_sc not between", value1, value2, "piSc");
            return (Criteria) this;
        }

        public Criteria andPiUserIsNull() {
            addCriterion("pi_user is null");
            return (Criteria) this;
        }

        public Criteria andPiUserIsNotNull() {
            addCriterion("pi_user is not null");
            return (Criteria) this;
        }

        public Criteria andPiUserEqualTo(Integer value) {
            addCriterion("pi_user =", value, "piUser");
            return (Criteria) this;
        }

        public Criteria andPiUserNotEqualTo(Integer value) {
            addCriterion("pi_user <>", value, "piUser");
            return (Criteria) this;
        }

        public Criteria andPiUserGreaterThan(Integer value) {
            addCriterion("pi_user >", value, "piUser");
            return (Criteria) this;
        }

        public Criteria andPiUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("pi_user >=", value, "piUser");
            return (Criteria) this;
        }

        public Criteria andPiUserLessThan(Integer value) {
            addCriterion("pi_user <", value, "piUser");
            return (Criteria) this;
        }

        public Criteria andPiUserLessThanOrEqualTo(Integer value) {
            addCriterion("pi_user <=", value, "piUser");
            return (Criteria) this;
        }

        public Criteria andPiUserIn(List<Integer> values) {
            addCriterion("pi_user in", values, "piUser");
            return (Criteria) this;
        }

        public Criteria andPiUserNotIn(List<Integer> values) {
            addCriterion("pi_user not in", values, "piUser");
            return (Criteria) this;
        }

        public Criteria andPiUserBetween(Integer value1, Integer value2) {
            addCriterion("pi_user between", value1, value2, "piUser");
            return (Criteria) this;
        }

        public Criteria andPiUserNotBetween(Integer value1, Integer value2) {
            addCriterion("pi_user not between", value1, value2, "piUser");
            return (Criteria) this;
        }

        public Criteria andPiAddressIsNull() {
            addCriterion("pi_address is null");
            return (Criteria) this;
        }

        public Criteria andPiAddressIsNotNull() {
            addCriterion("pi_address is not null");
            return (Criteria) this;
        }

        public Criteria andPiAddressEqualTo(String value) {
            addCriterion("pi_address =", value, "piAddress");
            return (Criteria) this;
        }

        public Criteria andPiAddressNotEqualTo(String value) {
            addCriterion("pi_address <>", value, "piAddress");
            return (Criteria) this;
        }

        public Criteria andPiAddressGreaterThan(String value) {
            addCriterion("pi_address >", value, "piAddress");
            return (Criteria) this;
        }

        public Criteria andPiAddressGreaterThanOrEqualTo(String value) {
            addCriterion("pi_address >=", value, "piAddress");
            return (Criteria) this;
        }

        public Criteria andPiAddressLessThan(String value) {
            addCriterion("pi_address <", value, "piAddress");
            return (Criteria) this;
        }

        public Criteria andPiAddressLessThanOrEqualTo(String value) {
            addCriterion("pi_address <=", value, "piAddress");
            return (Criteria) this;
        }

        public Criteria andPiAddressLike(String value) {
            addCriterion("pi_address like", value, "piAddress");
            return (Criteria) this;
        }

        public Criteria andPiAddressNotLike(String value) {
            addCriterion("pi_address not like", value, "piAddress");
            return (Criteria) this;
        }

        public Criteria andPiAddressIn(List<String> values) {
            addCriterion("pi_address in", values, "piAddress");
            return (Criteria) this;
        }

        public Criteria andPiAddressNotIn(List<String> values) {
            addCriterion("pi_address not in", values, "piAddress");
            return (Criteria) this;
        }

        public Criteria andPiAddressBetween(String value1, String value2) {
            addCriterion("pi_address between", value1, value2, "piAddress");
            return (Criteria) this;
        }

        public Criteria andPiAddressNotBetween(String value1, String value2) {
            addCriterion("pi_address not between", value1, value2, "piAddress");
            return (Criteria) this;
        }

        public Criteria andPiImgIsNull() {
            addCriterion("pi_img is null");
            return (Criteria) this;
        }

        public Criteria andPiImgIsNotNull() {
            addCriterion("pi_img is not null");
            return (Criteria) this;
        }

        public Criteria andPiImgEqualTo(String value) {
            addCriterion("pi_img =", value, "piImg");
            return (Criteria) this;
        }

        public Criteria andPiImgNotEqualTo(String value) {
            addCriterion("pi_img <>", value, "piImg");
            return (Criteria) this;
        }

        public Criteria andPiImgGreaterThan(String value) {
            addCriterion("pi_img >", value, "piImg");
            return (Criteria) this;
        }

        public Criteria andPiImgGreaterThanOrEqualTo(String value) {
            addCriterion("pi_img >=", value, "piImg");
            return (Criteria) this;
        }

        public Criteria andPiImgLessThan(String value) {
            addCriterion("pi_img <", value, "piImg");
            return (Criteria) this;
        }

        public Criteria andPiImgLessThanOrEqualTo(String value) {
            addCriterion("pi_img <=", value, "piImg");
            return (Criteria) this;
        }

        public Criteria andPiImgLike(String value) {
            addCriterion("pi_img like", value, "piImg");
            return (Criteria) this;
        }

        public Criteria andPiImgNotLike(String value) {
            addCriterion("pi_img not like", value, "piImg");
            return (Criteria) this;
        }

        public Criteria andPiImgIn(List<String> values) {
            addCriterion("pi_img in", values, "piImg");
            return (Criteria) this;
        }

        public Criteria andPiImgNotIn(List<String> values) {
            addCriterion("pi_img not in", values, "piImg");
            return (Criteria) this;
        }

        public Criteria andPiImgBetween(String value1, String value2) {
            addCriterion("pi_img between", value1, value2, "piImg");
            return (Criteria) this;
        }

        public Criteria andPiImgNotBetween(String value1, String value2) {
            addCriterion("pi_img not between", value1, value2, "piImg");
            return (Criteria) this;
        }

        public Criteria andPiScanIsNull() {
            addCriterion("pi_scan is null");
            return (Criteria) this;
        }

        public Criteria andPiScanIsNotNull() {
            addCriterion("pi_scan is not null");
            return (Criteria) this;
        }

        public Criteria andPiScanEqualTo(Integer value) {
            addCriterion("pi_scan =", value, "piScan");
            return (Criteria) this;
        }

        public Criteria andPiScanNotEqualTo(Integer value) {
            addCriterion("pi_scan <>", value, "piScan");
            return (Criteria) this;
        }

        public Criteria andPiScanGreaterThan(Integer value) {
            addCriterion("pi_scan >", value, "piScan");
            return (Criteria) this;
        }

        public Criteria andPiScanGreaterThanOrEqualTo(Integer value) {
            addCriterion("pi_scan >=", value, "piScan");
            return (Criteria) this;
        }

        public Criteria andPiScanLessThan(Integer value) {
            addCriterion("pi_scan <", value, "piScan");
            return (Criteria) this;
        }

        public Criteria andPiScanLessThanOrEqualTo(Integer value) {
            addCriterion("pi_scan <=", value, "piScan");
            return (Criteria) this;
        }

        public Criteria andPiScanIn(List<Integer> values) {
            addCriterion("pi_scan in", values, "piScan");
            return (Criteria) this;
        }

        public Criteria andPiScanNotIn(List<Integer> values) {
            addCriterion("pi_scan not in", values, "piScan");
            return (Criteria) this;
        }

        public Criteria andPiScanBetween(Integer value1, Integer value2) {
            addCriterion("pi_scan between", value1, value2, "piScan");
            return (Criteria) this;
        }

        public Criteria andPiScanNotBetween(Integer value1, Integer value2) {
            addCriterion("pi_scan not between", value1, value2, "piScan");
            return (Criteria) this;
        }

        public Criteria andPiPushDateIsNull() {
            addCriterion("pi_push_date is null");
            return (Criteria) this;
        }

        public Criteria andPiPushDateIsNotNull() {
            addCriterion("pi_push_date is not null");
            return (Criteria) this;
        }

        public Criteria andPiPushDateEqualTo(Date value) {
            addCriterion("pi_push_date =", value, "piPushDate");
            return (Criteria) this;
        }

        public Criteria andPiPushDateNotEqualTo(Date value) {
            addCriterion("pi_push_date <>", value, "piPushDate");
            return (Criteria) this;
        }

        public Criteria andPiPushDateGreaterThan(Date value) {
            addCriterion("pi_push_date >", value, "piPushDate");
            return (Criteria) this;
        }

        public Criteria andPiPushDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pi_push_date >=", value, "piPushDate");
            return (Criteria) this;
        }

        public Criteria andPiPushDateLessThan(Date value) {
            addCriterion("pi_push_date <", value, "piPushDate");
            return (Criteria) this;
        }

        public Criteria andPiPushDateLessThanOrEqualTo(Date value) {
            addCriterion("pi_push_date <=", value, "piPushDate");
            return (Criteria) this;
        }

        public Criteria andPiPushDateIn(List<Date> values) {
            addCriterion("pi_push_date in", values, "piPushDate");
            return (Criteria) this;
        }

        public Criteria andPiPushDateNotIn(List<Date> values) {
            addCriterion("pi_push_date not in", values, "piPushDate");
            return (Criteria) this;
        }

        public Criteria andPiPushDateBetween(Date value1, Date value2) {
            addCriterion("pi_push_date between", value1, value2, "piPushDate");
            return (Criteria) this;
        }

        public Criteria andPiPushDateNotBetween(Date value1, Date value2) {
            addCriterion("pi_push_date not between", value1, value2, "piPushDate");
            return (Criteria) this;
        }

        public Criteria andPiChujiaIsNull() {
            addCriterion("pi_chujia is null");
            return (Criteria) this;
        }

        public Criteria andPiChujiaIsNotNull() {
            addCriterion("pi_chujia is not null");
            return (Criteria) this;
        }

        public Criteria andPiChujiaEqualTo(Double value) {
            addCriterion("pi_chujia =", value, "piChujia");
            return (Criteria) this;
        }

        public Criteria andPiChujiaNotEqualTo(Double value) {
            addCriterion("pi_chujia <>", value, "piChujia");
            return (Criteria) this;
        }

        public Criteria andPiChujiaGreaterThan(Double value) {
            addCriterion("pi_chujia >", value, "piChujia");
            return (Criteria) this;
        }

        public Criteria andPiChujiaGreaterThanOrEqualTo(Double value) {
            addCriterion("pi_chujia >=", value, "piChujia");
            return (Criteria) this;
        }

        public Criteria andPiChujiaLessThan(Double value) {
            addCriterion("pi_chujia <", value, "piChujia");
            return (Criteria) this;
        }

        public Criteria andPiChujiaLessThanOrEqualTo(Double value) {
            addCriterion("pi_chujia <=", value, "piChujia");
            return (Criteria) this;
        }

        public Criteria andPiChujiaIn(List<Double> values) {
            addCriterion("pi_chujia in", values, "piChujia");
            return (Criteria) this;
        }

        public Criteria andPiChujiaNotIn(List<Double> values) {
            addCriterion("pi_chujia not in", values, "piChujia");
            return (Criteria) this;
        }

        public Criteria andPiChujiaBetween(Double value1, Double value2) {
            addCriterion("pi_chujia between", value1, value2, "piChujia");
            return (Criteria) this;
        }

        public Criteria andPiChujiaNotBetween(Double value1, Double value2) {
            addCriterion("pi_chujia not between", value1, value2, "piChujia");
            return (Criteria) this;
        }

        public Criteria andPiZhidingIsNull() {
            addCriterion("pi_zhiding is null");
            return (Criteria) this;
        }

        public Criteria andPiZhidingIsNotNull() {
            addCriterion("pi_zhiding is not null");
            return (Criteria) this;
        }

        public Criteria andPiZhidingEqualTo(String value) {
            addCriterion("pi_zhiding =", value, "piZhiding");
            return (Criteria) this;
        }

        public Criteria andPiZhidingNotEqualTo(String value) {
            addCriterion("pi_zhiding <>", value, "piZhiding");
            return (Criteria) this;
        }

        public Criteria andPiZhidingGreaterThan(String value) {
            addCriterion("pi_zhiding >", value, "piZhiding");
            return (Criteria) this;
        }

        public Criteria andPiZhidingGreaterThanOrEqualTo(String value) {
            addCriterion("pi_zhiding >=", value, "piZhiding");
            return (Criteria) this;
        }

        public Criteria andPiZhidingLessThan(String value) {
            addCriterion("pi_zhiding <", value, "piZhiding");
            return (Criteria) this;
        }

        public Criteria andPiZhidingLessThanOrEqualTo(String value) {
            addCriterion("pi_zhiding <=", value, "piZhiding");
            return (Criteria) this;
        }

        public Criteria andPiZhidingLike(String value) {
            addCriterion("pi_zhiding like", value, "piZhiding");
            return (Criteria) this;
        }

        public Criteria andPiZhidingNotLike(String value) {
            addCriterion("pi_zhiding not like", value, "piZhiding");
            return (Criteria) this;
        }

        public Criteria andPiZhidingIn(List<String> values) {
            addCriterion("pi_zhiding in", values, "piZhiding");
            return (Criteria) this;
        }

        public Criteria andPiZhidingNotIn(List<String> values) {
            addCriterion("pi_zhiding not in", values, "piZhiding");
            return (Criteria) this;
        }

        public Criteria andPiZhidingBetween(String value1, String value2) {
            addCriterion("pi_zhiding between", value1, value2, "piZhiding");
            return (Criteria) this;
        }

        public Criteria andPiZhidingNotBetween(String value1, String value2) {
            addCriterion("pi_zhiding not between", value1, value2, "piZhiding");
            return (Criteria) this;
        }

        public Criteria andPiContactPersonIsNull() {
            addCriterion("pi_contact_person is null");
            return (Criteria) this;
        }

        public Criteria andPiContactPersonIsNotNull() {
            addCriterion("pi_contact_person is not null");
            return (Criteria) this;
        }

        public Criteria andPiContactPersonEqualTo(String value) {
            addCriterion("pi_contact_person =", value, "piContactPerson");
            return (Criteria) this;
        }

        public Criteria andPiContactPersonNotEqualTo(String value) {
            addCriterion("pi_contact_person <>", value, "piContactPerson");
            return (Criteria) this;
        }

        public Criteria andPiContactPersonGreaterThan(String value) {
            addCriterion("pi_contact_person >", value, "piContactPerson");
            return (Criteria) this;
        }

        public Criteria andPiContactPersonGreaterThanOrEqualTo(String value) {
            addCriterion("pi_contact_person >=", value, "piContactPerson");
            return (Criteria) this;
        }

        public Criteria andPiContactPersonLessThan(String value) {
            addCriterion("pi_contact_person <", value, "piContactPerson");
            return (Criteria) this;
        }

        public Criteria andPiContactPersonLessThanOrEqualTo(String value) {
            addCriterion("pi_contact_person <=", value, "piContactPerson");
            return (Criteria) this;
        }

        public Criteria andPiContactPersonLike(String value) {
            addCriterion("pi_contact_person like", value, "piContactPerson");
            return (Criteria) this;
        }

        public Criteria andPiContactPersonNotLike(String value) {
            addCriterion("pi_contact_person not like", value, "piContactPerson");
            return (Criteria) this;
        }

        public Criteria andPiContactPersonIn(List<String> values) {
            addCriterion("pi_contact_person in", values, "piContactPerson");
            return (Criteria) this;
        }

        public Criteria andPiContactPersonNotIn(List<String> values) {
            addCriterion("pi_contact_person not in", values, "piContactPerson");
            return (Criteria) this;
        }

        public Criteria andPiContactPersonBetween(String value1, String value2) {
            addCriterion("pi_contact_person between", value1, value2, "piContactPerson");
            return (Criteria) this;
        }

        public Criteria andPiContactPersonNotBetween(String value1, String value2) {
            addCriterion("pi_contact_person not between", value1, value2, "piContactPerson");
            return (Criteria) this;
        }

        public Criteria andPiPhoneIsNull() {
            addCriterion("pi_phone is null");
            return (Criteria) this;
        }

        public Criteria andPiPhoneIsNotNull() {
            addCriterion("pi_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPiPhoneEqualTo(String value) {
            addCriterion("pi_phone =", value, "piPhone");
            return (Criteria) this;
        }

        public Criteria andPiPhoneNotEqualTo(String value) {
            addCriterion("pi_phone <>", value, "piPhone");
            return (Criteria) this;
        }

        public Criteria andPiPhoneGreaterThan(String value) {
            addCriterion("pi_phone >", value, "piPhone");
            return (Criteria) this;
        }

        public Criteria andPiPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("pi_phone >=", value, "piPhone");
            return (Criteria) this;
        }

        public Criteria andPiPhoneLessThan(String value) {
            addCriterion("pi_phone <", value, "piPhone");
            return (Criteria) this;
        }

        public Criteria andPiPhoneLessThanOrEqualTo(String value) {
            addCriterion("pi_phone <=", value, "piPhone");
            return (Criteria) this;
        }

        public Criteria andPiPhoneLike(String value) {
            addCriterion("pi_phone like", value, "piPhone");
            return (Criteria) this;
        }

        public Criteria andPiPhoneNotLike(String value) {
            addCriterion("pi_phone not like", value, "piPhone");
            return (Criteria) this;
        }

        public Criteria andPiPhoneIn(List<String> values) {
            addCriterion("pi_phone in", values, "piPhone");
            return (Criteria) this;
        }

        public Criteria andPiPhoneNotIn(List<String> values) {
            addCriterion("pi_phone not in", values, "piPhone");
            return (Criteria) this;
        }

        public Criteria andPiPhoneBetween(String value1, String value2) {
            addCriterion("pi_phone between", value1, value2, "piPhone");
            return (Criteria) this;
        }

        public Criteria andPiPhoneNotBetween(String value1, String value2) {
            addCriterion("pi_phone not between", value1, value2, "piPhone");
            return (Criteria) this;
        }

        public Criteria andPiQqIsNull() {
            addCriterion("pi_qq is null");
            return (Criteria) this;
        }

        public Criteria andPiQqIsNotNull() {
            addCriterion("pi_qq is not null");
            return (Criteria) this;
        }

        public Criteria andPiQqEqualTo(String value) {
            addCriterion("pi_qq =", value, "piQq");
            return (Criteria) this;
        }

        public Criteria andPiQqNotEqualTo(String value) {
            addCriterion("pi_qq <>", value, "piQq");
            return (Criteria) this;
        }

        public Criteria andPiQqGreaterThan(String value) {
            addCriterion("pi_qq >", value, "piQq");
            return (Criteria) this;
        }

        public Criteria andPiQqGreaterThanOrEqualTo(String value) {
            addCriterion("pi_qq >=", value, "piQq");
            return (Criteria) this;
        }

        public Criteria andPiQqLessThan(String value) {
            addCriterion("pi_qq <", value, "piQq");
            return (Criteria) this;
        }

        public Criteria andPiQqLessThanOrEqualTo(String value) {
            addCriterion("pi_qq <=", value, "piQq");
            return (Criteria) this;
        }

        public Criteria andPiQqLike(String value) {
            addCriterion("pi_qq like", value, "piQq");
            return (Criteria) this;
        }

        public Criteria andPiQqNotLike(String value) {
            addCriterion("pi_qq not like", value, "piQq");
            return (Criteria) this;
        }

        public Criteria andPiQqIn(List<String> values) {
            addCriterion("pi_qq in", values, "piQq");
            return (Criteria) this;
        }

        public Criteria andPiQqNotIn(List<String> values) {
            addCriterion("pi_qq not in", values, "piQq");
            return (Criteria) this;
        }

        public Criteria andPiQqBetween(String value1, String value2) {
            addCriterion("pi_qq between", value1, value2, "piQq");
            return (Criteria) this;
        }

        public Criteria andPiQqNotBetween(String value1, String value2) {
            addCriterion("pi_qq not between", value1, value2, "piQq");
            return (Criteria) this;
        }

        public Criteria andPiDistrictIsNull() {
            addCriterion("pi_district is null");
            return (Criteria) this;
        }

        public Criteria andPiDistrictIsNotNull() {
            addCriterion("pi_district is not null");
            return (Criteria) this;
        }

        public Criteria andPiDistrictEqualTo(Integer value) {
            addCriterion("pi_district =", value, "piDistrict");
            return (Criteria) this;
        }

        public Criteria andPiDistrictNotEqualTo(Integer value) {
            addCriterion("pi_district <>", value, "piDistrict");
            return (Criteria) this;
        }

        public Criteria andPiDistrictGreaterThan(Integer value) {
            addCriterion("pi_district >", value, "piDistrict");
            return (Criteria) this;
        }

        public Criteria andPiDistrictGreaterThanOrEqualTo(Integer value) {
            addCriterion("pi_district >=", value, "piDistrict");
            return (Criteria) this;
        }

        public Criteria andPiDistrictLessThan(Integer value) {
            addCriterion("pi_district <", value, "piDistrict");
            return (Criteria) this;
        }

        public Criteria andPiDistrictLessThanOrEqualTo(Integer value) {
            addCriterion("pi_district <=", value, "piDistrict");
            return (Criteria) this;
        }

        public Criteria andPiDistrictIn(List<Integer> values) {
            addCriterion("pi_district in", values, "piDistrict");
            return (Criteria) this;
        }

        public Criteria andPiDistrictNotIn(List<Integer> values) {
            addCriterion("pi_district not in", values, "piDistrict");
            return (Criteria) this;
        }

        public Criteria andPiDistrictBetween(Integer value1, Integer value2) {
            addCriterion("pi_district between", value1, value2, "piDistrict");
            return (Criteria) this;
        }

        public Criteria andPiDistrictNotBetween(Integer value1, Integer value2) {
            addCriterion("pi_district not between", value1, value2, "piDistrict");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPiTitleLikeInsensitive(String value) {
            addCriterion("upper(pi_title) like", value.toUpperCase(), "piTitle");
            return (Criteria) this;
        }

        public Criteria andPiContentLikeInsensitive(String value) {
            addCriterion("upper(pi_content) like", value.toUpperCase(), "piContent");
            return (Criteria) this;
        }

        public Criteria andPiAddressLikeInsensitive(String value) {
            addCriterion("upper(pi_address) like", value.toUpperCase(), "piAddress");
            return (Criteria) this;
        }

        public Criteria andPiImgLikeInsensitive(String value) {
            addCriterion("upper(pi_img) like", value.toUpperCase(), "piImg");
            return (Criteria) this;
        }

        public Criteria andPiZhidingLikeInsensitive(String value) {
            addCriterion("upper(pi_zhiding) like", value.toUpperCase(), "piZhiding");
            return (Criteria) this;
        }

        public Criteria andPiContactPersonLikeInsensitive(String value) {
            addCriterion("upper(pi_contact_person) like", value.toUpperCase(), "piContactPerson");
            return (Criteria) this;
        }

        public Criteria andPiPhoneLikeInsensitive(String value) {
            addCriterion("upper(pi_phone) like", value.toUpperCase(), "piPhone");
            return (Criteria) this;
        }

        public Criteria andPiQqLikeInsensitive(String value) {
            addCriterion("upper(pi_qq) like", value.toUpperCase(), "piQq");
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