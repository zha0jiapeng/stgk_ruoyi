package com.ruoyi.system.service.impl;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.StgkTransformerMonitor;
import com.ruoyi.system.service.IStgkTransformerMonitorService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StgkTransformerMapper;
import com.ruoyi.system.domain.StgkTransformer;
import com.ruoyi.system.service.IStgkTransformerService;

/**
 * 变压器Service业务层处理
 * 
 * @author mashiro
 * @date 2023-03-29
 */
@Service
public class StgkTransformerServiceImpl implements IStgkTransformerService 
{
    @Autowired
    private StgkTransformerMapper stgkTransformerMapper;

    @Autowired
    private IStgkTransformerMonitorService stgkTransformerMonitorService;
    /**
     * 查询变压器
     * 
     * @param id 变压器主键
     * @return 变压器
     */
    @Override
    public StgkTransformer selectStgkTransformerById(Long id)
    {
        StgkTransformerMonitor transformerMonitor = stgkTransformerMonitorService.selectTransformerMonitorByIdLimit1(id);
        StgkTransformer stgkTransformer = stgkTransformerMapper.selectStgkTransformerById(id);
        stgkTransformer.setTransformerRepairRemaintime(stgkTransformer.getTransformerRepairtime());
        //负荷率 电流*电压*功率 / 容量
        if(transformerMonitor!=null){
            BigDecimal current= (transformerMonitor.getTransformerACurrent()
                    .add(transformerMonitor.getTransformerBCurrent())
                    .add(transformerMonitor.getTransformerCCurrent())).divide(new BigDecimal(3),2,BigDecimal.ROUND_HALF_UP);
            BigDecimal divide = current.multiply(transformerMonitor.getTransformerVoltage()).multiply(transformerMonitor.getTransformerPower())
                    .divide(new BigDecimal(stgkTransformer.getTransformerVolume()), 2, BigDecimal.ROUND_HALF_UP);
            stgkTransformer.setTransformerLoadrate(divide);
            BeanUtils.copyProperties(transformerMonitor,stgkTransformer);
        }
        return stgkTransformer;
    }

    /**
     * 查询变压器列表
     * 
     * @param stgkTransformer 变压器
     * @return 变压器
     */
    @Override
    public List<StgkTransformer> selectStgkTransformerList(StgkTransformer stgkTransformer)
    {
        return stgkTransformerMapper.selectStgkTransformerList(stgkTransformer);
    }

    /**
     * 新增变压器
     * 
     * @param stgkTransformer 变压器
     * @return 结果
     */
    @Override
    public int insertStgkTransformer(StgkTransformer stgkTransformer)
    {
        stgkTransformer.setCreateTime(LocalDateTime.now().withSecond(0).withNano(0));
        return stgkTransformerMapper.insertStgkTransformer(stgkTransformer);
    }

    /**
     * 修改变压器
     * 
     * @param stgkTransformer 变压器
     * @return 结果
     */
    @Override
    public int updateStgkTransformer(StgkTransformer stgkTransformer)
    {
        stgkTransformer.setUpdateTime(LocalDateTime.now().withSecond(0).withNano(0));
        return stgkTransformerMapper.updateStgkTransformer(stgkTransformer);
    }

    /**
     * 批量删除变压器
     * 
     * @param ids 需要删除的变压器主键
     * @return 结果
     */
    @Override
    public int deleteStgkTransformerByIds(Long[] ids)
    {
        return stgkTransformerMapper.deleteStgkTransformerByIds(ids);
    }

    /**
     * 删除变压器信息
     * 
     * @param id 变压器主键
     * @return 结果
     */
    @Override
    public int deleteStgkTransformerById(Long id)
    {
        return stgkTransformerMapper.deleteStgkTransformerById(id);
    }

    @Override
    public List<Map<String, Integer>> getRuntimingRate(Long id) {
        return stgkTransformerMapper.getRuntimingRate(id);
    }

    @Override
    public List<Map<String, Integer>> getTemperatureRate(Long id,String type) {
        return stgkTransformerMapper.getTemperatureRate(id, type);
    }

    @Override
    public List<Map<String, Integer>> getRedTemperatureRate(Long id) {
        return stgkTransformerMapper.getRedTemperatureRate(id);
    }
}
