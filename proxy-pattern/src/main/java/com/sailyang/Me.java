package com.sailyang;

/**
 * @author yangfan
 * @version 1.0
 * @description: TODO
 * @date 2024/9/11 19:16
 */
public class Me implements Human{
    @Override
    public void eat() {
        System.out.println("eat food ...");
    }

    @Override
    public void sleep() {
        System.out.println("I can sleep");
    }

    @Override
    public void lookConcert() {
        System.out.println("I can Listen to concert");
    }
}
