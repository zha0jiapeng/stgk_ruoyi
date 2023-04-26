package com.ruoyi.system.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.system.domain.StgkDeviceReport;

/**
 * 设备预警表Service接口
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
public interface IStgkDeviceReportService extends IService<StgkDeviceReport>
{
    /**
     * 查询设备预警表
     * 
     * @param id 设备预警表主键
     * @return 设备预警表
     */
    public StgkDeviceReport selectStgkDeviceReportById(Long id);

    /**
     * 查询设备预警表列表
     * 
     * @param stgkDeviceReport 设备预警表
     * @return 设备预警表集合
     */
    public List<StgkDeviceReport> selectStgkDeviceReportList(Integer roomId,StgkDeviceReport stgkDeviceReport);

    /**
     * 新增设备预警表
     * 
     * @param stgkDeviceReport 设备预警表
     * @return 结果
     */
    public int insertStgkDeviceReport(StgkDeviceReport stgkDeviceReport);

    /**
     * 修改设备预警表
     * 
     * @param stgkDeviceReport 设备预警表
     * @return 结果
     */
    public int updateStgkDeviceReport(StgkDeviceReport stgkDeviceReport);

    /**
     * 批量删除设备预警表
     * 
     * @param ids 需要删除的设备预警表主键集合
     * @return 结果
     */
    public int deleteStgkDeviceReportByIds(Long[] ids);

    /**
     * 删除设备预警表信息
     * 
     * @param id 设备预警表主键
     * @return 结果
     */
    public int deleteStgkDeviceReportById(Long id);
}
