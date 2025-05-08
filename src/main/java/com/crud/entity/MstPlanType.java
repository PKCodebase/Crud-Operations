package com.crud.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "mst_plan_type", schema = "obps")
public class MstPlanType {

    @Id
    @Column(name = "plan_type_guid", nullable = false, updatable = false, length = 36)
    private String planTypeGuid;

    @Column(name = "plan_type_id", nullable = false, unique = true)
    private Long planTypeId;

    @Column(name = "plan_type_code", length = 10, nullable = false, unique = true)
    private String planTypeCode;

    @Column(name = "plan_type_name_en", nullable = false)
    private String planTypeNameEn;

    @Column(name = "plan_type_name_hi")
    private String planTypeNameHi;

    @Column(name = "plan_type_name_rl")
    private String planTypeNameRl;

    @Column(name = "plan_type_description")
    private String planTypeDescription;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = true;

    @Column(name = "created_by" ,nullable = false)
    private String createdBy;

    @Column(name = "created_date",nullable = false, updatable=false )
    @CreationTimestamp
    @JsonFormat(pattern = "dd-MM-yyyy  hh:mm:ss")
    private LocalDateTime createdDateTime;


    @Column(name = "created_ip_add",nullable=false)
    private String createdIpAdd;

    @Column(name = "created_mac_add")
    private String macAddress;


    @Column(name = "created_remarks" )
    private String remarks;

    @Column(name = "created_uri ")
    private String uri;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "modified_date")
    @UpdateTimestamp
    @JsonFormat(pattern = "dd-MM-yyyy  hh:mm:ss")
    private LocalDateTime modifiedDateTime;

    @Column(name="modified_ip_add")
    private String modifiedIpAdd;

    @Column(name="modified_mac_add")
    private String modifiedMacAdd;

    @Column(name="modified_remarks ")
    private String modifiedRemarks;

    @Column(name="modified_uri ")
    private String modifiedUri;

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getPlanTypeGuid() {
        return planTypeGuid;
    }

    public void setPlanTypeGuid(String planTypeGuid) {
        this.planTypeGuid = planTypeGuid;
    }

    public Long getPlanTypeId() {
        return planTypeId;
    }

    public void setPlanTypeId(Long planTypeId) {
        this.planTypeId = planTypeId;
    }

    public String getPlanTypeCode() {
        return planTypeCode;
    }

    public void setPlanTypeCode(String planTypeCode) {
        this.planTypeCode = planTypeCode;
    }

    public String getPlanTypeNameEn() {
        return planTypeNameEn;
    }

    public void setPlanTypeNameEn(String planTypeNameEn) {
        this.planTypeNameEn = planTypeNameEn;
    }

    public String getPlanTypeNameHi() {
        return planTypeNameHi;
    }

    public void setPlanTypeNameHi(String planTypeNameHi) {
        this.planTypeNameHi = planTypeNameHi;
    }

    public String getPlanTypeNameRl() {
        return planTypeNameRl;
    }

    public void setPlanTypeNameRl(String planTypeNameRl) {
        this.planTypeNameRl = planTypeNameRl;
    }

    public String getPlanTypeDescription() {
        return planTypeDescription;
    }

    public void setPlanTypeDescription(String planTypeDescription) {
        this.planTypeDescription = planTypeDescription;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getCreatedIpAdd() {
        return createdIpAdd;
    }

    public void setCreatedIpAdd(String createdIpAdd) {
        this.createdIpAdd = createdIpAdd;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public LocalDateTime getModifiedDateTime() {
        return modifiedDateTime;
    }

    public void setModifiedDateTime(LocalDateTime modifiedDateTime) {
        this.modifiedDateTime = modifiedDateTime;
    }

    public String getModifiedIpAdd() {
        return modifiedIpAdd;
    }

    public void setModifiedIpAdd(String modifiedIpAdd) {
        this.modifiedIpAdd = modifiedIpAdd;
    }

    public String getModifiedMacAdd() {
        return modifiedMacAdd;
    }

    public void setModifiedMacAdd(String modifiedMacAdd) {
        this.modifiedMacAdd = modifiedMacAdd;
    }

    public String getModifiedRemarks() {
        return modifiedRemarks;
    }

    public void setModifiedRemarks(String modifiedRemarks) {
        this.modifiedRemarks = modifiedRemarks;
    }

    public String getModifiedUri() {
        return modifiedUri;
    }

    public void setModifiedUri(String modifiedUri) {
        this.modifiedUri = modifiedUri;
    }

}