package com.sailyang;

/**
 * @author yangfan
 * @version 1.0
 * @description: 具体装饰器
 * @date 2024/8/27 19:24
 */
public class VanillaCoffee extends CoffeeDecorator{
    public VanillaCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", 香草";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

}
