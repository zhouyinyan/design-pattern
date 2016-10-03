package com.zyy.learn.design.command;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        //do nothing
    }

    @Override
    public void undo() {

    }

}
