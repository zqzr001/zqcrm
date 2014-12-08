package com.whatbi.zq.dal.domain;

public class ZqUser {
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

    // 用户名
    private String userName;

    // 密码
    private String userPwd;

    // 用户角色
    private Integer userRole;

    // 用户权限
    private Integer userLevel;

    // 冗余, 标记
    private Integer userRemark;

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
     * 返回用户名
     * @return 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 返回密码
     * @return 密码
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * 设置密码
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    /**
     * 返回用户角色
     * @return 用户角色
     */
    public Integer getUserRole() {
        return userRole;
    }

    /**
     * 设置用户角色
     */
    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    /**
     * 返回用户权限
     * @return 用户权限
     */
    public Integer getUserLevel() {
        return userLevel;
    }

    /**
     * 设置用户权限
     */
    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    /**
     * 返回冗余, 标记
     * @return 冗余, 标记
     */
    public Integer getUserRemark() {
        return userRemark;
    }

    /**
     * 设置冗余, 标记
     */
    public void setUserRemark(Integer userRemark) {
        this.userRemark = userRemark;
    }
}