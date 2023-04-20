package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StgkCableMonitorMapper;
import com.ruoyi.system.domain.StgkCableMonitor;
import com.ruoyi.system.service.IStgkCableMonitorService;

/**
 * 电缆监测表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-20
 */
@Service
public class StgkCableMonitorServiceImpl implements IStgkCableMonitorService 
{
    @Autowired
    private StgkCableMonitorMapper stgkCableMonitorMapper;

    /**
     * 查询电缆监测表
     * 
     * @param id 电缆监测表主键
     * @return 电缆监测表
     */
    @Override
    public StgkCableMonitor selectStgkCableMonitorById(Long id)
    {
        return stgkCableMonitorMapper.selectStgkCableMonitorById(id);
    }

    /**
     * 查询电缆监测表列表
     * 
     * @param stgkCableMonitor 电缆监测表
     * @return 电缆监测表
     */
    @Override
    public List<StgkCableMonitor> selectStgkCableMonitorList(StgkCableMonitor stgkCableMonitor)
    {
        return stgkCableMonitorMapper.selectStgkCableMonitorList(stgkCableMonitor);
    }

    /**
     * 新增电缆监测表
     * 
     * @param stgkCableMonitor 电缆监测表
     * @return 结果
     */
    @Override
    public int insertStgkCableMonitor(StgkCableMonitor stgkCableMonitor)
    {
        return stgkCableMonitorMapper.insertStgkCableMonitor(stgkCableMonitor);
    }

    /**
     * 修改电缆监测表
     * 
     * @param stgkCableMonitor 电缆监测表
     * @return 结果
     */
    @Override
    public int updateStgkCableMonitor(StgkCableMonitor stgkCableMonitor)
    {
        return stgkCableMonitorMapper.updateStgkCableMonitor(stgkCableMonitor);
    }

    /**
     * 批量删除电缆监测表
     * 
     * @param ids 需要删除的电缆监测表主键
     * @return 结果
     */
    @Override
    public int deleteStgkCableMonitorByIds(Long[] ids)
    {
        return stgkCableMonitorMapper.deleteStgkCableMonitorByIds(ids);
    }

    /**
     * 删除电缆监测表信息
     * 
     * @param id 电缆监测表主键
     * @return 结果
     */
    @Override
    public int deleteStgkCableMonitorById(Long id)
    {
        return stgkCableMonitorMapper.deleteStgkCableMonitorById(id);
    }
}
