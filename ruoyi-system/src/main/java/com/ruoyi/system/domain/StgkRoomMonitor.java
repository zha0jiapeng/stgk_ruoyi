package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 配电室监控表对象 stgk_room_monitor
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
public class StgkRoomMonitor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增id */
    private Long id;

    /** 配电室id
 */
    @Excel(name = "配电室id")
    private Long roomId;

    /** 温度 */
    @Excel(name = "温度")
    private BigDecimal temperature;

    /** 湿度 */
    @Excel(name = "湿度")
    private BigDecimal humidity;

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
    public void setRoomId(Long roomId) 
    {
        this.roomId = roomId;
    }

    public Long getRoomId() 
    {
        return roomId;
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
            .append("roomId", getRoomId())
            .append("temperature", getTemperature())
            .append("humidity", getHumidity())
            .append("monitorTime", getMonitorTime())
            .toString();
    }
}
