package com.mkdlp.typeinfo.date20190728;

/**
 * @author mkdlp
 */
interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy{
    Toy(){}
    Toy(int i){}
}

class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots{
    FancyToy(){
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc){
        System.out.println("Class name: "+cc.getName());
        System.out.println("is interface: "+cc.isInterface());
        System.out.println("Simple name: "+cc.getSimpleName());
        System.out.println("Canonical name: "+cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c=null;
        try {
            c=Class.forName("com.mkdlp.typeinfo.date20190728.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for(Class face:c.getInterfaces()){
            printInfo(face);
        }
        Class up=c.getSuperclass();
        Object obj=new Object();
        try {
            obj=up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("can not instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("can not access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
