package com.lp.study.innerclass.date20190509;

public class DotThis {
    void f(){
        System.out.println("mkdlp");
    }
    public class inner{
        public DotThis outer(){
            //在内部类里面获得外围类对象
            return DotThis.this;
        }
    }
    public inner inner(){
        return new inner();
    }

    public static void main(String[] args) {
        DotThis dt=new DotThis();
        DotThis.inner dti=dt.inner();
        dti.outer().f();
    }
}
