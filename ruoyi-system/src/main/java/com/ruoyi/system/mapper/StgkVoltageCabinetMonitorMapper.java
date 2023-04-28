package com.ruoyi.system.mapper;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.system.domain.StgkVoltageCabinetMonitor;
import org.apache.ibatis.annotations.Param;

/**
 * 高压柜监控Mapper接口
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
public interface StgkVoltageCabinetMonitorMapper extends BaseMapper<StgkVoltageCabinetMonitor>
{
    List<Map<String, BigDecimal>> getCurve(@Param("cabinetId") Long cabinetId, @Param("column") String column);
}
