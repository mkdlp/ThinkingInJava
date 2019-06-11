package com.lp.study.innerclass.date20190530;

public abstract class Event {

    private long eventTime;

    protected final long delayTime;

    public Event(Long delayTime){
        this.delayTime=delayTime;
        start();
    }

    public void start(){
        eventTime=System.nanoTime()+delayTime;
    }

    public boolean ready(){
        return System.nanoTime() >=eventTime;
    }

    public abstract void action();
}
