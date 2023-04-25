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
import com.ruoyi.system.domain.StgkDeviceSet;
import com.ruoyi.system.service.IStgkDeviceSetService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 设备通用设置表Controller
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
@RestController
@RequestMapping("/system/deviceSet")
public class StgkDeviceSetController extends BaseController
{
    @Autowired
    private IStgkDeviceSetService stgkDeviceSetService;

    /**
     * 查询设备通用设置表列表
     */
    @PreAuthorize("@ss.hasPermi('system:deviceSet:list')")
    @GetMapping("/list")
    public TableDataInfo list(StgkDeviceSet stgkDeviceSet)
    {
        startPage();
        List<StgkDeviceSet> list = stgkDeviceSetService.selectStgkDeviceSetList(stgkDeviceSet);
        return getDataTable(list);
    }

    /**
     * 导出设备通用设置表列表
     */
    @PreAuthorize("@ss.hasPermi('system:deviceSet:export')")
    @Log(title = "设备通用设置表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, StgkDeviceSet stgkDeviceSet)
    {
        List<StgkDeviceSet> list = stgkDeviceSetService.selectStgkDeviceSetList(stgkDeviceSet);
        ExcelUtil<StgkDeviceSet> util = new ExcelUtil<StgkDeviceSet>(StgkDeviceSet.class);
        util.exportExcel(response, list, "设备通用设置表数据");
    }

    /**
     * 获取设备通用设置表详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:deviceSet:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(stgkDeviceSetService.selectStgkDeviceSetById(id));
    }

    /**
     * 新增设备通用设置表
     */
    @PreAuthorize("@ss.hasPermi('system:deviceSet:add')")
    @Log(title = "设备通用设置表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody StgkDeviceSet stgkDeviceSet)
    {
        return toAjax(stgkDeviceSetService.insertStgkDeviceSet(stgkDeviceSet));
    }

    /**
     * 修改设备通用设置表
     */
    @PreAuthorize("@ss.hasPermi('system:deviceSet:edit')")
    @Log(title = "设备通用设置表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody StgkDeviceSet stgkDeviceSet)
    {
        return toAjax(stgkDeviceSetService.updateStgkDeviceSet(stgkDeviceSet));
    }

    /**
     * 删除设备通用设置表
     */
    @PreAuthorize("@ss.hasPermi('system:deviceSet:remove')")
    @Log(title = "设备通用设置表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(stgkDeviceSetService.deleteStgkDeviceSetByIds(ids));
    }
}
