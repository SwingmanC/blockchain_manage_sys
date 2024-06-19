package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BBlockMapper;
import com.ruoyi.system.domain.BBlock;
import com.ruoyi.system.service.IBBlockService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-06-19
 */
@Service
public class BBlockServiceImpl implements IBBlockService 
{
    @Autowired
    private BBlockMapper bBlockMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BBlock selectBBlockById(Long id)
    {
        return bBlockMapper.selectBBlockById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param bBlock 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BBlock> selectBBlockList(BBlock bBlock)
    {
        return bBlockMapper.selectBBlockList(bBlock);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param bBlock 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBBlock(BBlock bBlock)
    {
        bBlock.setCreateTime(DateUtils.getNowDate());
        return bBlockMapper.insertBBlock(bBlock);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param bBlock 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBBlock(BBlock bBlock)
    {
        return bBlockMapper.updateBBlock(bBlock);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBBlockByIds(Long[] ids)
    {
        return bBlockMapper.deleteBBlockByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBBlockById(Long id)
    {
        return bBlockMapper.deleteBBlockById(id);
    }
}
