package com.lp.study.innerclass.date20190611;

public class Egg {
    private Yolk y;
    protected class Yolk{
        public Yolk(){
            System.out.println("Egg.yolk");
        }
    }
    public Egg(){
        System.out.println("New Egg()");
        y=new Yolk();
    }
}
