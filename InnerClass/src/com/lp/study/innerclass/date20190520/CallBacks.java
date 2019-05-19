package com.lp.study.innerclass.date20190520;

public class CallBacks {
    public static void main(String[] args) {
        Callee1 c1=new Callee1();
        Callee2 c2=new Callee2();
        MyIncrementable.f(c2);
        Caller caller1=new Caller(c1);
        Caller caller2=new Caller(c2.getCallbackReference());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
    }
}
