package com.ruoyi.system.service.impl;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.system.domain.StgkVoltageCabinetMonitor;
import com.ruoyi.system.service.IStgkVoltageCabinetMonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StgkVoltageCabinetMapper;
import com.ruoyi.system.domain.StgkVoltageCabinet;
import com.ruoyi.system.service.IStgkVoltageCabinetService;

/**
 * 高压柜Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
@Service
public class StgkVoltageCabinetServiceImpl extends ServiceImpl<StgkVoltageCabinetMapper,StgkVoltageCabinet> implements IStgkVoltageCabinetService
{
    @Autowired
    private StgkVoltageCabinetMapper stgkVoltageCabinetMapper;

    @Autowired
    private IStgkVoltageCabinetMonitorService StgkVoltageCabinetMonitorService;

    /**
     * 查询高压柜
     * 
     * @param id 高压柜主键
     * @return 高压柜
     */
    @Override
    public Map<String,Object> selectStgkVoltageCabinetById(Long id)
    {
        StgkVoltageCabinet stgkVoltageCabinet = stgkVoltageCabinetMapper.selectById(id);
        if(stgkVoltageCabinet!=null) {
            StgkVoltageCabinetMonitor stgkVoltageCabinetMonitor = StgkVoltageCabinetMonitorService.selectStgkVoltageCabinetMonitorByCabinetId(id.intValue());
            Map<String, Object> map = JSONObject.parseObject(JSONObject.toJSONString(stgkVoltageCabinet), Map.class);
            Map<String, Object> map2 = JSONObject.parseObject(JSONObject.toJSONString(stgkVoltageCabinetMonitor), Map.class);
            map2.forEach((k, v) -> {
                if (!k.equals("id"))
                    map.merge(k, v, (v1, v2) -> v2);
            });
            return map;
        }
        return null;
    }

    /**
     * 查询高压柜列表
     * 
     * @param stgkVoltageCabinet 高压柜
     * @return 高压柜
     */
    @Override
    public List<StgkVoltageCabinet> selectStgkVoltageCabinetList(StgkVoltageCabinet stgkVoltageCabinet)
    {
        LambdaQueryWrapper<StgkVoltageCabinet> q = new LambdaQueryWrapper<>();
        q.like(StringUtils.isNotEmpty(stgkVoltageCabinet.getCabinetName()),StgkVoltageCabinet::getCabinetName,stgkVoltageCabinet.getCabinetName());
        return stgkVoltageCabinetMapper.selectList(q);
    }

    /**
     * 新增高压柜
     * 
     * @param stgkVoltageCabinet 高压柜
     * @return 结果
     */
    @Override
    public int insertStgkVoltageCabinet(StgkVoltageCabinet stgkVoltageCabinet)
    {
        stgkVoltageCabinet.setCreateTime(LocalDateTime.now().withSecond(0).withNano(0));
        return stgkVoltageCabinetMapper.insert(stgkVoltageCabinet);
    }

    /**
     * 修改高压柜
     * 
     * @param stgkVoltageCabinet 高压柜
     * @return 结果
     */
    @Override
    public int updateStgkVoltageCabinet(StgkVoltageCabinet stgkVoltageCabinet)
    {
        stgkVoltageCabinet.setUpdateTime(LocalDateTime.now().withSecond(0).withNano(0));
        LambdaUpdateWrapper<StgkVoltageCabinet> q = new LambdaUpdateWrapper<StgkVoltageCabinet>().eq(StgkVoltageCabinet::getId, stgkVoltageCabinet.getId());
        return stgkVoltageCabinetMapper.update(stgkVoltageCabinet,q);
    }

    /**
     * 批量删除高压柜
     * 
     * @param ids 需要删除的高压柜主键
     * @return 结果
     */
    @Override
    public int deleteStgkVoltageCabinetByIds(Long[] ids)
    {
        return stgkVoltageCabinetMapper.deleteBatchIds(new ArrayList(Arrays.asList(ids)));
    }

    /**
     * 删除高压柜信息
     * 
     * @param id 高压柜主键
     * @return 结果
     */
    @Override
    public int deleteStgkVoltageCabinetById(Long id)
    {
        return stgkVoltageCabinetMapper.deleteById(id);
    }

    @Override
    public StgkVoltageCabinet selectStgkVoltageCabinetByName(String cabinetName) {

        return stgkVoltageCabinetMapper.selectOne(new LambdaQueryWrapper<StgkVoltageCabinet>().eq(StgkVoltageCabinet::getCabinetName,cabinetName));
    }

    @Override
    public List<Map<String, BigDecimal>> getCurve(Long id,String column) {
        return StgkVoltageCabinetMonitorService.getCurve(id,column);
    }
}
