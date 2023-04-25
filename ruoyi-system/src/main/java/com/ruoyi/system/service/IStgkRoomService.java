package com.ruoyi.system.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.ruoyi.system.domain.StgkRoom;

/**
 * 配电室Service接口
 * 
 * @author ruoyi
 * @date 2023-04-23
 */
public interface IStgkRoomService 
{
    /**
     * 查询配电室
     * 
     * @param id 配电室主键
     * @return 配电室
     */
    public StgkRoom selectStgkRoomById(Long id);

    /**
     * 查询配电室列表
     * 
     * @param stgkRoom 配电室
     * @return 配电室集合
     */
    public List<StgkRoom> selectStgkRoomList(StgkRoom stgkRoom);

    /**
     * 新增配电室
     * 
     * @param stgkRoom 配电室
     * @return 结果
     */
    public int insertStgkRoom(StgkRoom stgkRoom);

    /**
     * 修改配电室
     * 
     * @param stgkRoom 配电室
     * @return 结果
     */
    public int updateStgkRoom(StgkRoom stgkRoom);

    /**
     * 批量删除配电室
     * 
     * @param ids 需要删除的配电室主键集合
     * @return 结果
     */
    public int deleteStgkRoomByIds(Long[] ids);

    /**
     * 删除配电室信息
     * 
     * @param id 配电室主键
     * @return 结果
     */
    public int deleteStgkRoomById(Long id);

    List<Map<String, BigDecimal>> getTimeTemperatureAndHumidity(Long id);
}
