package com.lp.study.innerclass.date20190514;

public class Factories {
    public static void serviceConsumer(ServiceFactory fact){
        Service s=fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(ServiceImpl1.factory);
        serviceConsumer(ServiceImpl2.factory);
    }
}
