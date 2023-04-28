package com.ruoyi.system.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StgkVoltageCabinetMonitorMapper;
import com.ruoyi.system.domain.StgkVoltageCabinetMonitor;
import com.ruoyi.system.service.IStgkVoltageCabinetMonitorService;

/**
 * 高压柜监控Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
@Service
public class StgkVoltageCabinetMonitorServiceImpl extends ServiceImpl<StgkVoltageCabinetMonitorMapper,StgkVoltageCabinetMonitor> implements IStgkVoltageCabinetMonitorService
{
    @Autowired
    private StgkVoltageCabinetMonitorMapper stgkVoltageCabinetMonitorMapper;

    /**
     * 查询高压柜监控
     * 
     * @param id 高压柜监控主键
     * @return 高压柜监控
     */
    @Override
    public StgkVoltageCabinetMonitor selectStgkVoltageCabinetMonitorById(Long id)
    {
        return stgkVoltageCabinetMonitorMapper.selectById(id);
    }

    /**
     * 查询高压柜监控列表
     * 
     * @param stgkVoltageCabinetMonitor 高压柜监控
     * @return 高压柜监控
     */
    @Override
    public List<StgkVoltageCabinetMonitor> selectStgkVoltageCabinetMonitorList(StgkVoltageCabinetMonitor stgkVoltageCabinetMonitor)
    {

        return stgkVoltageCabinetMonitorMapper.selectList(new LambdaQueryWrapper<>());
    }

    /**
     * 新增高压柜监控
     * 
     * @param stgkVoltageCabinetMonitor 高压柜监控
     * @return 结果
     */
    @Override
    public int insertStgkVoltageCabinetMonitor(StgkVoltageCabinetMonitor stgkVoltageCabinetMonitor)
    {
        return stgkVoltageCabinetMonitorMapper.insert(stgkVoltageCabinetMonitor);
    }

    /**
     * 修改高压柜监控
     * 
     * @param stgkVoltageCabinetMonitor 高压柜监控
     * @return 结果
     */
    @Override
    public int updateStgkVoltageCabinetMonitor(StgkVoltageCabinetMonitor stgkVoltageCabinetMonitor)
    {
        return stgkVoltageCabinetMonitorMapper.update(stgkVoltageCabinetMonitor,new LambdaUpdateWrapper<StgkVoltageCabinetMonitor>().eq(StgkVoltageCabinetMonitor::getId,stgkVoltageCabinetMonitor.getCabinetId()));
    }

    /**
     * 批量删除高压柜监控
     * 
     * @param ids 需要删除的高压柜监控主键
     * @return 结果
     */
    @Override
    public int deleteStgkVoltageCabinetMonitorByIds(Long[] ids)
    {
        return stgkVoltageCabinetMonitorMapper.deleteBatchIds(new ArrayList<>(Arrays.asList(ids)));
    }

    /**
     * 删除高压柜监控信息
     * 
     * @param id 高压柜监控主键
     * @return 结果
     */
    @Override
    public int deleteStgkVoltageCabinetMonitorById(Integer id)
    {
        return stgkVoltageCabinetMonitorMapper.deleteById(id);
    }

    @Override
    public StgkVoltageCabinetMonitor selectStgkVoltageCabinetMonitorByCabinetId(Integer id) {
        LambdaQueryWrapper<StgkVoltageCabinetMonitor> q = new LambdaQueryWrapper<>();
                q.eq(StgkVoltageCabinetMonitor::getCabinetId,id);
                q.orderByDesc(StgkVoltageCabinetMonitor::getMonitorTime);
                q.last("limit 1");
        return stgkVoltageCabinetMonitorMapper.selectOne(q);
    }

    @Override
    public List<Map<String, BigDecimal>> getCurve(Long cabinetId,String column) {
        return stgkVoltageCabinetMonitorMapper.getCurve(cabinetId,column);
    }
}
