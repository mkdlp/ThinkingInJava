package com.lp.study.innerclass.date20190520;

public class Caller {
    private Incrementable callbackReference;

    Caller(Incrementable cdn){
        callbackReference=cdn;
    }

    void go(){
        callbackReference.incrementable();
    }
}
