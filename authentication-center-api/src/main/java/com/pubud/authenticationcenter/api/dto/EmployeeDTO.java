package com.pubud.authenticationcenter.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 员工entity
 * @author wangbaoliang
 */
@Data
public class EmployeeDTO implements Serializable {

    private static final long serialVersionUID = -5139104545625390374L;

    /**
     * 主键id
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 地址
     */
    private String address;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;
}
