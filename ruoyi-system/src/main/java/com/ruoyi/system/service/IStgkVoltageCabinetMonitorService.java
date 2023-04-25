package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.StgkVoltageCabinetMonitor;

/**
 * 高压柜监控Service接口
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
public interface IStgkVoltageCabinetMonitorService 
{
    /**
     * 查询高压柜监控
     * 
     * @param id 高压柜监控主键
     * @return 高压柜监控
     */
    public StgkVoltageCabinetMonitor selectStgkVoltageCabinetMonitorById(Long id);

    /**
     * 查询高压柜监控列表
     * 
     * @param stgkVoltageCabinetMonitor 高压柜监控
     * @return 高压柜监控集合
     */
    public List<StgkVoltageCabinetMonitor> selectStgkVoltageCabinetMonitorList(StgkVoltageCabinetMonitor stgkVoltageCabinetMonitor);

    /**
     * 新增高压柜监控
     * 
     * @param stgkVoltageCabinetMonitor 高压柜监控
     * @return 结果
     */
    public int insertStgkVoltageCabinetMonitor(StgkVoltageCabinetMonitor stgkVoltageCabinetMonitor);

    /**
     * 修改高压柜监控
     * 
     * @param stgkVoltageCabinetMonitor 高压柜监控
     * @return 结果
     */
    public int updateStgkVoltageCabinetMonitor(StgkVoltageCabinetMonitor stgkVoltageCabinetMonitor);

    /**
     * 批量删除高压柜监控
     * 
     * @param ids 需要删除的高压柜监控主键集合
     * @return 结果
     */
    public int deleteStgkVoltageCabinetMonitorByIds(Long[] ids);

    /**
     * 删除高压柜监控信息
     * 
     * @param id 高压柜监控主键
     * @return 结果
     */
    public int deleteStgkVoltageCabinetMonitorById(Long id);

    StgkVoltageCabinetMonitor selectStgkVoltageCabinetMonitorByCabinetId(Long id);
}
