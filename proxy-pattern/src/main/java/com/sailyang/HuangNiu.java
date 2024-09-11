package com.sailyang;

/**
 * @author yangfan
 * @version 1.0
 * @description: 黄牛-静态代理
 * @date 2024/9/11 19:17
 */
public class HuangNiu implements Human{
    private Me me;

    public HuangNiu(){
        me = new Me();
    }


    @Override
    public void eat() {
        System.out.println("HuangNiu can eat");
    }

    @Override
    public void sleep() {
        System.out.println("HuangNiu can sleep");
    }

    @Override
    public void lookConcert() {
        //黄牛可以排队
        this.lineup();
        me.lookConcert();
    }

    public void lineup() {
        System.out.println("line up ...");
    }
}
