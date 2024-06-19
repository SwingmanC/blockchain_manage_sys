package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BRiskRuleMapper;
import com.ruoyi.system.domain.BRiskRule;
import com.ruoyi.system.service.IBRiskRuleService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-06-19
 */
@Service
public class BRiskRuleServiceImpl implements IBRiskRuleService 
{
    @Autowired
    private BRiskRuleMapper bRiskRuleMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BRiskRule selectBRiskRuleById(Long id)
    {
        return bRiskRuleMapper.selectBRiskRuleById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param bRiskRule 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BRiskRule> selectBRiskRuleList(BRiskRule bRiskRule)
    {
        return bRiskRuleMapper.selectBRiskRuleList(bRiskRule);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param bRiskRule 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBRiskRule(BRiskRule bRiskRule)
    {
        bRiskRule.setCreateTime(DateUtils.getNowDate());
        return bRiskRuleMapper.insertBRiskRule(bRiskRule);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param bRiskRule 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBRiskRule(BRiskRule bRiskRule)
    {
        bRiskRule.setUpdateTime(DateUtils.getNowDate());
        return bRiskRuleMapper.updateBRiskRule(bRiskRule);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBRiskRuleByIds(Long[] ids)
    {
        return bRiskRuleMapper.deleteBRiskRuleByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBRiskRuleById(Long id)
    {
        return bRiskRuleMapper.deleteBRiskRuleById(id);
    }
}
