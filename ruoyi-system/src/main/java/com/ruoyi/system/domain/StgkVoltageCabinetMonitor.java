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
 * @date 2023-04-20
 */
public class StgkVoltageCabinetMonitor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增id */
    private Long id;

    /** 所属配电室id */
    @Excel(name = "所属配电室id")
    private Long cabinetId;

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
    private BigDecimal breakerUpAcurrent;

    /** 断路器上口B相温度 */
    @Excel(name = "断路器上口B相温度")
    private BigDecimal breakerUpBcurrent;

    /** 断路器上口C相温度 */
    @Excel(name = "断路器上口C相温度")
    private BigDecimal breakerUpCcurrent;

    /** 断路器下口A相温度 */
    @Excel(name = "断路器下口A相温度")
    private BigDecimal breakerDownAcurrent;

    /** 断路器下口B相温度 */
    @Excel(name = "断路器下口B相温度")
    private BigDecimal breakerDownBcurrent;

    /** 断路器下口C相温度 */
    @Excel(name = "断路器下口C相温度")
    private BigDecimal breakerDownCcurrent;

    /** 断路器出口A相温度 */
    @Excel(name = "断路器出口A相温度")
    private BigDecimal breakerOutAcurrent;

    /** 断路器出口B相温度 */
    @Excel(name = "断路器出口B相温度")
    private BigDecimal breakerOutBcurrent;

    /** 断路器出口C相温度 */
    @Excel(name = "断路器出口C相温度")
    private BigDecimal breakerOutCcurrent;

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
    public void setBreakerUpAcurrent(BigDecimal breakerUpAcurrent) 
    {
        this.breakerUpAcurrent = breakerUpAcurrent;
    }

    public BigDecimal getBreakerUpAcurrent() 
    {
        return breakerUpAcurrent;
    }
    public void setBreakerUpBcurrent(BigDecimal breakerUpBcurrent) 
    {
        this.breakerUpBcurrent = breakerUpBcurrent;
    }

    public BigDecimal getBreakerUpBcurrent() 
    {
        return breakerUpBcurrent;
    }
    public void setBreakerUpCcurrent(BigDecimal breakerUpCcurrent) 
    {
        this.breakerUpCcurrent = breakerUpCcurrent;
    }

    public BigDecimal getBreakerUpCcurrent() 
    {
        return breakerUpCcurrent;
    }
    public void setBreakerDownAcurrent(BigDecimal breakerDownAcurrent) 
    {
        this.breakerDownAcurrent = breakerDownAcurrent;
    }

    public BigDecimal getBreakerDownAcurrent() 
    {
        return breakerDownAcurrent;
    }
    public void setBreakerDownBcurrent(BigDecimal breakerDownBcurrent) 
    {
        this.breakerDownBcurrent = breakerDownBcurrent;
    }

    public BigDecimal getBreakerDownBcurrent() 
    {
        return breakerDownBcurrent;
    }
    public void setBreakerDownCcurrent(BigDecimal breakerDownCcurrent) 
    {
        this.breakerDownCcurrent = breakerDownCcurrent;
    }

    public BigDecimal getBreakerDownCcurrent() 
    {
        return breakerDownCcurrent;
    }
    public void setBreakerOutAcurrent(BigDecimal breakerOutAcurrent) 
    {
        this.breakerOutAcurrent = breakerOutAcurrent;
    }

    public BigDecimal getBreakerOutAcurrent() 
    {
        return breakerOutAcurrent;
    }
    public void setBreakerOutBcurrent(BigDecimal breakerOutBcurrent) 
    {
        this.breakerOutBcurrent = breakerOutBcurrent;
    }

    public BigDecimal getBreakerOutBcurrent() 
    {
        return breakerOutBcurrent;
    }
    public void setBreakerOutCcurrent(BigDecimal breakerOutCcurrent) 
    {
        this.breakerOutCcurrent = breakerOutCcurrent;
    }

    public BigDecimal getBreakerOutCcurrent() 
    {
        return breakerOutCcurrent;
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
            .append("breakerUpAcurrent", getBreakerUpAcurrent())
            .append("breakerUpBcurrent", getBreakerUpBcurrent())
            .append("breakerUpCcurrent", getBreakerUpCcurrent())
            .append("breakerDownAcurrent", getBreakerDownAcurrent())
            .append("breakerDownBcurrent", getBreakerDownBcurrent())
            .append("breakerDownCcurrent", getBreakerDownCcurrent())
            .append("breakerOutAcurrent", getBreakerOutAcurrent())
            .append("breakerOutBcurrent", getBreakerOutBcurrent())
            .append("breakerOutCcurrent", getBreakerOutCcurrent())
            .append("closingCoilCurrent", getClosingCoilCurrent())
            .append("openingCoilCurrent", getOpeningCoilCurrent())
            .append("storageMotorCurrent", getStorageMotorCurrent())
            .append("displacement", getDisplacement())
            .append("trip", getTrip())
            .append("monitorTime", getMonitorTime())
            .toString();
    }
}
