package jing.entity;

import java.util.ArrayList;
import java.util.List;

public class TPermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public TPermissionExample() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
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
            addCriterion("_id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("_id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPerNameIsNull() {
            addCriterion("per_name is null");
            return (Criteria) this;
        }

        public Criteria andPerNameIsNotNull() {
            addCriterion("per_name is not null");
            return (Criteria) this;
        }

        public Criteria andPerNameEqualTo(String value) {
            addCriterion("per_name =", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameNotEqualTo(String value) {
            addCriterion("per_name <>", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameGreaterThan(String value) {
            addCriterion("per_name >", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameGreaterThanOrEqualTo(String value) {
            addCriterion("per_name >=", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameLessThan(String value) {
            addCriterion("per_name <", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameLessThanOrEqualTo(String value) {
            addCriterion("per_name <=", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameLike(String value) {
            addCriterion("per_name like", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameNotLike(String value) {
            addCriterion("per_name not like", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameIn(List<String> values) {
            addCriterion("per_name in", values, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameNotIn(List<String> values) {
            addCriterion("per_name not in", values, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameBetween(String value1, String value2) {
            addCriterion("per_name between", value1, value2, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameNotBetween(String value1, String value2) {
            addCriterion("per_name not between", value1, value2, "perName");
            return (Criteria) this;
        }

        public Criteria andPerValueIsNull() {
            addCriterion("per_value is null");
            return (Criteria) this;
        }

        public Criteria andPerValueIsNotNull() {
            addCriterion("per_value is not null");
            return (Criteria) this;
        }

        public Criteria andPerValueEqualTo(Integer value) {
            addCriterion("per_value =", value, "perValue");
            return (Criteria) this;
        }

        public Criteria andPerValueNotEqualTo(Integer value) {
            addCriterion("per_value <>", value, "perValue");
            return (Criteria) this;
        }

        public Criteria andPerValueGreaterThan(Integer value) {
            addCriterion("per_value >", value, "perValue");
            return (Criteria) this;
        }

        public Criteria andPerValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("per_value >=", value, "perValue");
            return (Criteria) this;
        }

        public Criteria andPerValueLessThan(Integer value) {
            addCriterion("per_value <", value, "perValue");
            return (Criteria) this;
        }

        public Criteria andPerValueLessThanOrEqualTo(Integer value) {
            addCriterion("per_value <=", value, "perValue");
            return (Criteria) this;
        }

        public Criteria andPerValueIn(List<Integer> values) {
            addCriterion("per_value in", values, "perValue");
            return (Criteria) this;
        }

        public Criteria andPerValueNotIn(List<Integer> values) {
            addCriterion("per_value not in", values, "perValue");
            return (Criteria) this;
        }

        public Criteria andPerValueBetween(Integer value1, Integer value2) {
            addCriterion("per_value between", value1, value2, "perValue");
            return (Criteria) this;
        }

        public Criteria andPerValueNotBetween(Integer value1, Integer value2) {
            addCriterion("per_value not between", value1, value2, "perValue");
            return (Criteria) this;
        }

        public Criteria andParentValueIsNull() {
            addCriterion("parent_value is null");
            return (Criteria) this;
        }

        public Criteria andParentValueIsNotNull() {
            addCriterion("parent_value is not null");
            return (Criteria) this;
        }

        public Criteria andParentValueEqualTo(Integer value) {
            addCriterion("parent_value =", value, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueNotEqualTo(Integer value) {
            addCriterion("parent_value <>", value, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueGreaterThan(Integer value) {
            addCriterion("parent_value >", value, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_value >=", value, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueLessThan(Integer value) {
            addCriterion("parent_value <", value, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueLessThanOrEqualTo(Integer value) {
            addCriterion("parent_value <=", value, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueIn(List<Integer> values) {
            addCriterion("parent_value in", values, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueNotIn(List<Integer> values) {
            addCriterion("parent_value not in", values, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueBetween(Integer value1, Integer value2) {
            addCriterion("parent_value between", value1, value2, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_value not between", value1, value2, "parentValue");
            return (Criteria) this;
        }

        public Criteria andPerTypeIsNull() {
            addCriterion("per_type is null");
            return (Criteria) this;
        }

        public Criteria andPerTypeIsNotNull() {
            addCriterion("per_type is not null");
            return (Criteria) this;
        }

        public Criteria andPerTypeEqualTo(Integer value) {
            addCriterion("per_type =", value, "perType");
            return (Criteria) this;
        }

        public Criteria andPerTypeNotEqualTo(Integer value) {
            addCriterion("per_type <>", value, "perType");
            return (Criteria) this;
        }

        public Criteria andPerTypeGreaterThan(Integer value) {
            addCriterion("per_type >", value, "perType");
            return (Criteria) this;
        }

        public Criteria andPerTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("per_type >=", value, "perType");
            return (Criteria) this;
        }

        public Criteria andPerTypeLessThan(Integer value) {
            addCriterion("per_type <", value, "perType");
            return (Criteria) this;
        }

        public Criteria andPerTypeLessThanOrEqualTo(Integer value) {
            addCriterion("per_type <=", value, "perType");
            return (Criteria) this;
        }

        public Criteria andPerTypeIn(List<Integer> values) {
            addCriterion("per_type in", values, "perType");
            return (Criteria) this;
        }

        public Criteria andPerTypeNotIn(List<Integer> values) {
            addCriterion("per_type not in", values, "perType");
            return (Criteria) this;
        }

        public Criteria andPerTypeBetween(Integer value1, Integer value2) {
            addCriterion("per_type between", value1, value2, "perType");
            return (Criteria) this;
        }

        public Criteria andPerTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("per_type not between", value1, value2, "perType");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andPerDescIsNull() {
            addCriterion("per_desc is null");
            return (Criteria) this;
        }

        public Criteria andPerDescIsNotNull() {
            addCriterion("per_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPerDescEqualTo(String value) {
            addCriterion("per_desc =", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescNotEqualTo(String value) {
            addCriterion("per_desc <>", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescGreaterThan(String value) {
            addCriterion("per_desc >", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescGreaterThanOrEqualTo(String value) {
            addCriterion("per_desc >=", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescLessThan(String value) {
            addCriterion("per_desc <", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescLessThanOrEqualTo(String value) {
            addCriterion("per_desc <=", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescLike(String value) {
            addCriterion("per_desc like", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescNotLike(String value) {
            addCriterion("per_desc not like", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescIn(List<String> values) {
            addCriterion("per_desc in", values, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescNotIn(List<String> values) {
            addCriterion("per_desc not in", values, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescBetween(String value1, String value2) {
            addCriterion("per_desc between", value1, value2, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescNotBetween(String value1, String value2) {
            addCriterion("per_desc not between", value1, value2, "perDesc");
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