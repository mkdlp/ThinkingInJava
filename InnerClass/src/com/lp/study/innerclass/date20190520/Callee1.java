package com.lp.study.innerclass.date20190520;

public class Callee1 implements Incrementable {

    private int i=0;

    @Override
    public void incrementable() {
        i++;
        System.out.println(i);
    }
}
