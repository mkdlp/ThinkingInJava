package com.lp.study.innerclass.date20190514;

import com.lp.study.innerclass.date20190510.Contents;
import com.lp.study.innerclass.date20190510.Destination;
import sun.security.krb5.internal.crypto.Des;

/**
 * @author mkdlp
 * 总结：嵌套类其实就是static的内部类
 * 他于普通内部类的不同：
 * 1.普通内部类隐式的保存着一个引用指向它的外围类对象，而嵌套类则不是这样
 * 2.要创建嵌套类的对象并不需要外围类的对象
 * 3.不能从嵌套类的对象中访问非静态的外围类对象
 * 4.普通内部类的字段和方法只能放在类的外部层次上，所以普通的内部类不能有
 * static数据和static字段，也不能包含嵌套类，但是嵌套类可以包含所有这些东西
 *
 */
public class Pracel11 {
    private static class ParcelContents implements Contents{
        private int i=11;
        public int value(){
            return i;
        }
    }

    protected static class ParcelDestination implements Destination{
        private String label;
        private ParcelDestination(String whereTo){
            label=whereTo;
        }

        public static void f(){

        }

        static int x=10;

        static class AnotherLevel{
            public static void f(){}
            static int x=10;
        }

        @Override
        public String readLaber() {
            return label;
        }
    }

    public static Destination destination(String s){
        return new ParcelDestination(s);
    }

    public static Contents contents(){
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents c=contents();
        Destination d=destination("mkdlp");
    }
}
