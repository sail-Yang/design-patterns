package com.sailyang;

import com.sailyang.employee.Employee;
import com.sailyang.factory.EmployeeFactory;

/**
 * @author yangfan
 * @version 1.0
 * @description: 公司部门
 * @date 2024/8/11 10:49
 */
public class Department {
    private Employee employee;

    public Department(EmployeeFactory employeeFactory) {
        this.employee = employeeFactory.createEmployee();
    }

    public Employee getEmployee() {
        return employee;
    }
}
