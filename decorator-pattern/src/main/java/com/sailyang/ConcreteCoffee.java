package com.sailyang;

/**
 * @author yangfan
 * @version 1.0
 * @description: 具体组件实现类
 * @date 2024/8/27 19:22
 */
public class ConcreteCoffee implements Coffee{

    @Override
    public double getCost() {
        return 10.0;
    }

    @Override
    public String getDescription() {
        return "获得一杯咖啡";
    }
}
