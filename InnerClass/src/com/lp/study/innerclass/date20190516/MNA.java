package com.lp.study.innerclass.date20190516;

/**
 * @author mkdlp
 * 从多层嵌套类中访问外部类的成员
 * 一个类被嵌套多少层并不重要，他能透明的访问所有它嵌入的外围类的所有成员
 */
public class MNA {
    private void f(){
        System.out.println("f");
    }
    class A{
        private void g(){
            System.out.println("g");
        }
        public class B{
            void h(){
                g();
                f();
            }
        }
    }
}
