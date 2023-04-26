package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.StgkDeviceSet;

/**
 * 设备通用设置表Service接口
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
public interface IStgkDeviceSetService 
{
    /**
     * 查询设备通用设置表
     * 
     * @param id 设备通用设置表主键
     * @return 设备通用设置表
     */
    public StgkDeviceSet selectStgkDeviceSetById(Long id);

    /**
     * 查询设备通用设置表列表
     * 
     * @param stgkDeviceSet 设备通用设置表
     * @return 设备通用设置表集合
     */
    public List<StgkDeviceSet> selectStgkDeviceSetList(StgkDeviceSet stgkDeviceSet);

    /**
     * 新增设备通用设置表
     * 
     * @param stgkDeviceSet 设备通用设置表
     * @return 结果
     */
    public int insertStgkDeviceSet(StgkDeviceSet stgkDeviceSet);

    /**
     * 修改设备通用设置表
     * 
     * @param stgkDeviceSet 设备通用设置表
     * @return 结果
     */
    public int updateStgkDeviceSet(StgkDeviceSet stgkDeviceSet);

    /**
     * 批量删除设备通用设置表
     * 
     * @param ids 需要删除的设备通用设置表主键集合
     * @return 结果
     */
    public int deleteStgkDeviceSetByIds(Long[] ids);

    /**
     * 删除设备通用设置表信息
     * 
     * @param id 设备通用设置表主键
     * @return 结果
     */
    public int deleteStgkDeviceSetById(Long id);

    StgkDeviceSet selectStgkDeviceSetByTypeIdAndDeviceId(Integer typeId, Integer id);
}
