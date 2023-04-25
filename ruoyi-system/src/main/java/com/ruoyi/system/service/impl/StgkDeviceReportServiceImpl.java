package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StgkDeviceReportMapper;
import com.ruoyi.system.domain.StgkDeviceReport;
import com.ruoyi.system.service.IStgkDeviceReportService;

/**
 * 设备预警表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
@Service
public class StgkDeviceReportServiceImpl implements IStgkDeviceReportService 
{
    @Autowired
    private StgkDeviceReportMapper stgkDeviceReportMapper;

    /**
     * 查询设备预警表
     * 
     * @param id 设备预警表主键
     * @return 设备预警表
     */
    @Override
    public StgkDeviceReport selectStgkDeviceReportById(Long id)
    {
        return stgkDeviceReportMapper.selectStgkDeviceReportById(id);
    }

    /**
     * 查询设备预警表列表
     * 
     * @param stgkDeviceReport 设备预警表
     * @return 设备预警表
     */
    @Override
    public List<StgkDeviceReport> selectStgkDeviceReportList(StgkDeviceReport stgkDeviceReport)
    {
        return stgkDeviceReportMapper.selectStgkDeviceReportList(stgkDeviceReport);
    }

    /**
     * 新增设备预警表
     * 
     * @param stgkDeviceReport 设备预警表
     * @return 结果
     */
    @Override
    public int insertStgkDeviceReport(StgkDeviceReport stgkDeviceReport)
    {
        stgkDeviceReport.setCreateTime(DateUtils.getNowDate());
        return stgkDeviceReportMapper.insertStgkDeviceReport(stgkDeviceReport);
    }

    /**
     * 修改设备预警表
     * 
     * @param stgkDeviceReport 设备预警表
     * @return 结果
     */
    @Override
    public int updateStgkDeviceReport(StgkDeviceReport stgkDeviceReport)
    {
        stgkDeviceReport.setUpdateTime(DateUtils.getNowDate());
        return stgkDeviceReportMapper.updateStgkDeviceReport(stgkDeviceReport);
    }

    /**
     * 批量删除设备预警表
     * 
     * @param ids 需要删除的设备预警表主键
     * @return 结果
     */
    @Override
    public int deleteStgkDeviceReportByIds(Long[] ids)
    {
        return stgkDeviceReportMapper.deleteStgkDeviceReportByIds(ids);
    }

    /**
     * 删除设备预警表信息
     * 
     * @param id 设备预警表主键
     * @return 结果
     */
    @Override
    public int deleteStgkDeviceReportById(Long id)
    {
        return stgkDeviceReportMapper.deleteStgkDeviceReportById(id);
    }
}
