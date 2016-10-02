package com.zyy.learn.design.decorator.size;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public interface SizeInterface {

    public Enum getSize();

    enum SizeEnum{
        TALL,GRANDE,VENTI;
    }
}
