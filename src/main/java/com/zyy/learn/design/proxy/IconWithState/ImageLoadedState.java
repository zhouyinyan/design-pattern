package com.zyy.learn.design.proxy.IconWithState;

/**
 * Created by zhouyinyan on 16/10/5.
 */
public class ImageLoadedState implements State {
    IconProxy context;

    public ImageLoadedState(IconProxy context) {
        this.context = context;
    }

    @Override
    public int getWidth() {
        return context.getRealSubject().getWidth();
    }

    @Override
    public int getHeight() {
        return context.getRealSubject().getHeight();
    }

    @Override
    public void printIcon() {
        context.getRealSubject().printIcon();
    }
}
