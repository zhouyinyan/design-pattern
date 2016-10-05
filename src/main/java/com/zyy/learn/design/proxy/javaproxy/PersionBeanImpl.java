package com.zyy.learn.design.proxy.javaproxy;

/**
 * Created by zhouyinyan on 16/10/5.
 */
public class PersionBeanImpl implements PersonBean {

    private String name;
    private int rating;
    private int ratingCount;



    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHotorNotRating() {
        return ratingCount == 0 ? 0 : rating/ratingCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setRating(int rating) {
        this.rating += rating;
        this.ratingCount++;
    }
}
