package com.ruoyi.common.enums;

/**
 * 操作人类别
 * 
 * @author ruoyi
 */
public enum ModbusTableEnum
{
    //储能/未储能
    ENERGY_STORAGE,
    //远方/就地
    REMOTE_LOCAL,
    //断路器分闸
    BREAKER_OPENING,
    //断路器合闸
    BREAKER_CLOSING,
    //接地刀合
    GROUNDING_KNIFE_CLOSING,
    //接地刀分
    GROUNDING_KNIFE_OPENING,
    //手车拉出
    HANDCART_PULLINGOUT,
    //手车推进
    HANDCART_PROPULSION,
    //照明
    LIGHTING,
    //加热1
    HEAT1,
    //加热2
    HEAT2,
    //降温
    LOWER_THE_TEMPERATURE;

}
