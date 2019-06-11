package com.lp.study.innerclass.date20190611;

/**
 * @author mkdlp
 * 本例用来试验了内部类能不能被覆盖，这两个内部类相互独立，各自在各自的命名空间里，但是明确的继承某个内部类是可以的。
 */
public class BigEgg extends Egg{
    public class Yolk{
        public Yolk(){
            System.out.println("BigEgg.yolk");
        }
    }

    public static void main(String[] args) {
        new BigEgg();
    }
}
