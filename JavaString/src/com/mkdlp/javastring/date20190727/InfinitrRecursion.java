package com.mkdlp.javastring.date20190727;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mkdlp
 * 使用toString方法打印变量的内存地址
 *
 */
public class InfinitrRecursion {
    @Override
    public String toString() {
//        return " InfiniteRecursion address: "+this+"\n";//这样会会发生自动类型装换产生递归调用会一直报错
        return " InfiniteRecursion address: "+super.toString()+"\n";//这种方法是可行的
    }

    public static void main(String[] args) {
        List<InfinitrRecursion> v=new ArrayList<>();
        for(int i=0;i<10;i++){
            v.add(new InfinitrRecursion());
        }
        System.out.println(v);
    }
}
