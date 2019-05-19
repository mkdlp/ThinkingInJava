package com.lp.study.innerclass.date20190514;

public class ServiceImpl1 implements Service{
    private ServiceImpl1(){

    }

    @Override
    public void method1() {
        System.out.println("impl1 method1");

    }

    @Override
    public void method2() {
        System.out.println("impl1 method2");
    }

    public static ServiceFactory factory=new ServiceFactory() {
        @Override
        public Service getService() {
            return new ServiceImpl1();
        }
    };
}
