package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BAsset;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2024-06-19
 */
public interface IBAssetService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BAsset selectBAssetById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param bAsset 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BAsset> selectBAssetList(BAsset bAsset);

    /**
     * 新增【请填写功能名称】
     * 
     * @param bAsset 【请填写功能名称】
     * @return 结果
     */
    public int insertBAsset(BAsset bAsset);

    /**
     * 修改【请填写功能名称】
     * 
     * @param bAsset 【请填写功能名称】
     * @return 结果
     */
    public int updateBAsset(BAsset bAsset);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBAssetByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBAssetById(Long id);
}
