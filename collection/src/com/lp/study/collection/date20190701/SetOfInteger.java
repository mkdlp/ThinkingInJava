package com.lp.study.collection.date20190701;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author mkdlp
 * set继承自Collection而且没有增加额外的方法，Set可以说就是Collection只是行为不同。
 * TreeSet的存储方式采用了红黑树，HashSet采用的是散列函数，linkedHashSet底层数据结构由哈希表和链表组成。
 *
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random rand=new Random(47);
        Set<Integer> intset=new HashSet<Integer>();
        for (int i=0;i<1000;i++){
            intset.add(rand.nextInt(50));
        }
        System.out.println(intset);
    }
}
