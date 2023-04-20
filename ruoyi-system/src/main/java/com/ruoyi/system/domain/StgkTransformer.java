package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.math.BigDecimal;

/**
 * 变压器对象 stgk_transformer
 * 
 * @author mashiro
 * @date 2023-03-29
 */
public class StgkTransformer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**   */
    private Long id;

    /** 变压器名称 */
    @Excel(name = "变压器名称")
    private String transformerName;

    /** 变压器状态 */
    @Excel(name = "变压器状态")
    private Long transformerStatus;

    /** 维修周期 */
    @Excel(name = "维修周期")
    private Long transformerRepairtime;

    /** 维修周期 */
    @Excel(name = "维修剩余天数")
    private Long transformerRepairRemaintime;

    /** 额定电流 */
    @Excel(name = "额定电流")
    private Long ratedCurrent;

    /** 带载运行时间 */
    @Excel(name = "带载运行时间")
    private Long onloadRuntime;

    /** 空载运行时间 */
    @Excel(name = "空载运行时间")
    private Long offloadRuntime;

    /** 退出运行时间 */
    @Excel(name = "退出运行时间")
    private Long exitRuntime;

    /** 过负载次数 */
    @Excel(name = "过负载次数")
    private Long overloadNum;

    /** 过负载时间(分) */
    @Excel(name = "过负载时间(分)")
    private Long overloadTime;

    /** 过负载寿命折损(分) */
    @Excel(name = "过负载寿命折损(分)")
    private Long overloadDamage;

    /** 变压器容量 */
    @Excel(name = "变压器容量")
    private Long transformerVolume;

    /** 从机id */
    @Excel(name = "从机id")
    private Long slaveId;

    @Excel(name = "变压器负荷率")
    private BigDecimal transformerLoadrate;

    /** A相烧组温度 */
    @Excel(name = "A相烧组温度")
    private BigDecimal aBurnerTemperature;

    /** B相烧组温度 */
    @Excel(name = "B相烧组温度")
    private BigDecimal bBurnerTemperature;

    /** C相烧组温度 */
    @Excel(name = "C相烧组温度")
    private BigDecimal cBurnerTemperature;

    /** A相出线温度 */
    @Excel(name = "A相出线温度")
    private BigDecimal aOutletTemperature;

    /** B相出线温度 */
    @Excel(name = "B相出线温度")
    private BigDecimal bOutletTemperature;

    /** C相出线温度 */
    @Excel(name = "C相出线温度")
    private BigDecimal cOutletTemperature;

    /** 铁芯温度 */
    @Excel(name = "铁芯温度")
    private BigDecimal coreTemperature;

    /** 环境温度 */
    @Excel(name = "环境温度")
    private BigDecimal ambientTemperature;

    private BigDecimal transformerVoltage;

    private BigDecimal transformerPower;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTransformerName(String transformerName) 
    {
        this.transformerName = transformerName;
    }

    public String getTransformerName() 
    {
        return transformerName;
    }
    public void setTransformerStatus(Long transformerStatus) 
    {
        this.transformerStatus = transformerStatus;
    }

    public Long getTransformerStatus() 
    {
        return transformerStatus;
    }
    public void setTransformerRepairtime(Long transformerRepairtime) 
    {
        this.transformerRepairtime = transformerRepairtime;
    }

    public Long getTransformerRepairRemaintime() {
        return transformerRepairRemaintime;
    }

    public void setTransformerRepairRemaintime(Long transformerRepairRemaintime) {
        this.transformerRepairRemaintime = transformerRepairRemaintime;
    }

    public Long getTransformerRepairtime()
    {
        return transformerRepairtime;
    }
    public void setRatedCurrent(Long ratedCurrent) 
    {
        this.ratedCurrent = ratedCurrent;
    }

    public Long getRatedCurrent() 
    {
        return ratedCurrent;
    }
    public void setOnloadRuntime(Long onloadRuntime) 
    {
        this.onloadRuntime = onloadRuntime;
    }

    public Long getOnloadRuntime() 
    {
        return onloadRuntime;
    }
    public void setOffloadRuntime(Long offloadRuntime) 
    {
        this.offloadRuntime = offloadRuntime;
    }

    public Long getOffloadRuntime() 
    {
        return offloadRuntime;
    }
    public void setExitRuntime(Long exitRuntime) 
    {
        this.exitRuntime = exitRuntime;
    }

    public Long getExitRuntime() 
    {
        return exitRuntime;
    }
    public void setOverloadNum(Long overloadNum) 
    {
        this.overloadNum = overloadNum;
    }

    public Long getOverloadNum() 
    {
        return overloadNum;
    }
    public void setOverloadTime(Long overloadTime) 
    {
        this.overloadTime = overloadTime;
    }

    public Long getOverloadTime() 
    {
        return overloadTime;
    }
    public void setOverloadDamage(Long overloadDamage) 
    {
        this.overloadDamage = overloadDamage;
    }

    public Long getOverloadDamage() 
    {
        return overloadDamage;
    }
    public void setTransformerVolume(Long transformerVolume) 
    {
        this.transformerVolume = transformerVolume;
    }

    public Long getTransformerVolume() 
    {
        return transformerVolume;
    }
    public void setSlaveId(Long slaveId) 
    {
        this.slaveId = slaveId;
    }

    public Long getSlaveId() 
    {
        return slaveId;
    }

    public BigDecimal getTransformerLoadrate() {
        return transformerLoadrate;
    }

    public void setTransformerLoadrate(BigDecimal transformerLoadrate) {
        this.transformerLoadrate = transformerLoadrate;
    }

    public BigDecimal getaBurnerTemperature() {
        return aBurnerTemperature;
    }

    public void setaBurnerTemperature(BigDecimal aBurnerTemperature) {
        this.aBurnerTemperature = aBurnerTemperature;
    }

    public BigDecimal getbBurnerTemperature() {
        return bBurnerTemperature;
    }

    public void setbBurnerTemperature(BigDecimal bBurnerTemperature) {
        this.bBurnerTemperature = bBurnerTemperature;
    }

    public BigDecimal getcBurnerTemperature() {
        return cBurnerTemperature;
    }

    public void setcBurnerTemperature(BigDecimal cBurnerTemperature) {
        this.cBurnerTemperature = cBurnerTemperature;
    }

    public BigDecimal getaOutletTemperature() {
        return aOutletTemperature;
    }

    public void setaOutletTemperature(BigDecimal aOutletTemperature) {
        this.aOutletTemperature = aOutletTemperature;
    }

    public BigDecimal getbOutletTemperature() {
        return bOutletTemperature;
    }

    public void setbOutletTemperature(BigDecimal bOutletTemperature) {
        this.bOutletTemperature = bOutletTemperature;
    }

    public BigDecimal getcOutletTemperature() {
        return cOutletTemperature;
    }

    public void setcOutletTemperature(BigDecimal cOutletTemperature) {
        this.cOutletTemperature = cOutletTemperature;
    }

    public BigDecimal getCoreTemperature() {
        return coreTemperature;
    }

    public void setCoreTemperature(BigDecimal coreTemperature) {
        this.coreTemperature = coreTemperature;
    }

    public BigDecimal getAmbientTemperature() {
        return ambientTemperature;
    }

    public void setAmbientTemperature(BigDecimal ambientTemperature) {
        this.ambientTemperature = ambientTemperature;
    }

    public BigDecimal getTransformerVoltage() {
        return transformerVoltage;
    }

    public void setTransformerVoltage(BigDecimal transformerVoltage) {
        this.transformerVoltage = transformerVoltage;
    }

    public BigDecimal getTransformerPower() {
        return transformerPower;
    }

    public void setTransformerPower(BigDecimal transformerPower) {
        this.transformerPower = transformerPower;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("transformerName", getTransformerName())
            .append("transformerStatus", getTransformerStatus())
            .append("transformerRepairtime", getTransformerRepairtime())
            .append("ratedCurrent", getRatedCurrent())
            .append("onloadRuntime", getOnloadRuntime())
            .append("offloadRuntime", getOffloadRuntime())
            .append("exitRuntime", getExitRuntime())
            .append("overloadNum", getOverloadNum())
            .append("overloadTime", getOverloadTime())
            .append("overloadDamage", getOverloadDamage())
            .append("transformerVolume", getTransformerVolume())
            .append("slaveId", getSlaveId())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
