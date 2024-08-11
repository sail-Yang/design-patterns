package com.sailyang.factory_method;

import com.sailyang.employee.Employee;

/**
 * @author yangfan
 * @version 1.0
 * @description: 工厂方法接口
 * @date 2024/8/11 11:01
 */
public interface EmployeeFactory {
    Employee createEmployee();
}
