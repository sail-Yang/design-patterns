package com.sailyang;

import com.sailyang.employee.Employee;
import com.sailyang.factory_abstract.AbstractEmployeeFactory;
import com.sailyang.factory_method.EmployeeFactory;
import com.sailyang.project.Project;

/**
 * @author yangfan
 * @version 1.0
 * @description: 公司部门
 * @date 2024/8/11 10:49
 */
public class Department {
    private Employee employee;

    private Project project;

    public Department(EmployeeFactory employeeFactory) {
        this.employee = employeeFactory.createEmployee();
    }

    public Department(AbstractEmployeeFactory factory) {
        this.employee = factory.createEmployee();
        this.project = factory.createProject();
    }

    public Employee getEmployee() {
        return employee;
    }

    public Project getProject() {
        return project;
    }
}
