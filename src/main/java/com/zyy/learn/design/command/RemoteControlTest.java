package com.zyy.learn.design.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhouyinyan on 16/10/3.
 */
public class RemoteControlTest {

    public static void main(String[] args){
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        simpleRemoteControl.setOnSlotCommand(new LightOnCommand(light));
        simpleRemoteControl.setOffSlotCommand(new LigthOffCommand(light));
        simpleRemoteControl.onButtonPressed();
        simpleRemoteControl.undoButtonPressed();
        simpleRemoteControl.offButtonPressed();
        simpleRemoteControl.undoButtonPressed();

        System.out.println("=========");

        List<Command> commands = new ArrayList<>();
        commands.add(new LightOnCommand(light));
        commands.add(new LigthOffCommand(light));
        simpleRemoteControl.setMicroCommand(new MicroCommand(commands));
        simpleRemoteControl.onParttyButtonPressed();
        simpleRemoteControl.undoButtonPressed();



    }
}
