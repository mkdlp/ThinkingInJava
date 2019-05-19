package com.lp.study.innerclass.date20190514;

public class ServiceImpl2 implements Service{
    private ServiceImpl2(){

    }

    @Override
    public void method1() {
        System.out.println("impl2 method1");

    }

    @Override
    public void method2() {
        System.out.println("impl2 method2");
    }

    public static ServiceFactory factory=new ServiceFactory() {
        @Override
        public Service getService() {
            return new ServiceImpl2();
        }
    };
}
