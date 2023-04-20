package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 变压器监控对象 stgk_transformer_monitor
 * 
 * @author ruoyi
 * @date 2023-03-29
 */
public class StgkTransformerMonitor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增id */
    private Long id;

    /** 变压器id */
    @Excel(name = "变压器id")
    private Long transformerId;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date monitorTime;

    /** 电压 */
    @Excel(name = "电压")
    private BigDecimal transformerVoltage;

    /** A相电流 */
    @Excel(name = "A相电流")
    private BigDecimal transformerACurrent;

    /** B相电流 */
    @Excel(name = "B相电流")
    private BigDecimal transformerBCurrent;

    /** C相电流 */
    @Excel(name = "C相电流")
    private BigDecimal transformerCCurrent;

    /** 功率因数 */
    @Excel(name = "功率因数")
    private BigDecimal transformerPower;

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

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTransformerId(Long transformerId) 
    {
        this.transformerId = transformerId;
    }

    public Long getTransformerId() 
    {
        return transformerId;
    }
    public void setMonitorTime(Date monitorTime) 
    {
        this.monitorTime = monitorTime;
    }

    public Date getMonitorTime() 
    {
        return monitorTime;
    }
    public void setTransformerVoltage(BigDecimal transformerVoltage) 
    {
        this.transformerVoltage = transformerVoltage;
    }

    public BigDecimal getTransformerVoltage() 
    {
        return transformerVoltage;
    }
    public void setTransformerACurrent(BigDecimal transformerACurrent) 
    {
        this.transformerACurrent = transformerACurrent;
    }

    public BigDecimal getTransformerACurrent() 
    {
        return transformerACurrent;
    }
    public void setTransformerBCurrent(BigDecimal transformerBCurrent) 
    {
        this.transformerBCurrent = transformerBCurrent;
    }

    public BigDecimal getTransformerBCurrent() 
    {
        return transformerBCurrent;
    }
    public void setTransformerCCurrent(BigDecimal transformerCCurrent) 
    {
        this.transformerCCurrent = transformerCCurrent;
    }

    public BigDecimal getTransformerCCurrent() 
    {
        return transformerCCurrent;
    }
    public void setTransformerPower(BigDecimal transformerPower) 
    {
        this.transformerPower = transformerPower;
    }

    public BigDecimal getTransformerPower() 
    {
        return transformerPower;
    }
    public void setaBurnerTemperature(BigDecimal aBurnerTemperature) 
    {
        this.aBurnerTemperature = aBurnerTemperature;
    }

    public BigDecimal getaBurnerTemperature() 
    {
        return aBurnerTemperature;
    }
    public void setbBurnerTemperature(BigDecimal bBurnerTemperature) 
    {
        this.bBurnerTemperature = bBurnerTemperature;
    }

    public BigDecimal getbBurnerTemperature() 
    {
        return bBurnerTemperature;
    }
    public void setcBurnerTemperature(BigDecimal cBurnerTemperature) 
    {
        this.cBurnerTemperature = cBurnerTemperature;
    }

    public BigDecimal getcBurnerTemperature() 
    {
        return cBurnerTemperature;
    }
    public void setaOutletTemperature(BigDecimal aOutletTemperature) 
    {
        this.aOutletTemperature = aOutletTemperature;
    }

    public BigDecimal getaOutletTemperature() 
    {
        return aOutletTemperature;
    }
    public void setbOutletTemperature(BigDecimal bOutletTemperature) 
    {
        this.bOutletTemperature = bOutletTemperature;
    }

    public BigDecimal getbOutletTemperature() 
    {
        return bOutletTemperature;
    }
    public void setcOutletTemperature(BigDecimal cOutletTemperature) 
    {
        this.cOutletTemperature = cOutletTemperature;
    }

    public BigDecimal getcOutletTemperature() 
    {
        return cOutletTemperature;
    }
    public void setCoreTemperature(BigDecimal coreTemperature) 
    {
        this.coreTemperature = coreTemperature;
    }

    public BigDecimal getCoreTemperature() 
    {
        return coreTemperature;
    }
    public void setAmbientTemperature(BigDecimal ambientTemperature) 
    {
        this.ambientTemperature = ambientTemperature;
    }

    public BigDecimal getAmbientTemperature() 
    {
        return ambientTemperature;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("transformerId", getTransformerId())
            .append("monitorTime", getMonitorTime())
            .append("transformerVoltage", getTransformerVoltage())
            .append("transformerACurrent", getTransformerACurrent())
            .append("transformerBCurrent", getTransformerBCurrent())
            .append("transformerCCurrent", getTransformerCCurrent())
            .append("transformerPower", getTransformerPower())
            .append("aBurnerTemperature", getaBurnerTemperature())
            .append("bBurnerTemperature", getbBurnerTemperature())
            .append("cBurnerTemperature", getcBurnerTemperature())
            .append("aOutletTemperature", getaOutletTemperature())
            .append("bOutletTemperature", getbOutletTemperature())
            .append("cOutletTemperature", getcOutletTemperature())
            .append("coreTemperature", getCoreTemperature())
            .append("ambientTemperature", getAmbientTemperature())
            .toString();
    }
}
