package com.sailyang.factory_method;

import com.sailyang.employee.BackendEngineer;
import com.sailyang.employee.Employee;

/**
 * @author yangfan
 * @version 1.0
 * @description: TODO
 * @date 2024/8/11 11:02
 */
public class BackendEngineerFactory implements EmployeeFactory{
    @Override
    public Employee createEmployee() {
        return new BackendEngineer();
    }
}
