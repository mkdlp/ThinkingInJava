package com.lp.study.innerclass.date20190512;

/**
 * 定义在任意作用域的内部类
 */
public class SomeWhereInnerClass {
    private void internalTracking(boolean b){
        //这里的IF并不是说内部类的创建是有条件的，他和别的类是一起编译过的，
        // 他除了在别的作用域不可用其他和别的类是一样的
        if(b){
            class TrackingShip{
                private String id;
                TrackingShip(String s){
                    id=s;
                }
                String getSlip(){
                    return id;
                }
            }
            TrackingShip ts=new TrackingShip("mkdlp");
            String s=ts.getSlip();
        }
        //在作用域外就不可使用了
        //TrackingShip ts=new TrackingShip("mkdlp");
    }

    public void track(){
        internalTracking(true);
    }

    public static void main(String[] args) {
        SomeWhereInnerClass si=new SomeWhereInnerClass();
        si.track();
    }
}
