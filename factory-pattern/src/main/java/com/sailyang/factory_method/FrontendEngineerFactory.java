package com.sailyang.factory_method;

import com.sailyang.employee.Employee;
import com.sailyang.employee.FrontendEngineer;

/**
 * @author yangfan
 * @version 1.0
 * @description: TODO
 * @date 2024/8/11 11:02
 */
public class FrontendEngineerFactory implements EmployeeFactory{

    @Override
    public Employee createEmployee() {
        return new FrontendEngineer();
    }
}
