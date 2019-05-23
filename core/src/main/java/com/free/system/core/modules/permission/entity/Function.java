package com.free.system.core.modules.permission.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 功能操作表
 * </p>
 *
 * @author suveng@163.com
 * @since 2019-05-23
 */
@TableName("p_function")
public class Function extends Model<Function> {

    private static final long serialVersionUID = 1L;

    /**
     * id编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 功能名称
     */
    @TableField("function_name")
    private String functionName;

    /**
     * 功能编码
     */
    @TableField("function_code")
    private String functionCode;

    /**
     * 拦截url前缀
     */
    @TableField("pre_url")
    private String preUrl;

    /**
     * 操作父id
     */
    @TableField("parent_id")
    private Integer parentId;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField("modify_time")
    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }
    public String getPreUrl() {
        return preUrl;
    }

    public void setPreUrl(String preUrl) {
        this.preUrl = preUrl;
    }
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Function{" +
        "id=" + id +
        ", functionName=" + functionName +
        ", functionCode=" + functionCode +
        ", preUrl=" + preUrl +
        ", parentId=" + parentId +
        ", createTime=" + createTime +
        ", modifyTime=" + modifyTime +
        "}";
    }
}
