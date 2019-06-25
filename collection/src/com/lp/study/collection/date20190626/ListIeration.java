package com.lp.study.collection.date20190626;

import com.lp.study.collection.date20190620.pets.Pet;
import com.lp.study.collection.date20190620.pets.Pets;

import java.util.List;
import java.util.ListIterator;

/**
 * @author mkdlp
 * ListIterator相较于Iterator:
 * 1.它只能用于List。
 * 2.它可以双向移动。
 * 3.它可以获得当前迭代器指向位置的前一个和后一个元素的索引。
 * 4.它可以使用set方法替换它访问的最后一个元素。
 * 5.它可以使用listIterator(n)来创建一个以开始就指向列表索引为n的元素的ListIterator(使用next()方法返回的就是索引为n的元素)。
 */
public class ListIeration {
    public static void main(String[] args) {
        List<Pet> pets= Pets.arrayList(8);
        ListIterator<Pet> it=pets.listIterator();
        while (it.hasNext()){
            System.out.print(it.next()+","+it.nextIndex()+","+it.previousIndex()+";");
        }
        System.out.println();
        while (it.hasPrevious()){
            System.out.print(it.previous().id()+"");
        }
        System.out.println();
        System.out.println(pets);
        it=pets.listIterator(3);
        while (it.hasNext()){
            Pet next=it.next();
            System.out.print("   next:"+next);
            it.set(Pets.randomPet());
        }
        System.out.println();
        System.out.println(pets);
    }
}
