package com.lp.study.innerclass.date20190612;

/**
 * @author mkdlp
 * 局部内部类和匿名内部类的区别：
 * 局部内部类可以有命名的构造器，可以重载构造器，而匿名内部类只能用来初始化实例.
 * 当你需要不止一个该内部类的对象时也可以使用局部内部类。
 */
public class LocalInnerClass {
    private int count=0;
    Counter getCounter(final String name){
        class LocalCounter implements Counter{
            public LocalCounter(){
                System.out.println("LocalCounter");
            }
            public int next(){
                System.out.println(name);
                return count++;
            }
        }
        return new LocalCounter();
    }

    Counter getCounter2(final String name){
        return new Counter(){
            {
                System.out.println("Counter()");
            }
            public int next(){
                System.out.println(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic=new LocalInnerClass();
        Counter c1=lic.getCounter("Local counter");
        Counter c2=lic.getCounter2("Anonymous counter");
        for (int i=0;i<5;i++){
            System.out.print(c1.next());
        }
        for (int i=0;i<5;i++){
            System.out.print(c2.next());
        }
    }
}
