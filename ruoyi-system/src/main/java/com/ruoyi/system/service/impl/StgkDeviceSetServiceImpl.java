package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StgkDeviceSetMapper;
import com.ruoyi.system.domain.StgkDeviceSet;
import com.ruoyi.system.service.IStgkDeviceSetService;

/**
 * 设备通用设置表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
@Service
public class StgkDeviceSetServiceImpl implements IStgkDeviceSetService 
{
    @Autowired
    private StgkDeviceSetMapper stgkDeviceSetMapper;

    /**
     * 查询设备通用设置表
     * 
     * @param id 设备通用设置表主键
     * @return 设备通用设置表
     */
    @Override
    public StgkDeviceSet selectStgkDeviceSetById(Long id)
    {
        return stgkDeviceSetMapper.selectStgkDeviceSetById(id);
    }

    /**
     * 查询设备通用设置表列表
     * 
     * @param stgkDeviceSet 设备通用设置表
     * @return 设备通用设置表
     */
    @Override
    public List<StgkDeviceSet> selectStgkDeviceSetList(StgkDeviceSet stgkDeviceSet)
    {
        return stgkDeviceSetMapper.selectStgkDeviceSetList(stgkDeviceSet);
    }

    /**
     * 新增设备通用设置表
     * 
     * @param stgkDeviceSet 设备通用设置表
     * @return 结果
     */
    @Override
    public int insertStgkDeviceSet(StgkDeviceSet stgkDeviceSet)
    {
        stgkDeviceSet.setCreateTime(DateUtils.getNowDate());
        return stgkDeviceSetMapper.insertStgkDeviceSet(stgkDeviceSet);
    }

    /**
     * 修改设备通用设置表
     * 
     * @param stgkDeviceSet 设备通用设置表
     * @return 结果
     */
    @Override
    public int updateStgkDeviceSet(StgkDeviceSet stgkDeviceSet)
    {
        stgkDeviceSet.setUpdateTime(DateUtils.getNowDate());
        return stgkDeviceSetMapper.updateStgkDeviceSet(stgkDeviceSet);
    }

    /**
     * 批量删除设备通用设置表
     * 
     * @param ids 需要删除的设备通用设置表主键
     * @return 结果
     */
    @Override
    public int deleteStgkDeviceSetByIds(Long[] ids)
    {
        return stgkDeviceSetMapper.deleteStgkDeviceSetByIds(ids);
    }

    /**
     * 删除设备通用设置表信息
     * 
     * @param id 设备通用设置表主键
     * @return 结果
     */
    @Override
    public int deleteStgkDeviceSetById(Long id)
    {
        return stgkDeviceSetMapper.deleteStgkDeviceSetById(id);
    }

    @Override
    public StgkDeviceSet selectStgkDeviceSetByTypeIdAndDeviceId(Integer typeId, Integer deviceId) {
        return stgkDeviceSetMapper.selectStgkDeviceSetByTypeIdAndDeviceId(typeId,deviceId);
    }
}
