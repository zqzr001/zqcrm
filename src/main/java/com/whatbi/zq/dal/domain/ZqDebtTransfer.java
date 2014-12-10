package com.whatbi.zq.dal.domain;

public class ZqDebtTransfer {
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

    // 出借客户标识
    private Long custLendId;

    // 贷款客户标识
    private Long custDebtId;

    // 转让开始日期
    private Long proStartdate;

    // 转让结束日期
    private Long proEnddate;

    // 利率
    private String proRate;

    // 转让金额
    private Double proMoney;

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
     * 返回出借客户标识
     * @return 出借客户标识
     */
    public Long getCustLendId() {
        return custLendId;
    }

    /**
     * 设置出借客户标识
     */
    public void setCustLendId(Long custLendId) {
        this.custLendId = custLendId;
    }

    /**
     * 返回贷款客户标识
     * @return 贷款客户标识
     */
    public Long getCustDebtId() {
        return custDebtId;
    }

    /**
     * 设置贷款客户标识
     */
    public void setCustDebtId(Long custDebtId) {
        this.custDebtId = custDebtId;
    }

    /**
     * 返回转让开始日期
     * @return 转让开始日期
     */
    public Long getProStartdate() {
        return proStartdate;
    }

    /**
     * 设置转让开始日期
     */
    public void setProStartdate(Long proStartdate) {
        this.proStartdate = proStartdate;
    }

    /**
     * 返回转让结束日期
     * @return 转让结束日期
     */
    public Long getProEnddate() {
        return proEnddate;
    }

    /**
     * 设置转让结束日期
     */
    public void setProEnddate(Long proEnddate) {
        this.proEnddate = proEnddate;
    }

    /**
     * 返回利率
     * @return 利率
     */
    public String getProRate() {
        return proRate;
    }

    /**
     * 设置利率
     */
    public void setProRate(String proRate) {
        this.proRate = proRate == null ? null : proRate.trim();
    }

    /**
     * 返回转让金额
     * @return 转让金额
     */
    public Double getProMoney() {
        return proMoney;
    }

    /**
     * 设置转让金额
     */
    public void setProMoney(Double proMoney) {
        this.proMoney = proMoney;
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