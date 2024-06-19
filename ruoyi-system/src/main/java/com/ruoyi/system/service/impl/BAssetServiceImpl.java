package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BAssetMapper;
import com.ruoyi.system.domain.BAsset;
import com.ruoyi.system.service.IBAssetService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-06-19
 */
@Service
public class BAssetServiceImpl implements IBAssetService 
{
    @Autowired
    private BAssetMapper bAssetMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BAsset selectBAssetById(Long id)
    {
        return bAssetMapper.selectBAssetById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param bAsset 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BAsset> selectBAssetList(BAsset bAsset)
    {
        return bAssetMapper.selectBAssetList(bAsset);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param bAsset 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBAsset(BAsset bAsset)
    {
        bAsset.setCreateTime(DateUtils.getNowDate());
        return bAssetMapper.insertBAsset(bAsset);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param bAsset 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBAsset(BAsset bAsset)
    {
        bAsset.setUpdateTime(DateUtils.getNowDate());
        return bAssetMapper.updateBAsset(bAsset);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBAssetByIds(Long[] ids)
    {
        return bAssetMapper.deleteBAssetByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBAssetById(Long id)
    {
        return bAssetMapper.deleteBAssetById(id);
    }
}
