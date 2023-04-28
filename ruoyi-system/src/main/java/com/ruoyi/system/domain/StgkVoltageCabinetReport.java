package com.ruoyi.system.domain;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 高压柜报警记录表对象 stgk_voltage_cabinet_report
 * 
 * @author ruoyi
 * @date 2023-04-28
 */
@Data
public class StgkVoltageCabinetReport extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增id */
    private Long id;

    /** 高压柜主键 */
    @Excel(name = "高压柜主键")
    private Long cabinetId;

    @TableField(exist = false)
    private String cabinetName;

    /** 监控表对应id */
    @Excel(name = "监控表对应id")
    private Long monitorId;

    /** 设置报警值 */
    @Excel(name = "设置报警值")
    private BigDecimal setValue;

    /** 报警值 */
    @Excel(name = "报警值")
    private BigDecimal colunmValue;

    /** 报警字段名 */
    @Excel(name = "报警字段名")
    private String reportFieldName;

    /** 报警字段名中文 */
    @Excel(name = "报警字段名中文")
    private String reportFieldChinese;

}
