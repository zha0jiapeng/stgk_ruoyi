package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import io.swagger.annotations.Api;
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
import com.ruoyi.system.domain.StgkCable;
import com.ruoyi.system.service.IStgkCableService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 电缆Controller
 * 
 * @author ruoyi
 * @date 2023-03-15
 */
@RestController
@Api("电缆相关")
@RequestMapping("/system/cable")
public class StgkCableController extends BaseController
{
    @Autowired
    private IStgkCableService stgkCableService;

    /**
     * 查询电缆列表
     */
    @PreAuthorize("@ss.hasPermi('system:cable:list')")
    @GetMapping("/list")
    public TableDataInfo list(StgkCable stgkCable)
    {
        startPage();
        List<StgkCable> list = stgkCableService.selectStgkCableList(stgkCable);
        return getDataTable(list);
    }

    /**
     * 导出电缆列表
     */
    @PreAuthorize("@ss.hasPermi('system:cable:export')")
    @Log(title = "电缆", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, StgkCable stgkCable)
    {
        List<StgkCable> list = stgkCableService.selectStgkCableList(stgkCable);
        ExcelUtil<StgkCable> util = new ExcelUtil<StgkCable>(StgkCable.class);
        util.exportExcel(response, list, "电缆数据");
    }

    /**
     * 获取电缆详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:cable:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(stgkCableService.selectStgkCableById(id));
    }

    /**
     * 新增电缆
     */
    @PreAuthorize("@ss.hasPermi('system:cable:add')")
    @Log(title = "电缆", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody StgkCable stgkCable)
    {
        return toAjax(stgkCableService.insertStgkCable(stgkCable));
    }

    /**
     * 修改电缆
     */
    @PreAuthorize("@ss.hasPermi('system:cable:edit')")
    @Log(title = "电缆", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody StgkCable stgkCable)
    {
        return toAjax(stgkCableService.updateStgkCable(stgkCable));
    }

    /**
     * 删除电缆
     */
    @PreAuthorize("@ss.hasPermi('system:cable:remove')")
    @Log(title = "电缆", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(stgkCableService.deleteStgkCableByIds(ids));
    }

    @PreAuthorize("@ss.hasPermi('system:cable:query')")
    @GetMapping(value = "/getIndexMaxTemperature/{id}")
    @ApiOperation("获取距离和最高温度曲线")
    public AjaxResult getIndexMaxTemperature(@PathVariable("id") Long id)
    {
        return success(stgkCableService.getIndexMaxTemperature(id));
    }

    @PreAuthorize("@ss.hasPermi('system:cable:query')")
    @GetMapping(value = "/getTimeTemperature/{id}")
    @ApiOperation("获取每小时与温度曲线")
    public AjaxResult getTimeTemperature(@PathVariable("id") Long id)
    {
        return success(stgkCableService.getTimeTemperature(id));
    }

    @PreAuthorize("@ss.hasPermi('system:cable:query')")
    @GetMapping(value = "/getTimeCurrent/{id}")
    @ApiOperation("获取每小时与温度曲线")
    public AjaxResult getTimeCurrent(@PathVariable("id") Long id)
    {
        return success(stgkCableService.getTimeCurrent(id));
    }
}
