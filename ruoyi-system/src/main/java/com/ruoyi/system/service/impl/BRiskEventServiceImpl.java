package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BRiskEventMapper;
import com.ruoyi.system.domain.BRiskEvent;
import com.ruoyi.system.service.IBRiskEventService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-06-19
 */
@Service
public class BRiskEventServiceImpl implements IBRiskEventService 
{
    @Autowired
    private BRiskEventMapper bRiskEventMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BRiskEvent selectBRiskEventById(Long id)
    {
        return bRiskEventMapper.selectBRiskEventById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param bRiskEvent 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BRiskEvent> selectBRiskEventList(BRiskEvent bRiskEvent)
    {
        return bRiskEventMapper.selectBRiskEventList(bRiskEvent);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param bRiskEvent 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBRiskEvent(BRiskEvent bRiskEvent)
    {
        return bRiskEventMapper.insertBRiskEvent(bRiskEvent);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param bRiskEvent 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBRiskEvent(BRiskEvent bRiskEvent)
    {
        return bRiskEventMapper.updateBRiskEvent(bRiskEvent);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBRiskEventByIds(Long[] ids)
    {
        return bRiskEventMapper.deleteBRiskEventByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBRiskEventById(Long id)
    {
        return bRiskEventMapper.deleteBRiskEventById(id);
    }
}
