package com.lp.study.innerclass.date20190513;

/**
 * 匿名内部类的缺陷：与继承相比有些受限，它既可以扩展类，也可以实现接口，但是不能两者兼备。而且如果是实现接口，也只能实现一个类。
 */
abstract  class Base{
    public Base(int i){
        System.out.println("Base constructor,i="+i);
    }

    public abstract void f();
}

//因为内部类没有名称所以没有构造器，通过实例初始化就能达到为匿名构造器创建一个构造器的效果
public class AnonymousConstructor {
    public static Base getBase(int i){
        return new Base(i){
            {
                //在这里初始化
                System.out.println("Inside instance initiallizer");
            }
            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base=getBase(47);
        base.f();
    }
}
