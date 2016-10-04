package com.zyy.learn.design.iterator;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public class MenuIteam {

    private String name;
    private String discription;
    private boolean vegetarian;
    private double price;

    public MenuIteam(String name, String discription, boolean vegetarian, double price) {
        this.name = name;
        this.discription = discription;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MenuIteam{");
        sb.append("name='").append(name).append('\'');
        sb.append(", discription='").append(discription).append('\'');
        sb.append(", vegetarian=").append(vegetarian);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
