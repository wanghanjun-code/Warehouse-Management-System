package com.warehouse.demo.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@ApiModel(description="USERS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "USERS")
public class UsersDto implements Serializable {
    /**
     * 用户ID主键
     */
    @TableId(value = "USER_ID", type = IdType.INPUT)
    @ApiModelProperty(value="用户ID主键")
    private BigDecimal userId;

    /**
     * 用户的名字
     */
    @TableField(value = "\"NAME\"")
    @ApiModelProperty(value="用户的名字")
    private String name;

    /**
     * 用户角色 (admin, warehouse manager, sales staff)
     */
    @TableField(value = "\"ROLE\"")
    @ApiModelProperty(value="用户角色 (admin, warehouse manager, sales staff)")
    private String role;

    private static final long serialVersionUID = 1L;
}