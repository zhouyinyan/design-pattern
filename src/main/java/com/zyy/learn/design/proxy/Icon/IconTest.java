package com.zyy.learn.design.proxy.Icon;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhouyinyan on 16/10/5.
 */
public class IconTest {

    public static void main(String[] args) throws InterruptedException {
        Icon icon = new IconProxy();
        icon.printIcon();

        TimeUnit.SECONDS.sleep(1);
        icon.printIcon();
        TimeUnit.SECONDS.sleep(1);
        icon.printIcon();
        TimeUnit.SECONDS.sleep(1);
        icon.printIcon();
        TimeUnit.SECONDS.sleep(1);
        icon.printIcon();
        TimeUnit.SECONDS.sleep(1);
        icon.printIcon();
    }
}
