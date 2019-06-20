package com.pubud.authenticationcenter.biz.service;

import com.pubud.authenticationcenter.biz.entity.Employee;
import com.pubud.commons.result.Result;

/**
 * 员工相关的服务
 * @author wangbaoliang
 */
public interface EmployeeService {

    /**
     * 新增一个员工
     * @param employee
     * @return
     */
    Result addEmployee(Employee employee);

}
