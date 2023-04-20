package com.ruoyi.system.service;

import java.util.List;
import java.util.Map;

import com.ruoyi.system.domain.StgkCable;
import com.ruoyi.system.domain.StgkCableMonitor;

/**
 * 电缆Service接口
 * 
 * @author ruoyi
 * @date 2023-03-15
 */
public interface IStgkCableService 
{
    /**
     * 查询电缆
     * 
     * @param id 电缆主键
     * @return 电缆
     */
    public StgkCable selectStgkCableById(Long id);

    /**
     * 查询电缆列表
     * 
     * @param stgkCable 电缆
     * @return 电缆集合
     */
    public List<StgkCable> selectStgkCableList(StgkCable stgkCable);

    /**
     * 新增电缆
     * 
     * @param stgkCable 电缆
     * @return 结果
     */
    public int insertStgkCable(StgkCable stgkCable);

    /**
     * 修改电缆
     * 
     * @param stgkCable 电缆
     * @return 结果
     */
    public int updateStgkCable(StgkCable stgkCable);

    /**
     * 批量删除电缆
     * 
     * @param ids 需要删除的电缆主键集合
     * @return 结果
     */
    public int deleteStgkCableByIds(Long[] ids);

    /**
     * 删除电缆信息
     * 
     * @param id 电缆主键
     * @return 结果
     */
    public int deleteStgkCableById(Long id);

    List<Map<String, Integer>> getIndexMaxTemperature(Long id);

    List<Map<String, Integer>> getTimeTemperature(Long id);

    List<Map<String, Integer>> getTimeCurrent(Long id);

}
