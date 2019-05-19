package com.lp.study.innerclass.date20190516;

/**
 * @author mkdlp
 * 接口内部的类
 *
 */
public interface ClassInInterface {
    void howdy();
    //这种内部类可以用来放置公告代码,使得他们可以被某个接口的所有不同实现类所共用
    class Test implements ClassInInterface{
        @Override
        public void howdy() {
            System.out.println("Howdy");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
