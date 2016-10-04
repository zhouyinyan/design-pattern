package com.zyy.learn.design.state.state;

/**
 * Created by zhouyinyan on 16/10/4.
 */
public class GumbalMachine {

    private State state ;

    private State soldOut ;
    private State noQuarter ;
    private State hasQuarter ;
    private State sold ;
    private State winner;

    public State getState() {
        return state;
    }

    public State getSoldOut() {
        return soldOut;
    }

    public State getNoQuarter() {
        return noQuarter;
    }

    public State getHasQuarter() {
        return hasQuarter;
    }

    public State getSold() {
        return sold;
    }

    public State getWinner(){
        return winner;
    }

    private int count = 0;

    public int getCount(){
        return this.count;
    }

    public GumbalMachine(int count){
        this.count = count;

        soldOut = new SoldOutState(this);
        noQuarter = new NoQuarterState(this);
        hasQuarter = new HasQuarterState(this);
        sold = new SoldState(this);
        winner = new WinerState(this);

        if(count > 0){
            state = noQuarter;
        }else{
            state = soldOut;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        dispence();
    }

    private void dispence(){
        state.dispence();
    }

    public void setState(State state){
        this.state = state;
    }

    public void releaseBall(){
        System.out.println("--机器正释放一个--");
        if(count != 0) {
            count--;
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
