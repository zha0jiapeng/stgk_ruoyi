package com.ruoyi.system.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StgkRoomMonitorMapper;
import com.ruoyi.system.domain.StgkRoomMonitor;
import com.ruoyi.system.service.IStgkRoomMonitorService;

/**
 * 配电室监控表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
@Service
public class StgkRoomMonitorServiceImpl extends ServiceImpl<StgkRoomMonitorMapper,StgkRoomMonitor> implements IStgkRoomMonitorService
{
    @Autowired
    private StgkRoomMonitorMapper stgkRoomMonitorMapper;

    /**
     * 查询配电室监控表
     * 
     * @param id 配电室监控表主键
     * @return 配电室监控表
     */
    @Override
    public StgkRoomMonitor selectStgkRoomMonitorById(Long id)
    {
        return stgkRoomMonitorMapper.selectStgkRoomMonitorById(id);
    }

    /**
     * 查询配电室监控表列表
     * 
     * @param stgkRoomMonitor 配电室监控表
     * @return 配电室监控表
     */
    @Override
    public List<StgkRoomMonitor> selectStgkRoomMonitorList(StgkRoomMonitor stgkRoomMonitor)
    {
        return stgkRoomMonitorMapper.selectStgkRoomMonitorList(stgkRoomMonitor);
    }

    /**
     * 新增配电室监控表
     * 
     * @param stgkRoomMonitor 配电室监控表
     * @return 结果
     */
    @Override
    public int insertStgkRoomMonitor(StgkRoomMonitor stgkRoomMonitor)
    {
        return stgkRoomMonitorMapper.insertStgkRoomMonitor(stgkRoomMonitor);
    }

    /**
     * 修改配电室监控表
     * 
     * @param stgkRoomMonitor 配电室监控表
     * @return 结果
     */
    @Override
    public int updateStgkRoomMonitor(StgkRoomMonitor stgkRoomMonitor)
    {
        return stgkRoomMonitorMapper.updateStgkRoomMonitor(stgkRoomMonitor);
    }

    /**
     * 批量删除配电室监控表
     * 
     * @param ids 需要删除的配电室监控表主键
     * @return 结果
     */
    @Override
    public int deleteStgkRoomMonitorByIds(Long[] ids)
    {
        return stgkRoomMonitorMapper.deleteStgkRoomMonitorByIds(ids);
    }

    /**
     * 删除配电室监控表信息
     * 
     * @param id 配电室监控表主键
     * @return 结果
     */
    @Override
    public int deleteStgkRoomMonitorById(Long id)
    {
        return stgkRoomMonitorMapper.deleteStgkRoomMonitorById(id);
    }

    @Override
    public List<Map<String, BigDecimal>> getTimeTemperatureAndHumidity(Long id) {
        return stgkRoomMonitorMapper.getTimeTemperatureAndHumidity(id);
    }

    @Override
    public StgkRoomMonitor selectStgkRoomMonitorByRoomIdLast1(Long id) {
        return stgkRoomMonitorMapper.selectStgkRoomMonitorByRoomIdLast1(id);
    }
}
