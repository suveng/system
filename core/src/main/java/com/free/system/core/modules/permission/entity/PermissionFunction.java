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
 * 权限与功能操作关联表
 * </p>
 *
 * @author suveng@163.com
 * @since 2019-05-23
 */
@TableName("p_permission_function")
public class PermissionFunction extends Model<PermissionFunction> {

    private static final long serialVersionUID = 1L;

    /**
     * id编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 权限id
     */
    @TableField("permission_id")
    private Integer permissionId;

    /**
     * 功能id
     */
    @TableField("function_id")
    private Integer functionId;

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
    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }
    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
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
        return "PermissionFunction{" +
        "id=" + id +
        ", permissionId=" + permissionId +
        ", functionId=" + functionId +
        ", createTime=" + createTime +
        ", modifyTime=" + modifyTime +
        "}";
    }
}
