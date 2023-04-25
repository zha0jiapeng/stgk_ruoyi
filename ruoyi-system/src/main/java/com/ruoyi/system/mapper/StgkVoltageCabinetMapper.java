package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.StgkVoltageCabinet;

/**
 * 高压柜Mapper接口
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
public interface StgkVoltageCabinetMapper 
{
    /**
     * 查询高压柜
     * 
     * @param id 高压柜主键
     * @return 高压柜
     */
    public StgkVoltageCabinet selectStgkVoltageCabinetById(Long id);

    /**
     * 查询高压柜列表
     * 
     * @param stgkVoltageCabinet 高压柜
     * @return 高压柜集合
     */
    public List<StgkVoltageCabinet> selectStgkVoltageCabinetList(StgkVoltageCabinet stgkVoltageCabinet);

    /**
     * 新增高压柜
     * 
     * @param stgkVoltageCabinet 高压柜
     * @return 结果
     */
    public int insertStgkVoltageCabinet(StgkVoltageCabinet stgkVoltageCabinet);

    /**
     * 修改高压柜
     * 
     * @param stgkVoltageCabinet 高压柜
     * @return 结果
     */
    public int updateStgkVoltageCabinet(StgkVoltageCabinet stgkVoltageCabinet);

    /**
     * 删除高压柜
     * 
     * @param id 高压柜主键
     * @return 结果
     */
    public int deleteStgkVoltageCabinetById(Long id);

    /**
     * 批量删除高压柜
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStgkVoltageCabinetByIds(Long[] ids);
}
