package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 高压柜对象 stgk_voltage_cabinet
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
public class StgkVoltageCabinet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增id */
    private Integer id;

    /** 所属配电室id */
    @Excel(name = "所属配电室id")
    private Integer roomId;

    /** 高压柜名称 */
    @Excel(name = "高压柜名称")
    private String cabinetName;

    /** 状态 */
    @Excel(name = "状态")
    private Long cabinetStatus;

    /** 额定电流 */
    @Excel(name = "额定电流")
    private BigDecimal current;

    /** 额定电压 */
    @Excel(name = "额定电压")
    private BigDecimal voltage;

    /** 额定功率 */
    @Excel(name = "额定功率")
    private BigDecimal power;

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getId()
    {
        return id;
    }
    public void setRoomId(Integer roomId)
    {
        this.roomId = roomId;
    }

    public Integer getRoomId()
    {
        return roomId;
    }
    public void setCabinetName(String cabinetName) 
    {
        this.cabinetName = cabinetName;
    }

    public String getCabinetName() 
    {
        return cabinetName;
    }
    public void setCabinetStatus(Long cabinetStatus) 
    {
        this.cabinetStatus = cabinetStatus;
    }

    public Long getCabinetStatus() 
    {
        return cabinetStatus;
    }
    public void setCurrent(BigDecimal current) 
    {
        this.current = current;
    }

    public BigDecimal getCurrent() 
    {
        return current;
    }
    public void setVoltage(BigDecimal voltage) 
    {
        this.voltage = voltage;
    }

    public BigDecimal getVoltage() 
    {
        return voltage;
    }
    public void setPower(BigDecimal power) 
    {
        this.power = power;
    }

    public BigDecimal getPower() 
    {
        return power;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("roomId", getRoomId())
            .append("cabinetName", getCabinetName())
            .append("cabinetStatus", getCabinetStatus())
            .append("current", getCurrent())
            .append("voltage", getVoltage())
            .append("power", getPower())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
