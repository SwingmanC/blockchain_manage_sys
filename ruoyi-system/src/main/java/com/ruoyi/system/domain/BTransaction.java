package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 b_transaction
 * 
 * @author ruoyi
 * @date 2024-06-19
 */
public class BTransaction extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /**  */
    @Excel(name = "")
    private String transactionId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long blockId;

    /**  */
    @Excel(name = "")
    private Long assetId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fromAddress;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String toAddress;

    /**  */
    @Excel(name = "")
    private BigDecimal amount;

    /**  */
    @Excel(name = "")
    private String status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long comfirmCnt;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTransactionId(String transactionId) 
    {
        this.transactionId = transactionId;
    }

    public String getTransactionId() 
    {
        return transactionId;
    }
    public void setBlockId(Long blockId) 
    {
        this.blockId = blockId;
    }

    public Long getBlockId() 
    {
        return blockId;
    }
    public void setAssetId(Long assetId) 
    {
        this.assetId = assetId;
    }

    public Long getAssetId() 
    {
        return assetId;
    }
    public void setFromAddress(String fromAddress) 
    {
        this.fromAddress = fromAddress;
    }

    public String getFromAddress() 
    {
        return fromAddress;
    }
    public void setToAddress(String toAddress) 
    {
        this.toAddress = toAddress;
    }

    public String getToAddress() 
    {
        return toAddress;
    }
    public void setAmount(BigDecimal amount) 
    {
        this.amount = amount;
    }

    public BigDecimal getAmount() 
    {
        return amount;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setComfirmCnt(Long comfirmCnt) 
    {
        this.comfirmCnt = comfirmCnt;
    }

    public Long getComfirmCnt() 
    {
        return comfirmCnt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("transactionId", getTransactionId())
            .append("blockId", getBlockId())
            .append("assetId", getAssetId())
            .append("fromAddress", getFromAddress())
            .append("toAddress", getToAddress())
            .append("amount", getAmount())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("comfirmCnt", getComfirmCnt())
            .toString();
    }
}
