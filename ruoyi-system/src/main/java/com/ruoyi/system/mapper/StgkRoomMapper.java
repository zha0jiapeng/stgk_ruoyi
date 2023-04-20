package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.StgkRoom;

/**
 * 配电室Mapper接口
 * 
 * @author ruoyi
 * @date 2023-04-19
 */
public interface StgkRoomMapper 
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
     * 删除配电室
     * 
     * @param id 配电室主键
     * @return 结果
     */
    public int deleteStgkRoomById(Long id);

    /**
     * 批量删除配电室
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStgkRoomByIds(Long[] ids);
}
