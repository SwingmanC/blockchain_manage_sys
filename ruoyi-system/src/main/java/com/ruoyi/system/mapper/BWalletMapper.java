package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BWallet;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2024-06-19
 */
public interface BWalletMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BWallet selectBWalletById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param bWallet 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BWallet> selectBWalletList(BWallet bWallet);

    /**
     * 新增【请填写功能名称】
     * 
     * @param bWallet 【请填写功能名称】
     * @return 结果
     */
    public int insertBWallet(BWallet bWallet);

    /**
     * 修改【请填写功能名称】
     * 
     * @param bWallet 【请填写功能名称】
     * @return 结果
     */
    public int updateBWallet(BWallet bWallet);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBWalletById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBWalletByIds(Long[] ids);
}
