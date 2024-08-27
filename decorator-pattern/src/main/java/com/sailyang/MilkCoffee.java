package com.sailyang;

/**
 * @author yangfan
 * @version 1.0
 * @description: 具体装饰器
 * @date 2024/8/27 19:27
 */
public class MilkCoffee extends CoffeeDecorator{
    public MilkCoffee(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", 牛奶";
    }
}
