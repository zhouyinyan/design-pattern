package com.zyy.learn.design.observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public class SwingObserverExample {

    JFrame jFrame ;

    public static void main(String[] args) throws InterruptedException {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() throws InterruptedException {
        jFrame = new JFrame();

        JButton jButton = new JButton("should i do it?");
        jButton.addActionListener(new AngelListener());
        jButton.addActionListener(new DevilListener());

        jFrame.getContentPane().add(BorderLayout.CENTER, jButton);

        TimeUnit.SECONDS.sleep(60);
    }

    class AngelListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("dont do it !");
        }
    }

    class DevilListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("come on, do it");
        }
    }

}
