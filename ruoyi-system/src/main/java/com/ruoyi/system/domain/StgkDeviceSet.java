package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设备通用设置表对象 stgk_device_set
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
public class StgkDeviceSet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增id */
    private Long id;

    /** 设备类型 */
    @Excel(name = "设备类型")
    private Long typeId;

    /** 设备id */
    @Excel(name = "设备id")
    private Long deviceId;

    /** 预警温度值 */
    @Excel(name = "预警温度值")
    private BigDecimal earlyWarning;

    /** 告警温度值 */
    @Excel(name = "告警温度值")
    private BigDecimal reportWarning;

    /** 报警温度值 */
    @Excel(name = "报警温度值")
    private BigDecimal alarmWarning;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTypeId(Long typeId) 
    {
        this.typeId = typeId;
    }

    public Long getTypeId() 
    {
        return typeId;
    }
    public void setDeviceId(Long deviceId) 
    {
        this.deviceId = deviceId;
    }

    public Long getDeviceId() 
    {
        return deviceId;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("typeId", getTypeId())
            .append("deviceId", getDeviceId())
            .append("earlyWarning", getEarlyWarning())
            .append("reportWarning", getReportWarning())
            .append("alarmWarning", getAlarmWarning())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
