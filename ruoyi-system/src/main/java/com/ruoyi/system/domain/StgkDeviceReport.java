package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设备预警表对象 stgk_device_report
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
public class StgkDeviceReport extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增id */
    private Long id;

    /** 设备主键 */
    @Excel(name = "设备主键")
    private Long deviceId;

    /** 设备类型 */
    @Excel(name = "设备类型")
    private Long typeId;

    /** 温度 */
    @Excel(name = "温度")
    private BigDecimal temperature;

    /** 记录时预警温度值 */
    @Excel(name = "记录时预警温度值")
    private BigDecimal earlyWarning;

    /** 记录时告警温度值 */
    @Excel(name = "记录时告警温度值")
    private BigDecimal reportWarning;

    /** 记录时报警温度值 */
    @Excel(name = "记录时报警温度值")
    private BigDecimal alarmWarning;

    /** 报警字段名 */
    @Excel(name = "报警字段名")
    private String reportFieldName;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDeviceId(Long deviceId) 
    {
        this.deviceId = deviceId;
    }

    public Long getDeviceId() 
    {
        return deviceId;
    }
    public void setTypeId(Long typeId) 
    {
        this.typeId = typeId;
    }

    public Long getTypeId() 
    {
        return typeId;
    }
    public void setTemperature(BigDecimal temperature) 
    {
        this.temperature = temperature;
    }

    public BigDecimal getTemperature() 
    {
        return temperature;
    }
    public void setEarlyWarning(BigDecimal earlyWarning) 
    {
        this.earlyWarning = earlyWarning;
    }

    public BigDecimal getEarlyWarning() 
    {
        return earlyWarning;
    }
    public void setReportWarning(BigDecimal reportWarning) 
    {
        this.reportWarning = reportWarning;
    }

    public BigDecimal getReportWarning() 
    {
        return reportWarning;
    }
    public void setAlarmWarning(BigDecimal alarmWarning) 
    {
        this.alarmWarning = alarmWarning;
    }

    public BigDecimal getAlarmWarning() 
    {
        return alarmWarning;
    }
    public void setReportFieldName(String reportFieldName) 
    {
        this.reportFieldName = reportFieldName;
    }

    public String getReportFieldName() 
    {
        return reportFieldName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("deviceId", getDeviceId())
            .append("typeId", getTypeId())
            .append("temperature", getTemperature())
            .append("earlyWarning", getEarlyWarning())
            .append("reportWarning", getReportWarning())
            .append("alarmWarning", getAlarmWarning())
            .append("reportFieldName", getReportFieldName())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
