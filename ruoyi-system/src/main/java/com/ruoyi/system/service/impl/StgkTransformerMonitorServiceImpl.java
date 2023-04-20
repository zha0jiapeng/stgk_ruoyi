package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StgkTransformerMonitorMapper;
import com.ruoyi.system.domain.StgkTransformerMonitor;
import com.ruoyi.system.service.IStgkTransformerMonitorService;

/**
 * 变压器监控Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-29
 */
@Service
public class StgkTransformerMonitorServiceImpl implements IStgkTransformerMonitorService 
{
    @Autowired
    private StgkTransformerMonitorMapper stgkTransformerMonitorMapper;

    /**
     * 查询变压器监控
     * 
     * @param id 变压器监控主键
     * @return 变压器监控
     */
    @Override
    public StgkTransformerMonitor selectStgkTransformerMonitorById(Long id)
    {
        return stgkTransformerMonitorMapper.selectStgkTransformerMonitorById(id);
    }

    /**
     * 查询变压器监控列表
     * 
     * @param stgkTransformerMonitor 变压器监控
     * @return 变压器监控
     */
    @Override
    public List<StgkTransformerMonitor> selectStgkTransformerMonitorList(StgkTransformerMonitor stgkTransformerMonitor)
    {
        return stgkTransformerMonitorMapper.selectStgkTransformerMonitorList(stgkTransformerMonitor);
    }

    /**
     * 新增变压器监控
     * 
     * @param stgkTransformerMonitor 变压器监控
     * @return 结果
     */
    @Override
    public int insertStgkTransformerMonitor(StgkTransformerMonitor stgkTransformerMonitor)
    {
        return stgkTransformerMonitorMapper.insertStgkTransformerMonitor(stgkTransformerMonitor);
    }

    /**
     * 修改变压器监控
     * 
     * @param stgkTransformerMonitor 变压器监控
     * @return 结果
     */
    @Override
    public int updateStgkTransformerMonitor(StgkTransformerMonitor stgkTransformerMonitor)
    {
        return stgkTransformerMonitorMapper.updateStgkTransformerMonitor(stgkTransformerMonitor);
    }

    /**
     * 批量删除变压器监控
     * 
     * @param ids 需要删除的变压器监控主键
     * @return 结果
     */
    @Override
    public int deleteStgkTransformerMonitorByIds(Long[] ids)
    {
        return stgkTransformerMonitorMapper.deleteStgkTransformerMonitorByIds(ids);
    }

    /**
     * 删除变压器监控信息
     * 
     * @param id 变压器监控主键
     * @return 结果
     */
    @Override
    public int deleteStgkTransformerMonitorById(Long id)
    {
        return stgkTransformerMonitorMapper.deleteStgkTransformerMonitorById(id);
    }

    @Override
    public StgkTransformerMonitor selectTransformerMonitorByIdLimit1(Long transformerId) {
        return stgkTransformerMonitorMapper.selectTransformerMonitorByIdLimit1(transformerId);
    }
}
