package com.zyy.learn.design.proxy.IconWithState;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhouyinyan on 16/10/5.
 */
public class ImageNotLoadedState implements State {
    IconProxy context;

    public ImageNotLoadedState(IconProxy context) {
        this.context = context;
    }

    @Override
    public int getWidth() {
        return 800;
    }

    @Override
    public int getHeight() {
        return 800;
    }

    @Override
    public void printIcon() {
        System.out.println("----真实对象准备中---");
        Thread createIconThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(5);
                    context.setRealSubject(new ImageIcon(500,300));
                    context.setState(context.getLoaded());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        createIconThread.start();
    }
}
