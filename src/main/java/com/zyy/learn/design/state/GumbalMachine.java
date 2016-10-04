package com.zyy.learn.design.state;

/**
 * Created by zhouyinyan on 16/10/4.
 */
public class GumbalMachine {

    private static int SOLD_OUT = 0;
    private static int NO_QUARTER = 1;
    private static int HAS_QUARTER = 2;
    private static int SOLD = 3;

    private int count = 0;
    private int state = SOLD_OUT;

    GumbalMachine(int count){
        this.count = count;
        if(count > 0){
            state = NO_QUARTER;
        }
    }

    public void insertQuarter(){
        if(state == SOLD_OUT){
            System.out.println("--已经卖完--");
        }else if(state == NO_QUARTER){
            state = HAS_QUARTER;
            System.out.println("--投入硬币--");
        }else if(state == HAS_QUARTER){
            System.out.println("--已经投入硬币，不需要再投入--");
        }else if(state == SOLD){
            System.out.println("--正在出货，请稍后--");
        }
    }

    public void ejectQuarter(){
        if(state == SOLD_OUT){
            System.out.println("--已经卖完--");
        }else if(state == NO_QUARTER){
            System.out.println("--不能推钱，还没有投入--");
        }else if(state == HAS_QUARTER){
            state = NO_QUARTER;
            System.out.println("--退钱成功--");
        }else if(state == SOLD){
            System.out.println("--正在出货，不能退钱--");
        }
    }

    public void turnCrank(){
        if(state == SOLD_OUT){
            System.out.println("--已经卖完--");
        }else if(state == NO_QUARTER){
            System.out.println("--没有投钱，不会出货--");
        }else if(state == HAS_QUARTER){
            state = SOLD;
            System.out.println("--转动了曲柄，正在出货--");
            dispence();
        }else if(state == SOLD){
            System.out.println("--正在出货，不需要在吃转动--");
        }
    }

    private void dispence(){
        if(state == SOLD_OUT){
            System.out.println("--已经卖完--");
        }else if(state == NO_QUARTER){
            System.out.println("--没有投钱，不会出货--");
        }else if(state == HAS_QUARTER){
            System.out.println("--不会发生--");
        }else if(state == SOLD){
            System.out.println("--机器正释放一个--");
            count--;
            if(count == 0){
                System.out.println("--买完--");
                state = SOLD_OUT;
            }else{
                state = NO_QUARTER;
            }
            System.out.println("--获得一个糖果--");

        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GumbalMachine{");
        sb.append("count=").append(count);
        sb.append(", state=").append(state);
        sb.append('}');
        return sb.toString();
    }
}
