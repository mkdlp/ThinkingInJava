package com.lp.study.innerclass.date20190509;

/**
 * 内部类联系2
 * @author mkdlp
 */
public class InnerClass2 {
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

    public Destination to(String s){
        return new Destination(s);
    }

    public Contents contents(){
        return new Contents();
    }
    public void ship(String dest){
        Contents c=new Contents();
        Destination d=to(dest);
        System.out.println(d.readLabel());
    }
    public static void main(String[] args){
        InnerClass2 i=new InnerClass2();
        i.ship("mkdlp");
        InnerClass2 i2=new InnerClass2();
        Contents c=i2.contents();
        Destination d=i2.to("lp");
    }
}
