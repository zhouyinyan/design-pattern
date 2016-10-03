package com.zyy.learn.design.command;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public interface Command {

    public void execute();

    public void undo();
}
