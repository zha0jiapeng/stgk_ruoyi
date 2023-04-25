package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StgkVoltageCabinetMapper;
import com.ruoyi.system.domain.StgkVoltageCabinet;
import com.ruoyi.system.service.IStgkVoltageCabinetService;

/**
 * 高压柜Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
@Service
public class StgkVoltageCabinetServiceImpl implements IStgkVoltageCabinetService 
{
    @Autowired
    private StgkVoltageCabinetMapper stgkVoltageCabinetMapper;

    /**
     * 查询高压柜
     * 
     * @param id 高压柜主键
     * @return 高压柜
     */
    @Override
    public StgkVoltageCabinet selectStgkVoltageCabinetById(Long id)
    {
        return stgkVoltageCabinetMapper.selectStgkVoltageCabinetById(id);
    }

    /**
     * 查询高压柜列表
     * 
     * @param stgkVoltageCabinet 高压柜
     * @return 高压柜
     */
    @Override
    public List<StgkVoltageCabinet> selectStgkVoltageCabinetList(StgkVoltageCabinet stgkVoltageCabinet)
    {
        return stgkVoltageCabinetMapper.selectStgkVoltageCabinetList(stgkVoltageCabinet);
    }

    /**
     * 新增高压柜
     * 
     * @param stgkVoltageCabinet 高压柜
     * @return 结果
     */
    @Override
    public int insertStgkVoltageCabinet(StgkVoltageCabinet stgkVoltageCabinet)
    {
        stgkVoltageCabinet.setCreateTime(DateUtils.getNowDate());
        return stgkVoltageCabinetMapper.insertStgkVoltageCabinet(stgkVoltageCabinet);
    }

    /**
     * 修改高压柜
     * 
     * @param stgkVoltageCabinet 高压柜
     * @return 结果
     */
    @Override
    public int updateStgkVoltageCabinet(StgkVoltageCabinet stgkVoltageCabinet)
    {
        stgkVoltageCabinet.setUpdateTime(DateUtils.getNowDate());
        return stgkVoltageCabinetMapper.updateStgkVoltageCabinet(stgkVoltageCabinet);
    }

    /**
     * 批量删除高压柜
     * 
     * @param ids 需要删除的高压柜主键
     * @return 结果
     */
    @Override
    public int deleteStgkVoltageCabinetByIds(Long[] ids)
    {
        return stgkVoltageCabinetMapper.deleteStgkVoltageCabinetByIds(ids);
    }

    /**
     * 删除高压柜信息
     * 
     * @param id 高压柜主键
     * @return 结果
     */
    @Override
    public int deleteStgkVoltageCabinetById(Long id)
    {
        return stgkVoltageCabinetMapper.deleteStgkVoltageCabinetById(id);
    }
}
