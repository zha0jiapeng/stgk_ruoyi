package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.math.BigDecimal;

/**
 * 配电室对象 stgk_room
 * 
 * @author ruoyi
 * @date 2023-04-23
 */
public class StgkRoom extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增id */
    private Long id;

    /** 配电室名称 */
    @Excel(name = "配电室名称")
    private String roomName;

    /** 从机地址 */
    @Excel(name = "从机地址")
    private String slaveId;

    /** 摄像头ip地址 多个以逗号分割 */
    @Excel(name = "摄像头ip地址 多个以逗号分割")
    private String cameraIps;

    private BigDecimal temperature;


    private BigDecimal humidity;



    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setRoomName(String roomName) 
    {
        this.roomName = roomName;
    }

    public String getRoomName() 
    {
        return roomName;
    }
    public void setSlaveId(String slaveId) 
    {
        this.slaveId = slaveId;
    }

    public String getSlaveId() 
    {
        return slaveId;
    }
    public void setCameraIps(String cameraIps) 
    {
        this.cameraIps = cameraIps;
    }

    public String getCameraIps() 
    {
        return cameraIps;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    public BigDecimal getHumidity() {
        return humidity;
    }

    public void setHumidity(BigDecimal humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("roomName", getRoomName())
            .append("remark", getRemark())
            .append("slaveId", getSlaveId())
            .append("cameraIps", getCameraIps())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
