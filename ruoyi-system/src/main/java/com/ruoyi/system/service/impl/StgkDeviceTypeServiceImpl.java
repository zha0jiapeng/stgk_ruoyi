package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StgkDeviceTypeMapper;
import com.ruoyi.system.domain.StgkDeviceType;
import com.ruoyi.system.service.IStgkDeviceTypeService;

/**
 * 设备类型表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
@Service
public class StgkDeviceTypeServiceImpl implements IStgkDeviceTypeService 
{
    @Autowired
    private StgkDeviceTypeMapper stgkDeviceTypeMapper;

    /**
     * 查询设备类型表
     * 
     * @param id 设备类型表主键
     * @return 设备类型表
     */
    @Override
    public StgkDeviceType selectStgkDeviceTypeById(Long id)
    {
        return stgkDeviceTypeMapper.selectStgkDeviceTypeById(id);
    }

    /**
     * 查询设备类型表列表
     * 
     * @param stgkDeviceType 设备类型表
     * @return 设备类型表
     */
    @Override
    public List<StgkDeviceType> selectStgkDeviceTypeList(StgkDeviceType stgkDeviceType)
    {
        return stgkDeviceTypeMapper.selectStgkDeviceTypeList(stgkDeviceType);
    }

    /**
     * 新增设备类型表
     * 
     * @param stgkDeviceType 设备类型表
     * @return 结果
     */
    @Override
    public int insertStgkDeviceType(StgkDeviceType stgkDeviceType)
    {
        stgkDeviceType.setCreateTime(DateUtils.getNowDate());
        return stgkDeviceTypeMapper.insertStgkDeviceType(stgkDeviceType);
    }

    /**
     * 修改设备类型表
     * 
     * @param stgkDeviceType 设备类型表
     * @return 结果
     */
    @Override
    public int updateStgkDeviceType(StgkDeviceType stgkDeviceType)
    {
        stgkDeviceType.setUpdateTime(DateUtils.getNowDate());
        return stgkDeviceTypeMapper.updateStgkDeviceType(stgkDeviceType);
    }

    /**
     * 批量删除设备类型表
     * 
     * @param ids 需要删除的设备类型表主键
     * @return 结果
     */
    @Override
    public int deleteStgkDeviceTypeByIds(Long[] ids)
    {
        return stgkDeviceTypeMapper.deleteStgkDeviceTypeByIds(ids);
    }

    /**
     * 删除设备类型表信息
     * 
     * @param id 设备类型表主键
     * @return 结果
     */
    @Override
    public int deleteStgkDeviceTypeById(Long id)
    {
        return stgkDeviceTypeMapper.deleteStgkDeviceTypeById(id);
    }
}
