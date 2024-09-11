package com.sailyang;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yangfan
 * @version 1.0
 * @description: 基于接口的动态代理，动态获取抽象接口的类型
 * @date 2024/9/11 19:23
 */
public class HuangNiuHandle implements InvocationHandler {
    private Object proxyTarget;

    public Object getProxyInstance(Object target) {
        this.proxyTarget = target;
        return Proxy.newProxyInstance(proxyTarget.getClass().getClassLoader(), proxyTarget.getClass().getInterfaces(), this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object methodObject = null;
        System.out.println("line up");
        methodObject = method.invoke(proxyTarget, args);
        System.out.println("go home and sleep");
        return methodObject;
    }
}
