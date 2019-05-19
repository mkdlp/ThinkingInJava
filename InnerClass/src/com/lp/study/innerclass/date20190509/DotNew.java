package com.lp.study.innerclass.date20190509;

/**
 * 总结：
 * 1.静态内部类可以有静态成员(方法，属性)，而非静态内部类则不能有静态成员(方法，属性)。
 * 2.静态内部类只能够访问外部类的静态成员,而非静态内部类则可以访问外部类的所有成员(方法，属性)。
 * 3.实例化一个非静态的内部类的方法：
 *  a.先生成一个外部类对象实例
 *  OutClassTest oc1 = new OutClassTest();
 *  b.通过外部类的对象实例生成内部类对象
 *  OutClassTest.InnerClass no_static_inner = oc1.new InnerClass();
 *  4.实例化一个静态内部类的方法：
 *  a.不依赖于外部类的实例,直接实例化内部类对象
 *  OutClassTest.InnerStaticClass inner = new OutClassTest.InnerStaticClass();
 *  b.调用内部静态类的方法或静态变量,通过类名直接调用
 *  OutClassTest.InnerStaticClass.static_value
 *  OutClassTest.InnerStaticClass.getMessage()
 */
public class DotNew {

    private String outName="outName";

    private static String staticOutName="outName";

    public  class Inner{

    }

    public static class StaticInner{

        //只有在静态内部类里面才能声明和定义静态变量
        public static String name="mkdlp";

        public void name(){
            System.out.println(name);

            //静态内部类不能访问外部类的非静态变量
            //System.out.println(outName);

            System.out.println(staticOutName);
        }
    }

    public Inner getInner(){
        return new Inner();
    }
    public static void main(String[] args) {
        DotNew dn=new DotNew();
        DotNew.Inner dni=dn.new Inner();
        //要么在外围类中定义一个方法返回内部类，要么使用 外围类.new 内部类;来获得内部类
        DotNew.Inner inner=dn.new Inner();
        DotNew.Inner inner1=dn.getInner();

        //静态内部类可以直接获取
        DotNew.StaticInner si=new DotNew.StaticInner();
        //访问静态内部类的静态变量
        System.out.println(StaticInner.name);
        si.name();

    }
}
