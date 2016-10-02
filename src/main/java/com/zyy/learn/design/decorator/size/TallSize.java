package com.zyy.learn.design.decorator.size;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public class TallSize implements SizeInterface{
    @Override
    public Enum getSize() {
        return SizeEnum.TALL;
    }
}
