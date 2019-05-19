package com.lp.study.innerclass.date20190513;

/**
 * 带参的内部类
 */
public class Pracel8 {
    public Wrapping wrapping(int x){
        return new Wrapping(x){
            public int value(){
                return super.value();
            }
        };
    }

    public static void main(String[] args) {
        Pracel8 p=new Pracel8();
        Wrapping w=p.wrapping(10);
    }
}
