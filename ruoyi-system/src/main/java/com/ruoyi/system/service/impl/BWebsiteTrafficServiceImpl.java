package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BWebsiteTrafficMapper;
import com.ruoyi.system.domain.BWebsiteTraffic;
import com.ruoyi.system.service.IBWebsiteTrafficService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-06-19
 */
@Service
public class BWebsiteTrafficServiceImpl implements IBWebsiteTrafficService 
{
    @Autowired
    private BWebsiteTrafficMapper bWebsiteTrafficMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BWebsiteTraffic selectBWebsiteTrafficById(Long id)
    {
        return bWebsiteTrafficMapper.selectBWebsiteTrafficById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param bWebsiteTraffic 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BWebsiteTraffic> selectBWebsiteTrafficList(BWebsiteTraffic bWebsiteTraffic)
    {
        return bWebsiteTrafficMapper.selectBWebsiteTrafficList(bWebsiteTraffic);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param bWebsiteTraffic 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBWebsiteTraffic(BWebsiteTraffic bWebsiteTraffic)
    {
        return bWebsiteTrafficMapper.insertBWebsiteTraffic(bWebsiteTraffic);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param bWebsiteTraffic 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBWebsiteTraffic(BWebsiteTraffic bWebsiteTraffic)
    {
        return bWebsiteTrafficMapper.updateBWebsiteTraffic(bWebsiteTraffic);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBWebsiteTrafficByIds(Long[] ids)
    {
        return bWebsiteTrafficMapper.deleteBWebsiteTrafficByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBWebsiteTrafficById(Long id)
    {
        return bWebsiteTrafficMapper.deleteBWebsiteTrafficById(id);
    }
}
