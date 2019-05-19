package com.lp.study.innerclass.date20190516;

public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna=new MNA();
        MNA.A mnaa=mna.new A();
        MNA.A.B mnaab=mnaa.new B();
        mnaab.h();
    }
}
