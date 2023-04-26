package com.ruoyi.system.mapper;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.system.domain.StgkRoomMonitor;

/**
 * 配电室监控表Mapper接口
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
public interface StgkRoomMonitorMapper extends BaseMapper<StgkRoomMonitor>
{
    /**
     * 查询配电室监控表
     * 
     * @param id 配电室监控表主键
     * @return 配电室监控表
     */
    public StgkRoomMonitor selectStgkRoomMonitorById(Long id);

    /**
     * 查询配电室监控表列表
     * 
     * @param stgkRoomMonitor 配电室监控表
     * @return 配电室监控表集合
     */
    public List<StgkRoomMonitor> selectStgkRoomMonitorList(StgkRoomMonitor stgkRoomMonitor);

    /**
     * 新增配电室监控表
     * 
     * @param stgkRoomMonitor 配电室监控表
     * @return 结果
     */
    public int insertStgkRoomMonitor(StgkRoomMonitor stgkRoomMonitor);

    /**
     * 修改配电室监控表
     * 
     * @param stgkRoomMonitor 配电室监控表
     * @return 结果
     */
    public int updateStgkRoomMonitor(StgkRoomMonitor stgkRoomMonitor);

    /**
     * 删除配电室监控表
     * 
     * @param id 配电室监控表主键
     * @return 结果
     */
    public int deleteStgkRoomMonitorById(Long id);

    /**
     * 批量删除配电室监控表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStgkRoomMonitorByIds(Long[] ids);

    List<Map<String, BigDecimal>> getTimeTemperatureAndHumidity(Long roomId);

    StgkRoomMonitor selectStgkRoomMonitorByRoomIdLast1(Long roomId);
}
