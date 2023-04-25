package com.ruoyi.system.service.impl;

import java.util.List;
import java.util.Map;

import com.ruoyi.system.domain.StgkCableMonitor;
import com.ruoyi.system.service.IStgkCableMonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StgkCableMapper;
import com.ruoyi.system.domain.StgkCable;
import com.ruoyi.system.service.IStgkCableService;

/**
 * 电缆Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-15
 */
@Service
public class StgkCableServiceImpl implements IStgkCableService 
{
    @Autowired
    private StgkCableMapper stgkCableMapper;

    @Autowired
    private IStgkCableMonitorService stgkCableMonitorService;

    /**
     * 查询电缆
     * 
     * @param id 电缆主键
     * @return 电缆
     */
    @Override
    public StgkCable selectStgkCableById(Long id)
    {
        StgkCable stgkCable = stgkCableMapper.selectStgkCableById(id);
        if(stgkCable!=null) {
            stgkCable.setMaintenanceDay(321);
            stgkCable.setMaintenanceTotalDay(654);
            stgkCable.setMaintenanceStatus(1);
        }
        return stgkCable;
    }

    /**
     * 查询电缆列表
     * 
     * @param stgkCable 电缆
     * @return 电缆
     */
    @Override
    public List<StgkCable> selectStgkCableList(StgkCable stgkCable)
    {
        List<StgkCable> stgkCables = stgkCableMapper.selectStgkCableList(stgkCable);
        for (StgkCable item: stgkCables) {
            item.setMaintenanceDay(321);
            item.setMaintenanceTotalDay(654);
            item.setMaintenanceStatus(1);
        }
        return stgkCables;
    }

    /**
     * 新增电缆
     * 
     * @param stgkCable 电缆
     * @return 结果
     */
    @Override
    public int insertStgkCable(StgkCable stgkCable)
    {
        return stgkCableMapper.insertStgkCable(stgkCable);
    }

    /**
     * 修改电缆
     * 
     * @param stgkCable 电缆
     * @return 结果
     */
    @Override
    public int updateStgkCable(StgkCable stgkCable)
    {
        return stgkCableMapper.updateStgkCable(stgkCable);
    }

    /**
     * 批量删除电缆
     * 
     * @param ids 需要删除的电缆主键
     * @return 结果
     */
    @Override
    public int deleteStgkCableByIds(Long[] ids)
    {
        return stgkCableMapper.deleteStgkCableByIds(ids);
    }

    /**
     * 删除电缆信息
     * 
     * @param id 电缆主键
     * @return 结果
     */
    @Override
    public int deleteStgkCableById(Long id)
    {
        return stgkCableMapper.deleteStgkCableById(id);
    }

    @Override
    public List<Map<String, Integer>> getIndexMaxTemperature(Long id) {
        List<Map<String, Integer>> maps = stgkCableMapper.getIndexMaxTemperature(id);
        //模拟 一个传感器之前 距离500m
        for (Map<String, Integer> map: maps) {
            map.put("distance", map.get("sensor_index")*500);
        }
        return maps;
    }

    @Override
    public List<Map<String, Integer>> getTimeTemperature(Long id) {
        List<Map<String, Integer>> maps= stgkCableMapper.getTimeTemperature(id);
        return maps;
    }
    @Override
    public List<Map<String, Integer>> getTimeCurrent(Long id) {
        List<Map<String, Integer>> maps= stgkCableMapper.getTimeCurrent(id);
        return maps;
    }
}
