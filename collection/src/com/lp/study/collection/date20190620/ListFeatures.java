package com.lp.study.collection.date20190620;

import com.lp.study.collection.date20190620.pets.*;

import java.util.*;

/**
 * @author mkdlp
 * list的方法总结
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        System.out.println("1: " + pets);
        Hamster h = new Hamster();
        //在list的末尾添加元素，
        pets.add(h);
        System.out.println("2: " + pets);
        System.out.println("3: " + pets.contains(h));
        //删除指定的对象
        pets.remove(h); // Remove by object
        //得到指定位置的元素
        Pet p = pets.get(2);
        //得到对象在list中第一次出现的位置
        System.out.println("4: " +  p + " " + pets.indexOf(p));
        Pet cymric = new Cymric();
        System.out.println("5: " + pets.indexOf(cymric));
        System.out.println("6: " + pets.remove(cymric));
        // Must be the exact object:
        System.out.println("7: " + pets.remove(p));
        System.out.println("8: " + pets);
        pets.add(3, new Mouse()); // Insert at an index
        System.out.println("9: " + pets);
        //得到起始位置为1,4的list
        List<Pet> sub = pets.subList(1, 4);
        System.out.println("subList: " + sub);
        //判断list是否包含subList
        System.out.println("10: " + pets.containsAll(sub));
        //讲sublist进行排序
        Collections.sort(sub); // In-place sort
        System.out.println("sorted subList: " + sub);
        // Order is not important in containsAll():
        System.out.println("11: " + pets.containsAll(sub));
        //对sublist进行洗牌,排序和洗牌都不会影响containsAll()的结果
        Collections.shuffle(sub, rand); // Mix it up
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + pets.containsAll(sub));
        List<Pet> copy = new ArrayList<Pet>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<Pet>(pets); // Get a fresh copy
        copy.remove(2); // Remove by index
        System.out.println("14: " + copy);
        //删除指定的list中的元素
        copy.removeAll(sub); // Only removes exact objects
        System.out.println("15: " + copy);
        //用对象替换指定位置的元素
        copy.set(1, new Mouse()); // Replace an element
        System.out.println("16: " + copy);
        //从指定位置添加sub中的所有元素,指定位置后的元素后移
        copy.addAll(2, sub); // Insert a list in the middle
        System.out.println("17: " + copy);
        System.out.println("18: " + pets.isEmpty());
        pets.clear(); // Remove all elements
        System.out.println("19: " + pets);
        System.out.println("20: " + pets.isEmpty());
        pets.addAll(Pets.arrayList(4));
        System.out.println("21: " + pets);
        //无参数的版本返回的是Object的数组
        Object[] o = pets.toArray();
        System.out.println("22: " + o[3]);
        //返回指定类型的数组，如果参数数组的大小不够容纳当前
        // List的所有元素则会新创建一个大小合适的新数组
        Pet[] pa = pets.toArray(new Pet[0]);
        System.out.println("23: " + pa[3].id());
    }
}
