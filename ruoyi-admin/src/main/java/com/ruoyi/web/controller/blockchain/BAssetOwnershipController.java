package com.ruoyi.web.controller.blockchain;

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
import com.ruoyi.system.domain.BAssetOwnership;
import com.ruoyi.system.service.IBAssetOwnershipService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2024-06-19
 */
@RestController
@RequestMapping("/system/ownership")
public class BAssetOwnershipController extends BaseController
{
    @Autowired
    private IBAssetOwnershipService bAssetOwnershipService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:ownership:list')")
    @GetMapping("/list")
    public TableDataInfo list(BAssetOwnership bAssetOwnership)
    {
        startPage();
        List<BAssetOwnership> list = bAssetOwnershipService.selectBAssetOwnershipList(bAssetOwnership);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:ownership:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BAssetOwnership bAssetOwnership)
    {
        List<BAssetOwnership> list = bAssetOwnershipService.selectBAssetOwnershipList(bAssetOwnership);
        ExcelUtil<BAssetOwnership> util = new ExcelUtil<BAssetOwnership>(BAssetOwnership.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:ownership:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(bAssetOwnershipService.selectBAssetOwnershipById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:ownership:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BAssetOwnership bAssetOwnership)
    {
        return toAjax(bAssetOwnershipService.insertBAssetOwnership(bAssetOwnership));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:ownership:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BAssetOwnership bAssetOwnership)
    {
        return toAjax(bAssetOwnershipService.updateBAssetOwnership(bAssetOwnership));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:ownership:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bAssetOwnershipService.deleteBAssetOwnershipByIds(ids));
    }
}
