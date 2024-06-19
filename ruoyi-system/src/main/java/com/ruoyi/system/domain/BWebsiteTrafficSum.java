package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 b_website_traffic_sum
 * 
 * @author ruoyi
 * @date 2024-06-19
 */
public class BWebsiteTrafficSum extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date sumDate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long totalReqCnt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long totalTraffic;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSumDate(Date sumDate) 
    {
        this.sumDate = sumDate;
    }

    public Date getSumDate() 
    {
        return sumDate;
    }
    public void setTotalReqCnt(Long totalReqCnt) 
    {
        this.totalReqCnt = totalReqCnt;
    }

    public Long getTotalReqCnt() 
    {
        return totalReqCnt;
    }
    public void setTotalTraffic(Long totalTraffic) 
    {
        this.totalTraffic = totalTraffic;
    }

    public Long getTotalTraffic() 
    {
        return totalTraffic;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sumDate", getSumDate())
            .append("totalReqCnt", getTotalReqCnt())
            .append("totalTraffic", getTotalTraffic())
            .toString();
    }
}
