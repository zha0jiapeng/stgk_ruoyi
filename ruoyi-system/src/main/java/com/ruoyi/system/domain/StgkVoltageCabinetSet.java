package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 高压柜报警设置表对象 stgk_voltage_cabinet_set
 * 
 * @author ruoyi
 * @date 2023-04-28
 */
public class StgkVoltageCabinetSet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增id */
    private Long id;

    /** 高压柜id */
    @Excel(name = "高压柜id")
    private Long cabinetId;

    /** A相电流 */
    @Excel(name = "A相电流")
    private BigDecimal aCurrent;

    /** A相电压 */
    @Excel(name = "A相电压")
    private BigDecimal aVoltage;

    /** B相电流 */
    @Excel(name = "B相电流")
    private BigDecimal bCurrent;

    /** B相电压 */
    @Excel(name = "B相电压")
    private BigDecimal bVoltage;

    /** C相电流 */
    @Excel(name = "C相电流")
    private BigDecimal cCurrent;

    /** C相电压 */
    @Excel(name = "C相电压")
    private BigDecimal cVoltage;

    /** 有功功率 */
    @Excel(name = "有功功率")
    private BigDecimal activePower;

    /** UAB电压 */
    @Excel(name = "UAB电压")
    private BigDecimal uabVoltage;

    /** 无功功率 */
    @Excel(name = "无功功率")
    private BigDecimal reactivePower;

    /** UAC电压 */
    @Excel(name = "UAC电压")
    private BigDecimal uacVoltage;

    /** 功率因数 */
    @Excel(name = "功率因数")
    private BigDecimal powerFactor;

    /** UBC电压 */
    @Excel(name = "UBC电压")
    private BigDecimal ubcVoltage;

    /** 柜内温度 */
    @Excel(name = "柜内温度")
    private BigDecimal temperature;

    /** 柜内湿度 */
    @Excel(name = "柜内湿度")
    private BigDecimal humidity;

    /** 放电量 */
    @Excel(name = "放电量")
    private BigDecimal dischargeCapacity;

    /** 放电次数 */
    @Excel(name = "放电次数")
    private BigDecimal dischargeFrequency;

    /** 断路器上口A相温度 */
    @Excel(name = "断路器上口A相温度")
    private BigDecimal breakerUpATemperature;

    /** 断路器上口B相温度 */
    @Excel(name = "断路器上口B相温度")
    private BigDecimal breakerUpBTemperature;

    /** 断路器上口C相温度 */
    @Excel(name = "断路器上口C相温度")
    private BigDecimal breakerUpCTemperature;

    /** 断路器下口A相温度 */
    @Excel(name = "断路器下口A相温度")
    private BigDecimal breakerDownATemperature;

    /** 断路器下口B相温度 */
    @Excel(name = "断路器下口B相温度")
    private BigDecimal breakerDownBTemperature;

    /** 断路器下口C相温度 */
    @Excel(name = "断路器下口C相温度")
    private BigDecimal breakerDownCTemperature;

    /** 断路器出口A相温度 */
    @Excel(name = "断路器出口A相温度")
    private BigDecimal breakerOutATemperature;

    /** 断路器出口B相温度 */
    @Excel(name = "断路器出口B相温度")
    private BigDecimal breakerOutBTemperature;

    /** 断路器出口C相温度 */
    @Excel(name = "断路器出口C相温度")
    private BigDecimal breakerOutCTemperature;

    /** 断路器上口报警温度 */
    @Excel(name = "断路器上口报警温度")
    private BigDecimal breakerUpReportTemperature;

    /** 断路器出口报警温度 */
    @Excel(name = "断路器出口报警温度")
    private BigDecimal breakerOutReportTemperature;

    /** 合闸线圈电流 */
    @Excel(name = "合闸线圈电流")
    private BigDecimal closingCoilCurrent;

    /** 分闸线圈电流 */
    @Excel(name = "分闸线圈电流")
    private BigDecimal openingCoilCurrent;

    /** 储能电机电流 */
    @Excel(name = "储能电机电流")
    private BigDecimal storageMotorCurrent;

    /** 位移值 */
    @Excel(name = "位移值")
    private BigDecimal displacement;

    /** 行程 */
    @Excel(name = "行程")
    private BigDecimal trip;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCabinetId(Long cabinetId) 
    {
        this.cabinetId = cabinetId;
    }

    public Long getCabinetId() 
    {
        return cabinetId;
    }
    public void setaCurrent(BigDecimal aCurrent) 
    {
        this.aCurrent = aCurrent;
    }

    public BigDecimal getaCurrent() 
    {
        return aCurrent;
    }
    public void setaVoltage(BigDecimal aVoltage) 
    {
        this.aVoltage = aVoltage;
    }

    public BigDecimal getaVoltage() 
    {
        return aVoltage;
    }
    public void setbCurrent(BigDecimal bCurrent) 
    {
        this.bCurrent = bCurrent;
    }

    public BigDecimal getbCurrent() 
    {
        return bCurrent;
    }
    public void setbVoltage(BigDecimal bVoltage) 
    {
        this.bVoltage = bVoltage;
    }

    public BigDecimal getbVoltage() 
    {
        return bVoltage;
    }
    public void setcCurrent(BigDecimal cCurrent) 
    {
        this.cCurrent = cCurrent;
    }

    public BigDecimal getcCurrent() 
    {
        return cCurrent;
    }
    public void setcVoltage(BigDecimal cVoltage) 
    {
        this.cVoltage = cVoltage;
    }

    public BigDecimal getcVoltage() 
    {
        return cVoltage;
    }
    public void setActivePower(BigDecimal activePower) 
    {
        this.activePower = activePower;
    }

    public BigDecimal getActivePower() 
    {
        return activePower;
    }
    public void setUabVoltage(BigDecimal uabVoltage) 
    {
        this.uabVoltage = uabVoltage;
    }

    public BigDecimal getUabVoltage() 
    {
        return uabVoltage;
    }
    public void setReactivePower(BigDecimal reactivePower) 
    {
        this.reactivePower = reactivePower;
    }

    public BigDecimal getReactivePower() 
    {
        return reactivePower;
    }
    public void setUacVoltage(BigDecimal uacVoltage) 
    {
        this.uacVoltage = uacVoltage;
    }

    public BigDecimal getUacVoltage() 
    {
        return uacVoltage;
    }
    public void setPowerFactor(BigDecimal powerFactor) 
    {
        this.powerFactor = powerFactor;
    }

    public BigDecimal getPowerFactor() 
    {
        return powerFactor;
    }
    public void setUbcVoltage(BigDecimal ubcVoltage) 
    {
        this.ubcVoltage = ubcVoltage;
    }

    public BigDecimal getUbcVoltage() 
    {
        return ubcVoltage;
    }
    public void setTemperature(BigDecimal temperature) 
    {
        this.temperature = temperature;
    }

    public BigDecimal getTemperature() 
    {
        return temperature;
    }
    public void setHumidity(BigDecimal humidity) 
    {
        this.humidity = humidity;
    }

    public BigDecimal getHumidity() 
    {
        return humidity;
    }
    public void setDischargeCapacity(BigDecimal dischargeCapacity) 
    {
        this.dischargeCapacity = dischargeCapacity;
    }

    public BigDecimal getDischargeCapacity() 
    {
        return dischargeCapacity;
    }
    public void setDischargeFrequency(BigDecimal dischargeFrequency) 
    {
        this.dischargeFrequency = dischargeFrequency;
    }

    public BigDecimal getDischargeFrequency() 
    {
        return dischargeFrequency;
    }
    public void setBreakerUpATemperature(BigDecimal breakerUpATemperature) 
    {
        this.breakerUpATemperature = breakerUpATemperature;
    }

    public BigDecimal getBreakerUpATemperature() 
    {
        return breakerUpATemperature;
    }
    public void setBreakerUpBTemperature(BigDecimal breakerUpBTemperature) 
    {
        this.breakerUpBTemperature = breakerUpBTemperature;
    }

    public BigDecimal getBreakerUpBTemperature() 
    {
        return breakerUpBTemperature;
    }
    public void setBreakerUpCTemperature(BigDecimal breakerUpCTemperature) 
    {
        this.breakerUpCTemperature = breakerUpCTemperature;
    }

    public BigDecimal getBreakerUpCTemperature() 
    {
        return breakerUpCTemperature;
    }
    public void setBreakerDownATemperature(BigDecimal breakerDownATemperature) 
    {
        this.breakerDownATemperature = breakerDownATemperature;
    }

    public BigDecimal getBreakerDownATemperature() 
    {
        return breakerDownATemperature;
    }
    public void setBreakerDownBTemperature(BigDecimal breakerDownBTemperature) 
    {
        this.breakerDownBTemperature = breakerDownBTemperature;
    }

    public BigDecimal getBreakerDownBTemperature() 
    {
        return breakerDownBTemperature;
    }
    public void setBreakerDownCTemperature(BigDecimal breakerDownCTemperature) 
    {
        this.breakerDownCTemperature = breakerDownCTemperature;
    }

    public BigDecimal getBreakerDownCTemperature() 
    {
        return breakerDownCTemperature;
    }
    public void setBreakerOutATemperature(BigDecimal breakerOutATemperature) 
    {
        this.breakerOutATemperature = breakerOutATemperature;
    }

    public BigDecimal getBreakerOutATemperature() 
    {
        return breakerOutATemperature;
    }
    public void setBreakerOutBTemperature(BigDecimal breakerOutBTemperature) 
    {
        this.breakerOutBTemperature = breakerOutBTemperature;
    }

    public BigDecimal getBreakerOutBTemperature() 
    {
        return breakerOutBTemperature;
    }
    public void setBreakerOutCTemperature(BigDecimal breakerOutCTemperature) 
    {
        this.breakerOutCTemperature = breakerOutCTemperature;
    }

    public BigDecimal getBreakerOutCTemperature() 
    {
        return breakerOutCTemperature;
    }
    public void setBreakerUpReportTemperature(BigDecimal breakerUpReportTemperature) 
    {
        this.breakerUpReportTemperature = breakerUpReportTemperature;
    }

    public BigDecimal getBreakerUpReportTemperature() 
    {
        return breakerUpReportTemperature;
    }
    public void setBreakerOutReportTemperature(BigDecimal breakerOutReportTemperature) 
    {
        this.breakerOutReportTemperature = breakerOutReportTemperature;
    }

    public BigDecimal getBreakerOutReportTemperature() 
    {
        return breakerOutReportTemperature;
    }
    public void setClosingCoilCurrent(BigDecimal closingCoilCurrent) 
    {
        this.closingCoilCurrent = closingCoilCurrent;
    }

    public BigDecimal getClosingCoilCurrent() 
    {
        return closingCoilCurrent;
    }
    public void setOpeningCoilCurrent(BigDecimal openingCoilCurrent) 
    {
        this.openingCoilCurrent = openingCoilCurrent;
    }

    public BigDecimal getOpeningCoilCurrent() 
    {
        return openingCoilCurrent;
    }
    public void setStorageMotorCurrent(BigDecimal storageMotorCurrent) 
    {
        this.storageMotorCurrent = storageMotorCurrent;
    }

    public BigDecimal getStorageMotorCurrent() 
    {
        return storageMotorCurrent;
    }
    public void setDisplacement(BigDecimal displacement) 
    {
        this.displacement = displacement;
    }

    public BigDecimal getDisplacement() 
    {
        return displacement;
    }
    public void setTrip(BigDecimal trip) 
    {
        this.trip = trip;
    }

    public BigDecimal getTrip() 
    {
        return trip;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("cabinetId", getCabinetId())
            .append("aCurrent", getaCurrent())
            .append("aVoltage", getaVoltage())
            .append("bCurrent", getbCurrent())
            .append("bVoltage", getbVoltage())
            .append("cCurrent", getcCurrent())
            .append("cVoltage", getcVoltage())
            .append("activePower", getActivePower())
            .append("uabVoltage", getUabVoltage())
            .append("reactivePower", getReactivePower())
            .append("uacVoltage", getUacVoltage())
            .append("powerFactor", getPowerFactor())
            .append("ubcVoltage", getUbcVoltage())
            .append("temperature", getTemperature())
            .append("humidity", getHumidity())
            .append("dischargeCapacity", getDischargeCapacity())
            .append("dischargeFrequency", getDischargeFrequency())
            .append("breakerUpATemperature", getBreakerUpATemperature())
            .append("breakerUpBTemperature", getBreakerUpBTemperature())
            .append("breakerUpCTemperature", getBreakerUpCTemperature())
            .append("breakerDownATemperature", getBreakerDownATemperature())
            .append("breakerDownBTemperature", getBreakerDownBTemperature())
            .append("breakerDownCTemperature", getBreakerDownCTemperature())
            .append("breakerOutATemperature", getBreakerOutATemperature())
            .append("breakerOutBTemperature", getBreakerOutBTemperature())
            .append("breakerOutCTemperature", getBreakerOutCTemperature())
            .append("breakerUpReportTemperature", getBreakerUpReportTemperature())
            .append("breakerOutReportTemperature", getBreakerOutReportTemperature())
            .append("closingCoilCurrent", getClosingCoilCurrent())
            .append("openingCoilCurrent", getOpeningCoilCurrent())
            .append("storageMotorCurrent", getStorageMotorCurrent())
            .append("displacement", getDisplacement())
            .append("trip", getTrip())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
