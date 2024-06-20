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
import com.ruoyi.system.domain.BWebsiteTrafficSum;
import com.ruoyi.system.service.IBWebsiteTrafficSumService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2024-06-19
 */
@RestController
@RequestMapping("/system/sum")
public class BWebsiteTrafficSumController extends BaseController
{
    @Autowired
    private IBWebsiteTrafficSumService bWebsiteTrafficSumService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:sum:list')")
    @GetMapping("/list")
    public TableDataInfo list(BWebsiteTrafficSum bWebsiteTrafficSum)
    {
        startPage();
        List<BWebsiteTrafficSum> list = bWebsiteTrafficSumService.selectBWebsiteTrafficSumList(bWebsiteTrafficSum);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:sum:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BWebsiteTrafficSum bWebsiteTrafficSum)
    {
        List<BWebsiteTrafficSum> list = bWebsiteTrafficSumService.selectBWebsiteTrafficSumList(bWebsiteTrafficSum);
        ExcelUtil<BWebsiteTrafficSum> util = new ExcelUtil<BWebsiteTrafficSum>(BWebsiteTrafficSum.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:sum:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(bWebsiteTrafficSumService.selectBWebsiteTrafficSumById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:sum:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BWebsiteTrafficSum bWebsiteTrafficSum)
    {
        return toAjax(bWebsiteTrafficSumService.insertBWebsiteTrafficSum(bWebsiteTrafficSum));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:sum:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BWebsiteTrafficSum bWebsiteTrafficSum)
    {
        return toAjax(bWebsiteTrafficSumService.updateBWebsiteTrafficSum(bWebsiteTrafficSum));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:sum:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bWebsiteTrafficSumService.deleteBWebsiteTrafficSumByIds(ids));
    }

    /**
     *  返回近7天的流量摘要
     */
    @PreAuthorize("@ss.hasPermi('system:sum:week')")
    @GetMapping("/week")
    public AjaxResult getTrafficSumByWeek(){
        return success(bWebsiteTrafficSumService.selectTrafficSumListByWeek());
    }
}
