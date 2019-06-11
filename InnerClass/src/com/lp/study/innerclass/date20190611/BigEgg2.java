package com.lp.study.innerclass.date20190611;

/**
 * 通过这样的方式可以覆盖内部类里面的方法
 */
public class BigEgg2 extends Egg2 {
    public class Yolk extends Egg2.Yolk{
        public Yolk(){
            System.out.println("BigEgg2.Yolk()");
        }
        public void f(){
            System.out.println("BigEgg2.Yolk.f()");
        }
    }

    public BigEgg2(){
        System.out.println("new BigEgg2");
        insertYolk(new Yolk());
    }

    public static void main(String[] args) {
        Egg2 e2=new BigEgg2();
        //Egg2 e2=new Egg2();
        e2.g();
    }
}
