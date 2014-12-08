package com.whatbi.zq.dal.domain;

public class ZqFirstLend {
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

    // 出借金额
    private Double lMoney;

    // 开始日期
    private Long lStartdate;

    // 结束日期
    private Long lEnddate;

    // 利率
    private Double lRate;

    // 收益方式
    private Integer lType;

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
     * 返回出借金额
     * @return 出借金额
     */
    public Double getLMoney() {
        return lMoney;
    }

    /**
     * 设置出借金额
     */
    public void setLMoney(Double lMoney) {
        this.lMoney = lMoney;
    }

    /**
     * 返回开始日期
     * @return 开始日期
     */
    public Long getLStartdate() {
        return lStartdate;
    }

    /**
     * 设置开始日期
     */
    public void setLStartdate(Long lStartdate) {
        this.lStartdate = lStartdate;
    }

    /**
     * 返回结束日期
     * @return 结束日期
     */
    public Long getLEnddate() {
        return lEnddate;
    }

    /**
     * 设置结束日期
     */
    public void setLEnddate(Long lEnddate) {
        this.lEnddate = lEnddate;
    }

    /**
     * 返回利率
     * @return 利率
     */
    public Double getLRate() {
        return lRate;
    }

    /**
     * 设置利率
     */
    public void setLRate(Double lRate) {
        this.lRate = lRate;
    }

    /**
     * 返回收益方式
     * @return 收益方式
     */
    public Integer getLType() {
        return lType;
    }

    /**
     * 设置收益方式
     */
    public void setLType(Integer lType) {
        this.lType = lType;
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