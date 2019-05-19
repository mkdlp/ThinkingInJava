package com.lp.study.innerclass.date20190520;

public class Callee2 extends MyIncrementable {
    private int i=0;
    public void increment(){
        super.increment();
        i++;
        System.out.println(i);
    }
    private class Closure implements Incrementable{
        @Override
        public void incrementable() {
            Callee2.this.increment();
        }
    }
    Incrementable getCallbackReference(){
        return new Closure();
    }
}
