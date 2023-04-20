package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 电缆对象 stgk_cable
 * 
 * @author ruoyi
 * @date 2023-03-15
 */
public class StgkCable extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增id */
    private Long id;

    /** 电缆编号 */
    @Excel(name = "电缆编号")
    private String cableNumber;

    /** 电缆名称 */
    @Excel(name = "电缆名称")
    private String cableName;

    /** 电缆状态 0健康 1异常 2危险 */
    @Excel(name = "电缆状态 0健康 1异常 2危险")
    private Long cableStatus;

    /** 电缆备注 */
    @Excel(name = "电缆备注")
    private String cableRemark;

    /** 电缆电压等级 */
    @Excel(name = "电缆电压等级")
    private String cableVoltageLevel;

    /** 电缆总长度 */
    @Excel(name = "电缆总长度")
    private Integer cableLength;

    /** 电缆预警温度值 */
    @Excel(name = "电缆预警温度值")
    private Integer cableEarlyWarning;

    /** 电缆告警温度值 */
    @Excel(name = "电缆告警温度值")
    private Integer cableReportWarning;

    /** 电缆报警温度值 */
    @Excel(name = "电缆报警温度值")
    private Integer cableAlarmWarning;

    /** 电缆24小时内最高温度 */
    @Excel(name = "电缆24小时内最高温度")
    private BigDecimal cableMaxTemperature;

    /** 电缆24小时内最低温度 */
    @Excel(name = "电缆24小时内最低温度")
    private BigDecimal cableMinTemperature;

    /** 电缆24小时内平均温度 */
    @Excel(name = "电缆24小时内平均温度")
    private BigDecimal cableAvgTemperature;

    /** 维保状态 */
    @Excel(name = "维保状态")
    private Integer maintenanceStatus;

    /** 维保总天数 */
    @Excel(name = "维保总天数")
    private Integer maintenanceTotalDay;

    /** 已维保天数 */
    @Excel(name = "已维保天数")
    private Integer maintenanceDay;


    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCableNumber(String cableNumber) 
    {
        this.cableNumber = cableNumber;
    }

    public String getCableNumber() 
    {
        return cableNumber;
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
    public void setCableRemark(String cableRemark) 
    {
        this.cableRemark = cableRemark;
    }

    public String getCableRemark() 
    {
        return cableRemark;
    }
    public void setCableVoltageLevel(String cableVoltageLevel) 
    {
        this.cableVoltageLevel = cableVoltageLevel;
    }

    public String getCableVoltageLevel() 
    {
        return cableVoltageLevel;
    }
    public void setCableLength(Integer cableLength) 
    {
        this.cableLength = cableLength;
    }

    public Integer getCableLength() 
    {
        return cableLength;
    }
    public void setCableEarlyWarning(Integer cableEarlyWarning) 
    {
        this.cableEarlyWarning = cableEarlyWarning;
    }

    public Integer getCableEarlyWarning() 
    {
        return cableEarlyWarning;
    }
    public void setCableReportWarning(Integer cableReportWarning) 
    {
        this.cableReportWarning = cableReportWarning;
    }

    public Integer getCableReportWarning() 
    {
        return cableReportWarning;
    }
    public void setCableAlarmWarning(Integer cableAlarmWarning) 
    {
        this.cableAlarmWarning = cableAlarmWarning;
    }

    public Integer getCableAlarmWarning() 
    {
        return cableAlarmWarning;
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

    public Integer getMaintenanceStatus() {
        return maintenanceStatus;
    }

    public void setMaintenanceStatus(Integer maintenanceStatus) {
        this.maintenanceStatus = maintenanceStatus;
    }

    public Integer getMaintenanceTotalDay() {
        return maintenanceTotalDay;
    }

    public void setMaintenanceTotalDay(Integer maintenanceTotalDay) {
        this.maintenanceTotalDay = maintenanceTotalDay;
    }

    public Integer getMaintenanceDay() {
        return maintenanceDay;
    }

    public void setMaintenanceDay(Integer maintenanceDay) {
        this.maintenanceDay = maintenanceDay;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("cableNumber", getCableNumber())
            .append("cableName", getCableName())
            .append("cableStatus", getCableStatus())
            .append("cableRemark", getCableRemark())
            .append("cableVoltageLevel", getCableVoltageLevel())
            .append("cableLength", getCableLength())
            .append("cableEarlyWarning", getCableEarlyWarning())
            .append("cableReportWarning", getCableReportWarning())
            .append("cableAlarmWarning", getCableAlarmWarning())
            .append("cableMaxTemperature", getCableMaxTemperature())
            .append("cableMinTemperature", getCableMinTemperature())
            .append("cableAvgTemperature", getCableAvgTemperature())
            .toString();
    }
}
