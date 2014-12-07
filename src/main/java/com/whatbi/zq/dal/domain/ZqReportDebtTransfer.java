package com.whatbi.zq.dal.domain;

public class ZqReportDebtTransfer {
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

    // 出借编号(系统生成)
    private String rNum;

    // 资金出借回收方式(理财产品名称)
    private String rType;

    // 初始出借日日期(投资日期)
    private String rInitDate;

    // 初始出借金额(投资金额)
    private String rMoney;

    // 下一个报告日(初始出借日期加一个月, 类推)
    private String rNextDate;

    // 下一个报告期借款人应还款额(收益)
    private String rNextMoney;

    // 预计下一个报告日您的资产总额(本金加收益)
    private String rAllMoney;

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
     * 返回出借编号(系统生成)
     * @return 出借编号(系统生成)
     */
    public String getRNum() {
        return rNum;
    }

    /**
     * 设置出借编号(系统生成)
     */
    public void setRNum(String rNum) {
        this.rNum = rNum == null ? null : rNum.trim();
    }

    /**
     * 返回资金出借回收方式(理财产品名称)
     * @return 资金出借回收方式(理财产品名称)
     */
    public String getRType() {
        return rType;
    }

    /**
     * 设置资金出借回收方式(理财产品名称)
     */
    public void setRType(String rType) {
        this.rType = rType == null ? null : rType.trim();
    }

    /**
     * 返回初始出借日日期(投资日期)
     * @return 初始出借日日期(投资日期)
     */
    public String getRInitDate() {
        return rInitDate;
    }

    /**
     * 设置初始出借日日期(投资日期)
     */
    public void setRInitDate(String rInitDate) {
        this.rInitDate = rInitDate == null ? null : rInitDate.trim();
    }

    /**
     * 返回初始出借金额(投资金额)
     * @return 初始出借金额(投资金额)
     */
    public String getRMoney() {
        return rMoney;
    }

    /**
     * 设置初始出借金额(投资金额)
     */
    public void setRMoney(String rMoney) {
        this.rMoney = rMoney == null ? null : rMoney.trim();
    }

    /**
     * 返回下一个报告日(初始出借日期加一个月, 类推)
     * @return 下一个报告日(初始出借日期加一个月, 类推)
     */
    public String getRNextDate() {
        return rNextDate;
    }

    /**
     * 设置下一个报告日(初始出借日期加一个月, 类推)
     */
    public void setRNextDate(String rNextDate) {
        this.rNextDate = rNextDate == null ? null : rNextDate.trim();
    }

    /**
     * 返回下一个报告期借款人应还款额(收益)
     * @return 下一个报告期借款人应还款额(收益)
     */
    public String getRNextMoney() {
        return rNextMoney;
    }

    /**
     * 设置下一个报告期借款人应还款额(收益)
     */
    public void setRNextMoney(String rNextMoney) {
        this.rNextMoney = rNextMoney == null ? null : rNextMoney.trim();
    }

    /**
     * 返回预计下一个报告日您的资产总额(本金加收益)
     * @return 预计下一个报告日您的资产总额(本金加收益)
     */
    public String getRAllMoney() {
        return rAllMoney;
    }

    /**
     * 设置预计下一个报告日您的资产总额(本金加收益)
     */
    public void setRAllMoney(String rAllMoney) {
        this.rAllMoney = rAllMoney == null ? null : rAllMoney.trim();
    }
}