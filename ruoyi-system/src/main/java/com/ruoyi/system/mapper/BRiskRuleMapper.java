package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BRiskRule;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2024-06-19
 */
public interface BRiskRuleMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BRiskRule selectBRiskRuleById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param bRiskRule 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BRiskRule> selectBRiskRuleList(BRiskRule bRiskRule);

    /**
     * 新增【请填写功能名称】
     * 
     * @param bRiskRule 【请填写功能名称】
     * @return 结果
     */
    public int insertBRiskRule(BRiskRule bRiskRule);

    /**
     * 修改【请填写功能名称】
     * 
     * @param bRiskRule 【请填写功能名称】
     * @return 结果
     */
    public int updateBRiskRule(BRiskRule bRiskRule);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBRiskRuleById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBRiskRuleByIds(Long[] ids);
}
