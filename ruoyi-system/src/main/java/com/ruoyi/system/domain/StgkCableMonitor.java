package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 电缆监测表对象 stgk_cable_monitor
 * 
 * @author ruoyi
 * @date 2023-03-20
 */
public class StgkCableMonitor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增id */
    private Long id;

    /** 电缆id */
    @Excel(name = "电缆id")
    private Long cableId;

    /** 电缆名称 */
    @Excel(name = "电缆名称")
    private String cableName;

    /** 电缆状态 健康 */
    @Excel(name = "电缆状态 健康")
    private Long cableStatus;

    /** 电缆最高温度 */
    @Excel(name = "电缆最高温度")
    private BigDecimal cableMaxTemperature;

    /** 电缆最低温度 */
    @Excel(name = "电缆最低温度")
    private BigDecimal cableMinTemperature;

    /** 电缆平均温度 */
    @Excel(name = "电缆平均温度")
    private BigDecimal cableAvgTemperature;

    /** 监测时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "监测时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date monitorTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCableId(Long cableId) 
    {
        this.cableId = cableId;
    }

    public Long getCableId() 
    {
        return cableId;
    }
    public void setCableName(String cableName) 
    {
        this.cableName = cableName;
    }

    public String getCableName() 
    {
        return cableName;
    }
    public void setCableStatus(Long cableStatus) 
    {
        this.cableStatus = cableStatus;
    }

    public Long getCableStatus() 
    {
        return cableStatus;
    }
    public void setCableMaxTemperature(BigDecimal cableMaxTemperature) 
    {
        this.cableMaxTemperature = cableMaxTemperature;
    }

    public BigDecimal getCableMaxTemperature() 
    {
        return cableMaxTemperature;
    }
    public void setCableMinTemperature(BigDecimal cableMinTemperature) 
    {
        this.cableMinTemperature = cableMinTemperature;
    }

    public BigDecimal getCableMinTemperature() 
    {
        return cableMinTemperature;
    }
    public void setCableAvgTemperature(BigDecimal cableAvgTemperature) 
    {
        this.cableAvgTemperature = cableAvgTemperature;
    }

    public BigDecimal getCableAvgTemperature() 
    {
        return cableAvgTemperature;
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
            .append("cableId", getCableId())
            .append("cableName", getCableName())
            .append("cableStatus", getCableStatus())
            .append("cableMaxTemperature", getCableMaxTemperature())
            .append("cableMinTemperature", getCableMinTemperature())
            .append("cableAvgTemperature", getCableAvgTemperature())
            .append("monitorTime", getMonitorTime())
            .toString();
    }
}
