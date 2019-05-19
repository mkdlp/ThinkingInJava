package com.lp.study.innerclass.date20190509;

/**
 * 内部类练习1
 * @author mkdlp
 */
public class InnerClass1 {

    class Contents{
        private int i=11;
        public int value(){
            return i;
        }
    }

    class Destination{
        private String label;
        Destination(String whereTo){
            label=whereTo;
        }
        String readLabel(){
            return label;
        }
    }
    public void ship(String dest){
        Contents c=new Contents();
        Destination d=new Destination(dest);
        System.out.println(d.readLabel());
    }
    public static void main(String[] args){
        InnerClass1 i=new InnerClass1();
        i.ship("mkdlp");
    }
}
