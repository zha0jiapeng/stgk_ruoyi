package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 高压柜对象 stgk_voltage_cabinet
 * 
 * @author ruoyi
 * @date 2023-04-20
 */
public class StgkVoltageCabinet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增id */
    private Long id;

    /** 所属配电室id */
    @Excel(name = "所属配电室id")
    private Long roomId;

    /** 高压柜名称 */
    @Excel(name = "高压柜名称")
    private String cabinetName;

    /** 状态 */
    private Long cabinetStatus;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("roomId", getRoomId())
            .append("cabinetName", getCabinetName())
            .append("cabinetStatus", getCabinetStatus())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
