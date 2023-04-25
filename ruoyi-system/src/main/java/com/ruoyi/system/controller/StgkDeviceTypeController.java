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
import com.ruoyi.system.domain.StgkDeviceType;
import com.ruoyi.system.service.IStgkDeviceTypeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 设备类型表Controller
 * 
 * @author ruoyi
 * @date 2023-04-25
 */
@RestController
@RequestMapping("/system/deiveType")
public class StgkDeviceTypeController extends BaseController
{
    @Autowired
    private IStgkDeviceTypeService stgkDeviceTypeService;

    /**
     * 查询设备类型表列表
     */
    @PreAuthorize("@ss.hasPermi('system:deiveType:list')")
    @GetMapping("/list")
    public TableDataInfo list(StgkDeviceType stgkDeviceType)
    {
        startPage();
        List<StgkDeviceType> list = stgkDeviceTypeService.selectStgkDeviceTypeList(stgkDeviceType);
        return getDataTable(list);
    }

    /**
     * 导出设备类型表列表
     */
    @PreAuthorize("@ss.hasPermi('system:deiveType:export')")
    @Log(title = "设备类型表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, StgkDeviceType stgkDeviceType)
    {
        List<StgkDeviceType> list = stgkDeviceTypeService.selectStgkDeviceTypeList(stgkDeviceType);
        ExcelUtil<StgkDeviceType> util = new ExcelUtil<StgkDeviceType>(StgkDeviceType.class);
        util.exportExcel(response, list, "设备类型表数据");
    }

    /**
     * 获取设备类型表详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:deiveType:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(stgkDeviceTypeService.selectStgkDeviceTypeById(id));
    }

    /**
     * 新增设备类型表
     */
    @PreAuthorize("@ss.hasPermi('system:deiveType:add')")
    @Log(title = "设备类型表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody StgkDeviceType stgkDeviceType)
    {
        return toAjax(stgkDeviceTypeService.insertStgkDeviceType(stgkDeviceType));
    }

    /**
     * 修改设备类型表
     */
    @PreAuthorize("@ss.hasPermi('system:deiveType:edit')")
    @Log(title = "设备类型表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody StgkDeviceType stgkDeviceType)
    {
        return toAjax(stgkDeviceTypeService.updateStgkDeviceType(stgkDeviceType));
    }

    /**
     * 删除设备类型表
     */
    @PreAuthorize("@ss.hasPermi('system:deiveType:remove')")
    @Log(title = "设备类型表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(stgkDeviceTypeService.deleteStgkDeviceTypeByIds(ids));
    }
}
