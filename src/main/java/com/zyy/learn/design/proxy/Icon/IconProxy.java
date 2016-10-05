package com.zyy.learn.design.proxy.Icon;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhouyinyan on 16/10/5.
 */
public class IconProxy implements Icon {

    Icon realSubject;

    @Override
    public int getWidth() {
        if(realSubject != null){
            return realSubject.getWidth();
        }else {
            return 800;
        }
    }

    @Override
    public int getHeight() {
        if(realSubject != null){
            return realSubject.getWidth();
        }else {
            return 800;
        }
    }

    @Override
    public void printIcon() {
        if(realSubject != null){
            realSubject.printIcon();
        }else {
            System.out.println("----真实对象准备中---");
            Thread createIconThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        TimeUnit.SECONDS.sleep(5);
                        realSubject = new ImageIcon(500,300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            createIconThread.start();

        }
    }
}
