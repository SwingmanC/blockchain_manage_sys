package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 b_block
 * 
 * @author ruoyi
 * @date 2024-06-19
 */
public class BBlock extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String blockHash;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long height;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String prevHash;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long transactionCnt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long size;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setBlockHash(String blockHash) 
    {
        this.blockHash = blockHash;
    }

    public String getBlockHash() 
    {
        return blockHash;
    }
    public void setHeight(Long height) 
    {
        this.height = height;
    }

    public Long getHeight() 
    {
        return height;
    }
    public void setPrevHash(String prevHash) 
    {
        this.prevHash = prevHash;
    }

    public String getPrevHash() 
    {
        return prevHash;
    }
    public void setTransactionCnt(Long transactionCnt) 
    {
        this.transactionCnt = transactionCnt;
    }

    public Long getTransactionCnt() 
    {
        return transactionCnt;
    }
    public void setSize(Long size) 
    {
        this.size = size;
    }

    public Long getSize() 
    {
        return size;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("blockHash", getBlockHash())
            .append("height", getHeight())
            .append("prevHash", getPrevHash())
            .append("createTime", getCreateTime())
            .append("transactionCnt", getTransactionCnt())
            .append("size", getSize())
            .toString();
    }
}
