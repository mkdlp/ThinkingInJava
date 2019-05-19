package com.lp.study.innerclass.date20190517.example2;

/**
 * @author mkdlp
 * 如果是多继承的话就只能内部类可以实现了。
 * 使用内部类可以获得的特性：
 * 1.内部类可以有多个实例，每个实例都有自己的状态信息，并且与其外围类对象的信息相互独立。
 * 2.在单个外围类中，可以让多个内部类以不同的方式实现同一个接口，或继承同一个类。
 * 3.创建内部类的时刻并不依赖于外围类对象的创建
 * 4.内部类没有“is-a”关系；他就是一个独立的实体
 *
 */
public class MutileImplementation {
    static void takesD(D d){}
    static void takesE(E e){}

    public static void main(String[] args) {
        Z z=new Z();
        takesD(z);
        takesE(z.makeE());
    }
}
