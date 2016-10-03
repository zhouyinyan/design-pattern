package com.zyy.learn.design.command;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public class SimpleRemoteControl {

    Command onSlot;
    Command offSlot;

    Command undoCommand;

    Command microCommand;

    public void setOnSlotCommand(Command command){
        onSlot = command;
    }

    public void setOffSlotCommand(Command command){
        offSlot = command;
    }

    public void setMicroCommand(Command microCommand){
        this.microCommand = microCommand;
    }

    public void onParttyButtonPressed(){
        microCommand.execute();
        undoCommand = microCommand;
    }

    public void onButtonPressed(){
        onSlot.execute();
        undoCommand = onSlot;
    }

    public void offButtonPressed(){
        offSlot.execute();
        undoCommand = offSlot;
    }

    public void undoButtonPressed(){
        if(undoCommand == null ){
            undoCommand = new NoCommand();
        }
        undoCommand.undo();
    }

}
