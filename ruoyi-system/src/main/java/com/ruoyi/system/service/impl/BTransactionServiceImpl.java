package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BTransactionMapper;
import com.ruoyi.system.domain.BTransaction;
import com.ruoyi.system.service.IBTransactionService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-06-19
 */
@Service
public class BTransactionServiceImpl implements IBTransactionService 
{
    @Autowired
    private BTransactionMapper bTransactionMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BTransaction selectBTransactionById(Long id)
    {
        return bTransactionMapper.selectBTransactionById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param bTransaction 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BTransaction> selectBTransactionList(BTransaction bTransaction)
    {
        return bTransactionMapper.selectBTransactionList(bTransaction);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param bTransaction 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBTransaction(BTransaction bTransaction)
    {
        bTransaction.setCreateTime(DateUtils.getNowDate());
        return bTransactionMapper.insertBTransaction(bTransaction);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param bTransaction 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBTransaction(BTransaction bTransaction)
    {
        return bTransactionMapper.updateBTransaction(bTransaction);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBTransactionByIds(Long[] ids)
    {
        return bTransactionMapper.deleteBTransactionByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBTransactionById(Long id)
    {
        return bTransactionMapper.deleteBTransactionById(id);
    }
}
