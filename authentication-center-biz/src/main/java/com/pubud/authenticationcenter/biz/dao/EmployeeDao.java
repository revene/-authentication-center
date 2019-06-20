package com.pubud.authenticationcenter.biz.dao;

import com.pubud.authenticationcenter.biz.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface EmployeeDao {

    /**
     * 新增一个员工
     * @param employee
     */
    void insert(Employee employee);
}
