package com.whatbi.zq.dal.domain;

public class ZqCustomer {
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

    // 客户姓名
    private String cName;

    // 身份证号
    private String cCardid;

    // 客户角色
    private Integer cRole;

    // 客户职业
    private String cJob;

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
     * 返回客户姓名
     * @return 客户姓名
     */
    public String getCName() {
        return cName;
    }

    /**
     * 设置客户姓名
     */
    public void setCName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    /**
     * 返回身份证号
     * @return 身份证号
     */
    public String getCCardid() {
        return cCardid;
    }

    /**
     * 设置身份证号
     */
    public void setCCardid(String cCardid) {
        this.cCardid = cCardid == null ? null : cCardid.trim();
    }

    /**
     * 返回客户角色
     * @return 客户角色
     */
    public Integer getCRole() {
        return cRole;
    }

    /**
     * 设置客户角色
     */
    public void setCRole(Integer cRole) {
        this.cRole = cRole;
    }

    /**
     * 返回客户职业
     * @return 客户职业
     */
    public String getCJob() {
        return cJob;
    }

    /**
     * 设置客户职业
     */
    public void setCJob(String cJob) {
        this.cJob = cJob == null ? null : cJob.trim();
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