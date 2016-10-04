package com.zyy.learn.design.iterator.composite;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by zhouyinyan on 16/10/4.
 */
public class ComponentIterator implements Iterator {
    Stack<Iterator> stack = new Stack<>();

    public ComponentIterator(Iterator<MenuComponet> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.isEmpty()){
            return false;
        }else{
            Iterator iter = stack.peek();
            if(!iter.hasNext()){
                stack.pop();
                return hasNext();
            }else{
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if(hasNext()){
            MenuComponet menuComponet = (MenuComponet) stack.peek().next();
            if(menuComponet instanceof Menu){
                stack.push(menuComponet.createIterator());
            }
            return menuComponet;
        }else {
            return null;
        }
    }
}
