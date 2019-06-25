package com.lp.study.collection.date20190626;

import com.lp.study.collection.date20190620.pets.Pet;
import com.lp.study.collection.date20190620.pets.Pets;

import java.util.Iterator;
import java.util.List;

/**
 * @author mkdlp 使用iterator
 * 1.Iterator只能单向移动。
 * 2.使用方法iterator()要求容器返回一个Iterator。
 * 3.使用next()获得序列的下一个元素。
 * 4.使用hasNext()检查序列中是否还有元素。
 * 5.使用remove()将迭代器新进返回的元素删除。
 */
public class SimpleIteration {
    public static void main(String[] args) {
        List<Pet> pets= Pets.arrayList(12);
        Iterator<Pet> it=pets.iterator();
        while(it.hasNext()){
            Pet p=it.next();
            System.out.print(p.id()+":"+p+" ");
        }
        System.out.println();
        for(Pet p:pets){
            System.out.print(p.id()+":"+p+" ");
        }
        it=pets.iterator();
        for(int i=0;i<6;i++){
            it.next();
            it.remove();
        }
        System.out.println(pets);
    }
}
