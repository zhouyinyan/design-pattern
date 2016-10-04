package com.zyy.learn.design.iterator.composite;

import java.util.Iterator;

/**
 * Created by zhouyinyan on 16/10/4.
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
