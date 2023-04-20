package com.ruoyi.system.mapper;

import java.util.List;
import java.util.Map;

import com.ruoyi.system.domain.StgkTransformer;
import org.apache.ibatis.annotations.Param;

/**
 * 变压器Mapper接口
 * 
 * @author mashiro
 * @date 2023-03-29
 */
public interface StgkTransformerMapper 
{
    /**
     * 查询变压器
     * 
     * @param id 变压器主键
     * @return 变压器
     */
    public StgkTransformer selectStgkTransformerById(Long id);

    /**
     * 查询变压器列表
     * 
     * @param stgkTransformer 变压器
     * @return 变压器集合
     */
    public List<StgkTransformer> selectStgkTransformerList(StgkTransformer stgkTransformer);

    /**
     * 新增变压器
     * 
     * @param stgkTransformer 变压器
     * @return 结果
     */
    public int insertStgkTransformer(StgkTransformer stgkTransformer);

    /**
     * 修改变压器
     * 
     * @param stgkTransformer 变压器
     * @return 结果
     */
    public int updateStgkTransformer(StgkTransformer stgkTransformer);

    /**
     * 删除变压器
     * 
     * @param id 变压器主键
     * @return 结果
     */
    public int deleteStgkTransformerById(Long id);

    /**
     * 批量删除变压器
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStgkTransformerByIds(Long[] ids);

    List<Map<String, Integer>> getRuntimingRate(Long id);

    List<Map<String, Integer>> getTemperatureRate(@Param("id") Long id, @Param("type")String type);

    List<Map<String, Integer>> getRedTemperatureRate(Long id);
}
