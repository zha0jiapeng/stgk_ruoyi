package com.ruoyi.system.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.system.domain.StgkVoltageCabinetReport;

/**
 * 高压柜报警记录表Service接口
 * 
 * @author ruoyi
 * @date 2023-04-28
 */
public interface IStgkVoltageCabinetReportService extends IService<StgkVoltageCabinetReport>
{
    /**
     * 查询高压柜报警记录表
     * 
     * @param id 高压柜报警记录表主键
     * @return 高压柜报警记录表
     */
    public StgkVoltageCabinetReport selectStgkVoltageCabinetReportById(Long id);

    /**
     * 查询高压柜报警记录表列表
     * 
     * @param stgkVoltageCabinetReport 高压柜报警记录表
     * @return 高压柜报警记录表集合
     */
    public List<StgkVoltageCabinetReport> selectStgkVoltageCabinetReportList(StgkVoltageCabinetReport stgkVoltageCabinetReport);

    /**
     * 新增高压柜报警记录表
     * 
     * @param stgkVoltageCabinetReport 高压柜报警记录表
     * @return 结果
     */
    public int insertStgkVoltageCabinetReport(StgkVoltageCabinetReport stgkVoltageCabinetReport);

    /**
     * 修改高压柜报警记录表
     * 
     * @param stgkVoltageCabinetReport 高压柜报警记录表
     * @return 结果
     */
    public int updateStgkVoltageCabinetReport(StgkVoltageCabinetReport stgkVoltageCabinetReport);

    /**
     * 批量删除高压柜报警记录表
     * 
     * @param ids 需要删除的高压柜报警记录表主键集合
     * @return 结果
     */
    public int deleteStgkVoltageCabinetReportByIds(Long[] ids);

    /**
     * 删除高压柜报警记录表信息
     * 
     * @param id 高压柜报警记录表主键
     * @return 结果
     */
    public int deleteStgkVoltageCabinetReportById(Long id);
}
