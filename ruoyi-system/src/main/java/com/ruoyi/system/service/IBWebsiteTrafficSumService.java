package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BWebsiteTrafficSum;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2024-06-19
 */
public interface IBWebsiteTrafficSumService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BWebsiteTrafficSum selectBWebsiteTrafficSumById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param bWebsiteTrafficSum 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BWebsiteTrafficSum> selectBWebsiteTrafficSumList(BWebsiteTrafficSum bWebsiteTrafficSum);

    /**
     * 新增【请填写功能名称】
     * 
     * @param bWebsiteTrafficSum 【请填写功能名称】
     * @return 结果
     */
    public int insertBWebsiteTrafficSum(BWebsiteTrafficSum bWebsiteTrafficSum);

    /**
     * 修改【请填写功能名称】
     * 
     * @param bWebsiteTrafficSum 【请填写功能名称】
     * @return 结果
     */
    public int updateBWebsiteTrafficSum(BWebsiteTrafficSum bWebsiteTrafficSum);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBWebsiteTrafficSumByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBWebsiteTrafficSumById(Long id);
}
