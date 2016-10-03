package com.zyy.learn.design.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public class MicroCommand implements Command {

    List<Command> commands = new ArrayList<>();

    public MicroCommand(List<Command> commands){
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(Command command : commands){
            command.execute();
        }
    }

    @Override
    public void undo() {
        for(Command command : commands){
            command.undo();
        }
    }
}
