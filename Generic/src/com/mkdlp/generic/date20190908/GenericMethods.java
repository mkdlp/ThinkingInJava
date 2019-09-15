package com.mkdlp.generic.date20190908;

public class GenericMethods {
    public <T> void f(T x){
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm=new GenericMethods();
        gm.f(1);
        gm.f(2.0);
        gm.f("");
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
    }
}
