package com.ruoyi.system.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StgkVoltageCabinetMonitorMapper;
import com.ruoyi.system.domain.StgkVoltageCabinetMonitor;
import com.ruoyi.system.service.IStgkVoltageCabinetMonitorService;

/**
 * 高压柜监控Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-20
 */
@Service
public class StgkVoltageCabinetMonitorServiceImpl implements IStgkVoltageCabinetMonitorService 
{
    @Autowired
    private StgkVoltageCabinetMonitorMapper stgkVoltageCabinetMonitorMapper;

    /**
     * 查询高压柜监控
     * 
     * @param id 高压柜监控主键
     * @return 高压柜监控
     */
    @Override
    public StgkVoltageCabinetMonitor selectStgkVoltageCabinetMonitorById(Long id)
    {
        return stgkVoltageCabinetMonitorMapper.selectStgkVoltageCabinetMonitorById(id);
    }

    /**
     * 查询高压柜监控列表
     * 
     * @param stgkVoltageCabinetMonitor 高压柜监控
     * @return 高压柜监控
     */
    @Override
    public List<StgkVoltageCabinetMonitor> selectStgkVoltageCabinetMonitorList(StgkVoltageCabinetMonitor stgkVoltageCabinetMonitor)
    {
        return stgkVoltageCabinetMonitorMapper.selectStgkVoltageCabinetMonitorList(stgkVoltageCabinetMonitor);
    }

    /**
     * 新增高压柜监控
     * 
     * @param stgkVoltageCabinetMonitor 高压柜监控
     * @return 结果
     */
    @Override
    public int insertStgkVoltageCabinetMonitor(StgkVoltageCabinetMonitor stgkVoltageCabinetMonitor)
    {
        return stgkVoltageCabinetMonitorMapper.insertStgkVoltageCabinetMonitor(stgkVoltageCabinetMonitor);
    }

    /**
     * 修改高压柜监控
     * 
     * @param stgkVoltageCabinetMonitor 高压柜监控
     * @return 结果
     */
    @Override
    public int updateStgkVoltageCabinetMonitor(StgkVoltageCabinetMonitor stgkVoltageCabinetMonitor)
    {
        return stgkVoltageCabinetMonitorMapper.updateStgkVoltageCabinetMonitor(stgkVoltageCabinetMonitor);
    }

    /**
     * 批量删除高压柜监控
     * 
     * @param ids 需要删除的高压柜监控主键
     * @return 结果
     */
    @Override
    public int deleteStgkVoltageCabinetMonitorByIds(Long[] ids)
    {
        return stgkVoltageCabinetMonitorMapper.deleteStgkVoltageCabinetMonitorByIds(ids);
    }

    /**
     * 删除高压柜监控信息
     * 
     * @param id 高压柜监控主键
     * @return 结果
     */
    @Override
    public int deleteStgkVoltageCabinetMonitorById(Long id)
    {
        return stgkVoltageCabinetMonitorMapper.deleteStgkVoltageCabinetMonitorById(id);
    }

    @Override
    public List<Map<String, BigDecimal>> getGraph(String column,Long cabinetId) {
        return stgkVoltageCabinetMonitorMapper.getGraph(column,cabinetId);
    }
}
