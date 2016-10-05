package com.zyy.learn.design.proxy.Icon;

/**
 * Created by zhouyinyan on 16/10/5.
 */
public class ImageIcon implements Icon {

    int width;

    int height;

    public ImageIcon(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void printIcon() {
        System.out.println("----真实图片打印输出-----");
    }
}
