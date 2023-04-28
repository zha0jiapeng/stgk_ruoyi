package com.ruoyi.system.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.system.domain.StgkVoltageCabinetSet;

/**
 * 高压柜报警设置表Service接口
 * 
 * @author ruoyi
 * @date 2023-04-28
 */
public interface IStgkVoltageCabinetSetService extends IService<StgkVoltageCabinetSet>
{
    /**
     * 查询高压柜报警设置表
     * 
     * @param id 高压柜报警设置表主键
     * @return 高压柜报警设置表
     */
    public StgkVoltageCabinetSet selectStgkVoltageCabinetSetById(Long id);

    /**
     * 查询高压柜报警设置表列表
     * 
     * @param stgkVoltageCabinetSet 高压柜报警设置表
     * @return 高压柜报警设置表集合
     */
    public List<StgkVoltageCabinetSet> selectStgkVoltageCabinetSetList(StgkVoltageCabinetSet stgkVoltageCabinetSet);

    /**
     * 新增高压柜报警设置表
     * 
     * @param stgkVoltageCabinetSet 高压柜报警设置表
     * @return 结果
     */
    public int insertStgkVoltageCabinetSet(StgkVoltageCabinetSet stgkVoltageCabinetSet);

    /**
     * 修改高压柜报警设置表
     * 
     * @param stgkVoltageCabinetSet 高压柜报警设置表
     * @return 结果
     */
    public int updateStgkVoltageCabinetSet(StgkVoltageCabinetSet stgkVoltageCabinetSet);

    /**
     * 批量删除高压柜报警设置表
     * 
     * @param ids 需要删除的高压柜报警设置表主键集合
     * @return 结果
     */
    public int deleteStgkVoltageCabinetSetByIds(Long[] ids);

    /**
     * 删除高压柜报警设置表信息
     * 
     * @param id 高压柜报警设置表主键
     * @return 结果
     */
    public int deleteStgkVoltageCabinetSetById(Long id);
}
