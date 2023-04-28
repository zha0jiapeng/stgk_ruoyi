package com.ruoyi.system.service.impl;

import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.StgkVoltageCabinet;
import com.ruoyi.system.service.IStgkVoltageCabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StgkVoltageCabinetReportMapper;
import com.ruoyi.system.domain.StgkVoltageCabinetReport;
import com.ruoyi.system.service.IStgkVoltageCabinetReportService;

/**
 * 高压柜报警记录表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-28
 */
@Service
public class StgkVoltageCabinetReportServiceImpl extends ServiceImpl<StgkVoltageCabinetReportMapper, StgkVoltageCabinetReport> implements IStgkVoltageCabinetReportService
{
    @Autowired
    private StgkVoltageCabinetReportMapper stgkVoltageCabinetReportMapper;
    @Autowired
    private IStgkVoltageCabinetService stgkVoltageCabinetService;

    /**
     * 查询高压柜报警记录表
     * 
     * @param id 高压柜报警记录表主键
     * @return 高压柜报警记录表
     */
    @Override
    public StgkVoltageCabinetReport selectStgkVoltageCabinetReportById(Long id)
    {
        StgkVoltageCabinetReport stgkVoltageCabinetReport = stgkVoltageCabinetReportMapper.selectById(id);
        if(stgkVoltageCabinetReport!=null){
            StgkVoltageCabinet byId = stgkVoltageCabinetService.getById(stgkVoltageCabinetReport.getCabinetId());
            if(byId!=null) {
                stgkVoltageCabinetReport.setCabinetName(byId.getCabinetName());
            }
        }

        return stgkVoltageCabinetReport;
    }

    /**
     * 查询高压柜报警记录表列表
     * 
     * @param stgkVoltageCabinetReport 高压柜报警记录表
     * @return 高压柜报警记录表
     */
    @Override
    public List<StgkVoltageCabinetReport> selectStgkVoltageCabinetReportList(StgkVoltageCabinetReport stgkVoltageCabinetReport)
    {
        LambdaQueryWrapper<StgkVoltageCabinetReport> q = new LambdaQueryWrapper<>();
        List<StgkVoltageCabinetReport> stgkVoltageCabinetReports = stgkVoltageCabinetReportMapper.selectList(q);
        for (StgkVoltageCabinetReport voltageCabinetReport : stgkVoltageCabinetReports) {
            StgkVoltageCabinet byId = stgkVoltageCabinetService.getById(voltageCabinetReport.getCabinetId());
            if(byId!=null) {
                voltageCabinetReport.setCabinetName(byId.getCabinetName());
            }
        }
        return stgkVoltageCabinetReports;
    }

    /**
     * 新增高压柜报警记录表
     * 
     * @param stgkVoltageCabinetReport 高压柜报警记录表
     * @return 结果
     */
    @Override
    public int insertStgkVoltageCabinetReport(StgkVoltageCabinetReport stgkVoltageCabinetReport)
    {
        stgkVoltageCabinetReport.setCreateTime(LocalDateTime.now().withSecond(0).withNano(0));
        return stgkVoltageCabinetReportMapper.insert(stgkVoltageCabinetReport);
    }

    /**
     * 修改高压柜报警记录表
     * 
     * @param stgkVoltageCabinetReport 高压柜报警记录表
     * @return 结果
     */
    @Override
    public int updateStgkVoltageCabinetReport(StgkVoltageCabinetReport stgkVoltageCabinetReport)
    {
        stgkVoltageCabinetReport.setUpdateTime(LocalDateTime.now().withSecond(0).withNano(0));
        return stgkVoltageCabinetReportMapper.updateById(stgkVoltageCabinetReport);
    }

    /**
     * 批量删除高压柜报警记录表
     * 
     * @param ids 需要删除的高压柜报警记录表主键
     * @return 结果
     */
    @Override
    public int deleteStgkVoltageCabinetReportByIds(Long[] ids)
    {
        return stgkVoltageCabinetReportMapper.deleteBatchIds(new ArrayList(Arrays.asList(ids)));
    }

    /**
     * 删除高压柜报警记录表信息
     * 
     * @param id 高压柜报警记录表主键
     * @return 结果
     */
    @Override
    public int deleteStgkVoltageCabinetReportById(Long id)
    {
        return stgkVoltageCabinetReportMapper.deleteById(id);
    }
}
