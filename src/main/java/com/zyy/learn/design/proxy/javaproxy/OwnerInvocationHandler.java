package com.zyy.learn.design.proxy.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zhouyinyan on 16/10/5.
 */
public class OwnerInvocationHandler implements InvocationHandler {

    PersonBean personBean;

    public OwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equalsIgnoreCase("setRating")){
            throw new IllegalAccessException();
        }
        return method.invoke(personBean, args);
    }

    public PersonBean getOwnerProxy() {

        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                                    personBean.getClass().getInterfaces(),
                                        this);
    }
}
