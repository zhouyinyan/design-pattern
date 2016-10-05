package com.zyy.learn.design.proxy.javaproxy;

/**
 * Created by zhouyinyan on 16/10/5.
 */
public class PersonTest {
    public static void main(String[] args){
        PersonBean personBean = new PersionBeanImpl();
        PersonBean proxyPerson = new OwnerInvocationHandler(personBean).getOwnerProxy();
        proxyPerson.setName("name");
        System.out.println(proxyPerson.getName());
        System.out.println(proxyPerson.getHotorNotRating());

        try {
            proxyPerson.setRating(55);
        } catch (Exception e) {
            System.out.println("自己不能调用setRating方法给自己评分");
        }
    }
}
