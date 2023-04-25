package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.StgkDeviceType;

/**
 * 设备类型表Service接口
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
public interface IStgkDeviceTypeService 
{
    /**
     * 查询设备类型表
     * 
     * @param id 设备类型表主键
     * @return 设备类型表
     */
    public StgkDeviceType selectStgkDeviceTypeById(Long id);

    /**
     * 查询设备类型表列表
     * 
     * @param stgkDeviceType 设备类型表
     * @return 设备类型表集合
     */
    public List<StgkDeviceType> selectStgkDeviceTypeList(StgkDeviceType stgkDeviceType);

    /**
     * 新增设备类型表
     * 
     * @param stgkDeviceType 设备类型表
     * @return 结果
     */
    public int insertStgkDeviceType(StgkDeviceType stgkDeviceType);

    /**
     * 修改设备类型表
     * 
     * @param stgkDeviceType 设备类型表
     * @return 结果
     */
    public int updateStgkDeviceType(StgkDeviceType stgkDeviceType);

    /**
     * 批量删除设备类型表
     * 
     * @param ids 需要删除的设备类型表主键集合
     * @return 结果
     */
    public int deleteStgkDeviceTypeByIds(Long[] ids);

    /**
     * 删除设备类型表信息
     * 
     * @param id 设备类型表主键
     * @return 结果
     */
    public int deleteStgkDeviceTypeById(Long id);
}
