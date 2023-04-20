package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.StgkCableMonitor;

/**
 * 电缆监测表Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-20
 */
public interface StgkCableMonitorMapper 
{
    /**
     * 查询电缆监测表
     * 
     * @param id 电缆监测表主键
     * @return 电缆监测表
     */
    public StgkCableMonitor selectStgkCableMonitorById(Long id);

    /**
     * 查询电缆监测表列表
     * 
     * @param stgkCableMonitor 电缆监测表
     * @return 电缆监测表集合
     */
    public List<StgkCableMonitor> selectStgkCableMonitorList(StgkCableMonitor stgkCableMonitor);

    /**
     * 新增电缆监测表
     * 
     * @param stgkCableMonitor 电缆监测表
     * @return 结果
     */
    public int insertStgkCableMonitor(StgkCableMonitor stgkCableMonitor);

    /**
     * 修改电缆监测表
     * 
     * @param stgkCableMonitor 电缆监测表
     * @return 结果
     */
    public int updateStgkCableMonitor(StgkCableMonitor stgkCableMonitor);

    /**
     * 删除电缆监测表
     * 
     * @param id 电缆监测表主键
     * @return 结果
     */
    public int deleteStgkCableMonitorById(Long id);

    /**
     * 批量删除电缆监测表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStgkCableMonitorByIds(Long[] ids);
}
