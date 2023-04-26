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
import com.ruoyi.system.domain.StgkDeviceReport;
import com.ruoyi.system.service.IStgkDeviceReportService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 设备预警表Controller
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
@RestController
@RequestMapping("/system/deviceReport")
public class StgkDeviceReportController extends BaseController
{
    @Autowired
    private IStgkDeviceReportService stgkDeviceReportService;

    /**
     * 查询设备预警表列表
     */
    @PreAuthorize("@ss.hasPermi('system:deviceReport:list')")
    @GetMapping("/list/{roomId}")
    public TableDataInfo list(@PathVariable("roomId") Integer roomId,StgkDeviceReport stgkDeviceReport)
    {
        startPage();
        List<StgkDeviceReport> list = stgkDeviceReportService.selectStgkDeviceReportList(roomId,stgkDeviceReport);
        return getDataTable(list);
    }

//    /**
//     * 导出设备预警表列表
//     */
//    @PreAuthorize("@ss.hasPermi('system:deviceReport:export')")
//    @Log(title = "设备预警表", businessType = BusinessType.EXPORT)
//    @PostMapping("/export")
//    public void export(HttpServletResponse response, StgkDeviceReport stgkDeviceReport)
//    {
//        List<StgkDeviceReport> list = stgkDeviceReportService.selectStgkDeviceReportList(stgkDeviceReport);
//        ExcelUtil<StgkDeviceReport> util = new ExcelUtil<StgkDeviceReport>(StgkDeviceReport.class);
//        util.exportExcel(response, list, "设备预警表数据");
//    }

    /**
     * 获取设备预警表详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:deviceReport:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(stgkDeviceReportService.selectStgkDeviceReportById(id));
    }

    /**
     * 新增设备预警表
     */
    @PreAuthorize("@ss.hasPermi('system:deviceReport:add')")
    @Log(title = "设备预警表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody StgkDeviceReport stgkDeviceReport)
    {
        return toAjax(stgkDeviceReportService.insertStgkDeviceReport(stgkDeviceReport));
    }

    /**
     * 修改设备预警表
     */
    @PreAuthorize("@ss.hasPermi('system:deviceReport:edit')")
    @Log(title = "设备预警表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody StgkDeviceReport stgkDeviceReport)
    {
        return toAjax(stgkDeviceReportService.updateStgkDeviceReport(stgkDeviceReport));
    }

    /**
     * 删除设备预警表
     */
    @PreAuthorize("@ss.hasPermi('system:deviceReport:remove')")
    @Log(title = "设备预警表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(stgkDeviceReportService.deleteStgkDeviceReportByIds(ids));
    }
}
