package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
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
import com.ruoyi.system.domain.StgkVoltageCabinetMonitor;
import com.ruoyi.system.service.IStgkVoltageCabinetMonitorService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 高压柜监控Controller
 * 
 * @author ruoyi
 * @date 2023-04-20
 */
@RestController
@RequestMapping("/system/monitor")
public class StgkVoltageCabinetMonitorController extends BaseController
{
    @Autowired
    private IStgkVoltageCabinetMonitorService stgkVoltageCabinetMonitorService;

    /**
     * 查询高压柜监控列表
     */
    @PreAuthorize("@ss.hasPermi('system:monitor:list')")
    @GetMapping("/list")
    public TableDataInfo list(StgkVoltageCabinetMonitor stgkVoltageCabinetMonitor)
    {
        startPage();
        List<StgkVoltageCabinetMonitor> list = stgkVoltageCabinetMonitorService.selectStgkVoltageCabinetMonitorList(stgkVoltageCabinetMonitor);
        return getDataTable(list);
    }

    /**
     * 导出高压柜监控列表
     */
    @PreAuthorize("@ss.hasPermi('system:monitor:export')")
    @Log(title = "高压柜监控", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, StgkVoltageCabinetMonitor stgkVoltageCabinetMonitor)
    {
        List<StgkVoltageCabinetMonitor> list = stgkVoltageCabinetMonitorService.selectStgkVoltageCabinetMonitorList(stgkVoltageCabinetMonitor);
        ExcelUtil<StgkVoltageCabinetMonitor> util = new ExcelUtil<StgkVoltageCabinetMonitor>(StgkVoltageCabinetMonitor.class);
        util.exportExcel(response, list, "高压柜监控数据");
    }

    /**
     * 获取高压柜监控详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:monitor:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(stgkVoltageCabinetMonitorService.selectStgkVoltageCabinetMonitorById(id));
    }

    /**
     * 新增高压柜监控
     */
    @PreAuthorize("@ss.hasPermi('system:monitor:add')")
    @Log(title = "高压柜监控", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody StgkVoltageCabinetMonitor stgkVoltageCabinetMonitor)
    {
        return toAjax(stgkVoltageCabinetMonitorService.insertStgkVoltageCabinetMonitor(stgkVoltageCabinetMonitor));
    }

    /**
     * 修改高压柜监控
     */
    @PreAuthorize("@ss.hasPermi('system:monitor:edit')")
    @Log(title = "高压柜监控", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody StgkVoltageCabinetMonitor stgkVoltageCabinetMonitor)
    {
        return toAjax(stgkVoltageCabinetMonitorService.updateStgkVoltageCabinetMonitor(stgkVoltageCabinetMonitor));
    }

    /**
     * 删除高压柜监控
     */
    @PreAuthorize("@ss.hasPermi('system:monitor:remove')")
    @Log(title = "高压柜监控", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(stgkVoltageCabinetMonitorService.deleteStgkVoltageCabinetMonitorByIds(ids));
    }
}
