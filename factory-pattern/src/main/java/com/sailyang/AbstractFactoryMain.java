package com.sailyang;

import com.sailyang.employee.Employee;
import com.sailyang.factory_abstract.FrontendFactory;
import com.sailyang.factory_method.FrontendEngineerFactory;
import com.sailyang.project.Project;

/**
 * @author yangfan
 * @version 1.0
 * @description: 抽象工厂模式
 * @date 2024/8/11 11:35
 */
public class AbstractFactoryMain {
    public static void main(String[] args) {
        Department department = new Department(new FrontendFactory());
        Employee employee = department.getEmployee();
        Project project = department.getProject();
        System.out.println(employee.getEmployeeType() + " : " + project.getProjectType());
    }
}
