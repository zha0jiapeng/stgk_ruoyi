package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
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
@Data
public class StgkVoltageCabinet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 合闸位移 */
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

    /** 分闸最小电流 */
    @Excel(name = "分闸最小电流")
    private BigDecimal trippingMinCurrent;

    /** 分闸最大电流 */
    @Excel(name = "分闸最大电流")
    private BigDecimal trippingMaxCurrent;

    /** 合闸最小电流 */
    @Excel(name = "合闸最小电流")
    private BigDecimal closingMinCurrent;

    /** 合闸最大电流 */
    @Excel(name = "合闸最大电流")
    private BigDecimal closingMaxCurrent;

    /** 分闸时间最小值 */
    private BigDecimal trippingMinTime;

    /** 分闸时间最大值 */
    @Excel(name = "分闸时间最大值")
    private BigDecimal trippingMaxTime;

    /** 合闸时间最小值 */
    @Excel(name = "合闸时间最小值")
    private BigDecimal closingMinTime;

    /** 合闸时间最大值 */
    private BigDecimal closingMaxTime;

    /** 储能电流最小值 */

    private BigDecimal storageMinCurrent;

    /** 储能电流最大值 */
    private BigDecimal storageMaxCurrent;

    /** 分闸位移最小值 */
    @Excel(name = "分闸位移最小值")
    private BigDecimal trippingMinDisplacement;

    /** 分闸位移最大值 */
    @Excel(name = "分闸位移最大值")
    private BigDecimal trippingMaxDisplacement;

    /** 合闸位移最小值 */
    @Excel(name = "合闸位移最小值")
    private BigDecimal closingMinDisplacement;

    /** 合闸位移最大值 */
    @Excel(name = "合闸位移最大值")
    private BigDecimal closingMaxDisplacement;

    /** 合闸行程最小值 */
    @Excel(name = "合闸行程最小值")
    private BigDecimal closingMinTrip;

    /** 合闸行程最大值 */
    @Excel(name = "合闸行程最大值")
    private BigDecimal closingMaxTrip;

}
