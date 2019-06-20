package com.pubud.authenticationcenter.biz.service.impl;

import com.pubud.authenticationcenter.biz.dao.EmployeeDao;
import com.pubud.authenticationcenter.biz.entity.Employee;
import com.pubud.authenticationcenter.biz.service.EmployeeService;
import com.pubud.commons.result.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 员工实现类
 * @author wangbaoliang
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    /**
     * 日志打印
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    /**
     * 新增一个员工
     * @param employee
     * @return
     */
    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public Result addEmployee(Employee employee) {
        Result result = new Result();
        try {
            employeeDao.insert(employee);
            result.setIsSuccess(true);
        }catch (Exception e){
            LOGGER.error("EmployeeServiceImpl [addEmployee] is error , cause by {} , employeeName is ",e.getMessage(),employee.getName());
        }
        return result;
    }
}
