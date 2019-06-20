package com.pubud.authenticationcenter.web.controller.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 员工视图对象
 * @author wangbaoliang
 */
@Data
@ToString
@ApiModel(value = "员工")
public class EmployeeVO implements Serializable {

    private static final long serialVersionUID = 2101017213300899973L;

    /**
     * 员工姓名
     */
    @ApiModelProperty(value = "员工姓名",example = "王保良")
    private String name;

    /**
     * 员工年龄
     */
    @ApiModelProperty(value = "员工年龄",example = "24")
    private Integer age;

    /**
     * 员工手机
     */
    @ApiModelProperty(value = "员工手机",example = "19956038831")
    private String mobile;

    /**
     * 员工邮箱
     */
    @ApiModelProperty(value = "员工邮箱",example = "1479930060@qq.com")
    private String email;

    /**
     * 员工描述
     */
    @ApiModelProperty(value = "员工描述",example = "男,未婚")
    private String description;

    /**
     * 员工性别
     */
    @ApiModelProperty(value = "员工性别",example = "0")
    private Integer gender;

    /**
     * 员工地址
     */
    @ApiModelProperty(value = "员工地址",example = "合肥市")
    private String address;
}
