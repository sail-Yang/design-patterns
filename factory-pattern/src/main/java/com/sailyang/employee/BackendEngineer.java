package com.sailyang.employee;

/**
 * @author yangfan
 * @version 1.0
 * @description: 后端工程师
 * @date 2024/8/11 10:50
 */
public class BackendEngineer implements Employee{
    @Override
    public String getEmployeeType() {
        return "I am a Backend Engineer";
    }
}
