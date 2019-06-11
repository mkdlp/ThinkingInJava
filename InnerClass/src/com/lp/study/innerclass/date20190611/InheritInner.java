package com.lp.study.innerclass.date20190611;

/**
 * 这里是继承内部类的语法
 */
public class InheritInner extends WithInner.Inner{
    InheritInner(WithInner wi){
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi=new WithInner();
        InheritInner ii=new InheritInner(wi);
    }
}
