package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BRiskEvent;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2024-06-19
 */
public interface IBRiskEventService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BRiskEvent selectBRiskEventById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param bRiskEvent 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BRiskEvent> selectBRiskEventList(BRiskEvent bRiskEvent);

    /**
     * 新增【请填写功能名称】
     * 
     * @param bRiskEvent 【请填写功能名称】
     * @return 结果
     */
    public int insertBRiskEvent(BRiskEvent bRiskEvent);

    /**
     * 修改【请填写功能名称】
     * 
     * @param bRiskEvent 【请填写功能名称】
     * @return 结果
     */
    public int updateBRiskEvent(BRiskEvent bRiskEvent);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBRiskEventByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBRiskEventById(Long id);
}
