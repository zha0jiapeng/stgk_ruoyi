package com.ruoyi.common.enums;

/**
 * 操作人类别
 * 
 * @author ruoyi
 */
public enum DeviceTypeEnum
{
    HIGH_VOLTAGE_CABINET(1,"高压柜"),
    TRANSFORMER(2,"变压器"),
    CABLE(3,"电缆");

    DeviceTypeEnum(Integer code,String name){
        this.code = code;
        this.name = name;
    }

    private Integer code;
    private String name;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
