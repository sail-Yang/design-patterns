package com.sailyang.factory_abstract;

import com.sailyang.employee.Employee;
import com.sailyang.project.Project;

/**
 * @author yangfan
 * @version 1.0
 * @description: TODO
 * @date 2024/8/11 11:32
 */
public interface AbstractEmployeeFactory {
    Employee createEmployee();

    Project createProject();
}
