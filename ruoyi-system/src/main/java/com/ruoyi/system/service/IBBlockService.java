package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BBlock;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2024-06-19
 */
public interface IBBlockService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BBlock selectBBlockById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param bBlock 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BBlock> selectBBlockList(BBlock bBlock);

    /**
     * 新增【请填写功能名称】
     * 
     * @param bBlock 【请填写功能名称】
     * @return 结果
     */
    public int insertBBlock(BBlock bBlock);

    /**
     * 修改【请填写功能名称】
     * 
     * @param bBlock 【请填写功能名称】
     * @return 结果
     */
    public int updateBBlock(BBlock bBlock);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBBlockByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBBlockById(Long id);
}
