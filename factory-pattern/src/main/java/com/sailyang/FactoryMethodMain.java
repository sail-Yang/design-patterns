package com.sailyang;

import com.sailyang.employee.Employee;
import com.sailyang.factory_method.FrontendEngineerFactory;

/**
 * 工厂方法模式创建员工
 */
public class FactoryMethodMain {
    public static void main(String[] args) {
        //拓展新员工时，只要创建新的员工类和对应的工厂类即可,不需要修改原来的代码
        Department department = new Department(new FrontendEngineerFactory());
//        Department department = new Department(new BackendEngineerFactory());
        Employee employee = department.getEmployee();
        String type = employee.getEmployeeType();
        System.out.println(type);
    }
}