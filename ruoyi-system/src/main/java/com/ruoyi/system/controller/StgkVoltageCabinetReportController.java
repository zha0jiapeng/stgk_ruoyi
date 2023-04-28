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
import com.ruoyi.system.domain.StgkVoltageCabinetReport;
import com.ruoyi.system.service.IStgkVoltageCabinetReportService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 高压柜报警记录表Controller
 * 
 * @author ruoyi
 * @date 2023-04-28
 */
@RestController
@RequestMapping("/system/cabinetReport")
public class StgkVoltageCabinetReportController extends BaseController
{
    @Autowired
    private IStgkVoltageCabinetReportService stgkVoltageCabinetReportService;

    /**
     * 查询高压柜报警记录表列表
     */
    @PreAuthorize("@ss.hasPermi('system:cabinetReport:list')")
    @GetMapping("/list")
    public TableDataInfo list(StgkVoltageCabinetReport stgkVoltageCabinetReport)
    {
        startPage();
        List<StgkVoltageCabinetReport> list = stgkVoltageCabinetReportService.selectStgkVoltageCabinetReportList(stgkVoltageCabinetReport);
        return getDataTable(list);
    }

    /**
     * 导出高压柜报警记录表列表
     */
    @PreAuthorize("@ss.hasPermi('system:cabinetReport:export')")
    @Log(title = "高压柜报警记录表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, StgkVoltageCabinetReport stgkVoltageCabinetReport)
    {
        List<StgkVoltageCabinetReport> list = stgkVoltageCabinetReportService.selectStgkVoltageCabinetReportList(stgkVoltageCabinetReport);
        ExcelUtil<StgkVoltageCabinetReport> util = new ExcelUtil<StgkVoltageCabinetReport>(StgkVoltageCabinetReport.class);
        util.exportExcel(response, list, "高压柜报警记录表数据");
    }

    /**
     * 获取高压柜报警记录表详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:cabinetReport:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(stgkVoltageCabinetReportService.selectStgkVoltageCabinetReportById(id));
    }

    /**
     * 新增高压柜报警记录表
     */
    @PreAuthorize("@ss.hasPermi('system:cabinetReport:add')")
    @Log(title = "高压柜报警记录表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody StgkVoltageCabinetReport stgkVoltageCabinetReport)
    {
        return toAjax(stgkVoltageCabinetReportService.insertStgkVoltageCabinetReport(stgkVoltageCabinetReport));
    }

    /**
     * 修改高压柜报警记录表
     */
    @PreAuthorize("@ss.hasPermi('system:cabinetReport:edit')")
    @Log(title = "高压柜报警记录表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody StgkVoltageCabinetReport stgkVoltageCabinetReport)
    {
        return toAjax(stgkVoltageCabinetReportService.updateStgkVoltageCabinetReport(stgkVoltageCabinetReport));
    }

    /**
     * 删除高压柜报警记录表
     */
    @PreAuthorize("@ss.hasPermi('system:cabinetReport:remove')")
    @Log(title = "高压柜报警记录表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(stgkVoltageCabinetReportService.deleteStgkVoltageCabinetReportByIds(ids));
    }
}
