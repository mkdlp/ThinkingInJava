package com.lp.study.collection.date20190617;

public class Apple {
    private static long counter;
    private final long id = counter++;
    public long id(){
        return id;
    }

}
