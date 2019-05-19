package com.lp.study.innerclass.date20190513;

import com.lp.study.innerclass.date20190510.Destination;

/**
 * 在匿名内部类中定义字段的时候，还能够对其进行初始化操作
 */
public class Pracel9 {
    public Destination destination(String dest){
        return new Destination(){
          private String label=dest;
          public String readLaber(){
              System.out.println(label);
              return label;
          }
        };
    }

    public static void main(String[] args) {
        Pracel9 p=new Pracel9();
        Destination d=p.destination("mkdlp");
        d.readLaber();
    }
}
