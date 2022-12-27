package com.hjt.business.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统管理员帐号
 * </p>
 *
 * @author hjt
 * @since 2022-12-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="BaseAdminUser对象", description="系统管理员帐号")
public class BaseAdminUser extends Model<BaseAdminUser> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "系统用户名称")
    private String sysUserName;

    @ApiModelProperty(value = "系统用户密码")
    private String sysUserPwd;

    @ApiModelProperty(value = "角色")
    private Integer roleId;

    @ApiModelProperty(value = "手机号")
    private String userPhone;

    @ApiModelProperty(value = "登记时间")
    private String regTime;

    @ApiModelProperty(value = "状态（0：无效；1：有效）")
    private Integer userStatus;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
