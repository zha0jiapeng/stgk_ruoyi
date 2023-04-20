package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StgkRoomMapper;
import com.ruoyi.system.domain.StgkRoom;
import com.ruoyi.system.service.IStgkRoomService;

/**
 * 配电室Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-19
 */
@Service
public class StgkRoomServiceImpl implements IStgkRoomService 
{
    @Autowired
    private StgkRoomMapper stgkRoomMapper;

    /**
     * 查询配电室
     * 
     * @param id 配电室主键
     * @return 配电室
     */
    @Override
    public StgkRoom selectStgkRoomById(Long id)
    {
        return stgkRoomMapper.selectStgkRoomById(id);
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
        stgkRoom.setCreateTime(DateUtils.getNowDate());
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
        stgkRoom.setUpdateTime(DateUtils.getNowDate());
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
}
