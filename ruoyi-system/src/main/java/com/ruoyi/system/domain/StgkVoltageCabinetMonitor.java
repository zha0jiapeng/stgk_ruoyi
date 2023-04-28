package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 高压柜监控对象 stgk_voltage_cabinet_monitor
 *
 * @author ruoyi
 * @date 2023-04-27
 */
@Data
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

    /** A相电压 */
    @Excel(name = "A相电压")
    private BigDecimal aVoltage;

    /** B相电流 */
    @Excel(name = "B相电流")
    private BigDecimal bCurrent;

    /** B相电压 */
    @Excel(name = "B相电压")
    private BigDecimal bVoltage;

    /** C相电流 */
    @Excel(name = "C相电流")
    private BigDecimal cCurrent;

    /** C相电压 */
    @Excel(name = "C相电压")
    private BigDecimal cVoltage;

    /** 有功功率 */
    @Excel(name = "有功功率")
    private BigDecimal activePower;

    /** UAB电压 */
    @Excel(name = "UAB电压")
    private BigDecimal uabVoltage;

    /** 无功功率 */
    @Excel(name = "无功功率")
    private BigDecimal reactivePower;

    /** UAC电压 */
    @Excel(name = "UAC电压")
    private BigDecimal uacVoltage;

    /** 功率因数 */
    @Excel(name = "功率因数")
    private BigDecimal powerFactor;

    /** UBC电压 */
    @Excel(name = "UBC电压")
    private BigDecimal ubcVoltage;

    /** 柜内温度 */
    @Excel(name = "柜内温度")
    private BigDecimal temperature;

    /** 柜内湿度 */
    @Excel(name = "柜内湿度")
    private BigDecimal humidity;

    /** 放电量 */
    @Excel(name = "放电量")
    private BigDecimal dischargeCapacity;

    /** 放电次数 */
    @Excel(name = "放电次数")
    private BigDecimal dischargeFrequency;

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

    /** 断路器上口报警温度 */
    @Excel(name = "断路器上口报警温度")
    private BigDecimal breakerUpReportTemperature;

    /** 断路器下口报警温度 */
    @Excel(name = "断路器下口报警温度")
    private BigDecimal breakerDownReportTemperature;

    /** 断路器出口报警温度 */
    @Excel(name = "断路器出口报警温度")
    private BigDecimal breakerOutReportTemperature;

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
    private LocalDateTime monitorTime;

}
