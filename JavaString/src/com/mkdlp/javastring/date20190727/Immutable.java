package com.mkdlp.javastring.date20190727;

/**
 * @author mkdlp
 * String 对象是不可变的，修改String的方法都是新建了一个String 对象
 */
public class Immutable {
    public static String upcase(String s){
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q="howdy";
        System.out.println(q);
        String qq=upcase(q);
        System.out.println(qq);
        System.out.println(q);
    }
}
