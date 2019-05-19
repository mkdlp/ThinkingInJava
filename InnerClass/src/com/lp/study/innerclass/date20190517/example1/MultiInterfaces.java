package com.lp.study.innerclass.date20190517.example1;

/**
 * @author mkdlp
 * 本例展示的是实现多接口的途径：
 * 1.直接implements多个接口，即单一类
 * 2.implements一部分接口加上内部类
 */
public class MultiInterfaces {
    static void takesA(A a){}
    static void takesB(B b){}

    public static void main(String[] args) {
        X x=new X();
        Y y=new Y();
        takesA(x);
        takesB(x);
        takesA(y);
        takesB(y.makeB());
    }
}
