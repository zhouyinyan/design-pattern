package com.zyy.learn.design.decorator.size;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public class GrandeSize implements SizeInterface {
    @Override
    public Enum getSize() {
        return SizeEnum.GRANDE;
    }
}
