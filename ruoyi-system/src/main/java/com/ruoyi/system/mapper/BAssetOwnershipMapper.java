package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BAssetOwnership;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2024-06-19
 */
public interface BAssetOwnershipMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BAssetOwnership selectBAssetOwnershipById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param bAssetOwnership 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BAssetOwnership> selectBAssetOwnershipList(BAssetOwnership bAssetOwnership);

    /**
     * 新增【请填写功能名称】
     * 
     * @param bAssetOwnership 【请填写功能名称】
     * @return 结果
     */
    public int insertBAssetOwnership(BAssetOwnership bAssetOwnership);

    /**
     * 修改【请填写功能名称】
     * 
     * @param bAssetOwnership 【请填写功能名称】
     * @return 结果
     */
    public int updateBAssetOwnership(BAssetOwnership bAssetOwnership);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBAssetOwnershipById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBAssetOwnershipByIds(Long[] ids);
}
