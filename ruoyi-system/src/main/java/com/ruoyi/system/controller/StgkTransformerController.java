package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

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
import com.ruoyi.system.domain.StgkTransformer;
import com.ruoyi.system.service.IStgkTransformerService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 变压器Controller
 * 
 * @author mashiro
 * @date 2023-03-29
 */
@RestController
@RequestMapping("/system/transformer")
public class StgkTransformerController extends BaseController
{

    @Autowired
    private IStgkTransformerService stgkTransformerService;

    /**
     * 查询变压器列表
     */
    @PreAuthorize("@ss.hasPermi('system:transformer:list')")
    @GetMapping("/list")
    public TableDataInfo list(StgkTransformer stgkTransformer)
    {
        startPage();
        List<StgkTransformer> list = stgkTransformerService.selectStgkTransformerList(stgkTransformer);
        return getDataTable(list);
    }

    /**
     * 导出变压器列表
     */
    @PreAuthorize("@ss.hasPermi('system:transformer:export')")
    @Log(title = "变压器", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, StgkTransformer stgkTransformer)
    {
        List<StgkTransformer> list = stgkTransformerService.selectStgkTransformerList(stgkTransformer);
        ExcelUtil<StgkTransformer> util = new ExcelUtil<StgkTransformer>(StgkTransformer.class);
        util.exportExcel(response, list, "变压器数据");
    }

    /**
     * 获取变压器详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:transformer:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(stgkTransformerService.selectStgkTransformerById(id));
    }

    /**
     * 新增变压器
     */
    @PreAuthorize("@ss.hasPermi('system:transformer:add')")
    @Log(title = "变压器", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody StgkTransformer stgkTransformer)
    {
        return toAjax(stgkTransformerService.insertStgkTransformer(stgkTransformer));
    }

    /**
     * 修改变压器
     */
    @PreAuthorize("@ss.hasPermi('system:transformer:edit')")
    @Log(title = "变压器", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody StgkTransformer stgkTransformer)
    {
        return toAjax(stgkTransformerService.updateStgkTransformer(stgkTransformer));
    }

    /**
     * 删除变压器
     */
    @PreAuthorize("@ss.hasPermi('system:transformer:remove')")
    @Log(title = "变压器", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(stgkTransformerService.deleteStgkTransformerByIds(ids));
    }


    @PreAuthorize("@ss.hasPermi('system:transformer:query')")
    @GetMapping(value = "/getRuntimingRate/{id}")
    public AjaxResult getRuntimingRate(@PathVariable("id") Long id)
    {
        return success(stgkTransformerService.getRuntimingRate(id));
    }

    @PreAuthorize("@ss.hasPermi('system:transformer:query')")
    @GetMapping(value = "/getTemperatureRate/{id}")
    public AjaxResult getTemperatureRate(@PathVariable("id") Long id)
    {
        return success(stgkTransformerService.getTemperatureRate(id,"1"));
    }

    @PreAuthorize("@ss.hasPermi('system:transformer:query')")
    @GetMapping(value = "/getRedTemperatureRate/{id}")
    public AjaxResult getRedTemperatureRate(@PathVariable("id") Long id)
    {
        return success(stgkTransformerService.getRedTemperatureRate(id));
    }
}
