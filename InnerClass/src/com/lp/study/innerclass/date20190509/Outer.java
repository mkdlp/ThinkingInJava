package com.lp.study.innerclass.date20190509;

public class Outer {
    class Inner{
        private String name;
        public String name(String name){
            System.out.println("name:"+name);
            return name;
        }
    }

    public Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        //Inner inner=new Inner();直接new内部类会报错
        InnerClass1 i1=new InnerClass1();//直接new其他的类不会报错
        Outer out=new Outer();
        Outer.Inner inner=out.getInner();
        inner.name("MKDLP");
    }
}
