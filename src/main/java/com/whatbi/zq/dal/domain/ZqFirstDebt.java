package com.whatbi.zq.dal.domain;

public class ZqFirstDebt {
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

    // 客户标识
    private Long cId;

    // 贷款金额
    private Double dMoney;

    // 可用金额
    private Double dUseMoney;

    // 开始日期
    private Long dStartdate;

    // 结束日期
    private Long dEnddate;

    // 利率
    private Double dRate;

    // 还款方式
    private Integer dType;

    // 是否有抵押
    private Integer dMortgage;

    // 贷款用途
    private String dUse;

    // 冗余, 标记
    private Integer remark;

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
     * 返回客户标识
     * @return 客户标识
     */
    public Long getCId() {
        return cId;
    }

    /**
     * 设置客户标识
     */
    public void setCId(Long cId) {
        this.cId = cId;
    }

    /**
     * 返回贷款金额
     * @return 贷款金额
     */
    public Double getDMoney() {
        return dMoney;
    }

    /**
     * 设置贷款金额
     */
    public void setDMoney(Double dMoney) {
        this.dMoney = dMoney;
    }

    public Double getDUseMoney() {
        return dUseMoney;
    }

    public void setDUseMoney(Double dUseMoney) {
        this.dUseMoney = dUseMoney;
    }

    /**
     * 返回开始日期
     * @return 开始日期
     */
    public Long getDStartdate() {
        return dStartdate;
    }

    /**
     * 设置开始日期
     */
    public void setDStartdate(Long dStartdate) {
        this.dStartdate = dStartdate;
    }

    /**
     * 返回结束日期
     * @return 结束日期
     */
    public Long getDEnddate() {
        return dEnddate;
    }

    /**
     * 设置结束日期
     */
    public void setDEnddate(Long dEnddate) {
        this.dEnddate = dEnddate;
    }

    /**
     * 返回利率
     * @return 利率
     */
    public Double getDRate() {
        return dRate;
    }

    /**
     * 设置利率
     */
    public void setDRate(Double dRate) {
        this.dRate = dRate;
    }

    /**
     * 返回还款方式
     * @return 还款方式
     */
    public Integer getDType() {
        return dType;
    }

    /**
     * 设置还款方式
     */
    public void setDType(Integer dType) {
        this.dType = dType;
    }

    /**
     * 返回是否有抵押
     * @return 是否有抵押
     */
    public Integer getDMortgage() {
        return dMortgage;
    }

    /**
     * 设置是否有抵押
     */
    public void setDMortgage(Integer dMortgage) {
        this.dMortgage = dMortgage;
    }

    /**
     * 返回贷款用途
     * @return 贷款用途
     */
    public String getDUse() {
        return dUse;
    }

    /**
     * 设置贷款用途
     */
    public void setDUse(String dUse) {
        this.dUse = dUse == null ? null : dUse.trim();
    }

    /**
     * 返回冗余, 标记
     * @return 冗余, 标记
     */
    public Integer getRemark() {
        return remark;
    }

    /**
     * 设置冗余, 标记
     */
    public void setRemark(Integer remark) {
        this.remark = remark;
    }
}