package com.whatbi.zq.dal.domain;

public class ZqProduct {
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

    // 产品名称
    private String proName;

    // 可售金额(这个值并不固定, 随系统中原始债权的变化而变化)
    private Double proMoney;

    // 购买开始日期
    private Long proStartdate;

    // 购买结束日期
    private Long proEnddate;

    // 利率
    private Double proRate;

    // 收益方式
    private Integer proType;

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
     * 返回产品名称
     * @return 产品名称
     */
    public String getProName() {
        return proName;
    }

    /**
     * 设置产品名称
     */
    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    /**
     * 返回可售金额(这个值并不固定, 随系统中原始债权的变化而变化)
     * @return 可售金额(这个值并不固定, 随系统中原始债权的变化而变化)
     */
    public Double getProMoney() {
        return proMoney;
    }

    /**
     * 设置可售金额(这个值并不固定, 随系统中原始债权的变化而变化)
     */
    public void setProMoney(Double proMoney) {
        this.proMoney = proMoney;
    }

    /**
     * 返回购买开始日期
     * @return 购买开始日期
     */
    public Long getProStartdate() {
        return proStartdate;
    }

    /**
     * 设置购买开始日期
     */
    public void setProStartdate(Long proStartdate) {
        this.proStartdate = proStartdate;
    }

    /**
     * 返回购买结束日期
     * @return 购买结束日期
     */
    public Long getProEnddate() {
        return proEnddate;
    }

    /**
     * 设置购买结束日期
     */
    public void setProEnddate(Long proEnddate) {
        this.proEnddate = proEnddate;
    }

    /**
     * 返回利率
     * @return 利率
     */
    public Double getProRate() {
        return proRate;
    }

    /**
     * 设置利率
     */
    public void setProRate(Double proRate) {
        this.proRate = proRate;
    }

    /**
     * 返回收益方式
     * @return 收益方式
     */
    public Integer getProType() {
        return proType;
    }

    /**
     * 设置收益方式
     */
    public void setProType(Integer proType) {
        this.proType = proType;
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