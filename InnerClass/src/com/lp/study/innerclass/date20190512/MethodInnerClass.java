package com.lp.study.innerclass.date20190512;

import com.lp.study.innerclass.date20190510.Destination;

/**
 * 定义在方法里面的内部类
 * @author mkdlp
 */
public class MethodInnerClass {
    public Destination destination(String s){
        /**
         * 只能在destination 方法内访问PDestination，但是并不意味着
         * destination方法完毕内部类PDestination就不可用了
         */
        class PDestination implements Destination{

            private String label;

            private PDestination(String whereTo){
                label=whereTo;
            }

            @Override
            public String readLaber() {
                return label;
            }
        }
        System.out.println(s);
        return new PDestination(s);
    }

    public static void main(String[] args) {
        MethodInnerClass mc=new MethodInnerClass();
        Destination d=mc.destination("MKDLP");
    }
}
