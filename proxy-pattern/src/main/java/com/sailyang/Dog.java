package com.sailyang;

/**
 * @author yangfan
 * @version 1.0
 * @description: TODO
 * @date 2024/9/11 19:29
 */
public class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("Dog can eat");
    }

    @Override
    public void sleep() {
        System.out.println("Dog can sleep");
    }

    @Override
    public void lookDoctor() {
        System.out.println("Dog need to watch Doctor");
    }
}
