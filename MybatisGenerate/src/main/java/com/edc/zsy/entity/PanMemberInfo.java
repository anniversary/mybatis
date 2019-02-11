package com.edc.zsy.entity;

import java.util.Date;

public class PanMemberInfo {
    private Integer fanMemberId;

    private String fanMemberCode;

    private Integer memberId;

    private String memberCode;

    private String memberChannel;

    private String provinceCode;

    private String cityCode;

    private String countryCode;

    private String storeCode;

    private String storeName;

    private String storeType;

    private String storeProperty;

    private Byte memberActiveState;

    private Date memberActiveTime;

    private String panMemberSource;

    private String creatorId;

    private Date createTime;

    private String updatorId;

    private Date updateTime;

    private Byte isDelete;

    public Integer getFanMemberId() {
        return fanMemberId;
    }

    public void setFanMemberId(Integer fanMemberId) {
        this.fanMemberId = fanMemberId;
    }

    public String getFanMemberCode() {
        return fanMemberCode;
    }

    public void setFanMemberCode(String fanMemberCode) {
        this.fanMemberCode = fanMemberCode == null ? null : fanMemberCode.trim();
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode == null ? null : memberCode.trim();
    }

    public String getMemberChannel() {
        return memberChannel;
    }

    public void setMemberChannel(String memberChannel) {
        this.memberChannel = memberChannel == null ? null : memberChannel.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode == null ? null : storeCode.trim();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType == null ? null : storeType.trim();
    }

    public String getStoreProperty() {
        return storeProperty;
    }

    public void setStoreProperty(String storeProperty) {
        this.storeProperty = storeProperty == null ? null : storeProperty.trim();
    }

    public Byte getMemberActiveState() {
        return memberActiveState;
    }

    public void setMemberActiveState(Byte memberActiveState) {
        this.memberActiveState = memberActiveState;
    }

    public Date getMemberActiveTime() {
        return memberActiveTime;
    }

    public void setMemberActiveTime(Date memberActiveTime) {
        this.memberActiveTime = memberActiveTime;
    }

    public String getPanMemberSource() {
        return panMemberSource;
    }

    public void setPanMemberSource(String panMemberSource) {
        this.panMemberSource = panMemberSource == null ? null : panMemberSource.trim();
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdatorId() {
        return updatorId;
    }

    public void setUpdatorId(String updatorId) {
        this.updatorId = updatorId == null ? null : updatorId.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}