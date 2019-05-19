package com.lp.study.innerclass.date20190520;

public class MyIncrementable {
    public void increment(){
        System.out.println("Other operation");
    }

    static void f(MyIncrementable i){
        i.increment();
    }
}
