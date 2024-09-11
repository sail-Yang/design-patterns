package com.sailyang;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yangfan
 * @version 1.0
 * @description: TODO
 * @date 2024/9/11 19:34
 */
public class SingleHuangNiuHandle implements InvocationHandler {
    private Object proxyTarget;

    public Object getProxyInstance(Object target) {
        this.proxyTarget = target;
        return Proxy.newProxyInstance(proxyTarget.getClass().getClassLoader(), proxyTarget.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object methodObject = null;

        if(method.getName().startsWith("look")){
            System.out.println("line up");
            methodObject = method.invoke(proxyTarget, args);
        }else{
            methodObject = method.invoke(proxyTarget, args);
        }
        return methodObject;
    }
}
