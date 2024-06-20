package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BWebsiteTrafficSumMapper;
import com.ruoyi.system.domain.BWebsiteTrafficSum;
import com.ruoyi.system.service.IBWebsiteTrafficSumService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-06-19
 */
@Service
public class BWebsiteTrafficSumServiceImpl implements IBWebsiteTrafficSumService 
{
    @Autowired
    private BWebsiteTrafficSumMapper bWebsiteTrafficSumMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BWebsiteTrafficSum selectBWebsiteTrafficSumById(Long id)
    {
        return bWebsiteTrafficSumMapper.selectBWebsiteTrafficSumById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param bWebsiteTrafficSum 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BWebsiteTrafficSum> selectBWebsiteTrafficSumList(BWebsiteTrafficSum bWebsiteTrafficSum)
    {
        return bWebsiteTrafficSumMapper.selectBWebsiteTrafficSumList(bWebsiteTrafficSum);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param bWebsiteTrafficSum 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBWebsiteTrafficSum(BWebsiteTrafficSum bWebsiteTrafficSum)
    {
        return bWebsiteTrafficSumMapper.insertBWebsiteTrafficSum(bWebsiteTrafficSum);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param bWebsiteTrafficSum 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBWebsiteTrafficSum(BWebsiteTrafficSum bWebsiteTrafficSum)
    {
        return bWebsiteTrafficSumMapper.updateBWebsiteTrafficSum(bWebsiteTrafficSum);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBWebsiteTrafficSumByIds(Long[] ids)
    {
        return bWebsiteTrafficSumMapper.deleteBWebsiteTrafficSumByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBWebsiteTrafficSumById(Long id)
    {
        return bWebsiteTrafficSumMapper.deleteBWebsiteTrafficSumById(id);
    }

    @Override
    public List<BWebsiteTrafficSum> selectTrafficSumListByWeek() {
        return bWebsiteTrafficSumMapper.selectTrafficSumListByWeek();
    }
}
