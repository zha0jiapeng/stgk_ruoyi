package com.ruoyi.system.service.impl;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.StgkRoomMonitor;
import com.ruoyi.system.service.IStgkRoomMonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StgkRoomMapper;
import com.ruoyi.system.domain.StgkRoom;
import com.ruoyi.system.service.IStgkRoomService;

/**
 * 配电室Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-23
 */
@Service
public class StgkRoomServiceImpl extends ServiceImpl<StgkRoomMapper, StgkRoom> implements IStgkRoomService
{
    @Autowired
    private StgkRoomMapper stgkRoomMapper;


    @Autowired
    private IStgkRoomMonitorService stgkRoomMonitorService;

    /**
     * 查询配电室
     * 
     * @param id 配电室主键
     * @return 配电室
     */
    @Override
    public StgkRoom selectStgkRoomById(Long id)
    {
        StgkRoom stgkRoom = stgkRoomMapper.selectStgkRoomById(id);
        if(stgkRoom!=null){
            StgkRoomMonitor one = stgkRoomMonitorService.getOne(new LambdaQueryWrapper<StgkRoomMonitor>().eq(StgkRoomMonitor::getRoomId, id)
                    .orderByDesc(StgkRoomMonitor::getMonitorTime).last("limit 1"));
            if(one!=null) {
                stgkRoom.setHumidity(one.getHumidity());
                stgkRoom.setTemperature(one.getTemperature());
            }
        }

        return stgkRoom;
    }

    /**
     * 查询配电室列表
     * 
     * @param stgkRoom 配电室
     * @return 配电室
     */
    @Override
    public List<StgkRoom> selectStgkRoomList(StgkRoom stgkRoom)
    {
        return stgkRoomMapper.selectStgkRoomList(stgkRoom);
    }

    /**
     * 新增配电室
     * 
     * @param stgkRoom 配电室
     * @return 结果
     */
    @Override
    public int insertStgkRoom(StgkRoom stgkRoom)
    {
        stgkRoom.setCreateTime(LocalDateTime.now().withSecond(0).withNano(0));
        return stgkRoomMapper.insertStgkRoom(stgkRoom);
    }

    /**
     * 修改配电室
     * 
     * @param stgkRoom 配电室
     * @return 结果
     */
    @Override
    public int updateStgkRoom(StgkRoom stgkRoom)
    {
        stgkRoom.setUpdateTime(LocalDateTime.now().withSecond(0).withNano(0));
        return stgkRoomMapper.updateStgkRoom(stgkRoom);
    }

    /**
     * 批量删除配电室
     * 
     * @param ids 需要删除的配电室主键
     * @return 结果
     */
    @Override
    public int deleteStgkRoomByIds(Long[] ids)
    {
        return stgkRoomMapper.deleteStgkRoomByIds(ids);
    }

    /**
     * 删除配电室信息
     * 
     * @param id 配电室主键
     * @return 结果
     */
    @Override
    public int deleteStgkRoomById(Long id)
    {
        return stgkRoomMapper.deleteStgkRoomById(id);
    }

    @Override
    public List<Map<String, BigDecimal>> getTimeTemperatureAndHumidity(Long id) {
        return stgkRoomMonitorService.getTimeTemperatureAndHumidity(id);
    }

    @Override
    public StgkRoom selectStgkRoomByName(String roomName) {
        return stgkRoomMapper.selectStgkRoomByName(roomName);
    }
}
