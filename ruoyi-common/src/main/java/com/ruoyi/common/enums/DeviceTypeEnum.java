package com.ruoyi.common.enums;

/**
 * 操作人类别
 * 
 * @author ruoyi
 */
public enum DeviceTypeEnum
{
    HIGH_VOLTAGE_CABINET(1L,"高压柜"),
    TRANSFORMER(2L,"变压器"),
    CABLE(3L,"电缆");

    DeviceTypeEnum(Long code,String name){
        this.code = code;
        this.name = name;
    }

    private Long code;
    private String name;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
