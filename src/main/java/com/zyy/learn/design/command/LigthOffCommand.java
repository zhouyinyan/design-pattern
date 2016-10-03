package com.zyy.learn.design.command;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public class LigthOffCommand implements Command {
    Light light;

    public LigthOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
