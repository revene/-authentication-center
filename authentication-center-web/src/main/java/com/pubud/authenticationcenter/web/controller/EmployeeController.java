package com.pubud.authenticationcenter.web.controller;

import com.netflix.discovery.converters.Auto;
import com.pubud.authenticationcenter.biz.entity.Employee;
import com.pubud.authenticationcenter.biz.service.EmployeeService;
import com.pubud.authenticationcenter.web.controller.vo.EmployeeVO;
import com.pubud.commons.constants.ExceptionConstants;
import com.pubud.commons.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 员工管理Controller
 * @author wangbaoliang
 */
@Api(value = "员工管理",tags = "员工管理")
@RestController
@RequestMapping(value = "employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 日志打印
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    /**
     * 新增一个员工
     * @param employeeVO
     * @return
     */
    @ApiOperation(value = "新增一个员工")
    @RequestMapping(value = "addEmployee" , method = RequestMethod.POST)
    public Result addEmployee(@RequestBody EmployeeVO employeeVO){
        Result result = new Result();
        try {
            Employee employee = new Employee();
            BeanUtils.copyProperties(employee,employeeVO);
            result = employeeService.addEmployee(employee);
        }catch (Exception e){
            LOGGER.error("EmployeeController [addEmployee] is error , cause by {} , employee is {}",e.getMessage(),employeeVO.toString());
            result.setExceptionInfo(ExceptionConstants.genSystemError(e));
        }
        return result;
    }
}
