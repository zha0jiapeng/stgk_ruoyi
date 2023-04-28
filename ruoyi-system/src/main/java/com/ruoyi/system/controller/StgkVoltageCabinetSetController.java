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
import com.ruoyi.system.domain.StgkVoltageCabinetSet;
import com.ruoyi.system.service.IStgkVoltageCabinetSetService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 高压柜报警设置表Controller
 * 
 * @author ruoyi
 * @date 2023-04-28
 */
@RestController
@RequestMapping("/system/voltageCabinetSet")
public class StgkVoltageCabinetSetController extends BaseController
{
    @Autowired
    private IStgkVoltageCabinetSetService stgkVoltageCabinetSetService;

    /**
     * 查询高压柜报警设置表列表
     */
    @PreAuthorize("@ss.hasPermi('system:voltageCabinetSet:list')")
    @GetMapping("/list")
    public TableDataInfo list(StgkVoltageCabinetSet stgkVoltageCabinetSet)
    {
        startPage();
        List<StgkVoltageCabinetSet> list = stgkVoltageCabinetSetService.selectStgkVoltageCabinetSetList(stgkVoltageCabinetSet);
        return getDataTable(list);
    }

    /**
     * 导出高压柜报警设置表列表
     */
    @PreAuthorize("@ss.hasPermi('system:voltageCabinetSet:export')")
    @Log(title = "高压柜报警设置表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, StgkVoltageCabinetSet stgkVoltageCabinetSet)
    {
        List<StgkVoltageCabinetSet> list = stgkVoltageCabinetSetService.selectStgkVoltageCabinetSetList(stgkVoltageCabinetSet);
        ExcelUtil<StgkVoltageCabinetSet> util = new ExcelUtil<StgkVoltageCabinetSet>(StgkVoltageCabinetSet.class);
        util.exportExcel(response, list, "高压柜报警设置表数据");
    }

    /**
     * 获取高压柜报警设置表详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:voltageCabinetSet:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(stgkVoltageCabinetSetService.selectStgkVoltageCabinetSetById(id));
    }

    /**
     * 新增高压柜报警设置表
     */
    @PreAuthorize("@ss.hasPermi('system:voltageCabinetSet:add')")
    @Log(title = "高压柜报警设置表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody StgkVoltageCabinetSet stgkVoltageCabinetSet)
    {
        return toAjax(stgkVoltageCabinetSetService.insertStgkVoltageCabinetSet(stgkVoltageCabinetSet));
    }

    /**
     * 修改高压柜报警设置表
     */
    @PreAuthorize("@ss.hasPermi('system:voltageCabinetSet:edit')")
    @Log(title = "高压柜报警设置表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody StgkVoltageCabinetSet stgkVoltageCabinetSet)
    {
        return toAjax(stgkVoltageCabinetSetService.updateStgkVoltageCabinetSet(stgkVoltageCabinetSet));
    }

    /**
     * 删除高压柜报警设置表
     */
    @PreAuthorize("@ss.hasPermi('system:voltageCabinetSet:remove')")
    @Log(title = "高压柜报警设置表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(stgkVoltageCabinetSetService.deleteStgkVoltageCabinetSetByIds(ids));
    }
}
