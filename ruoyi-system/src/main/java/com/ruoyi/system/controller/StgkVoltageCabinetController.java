package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.utils.StringUtils;
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
import com.ruoyi.system.domain.StgkVoltageCabinet;
import com.ruoyi.system.service.IStgkVoltageCabinetService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 高压柜Controller
 *
 * @author ruoyi
 * @date 2023-04-20
 */
@RestController
@RequestMapping("/system/cabinet")
public class StgkVoltageCabinetController extends BaseController
{
    @Autowired
    private IStgkVoltageCabinetService stgkVoltageCabinetService;

    /**
     * 查询高压柜列表
     */
    @PreAuthorize("@ss.hasPermi('system:cabinet:list')")
    @GetMapping("/list")
    public TableDataInfo list(StgkVoltageCabinet stgkVoltageCabinet)
    {
        startPage();
        List<StgkVoltageCabinet> list = stgkVoltageCabinetService.selectStgkVoltageCabinetList(stgkVoltageCabinet);
        return getDataTable(list);
    }

    /**
     * 导出高压柜列表
     */
    @PreAuthorize("@ss.hasPermi('system:cabinet:export')")
    @Log(title = "高压柜", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, StgkVoltageCabinet stgkVoltageCabinet)
    {
        List<StgkVoltageCabinet> list = stgkVoltageCabinetService.selectStgkVoltageCabinetList(stgkVoltageCabinet);
        ExcelUtil<StgkVoltageCabinet> util = new ExcelUtil<StgkVoltageCabinet>(StgkVoltageCabinet.class);
        util.exportExcel(response, list, "高压柜数据");
    }

    /**
     * 获取高压柜详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:cabinet:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(stgkVoltageCabinetService.selectStgkVoltageCabinetById(id));
    }

    /**
     * 新增高压柜
     */
    @PreAuthorize("@ss.hasPermi('system:cabinet:add')")
    @Log(title = "高压柜", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody StgkVoltageCabinet stgkVoltageCabinet)
    {
        return toAjax(stgkVoltageCabinetService.insertStgkVoltageCabinet(stgkVoltageCabinet));
    }

    /**
     * 修改高压柜
     */
    @PreAuthorize("@ss.hasPermi('system:cabinet:edit')")
    @Log(title = "高压柜", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody StgkVoltageCabinet stgkVoltageCabinet)
    {
        return toAjax(stgkVoltageCabinetService.updateStgkVoltageCabinet(stgkVoltageCabinet));
    }

    /**
     * 删除高压柜
     */
    @PreAuthorize("@ss.hasPermi('system:cabinet:remove')")
    @Log(title = "高压柜", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(stgkVoltageCabinetService.deleteStgkVoltageCabinetByIds(ids));
    }

    /**
     * 获取高压柜曲线图
     */
    @PreAuthorize("@ss.hasPermi('system:cabinet:query')")
    @GetMapping(value = "/getGraph/{id}")
    public AjaxResult getGraph(String column, @PathVariable("id") Long id)
    {
        return success(stgkVoltageCabinetService.getGraph(StringUtils.camelToUnderline(column),id));
    }

    /**
     * 操作控制
     */
    @PreAuthorize("@ss.hasPermi('system:cabinet:edit')")
    @PostMapping(value = "/operate/{id}")
    public AjaxResult operate(String operate, @PathVariable("id") Long id)
    {
        return success();
    }

}