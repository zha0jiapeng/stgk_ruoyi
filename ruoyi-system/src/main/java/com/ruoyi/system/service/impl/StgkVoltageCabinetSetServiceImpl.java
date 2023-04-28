package com.ruoyi.system.service.impl;

import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StgkVoltageCabinetSetMapper;
import com.ruoyi.system.domain.StgkVoltageCabinetSet;
import com.ruoyi.system.service.IStgkVoltageCabinetSetService;

/**
 * 高压柜报警设置表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-28
 */
@Service
public class StgkVoltageCabinetSetServiceImpl extends ServiceImpl<StgkVoltageCabinetSetMapper, StgkVoltageCabinetSet> implements IStgkVoltageCabinetSetService
{
    @Autowired
    private StgkVoltageCabinetSetMapper stgkVoltageCabinetSetMapper;

    /**
     * 查询高压柜报警设置表
     * 
     * @param id 高压柜报警设置表主键
     * @return 高压柜报警设置表
     */
    @Override
    public StgkVoltageCabinetSet selectStgkVoltageCabinetSetById(Long id)
    {
        return stgkVoltageCabinetSetMapper.selectById(id);
    }

    /**
     * 查询高压柜报警设置表列表
     * 
     * @param stgkVoltageCabinetSet 高压柜报警设置表
     * @return 高压柜报警设置表
     */
    @Override
    public List<StgkVoltageCabinetSet> selectStgkVoltageCabinetSetList(StgkVoltageCabinetSet stgkVoltageCabinetSet)
    {
        LambdaQueryWrapper<StgkVoltageCabinetSet> q = new LambdaQueryWrapper<>();
        return stgkVoltageCabinetSetMapper.selectList(q);
    }

    /**
     * 新增高压柜报警设置表
     * 
     * @param stgkVoltageCabinetSet 高压柜报警设置表
     * @return 结果
     */
    @Override
    public int insertStgkVoltageCabinetSet(StgkVoltageCabinetSet stgkVoltageCabinetSet)
    {
        stgkVoltageCabinetSet.setCreateTime(LocalDateTime.now().withSecond(0).withNano(0));
        return stgkVoltageCabinetSetMapper.insert(stgkVoltageCabinetSet);
    }

    /**
     * 修改高压柜报警设置表
     * 
     * @param stgkVoltageCabinetSet 高压柜报警设置表
     * @return 结果
     */
    @Override
    public int updateStgkVoltageCabinetSet(StgkVoltageCabinetSet stgkVoltageCabinetSet)
    {
        stgkVoltageCabinetSet.setUpdateTime(LocalDateTime.now().withSecond(0).withNano(0));
        return stgkVoltageCabinetSetMapper.updateById(stgkVoltageCabinetSet);
    }

    /**
     * 批量删除高压柜报警设置表
     * 
     * @param ids 需要删除的高压柜报警设置表主键
     * @return 结果
     */
    @Override
    public int deleteStgkVoltageCabinetSetByIds(Long[] ids)
    {
        return stgkVoltageCabinetSetMapper.deleteBatchIds(new ArrayList(Arrays.asList(ids)));
    }

    /**
     * 删除高压柜报警设置表信息
     * 
     * @param id 高压柜报警设置表主键
     * @return 结果
     */
    @Override
    public int deleteStgkVoltageCabinetSetById(Long id)
    {
        return stgkVoltageCabinetSetMapper.deleteById(id);
    }
}
