package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.StgkRoom;
import com.ruoyi.system.service.IStgkRoomService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 配电室Controller
 * 
 * @author ruoyi
 * @date 2023-04-23
 */
@RestController
@RequestMapping("/system/room")
public class StgkRoomController extends BaseController
{
    @Autowired
    private IStgkRoomService stgkRoomService;

    /**
     * 查询配电室列表
     */
    @PreAuthorize("@ss.hasPermi('system:room:list')")
    @GetMapping("/list")
    public TableDataInfo list(StgkRoom stgkRoom)
    {
        startPage();
        List<StgkRoom> list = stgkRoomService.selectStgkRoomList(stgkRoom);
        return getDataTable(list);
    }

    /**
     * 导出配电室列表
     */
    @PreAuthorize("@ss.hasPermi('system:room:export')")
    @Log(title = "配电室", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, StgkRoom stgkRoom)
    {
        List<StgkRoom> list = stgkRoomService.selectStgkRoomList(stgkRoom);
        ExcelUtil<StgkRoom> util = new ExcelUtil<StgkRoom>(StgkRoom.class);
        util.exportExcel(response, list, "配电室数据");
    }

    /**
     * 获取配电室详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:room:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(stgkRoomService.selectStgkRoomById(id));
    }

    /**
     * 新增配电室
     */
    @PreAuthorize("@ss.hasPermi('system:room:add')")
    @Log(title = "配电室", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody StgkRoom stgkRoom)
    {
        StgkRoom room = stgkRoomService.selectStgkRoomByName(stgkRoom.getRoomName());
        if(room!=null){
            return AjaxResult.error("配电室名称已存在！");
        }
        return toAjax(stgkRoomService.insertStgkRoom(stgkRoom));
    }

    /**
     * 修改配电室
     */
    @PreAuthorize("@ss.hasPermi('system:room:edit')")
    @Log(title = "配电室", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody StgkRoom stgkRoom)
    {
        StgkRoom room = stgkRoomService.selectStgkRoomByName(stgkRoom.getRoomName());
        if(room!=null&& !stgkRoom.getId().equals(room.getId())){
            return AjaxResult.error("配电室名称已存在！");
        }
        return toAjax(stgkRoomService.updateStgkRoom(stgkRoom));
    }

    /**
     * 删除配电室
     */
    @PreAuthorize("@ss.hasPermi('system:room:remove')")
    @Log(title = "配电室", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(stgkRoomService.deleteStgkRoomByIds(ids));
    }




    @PreAuthorize("@ss.hasPermi('system:room:query')")
    @GetMapping(value = "/getTimeTemperatureAndHumidity/{id}")
    @ApiOperation("获取每小时与温度湿度曲线")
    public AjaxResult getTimeTemperatureAndHumidity(@PathVariable("id") Long id)
    {
        return success(stgkRoomService.getTimeTemperatureAndHumidity(id));
    }

}
