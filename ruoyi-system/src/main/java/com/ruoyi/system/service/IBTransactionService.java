package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BTransaction;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2024-06-19
 */
public interface IBTransactionService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BTransaction selectBTransactionById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param bTransaction 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BTransaction> selectBTransactionList(BTransaction bTransaction);

    /**
     * 新增【请填写功能名称】
     * 
     * @param bTransaction 【请填写功能名称】
     * @return 结果
     */
    public int insertBTransaction(BTransaction bTransaction);

    /**
     * 修改【请填写功能名称】
     * 
     * @param bTransaction 【请填写功能名称】
     * @return 结果
     */
    public int updateBTransaction(BTransaction bTransaction);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBTransactionByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBTransactionById(Long id);
}
