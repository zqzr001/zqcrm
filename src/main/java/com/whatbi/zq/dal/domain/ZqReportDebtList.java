package com.whatbi.zq.dal.domain;

public class ZqReportDebtList {
    private Long id;

    // 是否删除
    private String isDeleted;

    // 创建者
    private String creator;

    // 创建时间
    private Long gmtCreate;

    // 修改者
    private String modifier;

    // 修改时间
    private Long gmtModified;

    // 债权转让编号
    private String repTraId;

    // 借款人姓名
    private String custName;

    // 身份证号
    private String custCardid;

    // 本次转让债权价值
    private String debtMoney;

    // 需支付对价
    private String debtMoneyCopy;

    // 借款人职业情况
    private String custJob;

    // 借款人借款用途
    private String debtUse;

    // 还款起始日期(贷款起始日期加一个月, 后面的类推)
    private String debtDate;

    // 还款期限(月)
    private String debtTimeLimit;

    // 剩余还款月数
    private String monthNum;

    // 预计债权收益率(年)
    private String yearRate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回是否删除
     * @return 是否删除
     */
    public String getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置是否删除
     */
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }

    /**
     * 返回创建者
     * @return 创建者
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建者
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 返回创建时间
     * @return 创建时间
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 返回修改者
     * @return 修改者
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 设置修改者
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * 返回修改时间
     * @return 修改时间
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置修改时间
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 返回债权转让编号
     * @return 债权转让编号
     */
    public String getRepTraId() {
        return repTraId;
    }

    /**
     * 设置债权转让编号
     */
    public void setRepTraId(String repTraId) {
        this.repTraId = repTraId == null ? null : repTraId.trim();
    }

    /**
     * 返回借款人姓名
     * @return 借款人姓名
     */
    public String getCustName() {
        return custName;
    }

    /**
     * 设置借款人姓名
     */
    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    /**
     * 返回身份证号
     * @return 身份证号
     */
    public String getCustCardid() {
        return custCardid;
    }

    /**
     * 设置身份证号
     */
    public void setCustCardid(String custCardid) {
        this.custCardid = custCardid == null ? null : custCardid.trim();
    }

    /**
     * 返回本次转让债权价值
     * @return 本次转让债权价值
     */
    public String getDebtMoney() {
        return debtMoney;
    }

    /**
     * 设置本次转让债权价值
     */
    public void setDebtMoney(String debtMoney) {
        this.debtMoney = debtMoney == null ? null : debtMoney.trim();
    }

    /**
     * 返回需支付对价
     * @return 需支付对价
     */
    public String getDebtMoneyCopy() {
        return debtMoneyCopy;
    }

    /**
     * 设置需支付对价
     */
    public void setDebtMoneyCopy(String debtMoneyCopy) {
        this.debtMoneyCopy = debtMoneyCopy == null ? null : debtMoneyCopy.trim();
    }

    /**
     * 返回借款人职业情况
     * @return 借款人职业情况
     */
    public String getCustJob() {
        return custJob;
    }

    /**
     * 设置借款人职业情况
     */
    public void setCustJob(String custJob) {
        this.custJob = custJob == null ? null : custJob.trim();
    }

    /**
     * 返回借款人借款用途
     * @return 借款人借款用途
     */
    public String getDebtUse() {
        return debtUse;
    }

    /**
     * 设置借款人借款用途
     */
    public void setDebtUse(String debtUse) {
        this.debtUse = debtUse == null ? null : debtUse.trim();
    }

    /**
     * 返回还款起始日期(贷款起始日期加一个月, 后面的类推)
     * @return 还款起始日期(贷款起始日期加一个月, 后面的类推)
     */
    public String getDebtDate() {
        return debtDate;
    }

    /**
     * 设置还款起始日期(贷款起始日期加一个月, 后面的类推)
     */
    public void setDebtDate(String debtDate) {
        this.debtDate = debtDate == null ? null : debtDate.trim();
    }

    /**
     * 返回还款期限(月)
     * @return 还款期限(月)
     */
    public String getDebtTimeLimit() {
        return debtTimeLimit;
    }

    /**
     * 设置还款期限(月)
     */
    public void setDebtTimeLimit(String debtTimeLimit) {
        this.debtTimeLimit = debtTimeLimit == null ? null : debtTimeLimit.trim();
    }

    /**
     * 返回剩余还款月数
     * @return 剩余还款月数
     */
    public String getMonthNum() {
        return monthNum;
    }

    /**
     * 设置剩余还款月数
     */
    public void setMonthNum(String monthNum) {
        this.monthNum = monthNum == null ? null : monthNum.trim();
    }

    /**
     * 返回预计债权收益率(年)
     * @return 预计债权收益率(年)
     */
    public String getYearRate() {
        return yearRate;
    }

    /**
     * 设置预计债权收益率(年)
     */
    public void setYearRate(String yearRate) {
        this.yearRate = yearRate == null ? null : yearRate.trim();
    }
}