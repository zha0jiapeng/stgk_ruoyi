package com.ruoyi.system.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.system.domain.StgkVoltageCabinet;

/**
 * 高压柜Service接口
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
public interface IStgkVoltageCabinetService extends IService<StgkVoltageCabinet>
{
    /**
     * 查询高压柜
     * 
     * @param id 高压柜主键
     * @return 高压柜
     */
    public  Map<String,Object> selectStgkVoltageCabinetById(Long id);

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
     * 批量删除高压柜
     * 
     * @param ids 需要删除的高压柜主键集合
     * @return 结果
     */
    public int deleteStgkVoltageCabinetByIds(Long[] ids);

    /**
     * 删除高压柜信息
     * 
     * @param id 高压柜主键
     * @return 结果
     */
    public int deleteStgkVoltageCabinetById(Long id);

    StgkVoltageCabinet selectStgkVoltageCabinetByName(String cabinetName);

    List<Map<String, BigDecimal>> getCurve(Long id,String column);
}
