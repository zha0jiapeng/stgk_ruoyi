package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 高压柜监控对象 stgk_voltage_cabinet_monitor
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
public class StgkVoltageCabinetMonitor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增id */
    private Long id;

    /** 所属配电室id */
    @Excel(name = "所属配电室id")
    private Integer cabinetId;

    /** A相电流 */
    @Excel(name = "A相电流")
    private BigDecimal aCurrent;

    /** B相电流 */
    @Excel(name = "B相电流")
    private BigDecimal bCurrent;

    /** C相电流 */
    @Excel(name = "C相电流")
    private BigDecimal cCurrent;

    /** UAB电压 */
    @Excel(name = "UAB电压")
    private BigDecimal uabVoltage;

    /** P功率 */
    @Excel(name = "P功率")
    private BigDecimal pPower;

    /** cos */
    @Excel(name = "cos")
    private BigDecimal cos;

    /** rh */
    @Excel(name = "rh")
    private BigDecimal rh;

    /** pd */
    @Excel(name = "pd")
    private BigDecimal pd;

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

    /** 监控时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "监控时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date monitorTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCabinetId(Integer cabinetId)
    {
        this.cabinetId = cabinetId;
    }

    public Integer getCabinetId()
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
    public void setbCurrent(BigDecimal bCurrent) 
    {
        this.bCurrent = bCurrent;
    }

    public BigDecimal getbCurrent() 
    {
        return bCurrent;
    }
    public void setcCurrent(BigDecimal cCurrent) 
    {
        this.cCurrent = cCurrent;
    }

    public BigDecimal getcCurrent() 
    {
        return cCurrent;
    }
    public void setUabVoltage(BigDecimal uabVoltage) 
    {
        this.uabVoltage = uabVoltage;
    }

    public BigDecimal getUabVoltage() 
    {
        return uabVoltage;
    }
    public void setpPower(BigDecimal pPower) 
    {
        this.pPower = pPower;
    }

    public BigDecimal getpPower() 
    {
        return pPower;
    }
    public void setCos(BigDecimal cos) 
    {
        this.cos = cos;
    }

    public BigDecimal getCos() 
    {
        return cos;
    }
    public void setRh(BigDecimal rh) 
    {
        this.rh = rh;
    }

    public BigDecimal getRh() 
    {
        return rh;
    }
    public void setPd(BigDecimal pd) 
    {
        this.pd = pd;
    }

    public BigDecimal getPd() 
    {
        return pd;
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
    public void setMonitorTime(Date monitorTime) 
    {
        this.monitorTime = monitorTime;
    }

    public Date getMonitorTime() 
    {
        return monitorTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("cabinetId", getCabinetId())
            .append("aCurrent", getaCurrent())
            .append("bCurrent", getbCurrent())
            .append("cCurrent", getcCurrent())
            .append("uabVoltage", getUabVoltage())
            .append("pPower", getpPower())
            .append("cos", getCos())
            .append("rh", getRh())
            .append("pd", getPd())
            .append("breakerUpATemperature", getBreakerUpATemperature())
            .append("breakerUpBTemperature", getBreakerUpBTemperature())
            .append("breakerUpCTemperature", getBreakerUpCTemperature())
            .append("breakerDownATemperature", getBreakerDownATemperature())
            .append("breakerDownBTemperature", getBreakerDownBTemperature())
            .append("breakerDownCTemperature", getBreakerDownCTemperature())
            .append("breakerOutATemperature", getBreakerOutATemperature())
            .append("breakerOutBTemperature", getBreakerOutBTemperature())
            .append("breakerOutCTemperature", getBreakerOutCTemperature())
            .append("closingCoilCurrent", getClosingCoilCurrent())
            .append("openingCoilCurrent", getOpeningCoilCurrent())
            .append("storageMotorCurrent", getStorageMotorCurrent())
            .append("displacement", getDisplacement())
            .append("trip", getTrip())
            .append("monitorTime", getMonitorTime())
            .toString();
    }
}
