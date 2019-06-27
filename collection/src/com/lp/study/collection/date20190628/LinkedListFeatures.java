package com.lp.study.collection.date20190628;

import com.lp.study.collection.date20190620.pets.Hamster;
import com.lp.study.collection.date20190620.pets.Pet;
import com.lp.study.collection.date20190620.pets.Pets;
import com.lp.study.collection.date20190620.pets.Rat;

import java.util.LinkedList;

/**
 * @author mkdlp
 * likinedList
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets=new LinkedList<>(Pets.arrayList(5));
        System.out.println(pets);
        //getFitst和element一样都是返回第一个元素，而并不移除它
        //而list为null的时候会抛出NoSuchElementException
        System.out.println("pets.getFirst():"+pets.getFirst());
        System.out.println("pets.element:()"+pets.element());
        //peek和getFirst以及element基本相同，不同的是list为null
        //的时候，返回null
        System.out.println("pets.peek()"+pets.peek());
        //remove和removeFirst都是移除并返回列表的头，但是列表为null
        //的时候会抛出NoSuchElementException
        System.out.println("pets.remove()"+pets.remove());
        System.out.println("pets.removeFirst()"+pets.removeFirst());
        //poll和remove、removeFirst用法一样，不同的是在列表为
        //null的时候poll不会抛出异常，直接返回null
        System.out.println("pets.poll()"+pets.poll());
        System.out.println(pets);
        pets.addFirst(new Rat());
        //addFirst、add、addLast相同，他们都将某个元素插入到
        //列表的尾部
        System.out.println("after addFirst():"+pets);
        pets.offer(Pets.randomPet());
        //offer与add不同的是：
        //offer 属于Deque<E>、 add 属于Collection<E>
        //当队列为null的时候add会抛出异常，offer返回false
        //作为list使用的时候，一般使用add/get
        //作为queue使用的时候，才会采用offer/poll/take
        System.out.println("after offer():"+pets);
        pets.add(Pets.randomPet());
        System.out.println("after add():"+pets);
        pets.addLast(new Hamster());
        System.out.println("after addLast():"+pets);
        //移除并返回列表的最后一个元素
        System.out.println("pets.removeLast():"+pets.removeLast());

        //queue在linkedlist的基础上增加了element()、offer()、peek()、
        //poll()、remove()方法使其可以成为一个Queue的实现
    }
}
