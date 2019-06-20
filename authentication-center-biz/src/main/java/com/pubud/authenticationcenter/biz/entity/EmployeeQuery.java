package com.pubud.authenticationcenter.biz.entity;

import lombok.Builder;

import java.io.Serializable;

/**
 * 员工查询对象
 * @author wangbaoliang
 */
@Builder
public class EmployeeQuery implements Serializable {

    private static final long serialVersionUID = 7771121546765216378L;

    /**
     * 年龄
     */
    private String name;

    /**
     * 姓名
     */
    private Integer age;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 性别
     */
    private Integer gender;

}
