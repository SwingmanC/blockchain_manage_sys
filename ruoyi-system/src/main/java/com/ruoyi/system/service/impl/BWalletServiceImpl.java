package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BWalletMapper;
import com.ruoyi.system.domain.BWallet;
import com.ruoyi.system.service.IBWalletService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-06-19
 */
@Service
public class BWalletServiceImpl implements IBWalletService 
{
    @Autowired
    private BWalletMapper bWalletMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BWallet selectBWalletById(Long id)
    {
        return bWalletMapper.selectBWalletById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param bWallet 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BWallet> selectBWalletList(BWallet bWallet)
    {
        return bWalletMapper.selectBWalletList(bWallet);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param bWallet 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBWallet(BWallet bWallet)
    {
        bWallet.setCreateTime(DateUtils.getNowDate());
        return bWalletMapper.insertBWallet(bWallet);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param bWallet 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBWallet(BWallet bWallet)
    {
        bWallet.setUpdateTime(DateUtils.getNowDate());
        return bWalletMapper.updateBWallet(bWallet);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBWalletByIds(Long[] ids)
    {
        return bWalletMapper.deleteBWalletByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBWalletById(Long id)
    {
        return bWalletMapper.deleteBWalletById(id);
    }
}
