package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.StgkTransformerMonitor;

/**
 * 变压器监控Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-29
 */
public interface StgkTransformerMonitorMapper 
{
    /**
     * 查询变压器监控
     * 
     * @param id 变压器监控主键
     * @return 变压器监控
     */
    public StgkTransformerMonitor selectStgkTransformerMonitorById(Long id);

    /**
     * 查询变压器监控列表
     * 
     * @param stgkTransformerMonitor 变压器监控
     * @return 变压器监控集合
     */
    public List<StgkTransformerMonitor> selectStgkTransformerMonitorList(StgkTransformerMonitor stgkTransformerMonitor);

    /**
     * 新增变压器监控
     * 
     * @param stgkTransformerMonitor 变压器监控
     * @return 结果
     */
    public int insertStgkTransformerMonitor(StgkTransformerMonitor stgkTransformerMonitor);

    /**
     * 修改变压器监控
     * 
     * @param stgkTransformerMonitor 变压器监控
     * @return 结果
     */
    public int updateStgkTransformerMonitor(StgkTransformerMonitor stgkTransformerMonitor);

    /**
     * 删除变压器监控
     * 
     * @param id 变压器监控主键
     * @return 结果
     */
    public int deleteStgkTransformerMonitorById(Long id);

    /**
     * 批量删除变压器监控
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStgkTransformerMonitorByIds(Long[] ids);

    StgkTransformerMonitor selectTransformerMonitorByIdLimit1(Long transformerId);
}
