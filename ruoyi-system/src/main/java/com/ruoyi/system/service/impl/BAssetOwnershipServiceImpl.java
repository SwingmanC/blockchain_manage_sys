package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BAssetOwnershipMapper;
import com.ruoyi.system.domain.BAssetOwnership;
import com.ruoyi.system.service.IBAssetOwnershipService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-06-19
 */
@Service
public class BAssetOwnershipServiceImpl implements IBAssetOwnershipService 
{
    @Autowired
    private BAssetOwnershipMapper bAssetOwnershipMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BAssetOwnership selectBAssetOwnershipById(Long id)
    {
        return bAssetOwnershipMapper.selectBAssetOwnershipById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param bAssetOwnership 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BAssetOwnership> selectBAssetOwnershipList(BAssetOwnership bAssetOwnership)
    {
        return bAssetOwnershipMapper.selectBAssetOwnershipList(bAssetOwnership);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param bAssetOwnership 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBAssetOwnership(BAssetOwnership bAssetOwnership)
    {
        bAssetOwnership.setCreateTime(DateUtils.getNowDate());
        return bAssetOwnershipMapper.insertBAssetOwnership(bAssetOwnership);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param bAssetOwnership 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBAssetOwnership(BAssetOwnership bAssetOwnership)
    {
        bAssetOwnership.setUpdateTime(DateUtils.getNowDate());
        return bAssetOwnershipMapper.updateBAssetOwnership(bAssetOwnership);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBAssetOwnershipByIds(Long[] ids)
    {
        return bAssetOwnershipMapper.deleteBAssetOwnershipByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBAssetOwnershipById(Long id)
    {
        return bAssetOwnershipMapper.deleteBAssetOwnershipById(id);
    }
}
