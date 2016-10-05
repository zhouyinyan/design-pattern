package com.zyy.learn.design.proxy.IconWithState;

/**
 * Created by zhouyinyan on 16/10/5.
 */
public class IconProxy implements Icon {

    State loaded;
    State notLoaded;
    State state;
    Icon realSubject;

    public IconProxy() {
        loaded = new ImageLoadedState( this);
        notLoaded = new ImageNotLoadedState( this);
        state = notLoaded;
    }

    public State getLoaded() {
        return loaded;
    }

    public void setLoaded(State loaded) {
        this.loaded = loaded;
    }

    public State getNotLoaded() {
        return notLoaded;
    }

    public void setNotLoaded(State notLoaded) {
        this.notLoaded = notLoaded;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Icon getRealSubject() {
        return realSubject;
    }

    public void setRealSubject(Icon realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public int getWidth() {
        return state.getWidth();
    }

    @Override
    public int getHeight() {
       return state.getHeight();
    }

    @Override
    public void printIcon() {
        state.printIcon();
    }
}
