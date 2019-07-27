package com.mkdlp.javastring.date20190727;

/**
 * @author mkdlp
 * 比较String"+","+="和StringBuilder
 * 在java中并不允许程序员重载操作符，用于String的"+"和"+="是仅有的被重载过的操作符。
 * 在使用"+"和"+="的时候java会自动创建StringBuilder对象来优化性能，但是这种优化是不彻底的
 * 在如下的代码中，implicit()会多次创建新的StringBuilder对象（循环一次创建一个）,
 * 而在使用StringBuilder的explicit()中，StringBuilder仅仅被创建了一次,
 * StringBuilder还可以预先指定字符串的大小，避免多次分配缓存（前提你知道字符串的大小）
 * 如果是这样使用的话也会创建多余的StringBuilder对象：
 * append(a+":"+b);编译器在处理(a+":"+b)的时候会自动创建一个StringBuilder
 */
public class WhitherStringBuilder {
    public String implicit(String[] fields){
        String result="";
        for(int i=0;i<fields.length;i++){
            result+=fields[i];
        }
        return result;
    }

    public String explicit(String[] fields){
        StringBuilder result=new StringBuilder();
        for(int i=0;i<fields.length;i++){
            result.append(fields[i]);
        }
        return result.toString();
    }
}
