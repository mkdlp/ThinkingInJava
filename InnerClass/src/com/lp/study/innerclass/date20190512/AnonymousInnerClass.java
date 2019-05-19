package com.lp.study.innerclass.date20190512;

import com.lp.study.innerclass.date20190510.Contents;

/**
 * 匿名内部类
 * @author mkdlp
 */
public class AnonymousInnerClass {
    public Contents contens(){
        return new Contents() {

            private int i=11;

            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        AnonymousInnerClass ac=new AnonymousInnerClass();
        Contents c=ac.contens();
    }
}
